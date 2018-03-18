package net.corda.contrib

import java.io.File
import java.util.Currency

typealias KotlinCode = String

fun header(filename: String): KotlinCode = """@file:JvmName("$filename")

package net.corda.finance

import net.corda.core.contracts.Amount
import java.util.Currency
"""

fun currencyExtensionCode(currency: Currency): KotlinCode {
    val code = currency.currencyCode.toUpperCase()
    return """
@JvmField
val $code: Currency = Currency.getInstance("$code")

fun $code(amount: Int): Amount<Currency> = AMOUNT(amount, $code)
fun $code(amount: Long): Amount<Currency> = AMOUNT(amount, $code)
fun $code(amount: Double): Amount<Currency> = AMOUNT(amount, $code)
val Int.$code: Amount<Currency> get() = $code(this)
val Long.$code: Amount<Currency> get() = $code(this)
val Double.$code: Amount<Currency> get() = $code(this)
"""
}

fun generateCurrenciesFile(filename: String, currencies: List<Currency>): KotlinCode =
    header(filename) + currencies.joinToString("\n", transform = ::currencyExtensionCode)

fun writeCurrenciesFile(filepath: String, currencies: List<Currency>) {
    val fullName = filepath.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    File(filepath).printWriter().use { it.print(generateCurrenciesFile(fileName, currencies)) }
}

fun main(array: Array<String>) {
    val path = "src/main/kotlin/net/corda/finance/AllCurrencies.kt"
    val currencies = Currency.getAvailableCurrencies().sortedBy { it.currencyCode }
    writeCurrenciesFile(path, currencies)
}