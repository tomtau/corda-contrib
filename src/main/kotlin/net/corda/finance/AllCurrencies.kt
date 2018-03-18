@file:JvmName("AllCurrencies")

package net.corda.finance

import net.corda.core.contracts.Amount
import java.util.Currency

@JvmField
val ADP: Currency = Currency.getInstance("ADP")

fun ADP(amount: Int): Amount<Currency> = AMOUNT(amount, ADP)
fun ADP(amount: Long): Amount<Currency> = AMOUNT(amount, ADP)
fun ADP(amount: Double): Amount<Currency> = AMOUNT(amount, ADP)
val Int.ADP: Amount<Currency> get() = ADP(this)
val Long.ADP: Amount<Currency> get() = ADP(this)
val Double.ADP: Amount<Currency> get() = ADP(this)


@JvmField
val AED: Currency = Currency.getInstance("AED")

fun AED(amount: Int): Amount<Currency> = AMOUNT(amount, AED)
fun AED(amount: Long): Amount<Currency> = AMOUNT(amount, AED)
fun AED(amount: Double): Amount<Currency> = AMOUNT(amount, AED)
val Int.AED: Amount<Currency> get() = AED(this)
val Long.AED: Amount<Currency> get() = AED(this)
val Double.AED: Amount<Currency> get() = AED(this)


@JvmField
val AFA: Currency = Currency.getInstance("AFA")

fun AFA(amount: Int): Amount<Currency> = AMOUNT(amount, AFA)
fun AFA(amount: Long): Amount<Currency> = AMOUNT(amount, AFA)
fun AFA(amount: Double): Amount<Currency> = AMOUNT(amount, AFA)
val Int.AFA: Amount<Currency> get() = AFA(this)
val Long.AFA: Amount<Currency> get() = AFA(this)
val Double.AFA: Amount<Currency> get() = AFA(this)


@JvmField
val AFN: Currency = Currency.getInstance("AFN")

fun AFN(amount: Int): Amount<Currency> = AMOUNT(amount, AFN)
fun AFN(amount: Long): Amount<Currency> = AMOUNT(amount, AFN)
fun AFN(amount: Double): Amount<Currency> = AMOUNT(amount, AFN)
val Int.AFN: Amount<Currency> get() = AFN(this)
val Long.AFN: Amount<Currency> get() = AFN(this)
val Double.AFN: Amount<Currency> get() = AFN(this)


@JvmField
val ALL: Currency = Currency.getInstance("ALL")

fun ALL(amount: Int): Amount<Currency> = AMOUNT(amount, ALL)
fun ALL(amount: Long): Amount<Currency> = AMOUNT(amount, ALL)
fun ALL(amount: Double): Amount<Currency> = AMOUNT(amount, ALL)
val Int.ALL: Amount<Currency> get() = ALL(this)
val Long.ALL: Amount<Currency> get() = ALL(this)
val Double.ALL: Amount<Currency> get() = ALL(this)


@JvmField
val AMD: Currency = Currency.getInstance("AMD")

fun AMD(amount: Int): Amount<Currency> = AMOUNT(amount, AMD)
fun AMD(amount: Long): Amount<Currency> = AMOUNT(amount, AMD)
fun AMD(amount: Double): Amount<Currency> = AMOUNT(amount, AMD)
val Int.AMD: Amount<Currency> get() = AMD(this)
val Long.AMD: Amount<Currency> get() = AMD(this)
val Double.AMD: Amount<Currency> get() = AMD(this)


@JvmField
val ANG: Currency = Currency.getInstance("ANG")

fun ANG(amount: Int): Amount<Currency> = AMOUNT(amount, ANG)
fun ANG(amount: Long): Amount<Currency> = AMOUNT(amount, ANG)
fun ANG(amount: Double): Amount<Currency> = AMOUNT(amount, ANG)
val Int.ANG: Amount<Currency> get() = ANG(this)
val Long.ANG: Amount<Currency> get() = ANG(this)
val Double.ANG: Amount<Currency> get() = ANG(this)


@JvmField
val AOA: Currency = Currency.getInstance("AOA")

fun AOA(amount: Int): Amount<Currency> = AMOUNT(amount, AOA)
fun AOA(amount: Long): Amount<Currency> = AMOUNT(amount, AOA)
fun AOA(amount: Double): Amount<Currency> = AMOUNT(amount, AOA)
val Int.AOA: Amount<Currency> get() = AOA(this)
val Long.AOA: Amount<Currency> get() = AOA(this)
val Double.AOA: Amount<Currency> get() = AOA(this)


@JvmField
val ARS: Currency = Currency.getInstance("ARS")

fun ARS(amount: Int): Amount<Currency> = AMOUNT(amount, ARS)
fun ARS(amount: Long): Amount<Currency> = AMOUNT(amount, ARS)
fun ARS(amount: Double): Amount<Currency> = AMOUNT(amount, ARS)
val Int.ARS: Amount<Currency> get() = ARS(this)
val Long.ARS: Amount<Currency> get() = ARS(this)
val Double.ARS: Amount<Currency> get() = ARS(this)


@JvmField
val ATS: Currency = Currency.getInstance("ATS")

fun ATS(amount: Int): Amount<Currency> = AMOUNT(amount, ATS)
fun ATS(amount: Long): Amount<Currency> = AMOUNT(amount, ATS)
fun ATS(amount: Double): Amount<Currency> = AMOUNT(amount, ATS)
val Int.ATS: Amount<Currency> get() = ATS(this)
val Long.ATS: Amount<Currency> get() = ATS(this)
val Double.ATS: Amount<Currency> get() = ATS(this)


@JvmField
val AUD: Currency = Currency.getInstance("AUD")

fun AUD(amount: Int): Amount<Currency> = AMOUNT(amount, AUD)
fun AUD(amount: Long): Amount<Currency> = AMOUNT(amount, AUD)
fun AUD(amount: Double): Amount<Currency> = AMOUNT(amount, AUD)
val Int.AUD: Amount<Currency> get() = AUD(this)
val Long.AUD: Amount<Currency> get() = AUD(this)
val Double.AUD: Amount<Currency> get() = AUD(this)


@JvmField
val AWG: Currency = Currency.getInstance("AWG")

fun AWG(amount: Int): Amount<Currency> = AMOUNT(amount, AWG)
fun AWG(amount: Long): Amount<Currency> = AMOUNT(amount, AWG)
fun AWG(amount: Double): Amount<Currency> = AMOUNT(amount, AWG)
val Int.AWG: Amount<Currency> get() = AWG(this)
val Long.AWG: Amount<Currency> get() = AWG(this)
val Double.AWG: Amount<Currency> get() = AWG(this)


@JvmField
val AYM: Currency = Currency.getInstance("AYM")

fun AYM(amount: Int): Amount<Currency> = AMOUNT(amount, AYM)
fun AYM(amount: Long): Amount<Currency> = AMOUNT(amount, AYM)
fun AYM(amount: Double): Amount<Currency> = AMOUNT(amount, AYM)
val Int.AYM: Amount<Currency> get() = AYM(this)
val Long.AYM: Amount<Currency> get() = AYM(this)
val Double.AYM: Amount<Currency> get() = AYM(this)


@JvmField
val AZM: Currency = Currency.getInstance("AZM")

fun AZM(amount: Int): Amount<Currency> = AMOUNT(amount, AZM)
fun AZM(amount: Long): Amount<Currency> = AMOUNT(amount, AZM)
fun AZM(amount: Double): Amount<Currency> = AMOUNT(amount, AZM)
val Int.AZM: Amount<Currency> get() = AZM(this)
val Long.AZM: Amount<Currency> get() = AZM(this)
val Double.AZM: Amount<Currency> get() = AZM(this)


@JvmField
val AZN: Currency = Currency.getInstance("AZN")

fun AZN(amount: Int): Amount<Currency> = AMOUNT(amount, AZN)
fun AZN(amount: Long): Amount<Currency> = AMOUNT(amount, AZN)
fun AZN(amount: Double): Amount<Currency> = AMOUNT(amount, AZN)
val Int.AZN: Amount<Currency> get() = AZN(this)
val Long.AZN: Amount<Currency> get() = AZN(this)
val Double.AZN: Amount<Currency> get() = AZN(this)


@JvmField
val BAM: Currency = Currency.getInstance("BAM")

fun BAM(amount: Int): Amount<Currency> = AMOUNT(amount, BAM)
fun BAM(amount: Long): Amount<Currency> = AMOUNT(amount, BAM)
fun BAM(amount: Double): Amount<Currency> = AMOUNT(amount, BAM)
val Int.BAM: Amount<Currency> get() = BAM(this)
val Long.BAM: Amount<Currency> get() = BAM(this)
val Double.BAM: Amount<Currency> get() = BAM(this)


@JvmField
val BBD: Currency = Currency.getInstance("BBD")

fun BBD(amount: Int): Amount<Currency> = AMOUNT(amount, BBD)
fun BBD(amount: Long): Amount<Currency> = AMOUNT(amount, BBD)
fun BBD(amount: Double): Amount<Currency> = AMOUNT(amount, BBD)
val Int.BBD: Amount<Currency> get() = BBD(this)
val Long.BBD: Amount<Currency> get() = BBD(this)
val Double.BBD: Amount<Currency> get() = BBD(this)


@JvmField
val BDT: Currency = Currency.getInstance("BDT")

fun BDT(amount: Int): Amount<Currency> = AMOUNT(amount, BDT)
fun BDT(amount: Long): Amount<Currency> = AMOUNT(amount, BDT)
fun BDT(amount: Double): Amount<Currency> = AMOUNT(amount, BDT)
val Int.BDT: Amount<Currency> get() = BDT(this)
val Long.BDT: Amount<Currency> get() = BDT(this)
val Double.BDT: Amount<Currency> get() = BDT(this)


@JvmField
val BEF: Currency = Currency.getInstance("BEF")

fun BEF(amount: Int): Amount<Currency> = AMOUNT(amount, BEF)
fun BEF(amount: Long): Amount<Currency> = AMOUNT(amount, BEF)
fun BEF(amount: Double): Amount<Currency> = AMOUNT(amount, BEF)
val Int.BEF: Amount<Currency> get() = BEF(this)
val Long.BEF: Amount<Currency> get() = BEF(this)
val Double.BEF: Amount<Currency> get() = BEF(this)


@JvmField
val BGL: Currency = Currency.getInstance("BGL")

fun BGL(amount: Int): Amount<Currency> = AMOUNT(amount, BGL)
fun BGL(amount: Long): Amount<Currency> = AMOUNT(amount, BGL)
fun BGL(amount: Double): Amount<Currency> = AMOUNT(amount, BGL)
val Int.BGL: Amount<Currency> get() = BGL(this)
val Long.BGL: Amount<Currency> get() = BGL(this)
val Double.BGL: Amount<Currency> get() = BGL(this)


@JvmField
val BGN: Currency = Currency.getInstance("BGN")

fun BGN(amount: Int): Amount<Currency> = AMOUNT(amount, BGN)
fun BGN(amount: Long): Amount<Currency> = AMOUNT(amount, BGN)
fun BGN(amount: Double): Amount<Currency> = AMOUNT(amount, BGN)
val Int.BGN: Amount<Currency> get() = BGN(this)
val Long.BGN: Amount<Currency> get() = BGN(this)
val Double.BGN: Amount<Currency> get() = BGN(this)


@JvmField
val BHD: Currency = Currency.getInstance("BHD")

fun BHD(amount: Int): Amount<Currency> = AMOUNT(amount, BHD)
fun BHD(amount: Long): Amount<Currency> = AMOUNT(amount, BHD)
fun BHD(amount: Double): Amount<Currency> = AMOUNT(amount, BHD)
val Int.BHD: Amount<Currency> get() = BHD(this)
val Long.BHD: Amount<Currency> get() = BHD(this)
val Double.BHD: Amount<Currency> get() = BHD(this)


@JvmField
val BIF: Currency = Currency.getInstance("BIF")

fun BIF(amount: Int): Amount<Currency> = AMOUNT(amount, BIF)
fun BIF(amount: Long): Amount<Currency> = AMOUNT(amount, BIF)
fun BIF(amount: Double): Amount<Currency> = AMOUNT(amount, BIF)
val Int.BIF: Amount<Currency> get() = BIF(this)
val Long.BIF: Amount<Currency> get() = BIF(this)
val Double.BIF: Amount<Currency> get() = BIF(this)


@JvmField
val BMD: Currency = Currency.getInstance("BMD")

fun BMD(amount: Int): Amount<Currency> = AMOUNT(amount, BMD)
fun BMD(amount: Long): Amount<Currency> = AMOUNT(amount, BMD)
fun BMD(amount: Double): Amount<Currency> = AMOUNT(amount, BMD)
val Int.BMD: Amount<Currency> get() = BMD(this)
val Long.BMD: Amount<Currency> get() = BMD(this)
val Double.BMD: Amount<Currency> get() = BMD(this)


@JvmField
val BND: Currency = Currency.getInstance("BND")

fun BND(amount: Int): Amount<Currency> = AMOUNT(amount, BND)
fun BND(amount: Long): Amount<Currency> = AMOUNT(amount, BND)
fun BND(amount: Double): Amount<Currency> = AMOUNT(amount, BND)
val Int.BND: Amount<Currency> get() = BND(this)
val Long.BND: Amount<Currency> get() = BND(this)
val Double.BND: Amount<Currency> get() = BND(this)


@JvmField
val BOB: Currency = Currency.getInstance("BOB")

fun BOB(amount: Int): Amount<Currency> = AMOUNT(amount, BOB)
fun BOB(amount: Long): Amount<Currency> = AMOUNT(amount, BOB)
fun BOB(amount: Double): Amount<Currency> = AMOUNT(amount, BOB)
val Int.BOB: Amount<Currency> get() = BOB(this)
val Long.BOB: Amount<Currency> get() = BOB(this)
val Double.BOB: Amount<Currency> get() = BOB(this)


@JvmField
val BOV: Currency = Currency.getInstance("BOV")

fun BOV(amount: Int): Amount<Currency> = AMOUNT(amount, BOV)
fun BOV(amount: Long): Amount<Currency> = AMOUNT(amount, BOV)
fun BOV(amount: Double): Amount<Currency> = AMOUNT(amount, BOV)
val Int.BOV: Amount<Currency> get() = BOV(this)
val Long.BOV: Amount<Currency> get() = BOV(this)
val Double.BOV: Amount<Currency> get() = BOV(this)


@JvmField
val BRL: Currency = Currency.getInstance("BRL")

fun BRL(amount: Int): Amount<Currency> = AMOUNT(amount, BRL)
fun BRL(amount: Long): Amount<Currency> = AMOUNT(amount, BRL)
fun BRL(amount: Double): Amount<Currency> = AMOUNT(amount, BRL)
val Int.BRL: Amount<Currency> get() = BRL(this)
val Long.BRL: Amount<Currency> get() = BRL(this)
val Double.BRL: Amount<Currency> get() = BRL(this)


@JvmField
val BSD: Currency = Currency.getInstance("BSD")

fun BSD(amount: Int): Amount<Currency> = AMOUNT(amount, BSD)
fun BSD(amount: Long): Amount<Currency> = AMOUNT(amount, BSD)
fun BSD(amount: Double): Amount<Currency> = AMOUNT(amount, BSD)
val Int.BSD: Amount<Currency> get() = BSD(this)
val Long.BSD: Amount<Currency> get() = BSD(this)
val Double.BSD: Amount<Currency> get() = BSD(this)


@JvmField
val BTN: Currency = Currency.getInstance("BTN")

fun BTN(amount: Int): Amount<Currency> = AMOUNT(amount, BTN)
fun BTN(amount: Long): Amount<Currency> = AMOUNT(amount, BTN)
fun BTN(amount: Double): Amount<Currency> = AMOUNT(amount, BTN)
val Int.BTN: Amount<Currency> get() = BTN(this)
val Long.BTN: Amount<Currency> get() = BTN(this)
val Double.BTN: Amount<Currency> get() = BTN(this)


@JvmField
val BWP: Currency = Currency.getInstance("BWP")

fun BWP(amount: Int): Amount<Currency> = AMOUNT(amount, BWP)
fun BWP(amount: Long): Amount<Currency> = AMOUNT(amount, BWP)
fun BWP(amount: Double): Amount<Currency> = AMOUNT(amount, BWP)
val Int.BWP: Amount<Currency> get() = BWP(this)
val Long.BWP: Amount<Currency> get() = BWP(this)
val Double.BWP: Amount<Currency> get() = BWP(this)


@JvmField
val BYB: Currency = Currency.getInstance("BYB")

fun BYB(amount: Int): Amount<Currency> = AMOUNT(amount, BYB)
fun BYB(amount: Long): Amount<Currency> = AMOUNT(amount, BYB)
fun BYB(amount: Double): Amount<Currency> = AMOUNT(amount, BYB)
val Int.BYB: Amount<Currency> get() = BYB(this)
val Long.BYB: Amount<Currency> get() = BYB(this)
val Double.BYB: Amount<Currency> get() = BYB(this)


@JvmField
val BYN: Currency = Currency.getInstance("BYN")

fun BYN(amount: Int): Amount<Currency> = AMOUNT(amount, BYN)
fun BYN(amount: Long): Amount<Currency> = AMOUNT(amount, BYN)
fun BYN(amount: Double): Amount<Currency> = AMOUNT(amount, BYN)
val Int.BYN: Amount<Currency> get() = BYN(this)
val Long.BYN: Amount<Currency> get() = BYN(this)
val Double.BYN: Amount<Currency> get() = BYN(this)


@JvmField
val BYR: Currency = Currency.getInstance("BYR")

fun BYR(amount: Int): Amount<Currency> = AMOUNT(amount, BYR)
fun BYR(amount: Long): Amount<Currency> = AMOUNT(amount, BYR)
fun BYR(amount: Double): Amount<Currency> = AMOUNT(amount, BYR)
val Int.BYR: Amount<Currency> get() = BYR(this)
val Long.BYR: Amount<Currency> get() = BYR(this)
val Double.BYR: Amount<Currency> get() = BYR(this)


@JvmField
val BZD: Currency = Currency.getInstance("BZD")

fun BZD(amount: Int): Amount<Currency> = AMOUNT(amount, BZD)
fun BZD(amount: Long): Amount<Currency> = AMOUNT(amount, BZD)
fun BZD(amount: Double): Amount<Currency> = AMOUNT(amount, BZD)
val Int.BZD: Amount<Currency> get() = BZD(this)
val Long.BZD: Amount<Currency> get() = BZD(this)
val Double.BZD: Amount<Currency> get() = BZD(this)


@JvmField
val CAD: Currency = Currency.getInstance("CAD")

fun CAD(amount: Int): Amount<Currency> = AMOUNT(amount, CAD)
fun CAD(amount: Long): Amount<Currency> = AMOUNT(amount, CAD)
fun CAD(amount: Double): Amount<Currency> = AMOUNT(amount, CAD)
val Int.CAD: Amount<Currency> get() = CAD(this)
val Long.CAD: Amount<Currency> get() = CAD(this)
val Double.CAD: Amount<Currency> get() = CAD(this)


@JvmField
val CDF: Currency = Currency.getInstance("CDF")

fun CDF(amount: Int): Amount<Currency> = AMOUNT(amount, CDF)
fun CDF(amount: Long): Amount<Currency> = AMOUNT(amount, CDF)
fun CDF(amount: Double): Amount<Currency> = AMOUNT(amount, CDF)
val Int.CDF: Amount<Currency> get() = CDF(this)
val Long.CDF: Amount<Currency> get() = CDF(this)
val Double.CDF: Amount<Currency> get() = CDF(this)


@JvmField
val CHE: Currency = Currency.getInstance("CHE")

fun CHE(amount: Int): Amount<Currency> = AMOUNT(amount, CHE)
fun CHE(amount: Long): Amount<Currency> = AMOUNT(amount, CHE)
fun CHE(amount: Double): Amount<Currency> = AMOUNT(amount, CHE)
val Int.CHE: Amount<Currency> get() = CHE(this)
val Long.CHE: Amount<Currency> get() = CHE(this)
val Double.CHE: Amount<Currency> get() = CHE(this)


@JvmField
val CHF: Currency = Currency.getInstance("CHF")

fun CHF(amount: Int): Amount<Currency> = AMOUNT(amount, CHF)
fun CHF(amount: Long): Amount<Currency> = AMOUNT(amount, CHF)
fun CHF(amount: Double): Amount<Currency> = AMOUNT(amount, CHF)
val Int.CHF: Amount<Currency> get() = CHF(this)
val Long.CHF: Amount<Currency> get() = CHF(this)
val Double.CHF: Amount<Currency> get() = CHF(this)


@JvmField
val CHW: Currency = Currency.getInstance("CHW")

fun CHW(amount: Int): Amount<Currency> = AMOUNT(amount, CHW)
fun CHW(amount: Long): Amount<Currency> = AMOUNT(amount, CHW)
fun CHW(amount: Double): Amount<Currency> = AMOUNT(amount, CHW)
val Int.CHW: Amount<Currency> get() = CHW(this)
val Long.CHW: Amount<Currency> get() = CHW(this)
val Double.CHW: Amount<Currency> get() = CHW(this)


@JvmField
val CLF: Currency = Currency.getInstance("CLF")

fun CLF(amount: Int): Amount<Currency> = AMOUNT(amount, CLF)
fun CLF(amount: Long): Amount<Currency> = AMOUNT(amount, CLF)
fun CLF(amount: Double): Amount<Currency> = AMOUNT(amount, CLF)
val Int.CLF: Amount<Currency> get() = CLF(this)
val Long.CLF: Amount<Currency> get() = CLF(this)
val Double.CLF: Amount<Currency> get() = CLF(this)


@JvmField
val CLP: Currency = Currency.getInstance("CLP")

fun CLP(amount: Int): Amount<Currency> = AMOUNT(amount, CLP)
fun CLP(amount: Long): Amount<Currency> = AMOUNT(amount, CLP)
fun CLP(amount: Double): Amount<Currency> = AMOUNT(amount, CLP)
val Int.CLP: Amount<Currency> get() = CLP(this)
val Long.CLP: Amount<Currency> get() = CLP(this)
val Double.CLP: Amount<Currency> get() = CLP(this)


@JvmField
val CNY: Currency = Currency.getInstance("CNY")

fun CNY(amount: Int): Amount<Currency> = AMOUNT(amount, CNY)
fun CNY(amount: Long): Amount<Currency> = AMOUNT(amount, CNY)
fun CNY(amount: Double): Amount<Currency> = AMOUNT(amount, CNY)
val Int.CNY: Amount<Currency> get() = CNY(this)
val Long.CNY: Amount<Currency> get() = CNY(this)
val Double.CNY: Amount<Currency> get() = CNY(this)


@JvmField
val COP: Currency = Currency.getInstance("COP")

fun COP(amount: Int): Amount<Currency> = AMOUNT(amount, COP)
fun COP(amount: Long): Amount<Currency> = AMOUNT(amount, COP)
fun COP(amount: Double): Amount<Currency> = AMOUNT(amount, COP)
val Int.COP: Amount<Currency> get() = COP(this)
val Long.COP: Amount<Currency> get() = COP(this)
val Double.COP: Amount<Currency> get() = COP(this)


@JvmField
val COU: Currency = Currency.getInstance("COU")

fun COU(amount: Int): Amount<Currency> = AMOUNT(amount, COU)
fun COU(amount: Long): Amount<Currency> = AMOUNT(amount, COU)
fun COU(amount: Double): Amount<Currency> = AMOUNT(amount, COU)
val Int.COU: Amount<Currency> get() = COU(this)
val Long.COU: Amount<Currency> get() = COU(this)
val Double.COU: Amount<Currency> get() = COU(this)


@JvmField
val CRC: Currency = Currency.getInstance("CRC")

fun CRC(amount: Int): Amount<Currency> = AMOUNT(amount, CRC)
fun CRC(amount: Long): Amount<Currency> = AMOUNT(amount, CRC)
fun CRC(amount: Double): Amount<Currency> = AMOUNT(amount, CRC)
val Int.CRC: Amount<Currency> get() = CRC(this)
val Long.CRC: Amount<Currency> get() = CRC(this)
val Double.CRC: Amount<Currency> get() = CRC(this)


@JvmField
val CSD: Currency = Currency.getInstance("CSD")

fun CSD(amount: Int): Amount<Currency> = AMOUNT(amount, CSD)
fun CSD(amount: Long): Amount<Currency> = AMOUNT(amount, CSD)
fun CSD(amount: Double): Amount<Currency> = AMOUNT(amount, CSD)
val Int.CSD: Amount<Currency> get() = CSD(this)
val Long.CSD: Amount<Currency> get() = CSD(this)
val Double.CSD: Amount<Currency> get() = CSD(this)


@JvmField
val CUC: Currency = Currency.getInstance("CUC")

fun CUC(amount: Int): Amount<Currency> = AMOUNT(amount, CUC)
fun CUC(amount: Long): Amount<Currency> = AMOUNT(amount, CUC)
fun CUC(amount: Double): Amount<Currency> = AMOUNT(amount, CUC)
val Int.CUC: Amount<Currency> get() = CUC(this)
val Long.CUC: Amount<Currency> get() = CUC(this)
val Double.CUC: Amount<Currency> get() = CUC(this)


@JvmField
val CUP: Currency = Currency.getInstance("CUP")

fun CUP(amount: Int): Amount<Currency> = AMOUNT(amount, CUP)
fun CUP(amount: Long): Amount<Currency> = AMOUNT(amount, CUP)
fun CUP(amount: Double): Amount<Currency> = AMOUNT(amount, CUP)
val Int.CUP: Amount<Currency> get() = CUP(this)
val Long.CUP: Amount<Currency> get() = CUP(this)
val Double.CUP: Amount<Currency> get() = CUP(this)


@JvmField
val CVE: Currency = Currency.getInstance("CVE")

fun CVE(amount: Int): Amount<Currency> = AMOUNT(amount, CVE)
fun CVE(amount: Long): Amount<Currency> = AMOUNT(amount, CVE)
fun CVE(amount: Double): Amount<Currency> = AMOUNT(amount, CVE)
val Int.CVE: Amount<Currency> get() = CVE(this)
val Long.CVE: Amount<Currency> get() = CVE(this)
val Double.CVE: Amount<Currency> get() = CVE(this)


@JvmField
val CYP: Currency = Currency.getInstance("CYP")

fun CYP(amount: Int): Amount<Currency> = AMOUNT(amount, CYP)
fun CYP(amount: Long): Amount<Currency> = AMOUNT(amount, CYP)
fun CYP(amount: Double): Amount<Currency> = AMOUNT(amount, CYP)
val Int.CYP: Amount<Currency> get() = CYP(this)
val Long.CYP: Amount<Currency> get() = CYP(this)
val Double.CYP: Amount<Currency> get() = CYP(this)


@JvmField
val CZK: Currency = Currency.getInstance("CZK")

fun CZK(amount: Int): Amount<Currency> = AMOUNT(amount, CZK)
fun CZK(amount: Long): Amount<Currency> = AMOUNT(amount, CZK)
fun CZK(amount: Double): Amount<Currency> = AMOUNT(amount, CZK)
val Int.CZK: Amount<Currency> get() = CZK(this)
val Long.CZK: Amount<Currency> get() = CZK(this)
val Double.CZK: Amount<Currency> get() = CZK(this)


@JvmField
val DEM: Currency = Currency.getInstance("DEM")

fun DEM(amount: Int): Amount<Currency> = AMOUNT(amount, DEM)
fun DEM(amount: Long): Amount<Currency> = AMOUNT(amount, DEM)
fun DEM(amount: Double): Amount<Currency> = AMOUNT(amount, DEM)
val Int.DEM: Amount<Currency> get() = DEM(this)
val Long.DEM: Amount<Currency> get() = DEM(this)
val Double.DEM: Amount<Currency> get() = DEM(this)


@JvmField
val DJF: Currency = Currency.getInstance("DJF")

fun DJF(amount: Int): Amount<Currency> = AMOUNT(amount, DJF)
fun DJF(amount: Long): Amount<Currency> = AMOUNT(amount, DJF)
fun DJF(amount: Double): Amount<Currency> = AMOUNT(amount, DJF)
val Int.DJF: Amount<Currency> get() = DJF(this)
val Long.DJF: Amount<Currency> get() = DJF(this)
val Double.DJF: Amount<Currency> get() = DJF(this)


@JvmField
val DKK: Currency = Currency.getInstance("DKK")

fun DKK(amount: Int): Amount<Currency> = AMOUNT(amount, DKK)
fun DKK(amount: Long): Amount<Currency> = AMOUNT(amount, DKK)
fun DKK(amount: Double): Amount<Currency> = AMOUNT(amount, DKK)
val Int.DKK: Amount<Currency> get() = DKK(this)
val Long.DKK: Amount<Currency> get() = DKK(this)
val Double.DKK: Amount<Currency> get() = DKK(this)


@JvmField
val DOP: Currency = Currency.getInstance("DOP")

fun DOP(amount: Int): Amount<Currency> = AMOUNT(amount, DOP)
fun DOP(amount: Long): Amount<Currency> = AMOUNT(amount, DOP)
fun DOP(amount: Double): Amount<Currency> = AMOUNT(amount, DOP)
val Int.DOP: Amount<Currency> get() = DOP(this)
val Long.DOP: Amount<Currency> get() = DOP(this)
val Double.DOP: Amount<Currency> get() = DOP(this)


@JvmField
val DZD: Currency = Currency.getInstance("DZD")

fun DZD(amount: Int): Amount<Currency> = AMOUNT(amount, DZD)
fun DZD(amount: Long): Amount<Currency> = AMOUNT(amount, DZD)
fun DZD(amount: Double): Amount<Currency> = AMOUNT(amount, DZD)
val Int.DZD: Amount<Currency> get() = DZD(this)
val Long.DZD: Amount<Currency> get() = DZD(this)
val Double.DZD: Amount<Currency> get() = DZD(this)


@JvmField
val EEK: Currency = Currency.getInstance("EEK")

fun EEK(amount: Int): Amount<Currency> = AMOUNT(amount, EEK)
fun EEK(amount: Long): Amount<Currency> = AMOUNT(amount, EEK)
fun EEK(amount: Double): Amount<Currency> = AMOUNT(amount, EEK)
val Int.EEK: Amount<Currency> get() = EEK(this)
val Long.EEK: Amount<Currency> get() = EEK(this)
val Double.EEK: Amount<Currency> get() = EEK(this)


@JvmField
val EGP: Currency = Currency.getInstance("EGP")

fun EGP(amount: Int): Amount<Currency> = AMOUNT(amount, EGP)
fun EGP(amount: Long): Amount<Currency> = AMOUNT(amount, EGP)
fun EGP(amount: Double): Amount<Currency> = AMOUNT(amount, EGP)
val Int.EGP: Amount<Currency> get() = EGP(this)
val Long.EGP: Amount<Currency> get() = EGP(this)
val Double.EGP: Amount<Currency> get() = EGP(this)


@JvmField
val ERN: Currency = Currency.getInstance("ERN")

fun ERN(amount: Int): Amount<Currency> = AMOUNT(amount, ERN)
fun ERN(amount: Long): Amount<Currency> = AMOUNT(amount, ERN)
fun ERN(amount: Double): Amount<Currency> = AMOUNT(amount, ERN)
val Int.ERN: Amount<Currency> get() = ERN(this)
val Long.ERN: Amount<Currency> get() = ERN(this)
val Double.ERN: Amount<Currency> get() = ERN(this)


@JvmField
val ESP: Currency = Currency.getInstance("ESP")

fun ESP(amount: Int): Amount<Currency> = AMOUNT(amount, ESP)
fun ESP(amount: Long): Amount<Currency> = AMOUNT(amount, ESP)
fun ESP(amount: Double): Amount<Currency> = AMOUNT(amount, ESP)
val Int.ESP: Amount<Currency> get() = ESP(this)
val Long.ESP: Amount<Currency> get() = ESP(this)
val Double.ESP: Amount<Currency> get() = ESP(this)


@JvmField
val ETB: Currency = Currency.getInstance("ETB")

fun ETB(amount: Int): Amount<Currency> = AMOUNT(amount, ETB)
fun ETB(amount: Long): Amount<Currency> = AMOUNT(amount, ETB)
fun ETB(amount: Double): Amount<Currency> = AMOUNT(amount, ETB)
val Int.ETB: Amount<Currency> get() = ETB(this)
val Long.ETB: Amount<Currency> get() = ETB(this)
val Double.ETB: Amount<Currency> get() = ETB(this)


@JvmField
val EUR: Currency = Currency.getInstance("EUR")

fun EUR(amount: Int): Amount<Currency> = AMOUNT(amount, EUR)
fun EUR(amount: Long): Amount<Currency> = AMOUNT(amount, EUR)
fun EUR(amount: Double): Amount<Currency> = AMOUNT(amount, EUR)
val Int.EUR: Amount<Currency> get() = EUR(this)
val Long.EUR: Amount<Currency> get() = EUR(this)
val Double.EUR: Amount<Currency> get() = EUR(this)


@JvmField
val FIM: Currency = Currency.getInstance("FIM")

fun FIM(amount: Int): Amount<Currency> = AMOUNT(amount, FIM)
fun FIM(amount: Long): Amount<Currency> = AMOUNT(amount, FIM)
fun FIM(amount: Double): Amount<Currency> = AMOUNT(amount, FIM)
val Int.FIM: Amount<Currency> get() = FIM(this)
val Long.FIM: Amount<Currency> get() = FIM(this)
val Double.FIM: Amount<Currency> get() = FIM(this)


@JvmField
val FJD: Currency = Currency.getInstance("FJD")

fun FJD(amount: Int): Amount<Currency> = AMOUNT(amount, FJD)
fun FJD(amount: Long): Amount<Currency> = AMOUNT(amount, FJD)
fun FJD(amount: Double): Amount<Currency> = AMOUNT(amount, FJD)
val Int.FJD: Amount<Currency> get() = FJD(this)
val Long.FJD: Amount<Currency> get() = FJD(this)
val Double.FJD: Amount<Currency> get() = FJD(this)


@JvmField
val FKP: Currency = Currency.getInstance("FKP")

fun FKP(amount: Int): Amount<Currency> = AMOUNT(amount, FKP)
fun FKP(amount: Long): Amount<Currency> = AMOUNT(amount, FKP)
fun FKP(amount: Double): Amount<Currency> = AMOUNT(amount, FKP)
val Int.FKP: Amount<Currency> get() = FKP(this)
val Long.FKP: Amount<Currency> get() = FKP(this)
val Double.FKP: Amount<Currency> get() = FKP(this)


@JvmField
val FRF: Currency = Currency.getInstance("FRF")

fun FRF(amount: Int): Amount<Currency> = AMOUNT(amount, FRF)
fun FRF(amount: Long): Amount<Currency> = AMOUNT(amount, FRF)
fun FRF(amount: Double): Amount<Currency> = AMOUNT(amount, FRF)
val Int.FRF: Amount<Currency> get() = FRF(this)
val Long.FRF: Amount<Currency> get() = FRF(this)
val Double.FRF: Amount<Currency> get() = FRF(this)


@JvmField
val GBP: Currency = Currency.getInstance("GBP")

fun GBP(amount: Int): Amount<Currency> = AMOUNT(amount, GBP)
fun GBP(amount: Long): Amount<Currency> = AMOUNT(amount, GBP)
fun GBP(amount: Double): Amount<Currency> = AMOUNT(amount, GBP)
val Int.GBP: Amount<Currency> get() = GBP(this)
val Long.GBP: Amount<Currency> get() = GBP(this)
val Double.GBP: Amount<Currency> get() = GBP(this)


@JvmField
val GEL: Currency = Currency.getInstance("GEL")

fun GEL(amount: Int): Amount<Currency> = AMOUNT(amount, GEL)
fun GEL(amount: Long): Amount<Currency> = AMOUNT(amount, GEL)
fun GEL(amount: Double): Amount<Currency> = AMOUNT(amount, GEL)
val Int.GEL: Amount<Currency> get() = GEL(this)
val Long.GEL: Amount<Currency> get() = GEL(this)
val Double.GEL: Amount<Currency> get() = GEL(this)


@JvmField
val GHC: Currency = Currency.getInstance("GHC")

fun GHC(amount: Int): Amount<Currency> = AMOUNT(amount, GHC)
fun GHC(amount: Long): Amount<Currency> = AMOUNT(amount, GHC)
fun GHC(amount: Double): Amount<Currency> = AMOUNT(amount, GHC)
val Int.GHC: Amount<Currency> get() = GHC(this)
val Long.GHC: Amount<Currency> get() = GHC(this)
val Double.GHC: Amount<Currency> get() = GHC(this)


@JvmField
val GHS: Currency = Currency.getInstance("GHS")

fun GHS(amount: Int): Amount<Currency> = AMOUNT(amount, GHS)
fun GHS(amount: Long): Amount<Currency> = AMOUNT(amount, GHS)
fun GHS(amount: Double): Amount<Currency> = AMOUNT(amount, GHS)
val Int.GHS: Amount<Currency> get() = GHS(this)
val Long.GHS: Amount<Currency> get() = GHS(this)
val Double.GHS: Amount<Currency> get() = GHS(this)


@JvmField
val GIP: Currency = Currency.getInstance("GIP")

fun GIP(amount: Int): Amount<Currency> = AMOUNT(amount, GIP)
fun GIP(amount: Long): Amount<Currency> = AMOUNT(amount, GIP)
fun GIP(amount: Double): Amount<Currency> = AMOUNT(amount, GIP)
val Int.GIP: Amount<Currency> get() = GIP(this)
val Long.GIP: Amount<Currency> get() = GIP(this)
val Double.GIP: Amount<Currency> get() = GIP(this)


@JvmField
val GMD: Currency = Currency.getInstance("GMD")

fun GMD(amount: Int): Amount<Currency> = AMOUNT(amount, GMD)
fun GMD(amount: Long): Amount<Currency> = AMOUNT(amount, GMD)
fun GMD(amount: Double): Amount<Currency> = AMOUNT(amount, GMD)
val Int.GMD: Amount<Currency> get() = GMD(this)
val Long.GMD: Amount<Currency> get() = GMD(this)
val Double.GMD: Amount<Currency> get() = GMD(this)


@JvmField
val GNF: Currency = Currency.getInstance("GNF")

fun GNF(amount: Int): Amount<Currency> = AMOUNT(amount, GNF)
fun GNF(amount: Long): Amount<Currency> = AMOUNT(amount, GNF)
fun GNF(amount: Double): Amount<Currency> = AMOUNT(amount, GNF)
val Int.GNF: Amount<Currency> get() = GNF(this)
val Long.GNF: Amount<Currency> get() = GNF(this)
val Double.GNF: Amount<Currency> get() = GNF(this)


@JvmField
val GRD: Currency = Currency.getInstance("GRD")

fun GRD(amount: Int): Amount<Currency> = AMOUNT(amount, GRD)
fun GRD(amount: Long): Amount<Currency> = AMOUNT(amount, GRD)
fun GRD(amount: Double): Amount<Currency> = AMOUNT(amount, GRD)
val Int.GRD: Amount<Currency> get() = GRD(this)
val Long.GRD: Amount<Currency> get() = GRD(this)
val Double.GRD: Amount<Currency> get() = GRD(this)


@JvmField
val GTQ: Currency = Currency.getInstance("GTQ")

fun GTQ(amount: Int): Amount<Currency> = AMOUNT(amount, GTQ)
fun GTQ(amount: Long): Amount<Currency> = AMOUNT(amount, GTQ)
fun GTQ(amount: Double): Amount<Currency> = AMOUNT(amount, GTQ)
val Int.GTQ: Amount<Currency> get() = GTQ(this)
val Long.GTQ: Amount<Currency> get() = GTQ(this)
val Double.GTQ: Amount<Currency> get() = GTQ(this)


@JvmField
val GWP: Currency = Currency.getInstance("GWP")

fun GWP(amount: Int): Amount<Currency> = AMOUNT(amount, GWP)
fun GWP(amount: Long): Amount<Currency> = AMOUNT(amount, GWP)
fun GWP(amount: Double): Amount<Currency> = AMOUNT(amount, GWP)
val Int.GWP: Amount<Currency> get() = GWP(this)
val Long.GWP: Amount<Currency> get() = GWP(this)
val Double.GWP: Amount<Currency> get() = GWP(this)


@JvmField
val GYD: Currency = Currency.getInstance("GYD")

fun GYD(amount: Int): Amount<Currency> = AMOUNT(amount, GYD)
fun GYD(amount: Long): Amount<Currency> = AMOUNT(amount, GYD)
fun GYD(amount: Double): Amount<Currency> = AMOUNT(amount, GYD)
val Int.GYD: Amount<Currency> get() = GYD(this)
val Long.GYD: Amount<Currency> get() = GYD(this)
val Double.GYD: Amount<Currency> get() = GYD(this)


@JvmField
val HKD: Currency = Currency.getInstance("HKD")

fun HKD(amount: Int): Amount<Currency> = AMOUNT(amount, HKD)
fun HKD(amount: Long): Amount<Currency> = AMOUNT(amount, HKD)
fun HKD(amount: Double): Amount<Currency> = AMOUNT(amount, HKD)
val Int.HKD: Amount<Currency> get() = HKD(this)
val Long.HKD: Amount<Currency> get() = HKD(this)
val Double.HKD: Amount<Currency> get() = HKD(this)


@JvmField
val HNL: Currency = Currency.getInstance("HNL")

fun HNL(amount: Int): Amount<Currency> = AMOUNT(amount, HNL)
fun HNL(amount: Long): Amount<Currency> = AMOUNT(amount, HNL)
fun HNL(amount: Double): Amount<Currency> = AMOUNT(amount, HNL)
val Int.HNL: Amount<Currency> get() = HNL(this)
val Long.HNL: Amount<Currency> get() = HNL(this)
val Double.HNL: Amount<Currency> get() = HNL(this)


@JvmField
val HRK: Currency = Currency.getInstance("HRK")

fun HRK(amount: Int): Amount<Currency> = AMOUNT(amount, HRK)
fun HRK(amount: Long): Amount<Currency> = AMOUNT(amount, HRK)
fun HRK(amount: Double): Amount<Currency> = AMOUNT(amount, HRK)
val Int.HRK: Amount<Currency> get() = HRK(this)
val Long.HRK: Amount<Currency> get() = HRK(this)
val Double.HRK: Amount<Currency> get() = HRK(this)


@JvmField
val HTG: Currency = Currency.getInstance("HTG")

fun HTG(amount: Int): Amount<Currency> = AMOUNT(amount, HTG)
fun HTG(amount: Long): Amount<Currency> = AMOUNT(amount, HTG)
fun HTG(amount: Double): Amount<Currency> = AMOUNT(amount, HTG)
val Int.HTG: Amount<Currency> get() = HTG(this)
val Long.HTG: Amount<Currency> get() = HTG(this)
val Double.HTG: Amount<Currency> get() = HTG(this)


@JvmField
val HUF: Currency = Currency.getInstance("HUF")

fun HUF(amount: Int): Amount<Currency> = AMOUNT(amount, HUF)
fun HUF(amount: Long): Amount<Currency> = AMOUNT(amount, HUF)
fun HUF(amount: Double): Amount<Currency> = AMOUNT(amount, HUF)
val Int.HUF: Amount<Currency> get() = HUF(this)
val Long.HUF: Amount<Currency> get() = HUF(this)
val Double.HUF: Amount<Currency> get() = HUF(this)


@JvmField
val IDR: Currency = Currency.getInstance("IDR")

fun IDR(amount: Int): Amount<Currency> = AMOUNT(amount, IDR)
fun IDR(amount: Long): Amount<Currency> = AMOUNT(amount, IDR)
fun IDR(amount: Double): Amount<Currency> = AMOUNT(amount, IDR)
val Int.IDR: Amount<Currency> get() = IDR(this)
val Long.IDR: Amount<Currency> get() = IDR(this)
val Double.IDR: Amount<Currency> get() = IDR(this)


@JvmField
val IEP: Currency = Currency.getInstance("IEP")

fun IEP(amount: Int): Amount<Currency> = AMOUNT(amount, IEP)
fun IEP(amount: Long): Amount<Currency> = AMOUNT(amount, IEP)
fun IEP(amount: Double): Amount<Currency> = AMOUNT(amount, IEP)
val Int.IEP: Amount<Currency> get() = IEP(this)
val Long.IEP: Amount<Currency> get() = IEP(this)
val Double.IEP: Amount<Currency> get() = IEP(this)


@JvmField
val ILS: Currency = Currency.getInstance("ILS")

fun ILS(amount: Int): Amount<Currency> = AMOUNT(amount, ILS)
fun ILS(amount: Long): Amount<Currency> = AMOUNT(amount, ILS)
fun ILS(amount: Double): Amount<Currency> = AMOUNT(amount, ILS)
val Int.ILS: Amount<Currency> get() = ILS(this)
val Long.ILS: Amount<Currency> get() = ILS(this)
val Double.ILS: Amount<Currency> get() = ILS(this)


@JvmField
val INR: Currency = Currency.getInstance("INR")

fun INR(amount: Int): Amount<Currency> = AMOUNT(amount, INR)
fun INR(amount: Long): Amount<Currency> = AMOUNT(amount, INR)
fun INR(amount: Double): Amount<Currency> = AMOUNT(amount, INR)
val Int.INR: Amount<Currency> get() = INR(this)
val Long.INR: Amount<Currency> get() = INR(this)
val Double.INR: Amount<Currency> get() = INR(this)


@JvmField
val IQD: Currency = Currency.getInstance("IQD")

fun IQD(amount: Int): Amount<Currency> = AMOUNT(amount, IQD)
fun IQD(amount: Long): Amount<Currency> = AMOUNT(amount, IQD)
fun IQD(amount: Double): Amount<Currency> = AMOUNT(amount, IQD)
val Int.IQD: Amount<Currency> get() = IQD(this)
val Long.IQD: Amount<Currency> get() = IQD(this)
val Double.IQD: Amount<Currency> get() = IQD(this)


@JvmField
val IRR: Currency = Currency.getInstance("IRR")

fun IRR(amount: Int): Amount<Currency> = AMOUNT(amount, IRR)
fun IRR(amount: Long): Amount<Currency> = AMOUNT(amount, IRR)
fun IRR(amount: Double): Amount<Currency> = AMOUNT(amount, IRR)
val Int.IRR: Amount<Currency> get() = IRR(this)
val Long.IRR: Amount<Currency> get() = IRR(this)
val Double.IRR: Amount<Currency> get() = IRR(this)


@JvmField
val ISK: Currency = Currency.getInstance("ISK")

fun ISK(amount: Int): Amount<Currency> = AMOUNT(amount, ISK)
fun ISK(amount: Long): Amount<Currency> = AMOUNT(amount, ISK)
fun ISK(amount: Double): Amount<Currency> = AMOUNT(amount, ISK)
val Int.ISK: Amount<Currency> get() = ISK(this)
val Long.ISK: Amount<Currency> get() = ISK(this)
val Double.ISK: Amount<Currency> get() = ISK(this)


@JvmField
val ITL: Currency = Currency.getInstance("ITL")

fun ITL(amount: Int): Amount<Currency> = AMOUNT(amount, ITL)
fun ITL(amount: Long): Amount<Currency> = AMOUNT(amount, ITL)
fun ITL(amount: Double): Amount<Currency> = AMOUNT(amount, ITL)
val Int.ITL: Amount<Currency> get() = ITL(this)
val Long.ITL: Amount<Currency> get() = ITL(this)
val Double.ITL: Amount<Currency> get() = ITL(this)


@JvmField
val JMD: Currency = Currency.getInstance("JMD")

fun JMD(amount: Int): Amount<Currency> = AMOUNT(amount, JMD)
fun JMD(amount: Long): Amount<Currency> = AMOUNT(amount, JMD)
fun JMD(amount: Double): Amount<Currency> = AMOUNT(amount, JMD)
val Int.JMD: Amount<Currency> get() = JMD(this)
val Long.JMD: Amount<Currency> get() = JMD(this)
val Double.JMD: Amount<Currency> get() = JMD(this)


@JvmField
val JOD: Currency = Currency.getInstance("JOD")

fun JOD(amount: Int): Amount<Currency> = AMOUNT(amount, JOD)
fun JOD(amount: Long): Amount<Currency> = AMOUNT(amount, JOD)
fun JOD(amount: Double): Amount<Currency> = AMOUNT(amount, JOD)
val Int.JOD: Amount<Currency> get() = JOD(this)
val Long.JOD: Amount<Currency> get() = JOD(this)
val Double.JOD: Amount<Currency> get() = JOD(this)


@JvmField
val JPY: Currency = Currency.getInstance("JPY")

fun JPY(amount: Int): Amount<Currency> = AMOUNT(amount, JPY)
fun JPY(amount: Long): Amount<Currency> = AMOUNT(amount, JPY)
fun JPY(amount: Double): Amount<Currency> = AMOUNT(amount, JPY)
val Int.JPY: Amount<Currency> get() = JPY(this)
val Long.JPY: Amount<Currency> get() = JPY(this)
val Double.JPY: Amount<Currency> get() = JPY(this)


@JvmField
val KES: Currency = Currency.getInstance("KES")

fun KES(amount: Int): Amount<Currency> = AMOUNT(amount, KES)
fun KES(amount: Long): Amount<Currency> = AMOUNT(amount, KES)
fun KES(amount: Double): Amount<Currency> = AMOUNT(amount, KES)
val Int.KES: Amount<Currency> get() = KES(this)
val Long.KES: Amount<Currency> get() = KES(this)
val Double.KES: Amount<Currency> get() = KES(this)


@JvmField
val KGS: Currency = Currency.getInstance("KGS")

fun KGS(amount: Int): Amount<Currency> = AMOUNT(amount, KGS)
fun KGS(amount: Long): Amount<Currency> = AMOUNT(amount, KGS)
fun KGS(amount: Double): Amount<Currency> = AMOUNT(amount, KGS)
val Int.KGS: Amount<Currency> get() = KGS(this)
val Long.KGS: Amount<Currency> get() = KGS(this)
val Double.KGS: Amount<Currency> get() = KGS(this)


@JvmField
val KHR: Currency = Currency.getInstance("KHR")

fun KHR(amount: Int): Amount<Currency> = AMOUNT(amount, KHR)
fun KHR(amount: Long): Amount<Currency> = AMOUNT(amount, KHR)
fun KHR(amount: Double): Amount<Currency> = AMOUNT(amount, KHR)
val Int.KHR: Amount<Currency> get() = KHR(this)
val Long.KHR: Amount<Currency> get() = KHR(this)
val Double.KHR: Amount<Currency> get() = KHR(this)


@JvmField
val KMF: Currency = Currency.getInstance("KMF")

fun KMF(amount: Int): Amount<Currency> = AMOUNT(amount, KMF)
fun KMF(amount: Long): Amount<Currency> = AMOUNT(amount, KMF)
fun KMF(amount: Double): Amount<Currency> = AMOUNT(amount, KMF)
val Int.KMF: Amount<Currency> get() = KMF(this)
val Long.KMF: Amount<Currency> get() = KMF(this)
val Double.KMF: Amount<Currency> get() = KMF(this)


@JvmField
val KPW: Currency = Currency.getInstance("KPW")

fun KPW(amount: Int): Amount<Currency> = AMOUNT(amount, KPW)
fun KPW(amount: Long): Amount<Currency> = AMOUNT(amount, KPW)
fun KPW(amount: Double): Amount<Currency> = AMOUNT(amount, KPW)
val Int.KPW: Amount<Currency> get() = KPW(this)
val Long.KPW: Amount<Currency> get() = KPW(this)
val Double.KPW: Amount<Currency> get() = KPW(this)


@JvmField
val KRW: Currency = Currency.getInstance("KRW")

fun KRW(amount: Int): Amount<Currency> = AMOUNT(amount, KRW)
fun KRW(amount: Long): Amount<Currency> = AMOUNT(amount, KRW)
fun KRW(amount: Double): Amount<Currency> = AMOUNT(amount, KRW)
val Int.KRW: Amount<Currency> get() = KRW(this)
val Long.KRW: Amount<Currency> get() = KRW(this)
val Double.KRW: Amount<Currency> get() = KRW(this)


@JvmField
val KWD: Currency = Currency.getInstance("KWD")

fun KWD(amount: Int): Amount<Currency> = AMOUNT(amount, KWD)
fun KWD(amount: Long): Amount<Currency> = AMOUNT(amount, KWD)
fun KWD(amount: Double): Amount<Currency> = AMOUNT(amount, KWD)
val Int.KWD: Amount<Currency> get() = KWD(this)
val Long.KWD: Amount<Currency> get() = KWD(this)
val Double.KWD: Amount<Currency> get() = KWD(this)


@JvmField
val KYD: Currency = Currency.getInstance("KYD")

fun KYD(amount: Int): Amount<Currency> = AMOUNT(amount, KYD)
fun KYD(amount: Long): Amount<Currency> = AMOUNT(amount, KYD)
fun KYD(amount: Double): Amount<Currency> = AMOUNT(amount, KYD)
val Int.KYD: Amount<Currency> get() = KYD(this)
val Long.KYD: Amount<Currency> get() = KYD(this)
val Double.KYD: Amount<Currency> get() = KYD(this)


@JvmField
val KZT: Currency = Currency.getInstance("KZT")

fun KZT(amount: Int): Amount<Currency> = AMOUNT(amount, KZT)
fun KZT(amount: Long): Amount<Currency> = AMOUNT(amount, KZT)
fun KZT(amount: Double): Amount<Currency> = AMOUNT(amount, KZT)
val Int.KZT: Amount<Currency> get() = KZT(this)
val Long.KZT: Amount<Currency> get() = KZT(this)
val Double.KZT: Amount<Currency> get() = KZT(this)


@JvmField
val LAK: Currency = Currency.getInstance("LAK")

fun LAK(amount: Int): Amount<Currency> = AMOUNT(amount, LAK)
fun LAK(amount: Long): Amount<Currency> = AMOUNT(amount, LAK)
fun LAK(amount: Double): Amount<Currency> = AMOUNT(amount, LAK)
val Int.LAK: Amount<Currency> get() = LAK(this)
val Long.LAK: Amount<Currency> get() = LAK(this)
val Double.LAK: Amount<Currency> get() = LAK(this)


@JvmField
val LBP: Currency = Currency.getInstance("LBP")

fun LBP(amount: Int): Amount<Currency> = AMOUNT(amount, LBP)
fun LBP(amount: Long): Amount<Currency> = AMOUNT(amount, LBP)
fun LBP(amount: Double): Amount<Currency> = AMOUNT(amount, LBP)
val Int.LBP: Amount<Currency> get() = LBP(this)
val Long.LBP: Amount<Currency> get() = LBP(this)
val Double.LBP: Amount<Currency> get() = LBP(this)


@JvmField
val LKR: Currency = Currency.getInstance("LKR")

fun LKR(amount: Int): Amount<Currency> = AMOUNT(amount, LKR)
fun LKR(amount: Long): Amount<Currency> = AMOUNT(amount, LKR)
fun LKR(amount: Double): Amount<Currency> = AMOUNT(amount, LKR)
val Int.LKR: Amount<Currency> get() = LKR(this)
val Long.LKR: Amount<Currency> get() = LKR(this)
val Double.LKR: Amount<Currency> get() = LKR(this)


@JvmField
val LRD: Currency = Currency.getInstance("LRD")

fun LRD(amount: Int): Amount<Currency> = AMOUNT(amount, LRD)
fun LRD(amount: Long): Amount<Currency> = AMOUNT(amount, LRD)
fun LRD(amount: Double): Amount<Currency> = AMOUNT(amount, LRD)
val Int.LRD: Amount<Currency> get() = LRD(this)
val Long.LRD: Amount<Currency> get() = LRD(this)
val Double.LRD: Amount<Currency> get() = LRD(this)


@JvmField
val LSL: Currency = Currency.getInstance("LSL")

fun LSL(amount: Int): Amount<Currency> = AMOUNT(amount, LSL)
fun LSL(amount: Long): Amount<Currency> = AMOUNT(amount, LSL)
fun LSL(amount: Double): Amount<Currency> = AMOUNT(amount, LSL)
val Int.LSL: Amount<Currency> get() = LSL(this)
val Long.LSL: Amount<Currency> get() = LSL(this)
val Double.LSL: Amount<Currency> get() = LSL(this)


@JvmField
val LTL: Currency = Currency.getInstance("LTL")

fun LTL(amount: Int): Amount<Currency> = AMOUNT(amount, LTL)
fun LTL(amount: Long): Amount<Currency> = AMOUNT(amount, LTL)
fun LTL(amount: Double): Amount<Currency> = AMOUNT(amount, LTL)
val Int.LTL: Amount<Currency> get() = LTL(this)
val Long.LTL: Amount<Currency> get() = LTL(this)
val Double.LTL: Amount<Currency> get() = LTL(this)


@JvmField
val LUF: Currency = Currency.getInstance("LUF")

fun LUF(amount: Int): Amount<Currency> = AMOUNT(amount, LUF)
fun LUF(amount: Long): Amount<Currency> = AMOUNT(amount, LUF)
fun LUF(amount: Double): Amount<Currency> = AMOUNT(amount, LUF)
val Int.LUF: Amount<Currency> get() = LUF(this)
val Long.LUF: Amount<Currency> get() = LUF(this)
val Double.LUF: Amount<Currency> get() = LUF(this)


@JvmField
val LVL: Currency = Currency.getInstance("LVL")

fun LVL(amount: Int): Amount<Currency> = AMOUNT(amount, LVL)
fun LVL(amount: Long): Amount<Currency> = AMOUNT(amount, LVL)
fun LVL(amount: Double): Amount<Currency> = AMOUNT(amount, LVL)
val Int.LVL: Amount<Currency> get() = LVL(this)
val Long.LVL: Amount<Currency> get() = LVL(this)
val Double.LVL: Amount<Currency> get() = LVL(this)


@JvmField
val LYD: Currency = Currency.getInstance("LYD")

fun LYD(amount: Int): Amount<Currency> = AMOUNT(amount, LYD)
fun LYD(amount: Long): Amount<Currency> = AMOUNT(amount, LYD)
fun LYD(amount: Double): Amount<Currency> = AMOUNT(amount, LYD)
val Int.LYD: Amount<Currency> get() = LYD(this)
val Long.LYD: Amount<Currency> get() = LYD(this)
val Double.LYD: Amount<Currency> get() = LYD(this)


@JvmField
val MAD: Currency = Currency.getInstance("MAD")

fun MAD(amount: Int): Amount<Currency> = AMOUNT(amount, MAD)
fun MAD(amount: Long): Amount<Currency> = AMOUNT(amount, MAD)
fun MAD(amount: Double): Amount<Currency> = AMOUNT(amount, MAD)
val Int.MAD: Amount<Currency> get() = MAD(this)
val Long.MAD: Amount<Currency> get() = MAD(this)
val Double.MAD: Amount<Currency> get() = MAD(this)


@JvmField
val MDL: Currency = Currency.getInstance("MDL")

fun MDL(amount: Int): Amount<Currency> = AMOUNT(amount, MDL)
fun MDL(amount: Long): Amount<Currency> = AMOUNT(amount, MDL)
fun MDL(amount: Double): Amount<Currency> = AMOUNT(amount, MDL)
val Int.MDL: Amount<Currency> get() = MDL(this)
val Long.MDL: Amount<Currency> get() = MDL(this)
val Double.MDL: Amount<Currency> get() = MDL(this)


@JvmField
val MGA: Currency = Currency.getInstance("MGA")

fun MGA(amount: Int): Amount<Currency> = AMOUNT(amount, MGA)
fun MGA(amount: Long): Amount<Currency> = AMOUNT(amount, MGA)
fun MGA(amount: Double): Amount<Currency> = AMOUNT(amount, MGA)
val Int.MGA: Amount<Currency> get() = MGA(this)
val Long.MGA: Amount<Currency> get() = MGA(this)
val Double.MGA: Amount<Currency> get() = MGA(this)


@JvmField
val MGF: Currency = Currency.getInstance("MGF")

fun MGF(amount: Int): Amount<Currency> = AMOUNT(amount, MGF)
fun MGF(amount: Long): Amount<Currency> = AMOUNT(amount, MGF)
fun MGF(amount: Double): Amount<Currency> = AMOUNT(amount, MGF)
val Int.MGF: Amount<Currency> get() = MGF(this)
val Long.MGF: Amount<Currency> get() = MGF(this)
val Double.MGF: Amount<Currency> get() = MGF(this)


@JvmField
val MKD: Currency = Currency.getInstance("MKD")

fun MKD(amount: Int): Amount<Currency> = AMOUNT(amount, MKD)
fun MKD(amount: Long): Amount<Currency> = AMOUNT(amount, MKD)
fun MKD(amount: Double): Amount<Currency> = AMOUNT(amount, MKD)
val Int.MKD: Amount<Currency> get() = MKD(this)
val Long.MKD: Amount<Currency> get() = MKD(this)
val Double.MKD: Amount<Currency> get() = MKD(this)


@JvmField
val MMK: Currency = Currency.getInstance("MMK")

fun MMK(amount: Int): Amount<Currency> = AMOUNT(amount, MMK)
fun MMK(amount: Long): Amount<Currency> = AMOUNT(amount, MMK)
fun MMK(amount: Double): Amount<Currency> = AMOUNT(amount, MMK)
val Int.MMK: Amount<Currency> get() = MMK(this)
val Long.MMK: Amount<Currency> get() = MMK(this)
val Double.MMK: Amount<Currency> get() = MMK(this)


@JvmField
val MNT: Currency = Currency.getInstance("MNT")

fun MNT(amount: Int): Amount<Currency> = AMOUNT(amount, MNT)
fun MNT(amount: Long): Amount<Currency> = AMOUNT(amount, MNT)
fun MNT(amount: Double): Amount<Currency> = AMOUNT(amount, MNT)
val Int.MNT: Amount<Currency> get() = MNT(this)
val Long.MNT: Amount<Currency> get() = MNT(this)
val Double.MNT: Amount<Currency> get() = MNT(this)


@JvmField
val MOP: Currency = Currency.getInstance("MOP")

fun MOP(amount: Int): Amount<Currency> = AMOUNT(amount, MOP)
fun MOP(amount: Long): Amount<Currency> = AMOUNT(amount, MOP)
fun MOP(amount: Double): Amount<Currency> = AMOUNT(amount, MOP)
val Int.MOP: Amount<Currency> get() = MOP(this)
val Long.MOP: Amount<Currency> get() = MOP(this)
val Double.MOP: Amount<Currency> get() = MOP(this)


@JvmField
val MRO: Currency = Currency.getInstance("MRO")

fun MRO(amount: Int): Amount<Currency> = AMOUNT(amount, MRO)
fun MRO(amount: Long): Amount<Currency> = AMOUNT(amount, MRO)
fun MRO(amount: Double): Amount<Currency> = AMOUNT(amount, MRO)
val Int.MRO: Amount<Currency> get() = MRO(this)
val Long.MRO: Amount<Currency> get() = MRO(this)
val Double.MRO: Amount<Currency> get() = MRO(this)


@JvmField
val MTL: Currency = Currency.getInstance("MTL")

fun MTL(amount: Int): Amount<Currency> = AMOUNT(amount, MTL)
fun MTL(amount: Long): Amount<Currency> = AMOUNT(amount, MTL)
fun MTL(amount: Double): Amount<Currency> = AMOUNT(amount, MTL)
val Int.MTL: Amount<Currency> get() = MTL(this)
val Long.MTL: Amount<Currency> get() = MTL(this)
val Double.MTL: Amount<Currency> get() = MTL(this)


@JvmField
val MUR: Currency = Currency.getInstance("MUR")

fun MUR(amount: Int): Amount<Currency> = AMOUNT(amount, MUR)
fun MUR(amount: Long): Amount<Currency> = AMOUNT(amount, MUR)
fun MUR(amount: Double): Amount<Currency> = AMOUNT(amount, MUR)
val Int.MUR: Amount<Currency> get() = MUR(this)
val Long.MUR: Amount<Currency> get() = MUR(this)
val Double.MUR: Amount<Currency> get() = MUR(this)


@JvmField
val MVR: Currency = Currency.getInstance("MVR")

fun MVR(amount: Int): Amount<Currency> = AMOUNT(amount, MVR)
fun MVR(amount: Long): Amount<Currency> = AMOUNT(amount, MVR)
fun MVR(amount: Double): Amount<Currency> = AMOUNT(amount, MVR)
val Int.MVR: Amount<Currency> get() = MVR(this)
val Long.MVR: Amount<Currency> get() = MVR(this)
val Double.MVR: Amount<Currency> get() = MVR(this)


@JvmField
val MWK: Currency = Currency.getInstance("MWK")

fun MWK(amount: Int): Amount<Currency> = AMOUNT(amount, MWK)
fun MWK(amount: Long): Amount<Currency> = AMOUNT(amount, MWK)
fun MWK(amount: Double): Amount<Currency> = AMOUNT(amount, MWK)
val Int.MWK: Amount<Currency> get() = MWK(this)
val Long.MWK: Amount<Currency> get() = MWK(this)
val Double.MWK: Amount<Currency> get() = MWK(this)


@JvmField
val MXN: Currency = Currency.getInstance("MXN")

fun MXN(amount: Int): Amount<Currency> = AMOUNT(amount, MXN)
fun MXN(amount: Long): Amount<Currency> = AMOUNT(amount, MXN)
fun MXN(amount: Double): Amount<Currency> = AMOUNT(amount, MXN)
val Int.MXN: Amount<Currency> get() = MXN(this)
val Long.MXN: Amount<Currency> get() = MXN(this)
val Double.MXN: Amount<Currency> get() = MXN(this)


@JvmField
val MXV: Currency = Currency.getInstance("MXV")

fun MXV(amount: Int): Amount<Currency> = AMOUNT(amount, MXV)
fun MXV(amount: Long): Amount<Currency> = AMOUNT(amount, MXV)
fun MXV(amount: Double): Amount<Currency> = AMOUNT(amount, MXV)
val Int.MXV: Amount<Currency> get() = MXV(this)
val Long.MXV: Amount<Currency> get() = MXV(this)
val Double.MXV: Amount<Currency> get() = MXV(this)


@JvmField
val MYR: Currency = Currency.getInstance("MYR")

fun MYR(amount: Int): Amount<Currency> = AMOUNT(amount, MYR)
fun MYR(amount: Long): Amount<Currency> = AMOUNT(amount, MYR)
fun MYR(amount: Double): Amount<Currency> = AMOUNT(amount, MYR)
val Int.MYR: Amount<Currency> get() = MYR(this)
val Long.MYR: Amount<Currency> get() = MYR(this)
val Double.MYR: Amount<Currency> get() = MYR(this)


@JvmField
val MZM: Currency = Currency.getInstance("MZM")

fun MZM(amount: Int): Amount<Currency> = AMOUNT(amount, MZM)
fun MZM(amount: Long): Amount<Currency> = AMOUNT(amount, MZM)
fun MZM(amount: Double): Amount<Currency> = AMOUNT(amount, MZM)
val Int.MZM: Amount<Currency> get() = MZM(this)
val Long.MZM: Amount<Currency> get() = MZM(this)
val Double.MZM: Amount<Currency> get() = MZM(this)


@JvmField
val MZN: Currency = Currency.getInstance("MZN")

fun MZN(amount: Int): Amount<Currency> = AMOUNT(amount, MZN)
fun MZN(amount: Long): Amount<Currency> = AMOUNT(amount, MZN)
fun MZN(amount: Double): Amount<Currency> = AMOUNT(amount, MZN)
val Int.MZN: Amount<Currency> get() = MZN(this)
val Long.MZN: Amount<Currency> get() = MZN(this)
val Double.MZN: Amount<Currency> get() = MZN(this)


@JvmField
val NAD: Currency = Currency.getInstance("NAD")

fun NAD(amount: Int): Amount<Currency> = AMOUNT(amount, NAD)
fun NAD(amount: Long): Amount<Currency> = AMOUNT(amount, NAD)
fun NAD(amount: Double): Amount<Currency> = AMOUNT(amount, NAD)
val Int.NAD: Amount<Currency> get() = NAD(this)
val Long.NAD: Amount<Currency> get() = NAD(this)
val Double.NAD: Amount<Currency> get() = NAD(this)


@JvmField
val NGN: Currency = Currency.getInstance("NGN")

fun NGN(amount: Int): Amount<Currency> = AMOUNT(amount, NGN)
fun NGN(amount: Long): Amount<Currency> = AMOUNT(amount, NGN)
fun NGN(amount: Double): Amount<Currency> = AMOUNT(amount, NGN)
val Int.NGN: Amount<Currency> get() = NGN(this)
val Long.NGN: Amount<Currency> get() = NGN(this)
val Double.NGN: Amount<Currency> get() = NGN(this)


@JvmField
val NIO: Currency = Currency.getInstance("NIO")

fun NIO(amount: Int): Amount<Currency> = AMOUNT(amount, NIO)
fun NIO(amount: Long): Amount<Currency> = AMOUNT(amount, NIO)
fun NIO(amount: Double): Amount<Currency> = AMOUNT(amount, NIO)
val Int.NIO: Amount<Currency> get() = NIO(this)
val Long.NIO: Amount<Currency> get() = NIO(this)
val Double.NIO: Amount<Currency> get() = NIO(this)


@JvmField
val NLG: Currency = Currency.getInstance("NLG")

fun NLG(amount: Int): Amount<Currency> = AMOUNT(amount, NLG)
fun NLG(amount: Long): Amount<Currency> = AMOUNT(amount, NLG)
fun NLG(amount: Double): Amount<Currency> = AMOUNT(amount, NLG)
val Int.NLG: Amount<Currency> get() = NLG(this)
val Long.NLG: Amount<Currency> get() = NLG(this)
val Double.NLG: Amount<Currency> get() = NLG(this)


@JvmField
val NOK: Currency = Currency.getInstance("NOK")

fun NOK(amount: Int): Amount<Currency> = AMOUNT(amount, NOK)
fun NOK(amount: Long): Amount<Currency> = AMOUNT(amount, NOK)
fun NOK(amount: Double): Amount<Currency> = AMOUNT(amount, NOK)
val Int.NOK: Amount<Currency> get() = NOK(this)
val Long.NOK: Amount<Currency> get() = NOK(this)
val Double.NOK: Amount<Currency> get() = NOK(this)


@JvmField
val NPR: Currency = Currency.getInstance("NPR")

fun NPR(amount: Int): Amount<Currency> = AMOUNT(amount, NPR)
fun NPR(amount: Long): Amount<Currency> = AMOUNT(amount, NPR)
fun NPR(amount: Double): Amount<Currency> = AMOUNT(amount, NPR)
val Int.NPR: Amount<Currency> get() = NPR(this)
val Long.NPR: Amount<Currency> get() = NPR(this)
val Double.NPR: Amount<Currency> get() = NPR(this)


@JvmField
val NZD: Currency = Currency.getInstance("NZD")

fun NZD(amount: Int): Amount<Currency> = AMOUNT(amount, NZD)
fun NZD(amount: Long): Amount<Currency> = AMOUNT(amount, NZD)
fun NZD(amount: Double): Amount<Currency> = AMOUNT(amount, NZD)
val Int.NZD: Amount<Currency> get() = NZD(this)
val Long.NZD: Amount<Currency> get() = NZD(this)
val Double.NZD: Amount<Currency> get() = NZD(this)


@JvmField
val OMR: Currency = Currency.getInstance("OMR")

fun OMR(amount: Int): Amount<Currency> = AMOUNT(amount, OMR)
fun OMR(amount: Long): Amount<Currency> = AMOUNT(amount, OMR)
fun OMR(amount: Double): Amount<Currency> = AMOUNT(amount, OMR)
val Int.OMR: Amount<Currency> get() = OMR(this)
val Long.OMR: Amount<Currency> get() = OMR(this)
val Double.OMR: Amount<Currency> get() = OMR(this)


@JvmField
val PAB: Currency = Currency.getInstance("PAB")

fun PAB(amount: Int): Amount<Currency> = AMOUNT(amount, PAB)
fun PAB(amount: Long): Amount<Currency> = AMOUNT(amount, PAB)
fun PAB(amount: Double): Amount<Currency> = AMOUNT(amount, PAB)
val Int.PAB: Amount<Currency> get() = PAB(this)
val Long.PAB: Amount<Currency> get() = PAB(this)
val Double.PAB: Amount<Currency> get() = PAB(this)


@JvmField
val PEN: Currency = Currency.getInstance("PEN")

fun PEN(amount: Int): Amount<Currency> = AMOUNT(amount, PEN)
fun PEN(amount: Long): Amount<Currency> = AMOUNT(amount, PEN)
fun PEN(amount: Double): Amount<Currency> = AMOUNT(amount, PEN)
val Int.PEN: Amount<Currency> get() = PEN(this)
val Long.PEN: Amount<Currency> get() = PEN(this)
val Double.PEN: Amount<Currency> get() = PEN(this)


@JvmField
val PGK: Currency = Currency.getInstance("PGK")

fun PGK(amount: Int): Amount<Currency> = AMOUNT(amount, PGK)
fun PGK(amount: Long): Amount<Currency> = AMOUNT(amount, PGK)
fun PGK(amount: Double): Amount<Currency> = AMOUNT(amount, PGK)
val Int.PGK: Amount<Currency> get() = PGK(this)
val Long.PGK: Amount<Currency> get() = PGK(this)
val Double.PGK: Amount<Currency> get() = PGK(this)


@JvmField
val PHP: Currency = Currency.getInstance("PHP")

fun PHP(amount: Int): Amount<Currency> = AMOUNT(amount, PHP)
fun PHP(amount: Long): Amount<Currency> = AMOUNT(amount, PHP)
fun PHP(amount: Double): Amount<Currency> = AMOUNT(amount, PHP)
val Int.PHP: Amount<Currency> get() = PHP(this)
val Long.PHP: Amount<Currency> get() = PHP(this)
val Double.PHP: Amount<Currency> get() = PHP(this)


@JvmField
val PKR: Currency = Currency.getInstance("PKR")

fun PKR(amount: Int): Amount<Currency> = AMOUNT(amount, PKR)
fun PKR(amount: Long): Amount<Currency> = AMOUNT(amount, PKR)
fun PKR(amount: Double): Amount<Currency> = AMOUNT(amount, PKR)
val Int.PKR: Amount<Currency> get() = PKR(this)
val Long.PKR: Amount<Currency> get() = PKR(this)
val Double.PKR: Amount<Currency> get() = PKR(this)


@JvmField
val PLN: Currency = Currency.getInstance("PLN")

fun PLN(amount: Int): Amount<Currency> = AMOUNT(amount, PLN)
fun PLN(amount: Long): Amount<Currency> = AMOUNT(amount, PLN)
fun PLN(amount: Double): Amount<Currency> = AMOUNT(amount, PLN)
val Int.PLN: Amount<Currency> get() = PLN(this)
val Long.PLN: Amount<Currency> get() = PLN(this)
val Double.PLN: Amount<Currency> get() = PLN(this)


@JvmField
val PTE: Currency = Currency.getInstance("PTE")

fun PTE(amount: Int): Amount<Currency> = AMOUNT(amount, PTE)
fun PTE(amount: Long): Amount<Currency> = AMOUNT(amount, PTE)
fun PTE(amount: Double): Amount<Currency> = AMOUNT(amount, PTE)
val Int.PTE: Amount<Currency> get() = PTE(this)
val Long.PTE: Amount<Currency> get() = PTE(this)
val Double.PTE: Amount<Currency> get() = PTE(this)


@JvmField
val PYG: Currency = Currency.getInstance("PYG")

fun PYG(amount: Int): Amount<Currency> = AMOUNT(amount, PYG)
fun PYG(amount: Long): Amount<Currency> = AMOUNT(amount, PYG)
fun PYG(amount: Double): Amount<Currency> = AMOUNT(amount, PYG)
val Int.PYG: Amount<Currency> get() = PYG(this)
val Long.PYG: Amount<Currency> get() = PYG(this)
val Double.PYG: Amount<Currency> get() = PYG(this)


@JvmField
val QAR: Currency = Currency.getInstance("QAR")

fun QAR(amount: Int): Amount<Currency> = AMOUNT(amount, QAR)
fun QAR(amount: Long): Amount<Currency> = AMOUNT(amount, QAR)
fun QAR(amount: Double): Amount<Currency> = AMOUNT(amount, QAR)
val Int.QAR: Amount<Currency> get() = QAR(this)
val Long.QAR: Amount<Currency> get() = QAR(this)
val Double.QAR: Amount<Currency> get() = QAR(this)


@JvmField
val ROL: Currency = Currency.getInstance("ROL")

fun ROL(amount: Int): Amount<Currency> = AMOUNT(amount, ROL)
fun ROL(amount: Long): Amount<Currency> = AMOUNT(amount, ROL)
fun ROL(amount: Double): Amount<Currency> = AMOUNT(amount, ROL)
val Int.ROL: Amount<Currency> get() = ROL(this)
val Long.ROL: Amount<Currency> get() = ROL(this)
val Double.ROL: Amount<Currency> get() = ROL(this)


@JvmField
val RON: Currency = Currency.getInstance("RON")

fun RON(amount: Int): Amount<Currency> = AMOUNT(amount, RON)
fun RON(amount: Long): Amount<Currency> = AMOUNT(amount, RON)
fun RON(amount: Double): Amount<Currency> = AMOUNT(amount, RON)
val Int.RON: Amount<Currency> get() = RON(this)
val Long.RON: Amount<Currency> get() = RON(this)
val Double.RON: Amount<Currency> get() = RON(this)


@JvmField
val RSD: Currency = Currency.getInstance("RSD")

fun RSD(amount: Int): Amount<Currency> = AMOUNT(amount, RSD)
fun RSD(amount: Long): Amount<Currency> = AMOUNT(amount, RSD)
fun RSD(amount: Double): Amount<Currency> = AMOUNT(amount, RSD)
val Int.RSD: Amount<Currency> get() = RSD(this)
val Long.RSD: Amount<Currency> get() = RSD(this)
val Double.RSD: Amount<Currency> get() = RSD(this)


@JvmField
val RUB: Currency = Currency.getInstance("RUB")

fun RUB(amount: Int): Amount<Currency> = AMOUNT(amount, RUB)
fun RUB(amount: Long): Amount<Currency> = AMOUNT(amount, RUB)
fun RUB(amount: Double): Amount<Currency> = AMOUNT(amount, RUB)
val Int.RUB: Amount<Currency> get() = RUB(this)
val Long.RUB: Amount<Currency> get() = RUB(this)
val Double.RUB: Amount<Currency> get() = RUB(this)


@JvmField
val RUR: Currency = Currency.getInstance("RUR")

fun RUR(amount: Int): Amount<Currency> = AMOUNT(amount, RUR)
fun RUR(amount: Long): Amount<Currency> = AMOUNT(amount, RUR)
fun RUR(amount: Double): Amount<Currency> = AMOUNT(amount, RUR)
val Int.RUR: Amount<Currency> get() = RUR(this)
val Long.RUR: Amount<Currency> get() = RUR(this)
val Double.RUR: Amount<Currency> get() = RUR(this)


@JvmField
val RWF: Currency = Currency.getInstance("RWF")

fun RWF(amount: Int): Amount<Currency> = AMOUNT(amount, RWF)
fun RWF(amount: Long): Amount<Currency> = AMOUNT(amount, RWF)
fun RWF(amount: Double): Amount<Currency> = AMOUNT(amount, RWF)
val Int.RWF: Amount<Currency> get() = RWF(this)
val Long.RWF: Amount<Currency> get() = RWF(this)
val Double.RWF: Amount<Currency> get() = RWF(this)


@JvmField
val SAR: Currency = Currency.getInstance("SAR")

fun SAR(amount: Int): Amount<Currency> = AMOUNT(amount, SAR)
fun SAR(amount: Long): Amount<Currency> = AMOUNT(amount, SAR)
fun SAR(amount: Double): Amount<Currency> = AMOUNT(amount, SAR)
val Int.SAR: Amount<Currency> get() = SAR(this)
val Long.SAR: Amount<Currency> get() = SAR(this)
val Double.SAR: Amount<Currency> get() = SAR(this)


@JvmField
val SBD: Currency = Currency.getInstance("SBD")

fun SBD(amount: Int): Amount<Currency> = AMOUNT(amount, SBD)
fun SBD(amount: Long): Amount<Currency> = AMOUNT(amount, SBD)
fun SBD(amount: Double): Amount<Currency> = AMOUNT(amount, SBD)
val Int.SBD: Amount<Currency> get() = SBD(this)
val Long.SBD: Amount<Currency> get() = SBD(this)
val Double.SBD: Amount<Currency> get() = SBD(this)


@JvmField
val SCR: Currency = Currency.getInstance("SCR")

fun SCR(amount: Int): Amount<Currency> = AMOUNT(amount, SCR)
fun SCR(amount: Long): Amount<Currency> = AMOUNT(amount, SCR)
fun SCR(amount: Double): Amount<Currency> = AMOUNT(amount, SCR)
val Int.SCR: Amount<Currency> get() = SCR(this)
val Long.SCR: Amount<Currency> get() = SCR(this)
val Double.SCR: Amount<Currency> get() = SCR(this)


@JvmField
val SDD: Currency = Currency.getInstance("SDD")

fun SDD(amount: Int): Amount<Currency> = AMOUNT(amount, SDD)
fun SDD(amount: Long): Amount<Currency> = AMOUNT(amount, SDD)
fun SDD(amount: Double): Amount<Currency> = AMOUNT(amount, SDD)
val Int.SDD: Amount<Currency> get() = SDD(this)
val Long.SDD: Amount<Currency> get() = SDD(this)
val Double.SDD: Amount<Currency> get() = SDD(this)


@JvmField
val SDG: Currency = Currency.getInstance("SDG")

fun SDG(amount: Int): Amount<Currency> = AMOUNT(amount, SDG)
fun SDG(amount: Long): Amount<Currency> = AMOUNT(amount, SDG)
fun SDG(amount: Double): Amount<Currency> = AMOUNT(amount, SDG)
val Int.SDG: Amount<Currency> get() = SDG(this)
val Long.SDG: Amount<Currency> get() = SDG(this)
val Double.SDG: Amount<Currency> get() = SDG(this)


@JvmField
val SEK: Currency = Currency.getInstance("SEK")

fun SEK(amount: Int): Amount<Currency> = AMOUNT(amount, SEK)
fun SEK(amount: Long): Amount<Currency> = AMOUNT(amount, SEK)
fun SEK(amount: Double): Amount<Currency> = AMOUNT(amount, SEK)
val Int.SEK: Amount<Currency> get() = SEK(this)
val Long.SEK: Amount<Currency> get() = SEK(this)
val Double.SEK: Amount<Currency> get() = SEK(this)


@JvmField
val SGD: Currency = Currency.getInstance("SGD")

fun SGD(amount: Int): Amount<Currency> = AMOUNT(amount, SGD)
fun SGD(amount: Long): Amount<Currency> = AMOUNT(amount, SGD)
fun SGD(amount: Double): Amount<Currency> = AMOUNT(amount, SGD)
val Int.SGD: Amount<Currency> get() = SGD(this)
val Long.SGD: Amount<Currency> get() = SGD(this)
val Double.SGD: Amount<Currency> get() = SGD(this)


@JvmField
val SHP: Currency = Currency.getInstance("SHP")

fun SHP(amount: Int): Amount<Currency> = AMOUNT(amount, SHP)
fun SHP(amount: Long): Amount<Currency> = AMOUNT(amount, SHP)
fun SHP(amount: Double): Amount<Currency> = AMOUNT(amount, SHP)
val Int.SHP: Amount<Currency> get() = SHP(this)
val Long.SHP: Amount<Currency> get() = SHP(this)
val Double.SHP: Amount<Currency> get() = SHP(this)


@JvmField
val SIT: Currency = Currency.getInstance("SIT")

fun SIT(amount: Int): Amount<Currency> = AMOUNT(amount, SIT)
fun SIT(amount: Long): Amount<Currency> = AMOUNT(amount, SIT)
fun SIT(amount: Double): Amount<Currency> = AMOUNT(amount, SIT)
val Int.SIT: Amount<Currency> get() = SIT(this)
val Long.SIT: Amount<Currency> get() = SIT(this)
val Double.SIT: Amount<Currency> get() = SIT(this)


@JvmField
val SKK: Currency = Currency.getInstance("SKK")

fun SKK(amount: Int): Amount<Currency> = AMOUNT(amount, SKK)
fun SKK(amount: Long): Amount<Currency> = AMOUNT(amount, SKK)
fun SKK(amount: Double): Amount<Currency> = AMOUNT(amount, SKK)
val Int.SKK: Amount<Currency> get() = SKK(this)
val Long.SKK: Amount<Currency> get() = SKK(this)
val Double.SKK: Amount<Currency> get() = SKK(this)


@JvmField
val SLL: Currency = Currency.getInstance("SLL")

fun SLL(amount: Int): Amount<Currency> = AMOUNT(amount, SLL)
fun SLL(amount: Long): Amount<Currency> = AMOUNT(amount, SLL)
fun SLL(amount: Double): Amount<Currency> = AMOUNT(amount, SLL)
val Int.SLL: Amount<Currency> get() = SLL(this)
val Long.SLL: Amount<Currency> get() = SLL(this)
val Double.SLL: Amount<Currency> get() = SLL(this)


@JvmField
val SOS: Currency = Currency.getInstance("SOS")

fun SOS(amount: Int): Amount<Currency> = AMOUNT(amount, SOS)
fun SOS(amount: Long): Amount<Currency> = AMOUNT(amount, SOS)
fun SOS(amount: Double): Amount<Currency> = AMOUNT(amount, SOS)
val Int.SOS: Amount<Currency> get() = SOS(this)
val Long.SOS: Amount<Currency> get() = SOS(this)
val Double.SOS: Amount<Currency> get() = SOS(this)


@JvmField
val SRD: Currency = Currency.getInstance("SRD")

fun SRD(amount: Int): Amount<Currency> = AMOUNT(amount, SRD)
fun SRD(amount: Long): Amount<Currency> = AMOUNT(amount, SRD)
fun SRD(amount: Double): Amount<Currency> = AMOUNT(amount, SRD)
val Int.SRD: Amount<Currency> get() = SRD(this)
val Long.SRD: Amount<Currency> get() = SRD(this)
val Double.SRD: Amount<Currency> get() = SRD(this)


@JvmField
val SRG: Currency = Currency.getInstance("SRG")

fun SRG(amount: Int): Amount<Currency> = AMOUNT(amount, SRG)
fun SRG(amount: Long): Amount<Currency> = AMOUNT(amount, SRG)
fun SRG(amount: Double): Amount<Currency> = AMOUNT(amount, SRG)
val Int.SRG: Amount<Currency> get() = SRG(this)
val Long.SRG: Amount<Currency> get() = SRG(this)
val Double.SRG: Amount<Currency> get() = SRG(this)


@JvmField
val SSP: Currency = Currency.getInstance("SSP")

fun SSP(amount: Int): Amount<Currency> = AMOUNT(amount, SSP)
fun SSP(amount: Long): Amount<Currency> = AMOUNT(amount, SSP)
fun SSP(amount: Double): Amount<Currency> = AMOUNT(amount, SSP)
val Int.SSP: Amount<Currency> get() = SSP(this)
val Long.SSP: Amount<Currency> get() = SSP(this)
val Double.SSP: Amount<Currency> get() = SSP(this)


@JvmField
val STD: Currency = Currency.getInstance("STD")

fun STD(amount: Int): Amount<Currency> = AMOUNT(amount, STD)
fun STD(amount: Long): Amount<Currency> = AMOUNT(amount, STD)
fun STD(amount: Double): Amount<Currency> = AMOUNT(amount, STD)
val Int.STD: Amount<Currency> get() = STD(this)
val Long.STD: Amount<Currency> get() = STD(this)
val Double.STD: Amount<Currency> get() = STD(this)


@JvmField
val SVC: Currency = Currency.getInstance("SVC")

fun SVC(amount: Int): Amount<Currency> = AMOUNT(amount, SVC)
fun SVC(amount: Long): Amount<Currency> = AMOUNT(amount, SVC)
fun SVC(amount: Double): Amount<Currency> = AMOUNT(amount, SVC)
val Int.SVC: Amount<Currency> get() = SVC(this)
val Long.SVC: Amount<Currency> get() = SVC(this)
val Double.SVC: Amount<Currency> get() = SVC(this)


@JvmField
val SYP: Currency = Currency.getInstance("SYP")

fun SYP(amount: Int): Amount<Currency> = AMOUNT(amount, SYP)
fun SYP(amount: Long): Amount<Currency> = AMOUNT(amount, SYP)
fun SYP(amount: Double): Amount<Currency> = AMOUNT(amount, SYP)
val Int.SYP: Amount<Currency> get() = SYP(this)
val Long.SYP: Amount<Currency> get() = SYP(this)
val Double.SYP: Amount<Currency> get() = SYP(this)


@JvmField
val SZL: Currency = Currency.getInstance("SZL")

fun SZL(amount: Int): Amount<Currency> = AMOUNT(amount, SZL)
fun SZL(amount: Long): Amount<Currency> = AMOUNT(amount, SZL)
fun SZL(amount: Double): Amount<Currency> = AMOUNT(amount, SZL)
val Int.SZL: Amount<Currency> get() = SZL(this)
val Long.SZL: Amount<Currency> get() = SZL(this)
val Double.SZL: Amount<Currency> get() = SZL(this)


@JvmField
val THB: Currency = Currency.getInstance("THB")

fun THB(amount: Int): Amount<Currency> = AMOUNT(amount, THB)
fun THB(amount: Long): Amount<Currency> = AMOUNT(amount, THB)
fun THB(amount: Double): Amount<Currency> = AMOUNT(amount, THB)
val Int.THB: Amount<Currency> get() = THB(this)
val Long.THB: Amount<Currency> get() = THB(this)
val Double.THB: Amount<Currency> get() = THB(this)


@JvmField
val TJS: Currency = Currency.getInstance("TJS")

fun TJS(amount: Int): Amount<Currency> = AMOUNT(amount, TJS)
fun TJS(amount: Long): Amount<Currency> = AMOUNT(amount, TJS)
fun TJS(amount: Double): Amount<Currency> = AMOUNT(amount, TJS)
val Int.TJS: Amount<Currency> get() = TJS(this)
val Long.TJS: Amount<Currency> get() = TJS(this)
val Double.TJS: Amount<Currency> get() = TJS(this)


@JvmField
val TMM: Currency = Currency.getInstance("TMM")

fun TMM(amount: Int): Amount<Currency> = AMOUNT(amount, TMM)
fun TMM(amount: Long): Amount<Currency> = AMOUNT(amount, TMM)
fun TMM(amount: Double): Amount<Currency> = AMOUNT(amount, TMM)
val Int.TMM: Amount<Currency> get() = TMM(this)
val Long.TMM: Amount<Currency> get() = TMM(this)
val Double.TMM: Amount<Currency> get() = TMM(this)


@JvmField
val TMT: Currency = Currency.getInstance("TMT")

fun TMT(amount: Int): Amount<Currency> = AMOUNT(amount, TMT)
fun TMT(amount: Long): Amount<Currency> = AMOUNT(amount, TMT)
fun TMT(amount: Double): Amount<Currency> = AMOUNT(amount, TMT)
val Int.TMT: Amount<Currency> get() = TMT(this)
val Long.TMT: Amount<Currency> get() = TMT(this)
val Double.TMT: Amount<Currency> get() = TMT(this)


@JvmField
val TND: Currency = Currency.getInstance("TND")

fun TND(amount: Int): Amount<Currency> = AMOUNT(amount, TND)
fun TND(amount: Long): Amount<Currency> = AMOUNT(amount, TND)
fun TND(amount: Double): Amount<Currency> = AMOUNT(amount, TND)
val Int.TND: Amount<Currency> get() = TND(this)
val Long.TND: Amount<Currency> get() = TND(this)
val Double.TND: Amount<Currency> get() = TND(this)


@JvmField
val TOP: Currency = Currency.getInstance("TOP")

fun TOP(amount: Int): Amount<Currency> = AMOUNT(amount, TOP)
fun TOP(amount: Long): Amount<Currency> = AMOUNT(amount, TOP)
fun TOP(amount: Double): Amount<Currency> = AMOUNT(amount, TOP)
val Int.TOP: Amount<Currency> get() = TOP(this)
val Long.TOP: Amount<Currency> get() = TOP(this)
val Double.TOP: Amount<Currency> get() = TOP(this)


@JvmField
val TPE: Currency = Currency.getInstance("TPE")

fun TPE(amount: Int): Amount<Currency> = AMOUNT(amount, TPE)
fun TPE(amount: Long): Amount<Currency> = AMOUNT(amount, TPE)
fun TPE(amount: Double): Amount<Currency> = AMOUNT(amount, TPE)
val Int.TPE: Amount<Currency> get() = TPE(this)
val Long.TPE: Amount<Currency> get() = TPE(this)
val Double.TPE: Amount<Currency> get() = TPE(this)


@JvmField
val TRL: Currency = Currency.getInstance("TRL")

fun TRL(amount: Int): Amount<Currency> = AMOUNT(amount, TRL)
fun TRL(amount: Long): Amount<Currency> = AMOUNT(amount, TRL)
fun TRL(amount: Double): Amount<Currency> = AMOUNT(amount, TRL)
val Int.TRL: Amount<Currency> get() = TRL(this)
val Long.TRL: Amount<Currency> get() = TRL(this)
val Double.TRL: Amount<Currency> get() = TRL(this)


@JvmField
val TRY: Currency = Currency.getInstance("TRY")

fun TRY(amount: Int): Amount<Currency> = AMOUNT(amount, TRY)
fun TRY(amount: Long): Amount<Currency> = AMOUNT(amount, TRY)
fun TRY(amount: Double): Amount<Currency> = AMOUNT(amount, TRY)
val Int.TRY: Amount<Currency> get() = TRY(this)
val Long.TRY: Amount<Currency> get() = TRY(this)
val Double.TRY: Amount<Currency> get() = TRY(this)


@JvmField
val TTD: Currency = Currency.getInstance("TTD")

fun TTD(amount: Int): Amount<Currency> = AMOUNT(amount, TTD)
fun TTD(amount: Long): Amount<Currency> = AMOUNT(amount, TTD)
fun TTD(amount: Double): Amount<Currency> = AMOUNT(amount, TTD)
val Int.TTD: Amount<Currency> get() = TTD(this)
val Long.TTD: Amount<Currency> get() = TTD(this)
val Double.TTD: Amount<Currency> get() = TTD(this)


@JvmField
val TWD: Currency = Currency.getInstance("TWD")

fun TWD(amount: Int): Amount<Currency> = AMOUNT(amount, TWD)
fun TWD(amount: Long): Amount<Currency> = AMOUNT(amount, TWD)
fun TWD(amount: Double): Amount<Currency> = AMOUNT(amount, TWD)
val Int.TWD: Amount<Currency> get() = TWD(this)
val Long.TWD: Amount<Currency> get() = TWD(this)
val Double.TWD: Amount<Currency> get() = TWD(this)


@JvmField
val TZS: Currency = Currency.getInstance("TZS")

fun TZS(amount: Int): Amount<Currency> = AMOUNT(amount, TZS)
fun TZS(amount: Long): Amount<Currency> = AMOUNT(amount, TZS)
fun TZS(amount: Double): Amount<Currency> = AMOUNT(amount, TZS)
val Int.TZS: Amount<Currency> get() = TZS(this)
val Long.TZS: Amount<Currency> get() = TZS(this)
val Double.TZS: Amount<Currency> get() = TZS(this)


@JvmField
val UAH: Currency = Currency.getInstance("UAH")

fun UAH(amount: Int): Amount<Currency> = AMOUNT(amount, UAH)
fun UAH(amount: Long): Amount<Currency> = AMOUNT(amount, UAH)
fun UAH(amount: Double): Amount<Currency> = AMOUNT(amount, UAH)
val Int.UAH: Amount<Currency> get() = UAH(this)
val Long.UAH: Amount<Currency> get() = UAH(this)
val Double.UAH: Amount<Currency> get() = UAH(this)


@JvmField
val UGX: Currency = Currency.getInstance("UGX")

fun UGX(amount: Int): Amount<Currency> = AMOUNT(amount, UGX)
fun UGX(amount: Long): Amount<Currency> = AMOUNT(amount, UGX)
fun UGX(amount: Double): Amount<Currency> = AMOUNT(amount, UGX)
val Int.UGX: Amount<Currency> get() = UGX(this)
val Long.UGX: Amount<Currency> get() = UGX(this)
val Double.UGX: Amount<Currency> get() = UGX(this)


@JvmField
val USD: Currency = Currency.getInstance("USD")

fun USD(amount: Int): Amount<Currency> = AMOUNT(amount, USD)
fun USD(amount: Long): Amount<Currency> = AMOUNT(amount, USD)
fun USD(amount: Double): Amount<Currency> = AMOUNT(amount, USD)
val Int.USD: Amount<Currency> get() = USD(this)
val Long.USD: Amount<Currency> get() = USD(this)
val Double.USD: Amount<Currency> get() = USD(this)


@JvmField
val USN: Currency = Currency.getInstance("USN")

fun USN(amount: Int): Amount<Currency> = AMOUNT(amount, USN)
fun USN(amount: Long): Amount<Currency> = AMOUNT(amount, USN)
fun USN(amount: Double): Amount<Currency> = AMOUNT(amount, USN)
val Int.USN: Amount<Currency> get() = USN(this)
val Long.USN: Amount<Currency> get() = USN(this)
val Double.USN: Amount<Currency> get() = USN(this)


@JvmField
val USS: Currency = Currency.getInstance("USS")

fun USS(amount: Int): Amount<Currency> = AMOUNT(amount, USS)
fun USS(amount: Long): Amount<Currency> = AMOUNT(amount, USS)
fun USS(amount: Double): Amount<Currency> = AMOUNT(amount, USS)
val Int.USS: Amount<Currency> get() = USS(this)
val Long.USS: Amount<Currency> get() = USS(this)
val Double.USS: Amount<Currency> get() = USS(this)


@JvmField
val UYI: Currency = Currency.getInstance("UYI")

fun UYI(amount: Int): Amount<Currency> = AMOUNT(amount, UYI)
fun UYI(amount: Long): Amount<Currency> = AMOUNT(amount, UYI)
fun UYI(amount: Double): Amount<Currency> = AMOUNT(amount, UYI)
val Int.UYI: Amount<Currency> get() = UYI(this)
val Long.UYI: Amount<Currency> get() = UYI(this)
val Double.UYI: Amount<Currency> get() = UYI(this)


@JvmField
val UYU: Currency = Currency.getInstance("UYU")

fun UYU(amount: Int): Amount<Currency> = AMOUNT(amount, UYU)
fun UYU(amount: Long): Amount<Currency> = AMOUNT(amount, UYU)
fun UYU(amount: Double): Amount<Currency> = AMOUNT(amount, UYU)
val Int.UYU: Amount<Currency> get() = UYU(this)
val Long.UYU: Amount<Currency> get() = UYU(this)
val Double.UYU: Amount<Currency> get() = UYU(this)


@JvmField
val UZS: Currency = Currency.getInstance("UZS")

fun UZS(amount: Int): Amount<Currency> = AMOUNT(amount, UZS)
fun UZS(amount: Long): Amount<Currency> = AMOUNT(amount, UZS)
fun UZS(amount: Double): Amount<Currency> = AMOUNT(amount, UZS)
val Int.UZS: Amount<Currency> get() = UZS(this)
val Long.UZS: Amount<Currency> get() = UZS(this)
val Double.UZS: Amount<Currency> get() = UZS(this)


@JvmField
val VEB: Currency = Currency.getInstance("VEB")

fun VEB(amount: Int): Amount<Currency> = AMOUNT(amount, VEB)
fun VEB(amount: Long): Amount<Currency> = AMOUNT(amount, VEB)
fun VEB(amount: Double): Amount<Currency> = AMOUNT(amount, VEB)
val Int.VEB: Amount<Currency> get() = VEB(this)
val Long.VEB: Amount<Currency> get() = VEB(this)
val Double.VEB: Amount<Currency> get() = VEB(this)


@JvmField
val VEF: Currency = Currency.getInstance("VEF")

fun VEF(amount: Int): Amount<Currency> = AMOUNT(amount, VEF)
fun VEF(amount: Long): Amount<Currency> = AMOUNT(amount, VEF)
fun VEF(amount: Double): Amount<Currency> = AMOUNT(amount, VEF)
val Int.VEF: Amount<Currency> get() = VEF(this)
val Long.VEF: Amount<Currency> get() = VEF(this)
val Double.VEF: Amount<Currency> get() = VEF(this)


@JvmField
val VND: Currency = Currency.getInstance("VND")

fun VND(amount: Int): Amount<Currency> = AMOUNT(amount, VND)
fun VND(amount: Long): Amount<Currency> = AMOUNT(amount, VND)
fun VND(amount: Double): Amount<Currency> = AMOUNT(amount, VND)
val Int.VND: Amount<Currency> get() = VND(this)
val Long.VND: Amount<Currency> get() = VND(this)
val Double.VND: Amount<Currency> get() = VND(this)


@JvmField
val VUV: Currency = Currency.getInstance("VUV")

fun VUV(amount: Int): Amount<Currency> = AMOUNT(amount, VUV)
fun VUV(amount: Long): Amount<Currency> = AMOUNT(amount, VUV)
fun VUV(amount: Double): Amount<Currency> = AMOUNT(amount, VUV)
val Int.VUV: Amount<Currency> get() = VUV(this)
val Long.VUV: Amount<Currency> get() = VUV(this)
val Double.VUV: Amount<Currency> get() = VUV(this)


@JvmField
val WST: Currency = Currency.getInstance("WST")

fun WST(amount: Int): Amount<Currency> = AMOUNT(amount, WST)
fun WST(amount: Long): Amount<Currency> = AMOUNT(amount, WST)
fun WST(amount: Double): Amount<Currency> = AMOUNT(amount, WST)
val Int.WST: Amount<Currency> get() = WST(this)
val Long.WST: Amount<Currency> get() = WST(this)
val Double.WST: Amount<Currency> get() = WST(this)


@JvmField
val XAF: Currency = Currency.getInstance("XAF")

fun XAF(amount: Int): Amount<Currency> = AMOUNT(amount, XAF)
fun XAF(amount: Long): Amount<Currency> = AMOUNT(amount, XAF)
fun XAF(amount: Double): Amount<Currency> = AMOUNT(amount, XAF)
val Int.XAF: Amount<Currency> get() = XAF(this)
val Long.XAF: Amount<Currency> get() = XAF(this)
val Double.XAF: Amount<Currency> get() = XAF(this)


@JvmField
val XAG: Currency = Currency.getInstance("XAG")

fun XAG(amount: Int): Amount<Currency> = AMOUNT(amount, XAG)
fun XAG(amount: Long): Amount<Currency> = AMOUNT(amount, XAG)
fun XAG(amount: Double): Amount<Currency> = AMOUNT(amount, XAG)
val Int.XAG: Amount<Currency> get() = XAG(this)
val Long.XAG: Amount<Currency> get() = XAG(this)
val Double.XAG: Amount<Currency> get() = XAG(this)


@JvmField
val XAU: Currency = Currency.getInstance("XAU")

fun XAU(amount: Int): Amount<Currency> = AMOUNT(amount, XAU)
fun XAU(amount: Long): Amount<Currency> = AMOUNT(amount, XAU)
fun XAU(amount: Double): Amount<Currency> = AMOUNT(amount, XAU)
val Int.XAU: Amount<Currency> get() = XAU(this)
val Long.XAU: Amount<Currency> get() = XAU(this)
val Double.XAU: Amount<Currency> get() = XAU(this)


@JvmField
val XBA: Currency = Currency.getInstance("XBA")

fun XBA(amount: Int): Amount<Currency> = AMOUNT(amount, XBA)
fun XBA(amount: Long): Amount<Currency> = AMOUNT(amount, XBA)
fun XBA(amount: Double): Amount<Currency> = AMOUNT(amount, XBA)
val Int.XBA: Amount<Currency> get() = XBA(this)
val Long.XBA: Amount<Currency> get() = XBA(this)
val Double.XBA: Amount<Currency> get() = XBA(this)


@JvmField
val XBB: Currency = Currency.getInstance("XBB")

fun XBB(amount: Int): Amount<Currency> = AMOUNT(amount, XBB)
fun XBB(amount: Long): Amount<Currency> = AMOUNT(amount, XBB)
fun XBB(amount: Double): Amount<Currency> = AMOUNT(amount, XBB)
val Int.XBB: Amount<Currency> get() = XBB(this)
val Long.XBB: Amount<Currency> get() = XBB(this)
val Double.XBB: Amount<Currency> get() = XBB(this)


@JvmField
val XBC: Currency = Currency.getInstance("XBC")

fun XBC(amount: Int): Amount<Currency> = AMOUNT(amount, XBC)
fun XBC(amount: Long): Amount<Currency> = AMOUNT(amount, XBC)
fun XBC(amount: Double): Amount<Currency> = AMOUNT(amount, XBC)
val Int.XBC: Amount<Currency> get() = XBC(this)
val Long.XBC: Amount<Currency> get() = XBC(this)
val Double.XBC: Amount<Currency> get() = XBC(this)


@JvmField
val XBD: Currency = Currency.getInstance("XBD")

fun XBD(amount: Int): Amount<Currency> = AMOUNT(amount, XBD)
fun XBD(amount: Long): Amount<Currency> = AMOUNT(amount, XBD)
fun XBD(amount: Double): Amount<Currency> = AMOUNT(amount, XBD)
val Int.XBD: Amount<Currency> get() = XBD(this)
val Long.XBD: Amount<Currency> get() = XBD(this)
val Double.XBD: Amount<Currency> get() = XBD(this)


@JvmField
val XCD: Currency = Currency.getInstance("XCD")

fun XCD(amount: Int): Amount<Currency> = AMOUNT(amount, XCD)
fun XCD(amount: Long): Amount<Currency> = AMOUNT(amount, XCD)
fun XCD(amount: Double): Amount<Currency> = AMOUNT(amount, XCD)
val Int.XCD: Amount<Currency> get() = XCD(this)
val Long.XCD: Amount<Currency> get() = XCD(this)
val Double.XCD: Amount<Currency> get() = XCD(this)


@JvmField
val XDR: Currency = Currency.getInstance("XDR")

fun XDR(amount: Int): Amount<Currency> = AMOUNT(amount, XDR)
fun XDR(amount: Long): Amount<Currency> = AMOUNT(amount, XDR)
fun XDR(amount: Double): Amount<Currency> = AMOUNT(amount, XDR)
val Int.XDR: Amount<Currency> get() = XDR(this)
val Long.XDR: Amount<Currency> get() = XDR(this)
val Double.XDR: Amount<Currency> get() = XDR(this)


@JvmField
val XFO: Currency = Currency.getInstance("XFO")

fun XFO(amount: Int): Amount<Currency> = AMOUNT(amount, XFO)
fun XFO(amount: Long): Amount<Currency> = AMOUNT(amount, XFO)
fun XFO(amount: Double): Amount<Currency> = AMOUNT(amount, XFO)
val Int.XFO: Amount<Currency> get() = XFO(this)
val Long.XFO: Amount<Currency> get() = XFO(this)
val Double.XFO: Amount<Currency> get() = XFO(this)


@JvmField
val XFU: Currency = Currency.getInstance("XFU")

fun XFU(amount: Int): Amount<Currency> = AMOUNT(amount, XFU)
fun XFU(amount: Long): Amount<Currency> = AMOUNT(amount, XFU)
fun XFU(amount: Double): Amount<Currency> = AMOUNT(amount, XFU)
val Int.XFU: Amount<Currency> get() = XFU(this)
val Long.XFU: Amount<Currency> get() = XFU(this)
val Double.XFU: Amount<Currency> get() = XFU(this)


@JvmField
val XOF: Currency = Currency.getInstance("XOF")

fun XOF(amount: Int): Amount<Currency> = AMOUNT(amount, XOF)
fun XOF(amount: Long): Amount<Currency> = AMOUNT(amount, XOF)
fun XOF(amount: Double): Amount<Currency> = AMOUNT(amount, XOF)
val Int.XOF: Amount<Currency> get() = XOF(this)
val Long.XOF: Amount<Currency> get() = XOF(this)
val Double.XOF: Amount<Currency> get() = XOF(this)


@JvmField
val XPD: Currency = Currency.getInstance("XPD")

fun XPD(amount: Int): Amount<Currency> = AMOUNT(amount, XPD)
fun XPD(amount: Long): Amount<Currency> = AMOUNT(amount, XPD)
fun XPD(amount: Double): Amount<Currency> = AMOUNT(amount, XPD)
val Int.XPD: Amount<Currency> get() = XPD(this)
val Long.XPD: Amount<Currency> get() = XPD(this)
val Double.XPD: Amount<Currency> get() = XPD(this)


@JvmField
val XPF: Currency = Currency.getInstance("XPF")

fun XPF(amount: Int): Amount<Currency> = AMOUNT(amount, XPF)
fun XPF(amount: Long): Amount<Currency> = AMOUNT(amount, XPF)
fun XPF(amount: Double): Amount<Currency> = AMOUNT(amount, XPF)
val Int.XPF: Amount<Currency> get() = XPF(this)
val Long.XPF: Amount<Currency> get() = XPF(this)
val Double.XPF: Amount<Currency> get() = XPF(this)


@JvmField
val XPT: Currency = Currency.getInstance("XPT")

fun XPT(amount: Int): Amount<Currency> = AMOUNT(amount, XPT)
fun XPT(amount: Long): Amount<Currency> = AMOUNT(amount, XPT)
fun XPT(amount: Double): Amount<Currency> = AMOUNT(amount, XPT)
val Int.XPT: Amount<Currency> get() = XPT(this)
val Long.XPT: Amount<Currency> get() = XPT(this)
val Double.XPT: Amount<Currency> get() = XPT(this)


@JvmField
val XSU: Currency = Currency.getInstance("XSU")

fun XSU(amount: Int): Amount<Currency> = AMOUNT(amount, XSU)
fun XSU(amount: Long): Amount<Currency> = AMOUNT(amount, XSU)
fun XSU(amount: Double): Amount<Currency> = AMOUNT(amount, XSU)
val Int.XSU: Amount<Currency> get() = XSU(this)
val Long.XSU: Amount<Currency> get() = XSU(this)
val Double.XSU: Amount<Currency> get() = XSU(this)


@JvmField
val XTS: Currency = Currency.getInstance("XTS")

fun XTS(amount: Int): Amount<Currency> = AMOUNT(amount, XTS)
fun XTS(amount: Long): Amount<Currency> = AMOUNT(amount, XTS)
fun XTS(amount: Double): Amount<Currency> = AMOUNT(amount, XTS)
val Int.XTS: Amount<Currency> get() = XTS(this)
val Long.XTS: Amount<Currency> get() = XTS(this)
val Double.XTS: Amount<Currency> get() = XTS(this)


@JvmField
val XUA: Currency = Currency.getInstance("XUA")

fun XUA(amount: Int): Amount<Currency> = AMOUNT(amount, XUA)
fun XUA(amount: Long): Amount<Currency> = AMOUNT(amount, XUA)
fun XUA(amount: Double): Amount<Currency> = AMOUNT(amount, XUA)
val Int.XUA: Amount<Currency> get() = XUA(this)
val Long.XUA: Amount<Currency> get() = XUA(this)
val Double.XUA: Amount<Currency> get() = XUA(this)


@JvmField
val XXX: Currency = Currency.getInstance("XXX")

fun XXX(amount: Int): Amount<Currency> = AMOUNT(amount, XXX)
fun XXX(amount: Long): Amount<Currency> = AMOUNT(amount, XXX)
fun XXX(amount: Double): Amount<Currency> = AMOUNT(amount, XXX)
val Int.XXX: Amount<Currency> get() = XXX(this)
val Long.XXX: Amount<Currency> get() = XXX(this)
val Double.XXX: Amount<Currency> get() = XXX(this)


@JvmField
val YER: Currency = Currency.getInstance("YER")

fun YER(amount: Int): Amount<Currency> = AMOUNT(amount, YER)
fun YER(amount: Long): Amount<Currency> = AMOUNT(amount, YER)
fun YER(amount: Double): Amount<Currency> = AMOUNT(amount, YER)
val Int.YER: Amount<Currency> get() = YER(this)
val Long.YER: Amount<Currency> get() = YER(this)
val Double.YER: Amount<Currency> get() = YER(this)


@JvmField
val YUM: Currency = Currency.getInstance("YUM")

fun YUM(amount: Int): Amount<Currency> = AMOUNT(amount, YUM)
fun YUM(amount: Long): Amount<Currency> = AMOUNT(amount, YUM)
fun YUM(amount: Double): Amount<Currency> = AMOUNT(amount, YUM)
val Int.YUM: Amount<Currency> get() = YUM(this)
val Long.YUM: Amount<Currency> get() = YUM(this)
val Double.YUM: Amount<Currency> get() = YUM(this)


@JvmField
val ZAR: Currency = Currency.getInstance("ZAR")

fun ZAR(amount: Int): Amount<Currency> = AMOUNT(amount, ZAR)
fun ZAR(amount: Long): Amount<Currency> = AMOUNT(amount, ZAR)
fun ZAR(amount: Double): Amount<Currency> = AMOUNT(amount, ZAR)
val Int.ZAR: Amount<Currency> get() = ZAR(this)
val Long.ZAR: Amount<Currency> get() = ZAR(this)
val Double.ZAR: Amount<Currency> get() = ZAR(this)


@JvmField
val ZMK: Currency = Currency.getInstance("ZMK")

fun ZMK(amount: Int): Amount<Currency> = AMOUNT(amount, ZMK)
fun ZMK(amount: Long): Amount<Currency> = AMOUNT(amount, ZMK)
fun ZMK(amount: Double): Amount<Currency> = AMOUNT(amount, ZMK)
val Int.ZMK: Amount<Currency> get() = ZMK(this)
val Long.ZMK: Amount<Currency> get() = ZMK(this)
val Double.ZMK: Amount<Currency> get() = ZMK(this)


@JvmField
val ZMW: Currency = Currency.getInstance("ZMW")

fun ZMW(amount: Int): Amount<Currency> = AMOUNT(amount, ZMW)
fun ZMW(amount: Long): Amount<Currency> = AMOUNT(amount, ZMW)
fun ZMW(amount: Double): Amount<Currency> = AMOUNT(amount, ZMW)
val Int.ZMW: Amount<Currency> get() = ZMW(this)
val Long.ZMW: Amount<Currency> get() = ZMW(this)
val Double.ZMW: Amount<Currency> get() = ZMW(this)


@JvmField
val ZWD: Currency = Currency.getInstance("ZWD")

fun ZWD(amount: Int): Amount<Currency> = AMOUNT(amount, ZWD)
fun ZWD(amount: Long): Amount<Currency> = AMOUNT(amount, ZWD)
fun ZWD(amount: Double): Amount<Currency> = AMOUNT(amount, ZWD)
val Int.ZWD: Amount<Currency> get() = ZWD(this)
val Long.ZWD: Amount<Currency> get() = ZWD(this)
val Double.ZWD: Amount<Currency> get() = ZWD(this)


@JvmField
val ZWL: Currency = Currency.getInstance("ZWL")

fun ZWL(amount: Int): Amount<Currency> = AMOUNT(amount, ZWL)
fun ZWL(amount: Long): Amount<Currency> = AMOUNT(amount, ZWL)
fun ZWL(amount: Double): Amount<Currency> = AMOUNT(amount, ZWL)
val Int.ZWL: Amount<Currency> get() = ZWL(this)
val Long.ZWL: Amount<Currency> get() = ZWL(this)
val Double.ZWL: Amount<Currency> get() = ZWL(this)


@JvmField
val ZWN: Currency = Currency.getInstance("ZWN")

fun ZWN(amount: Int): Amount<Currency> = AMOUNT(amount, ZWN)
fun ZWN(amount: Long): Amount<Currency> = AMOUNT(amount, ZWN)
fun ZWN(amount: Double): Amount<Currency> = AMOUNT(amount, ZWN)
val Int.ZWN: Amount<Currency> get() = ZWN(this)
val Long.ZWN: Amount<Currency> get() = ZWN(this)
val Double.ZWN: Amount<Currency> get() = ZWN(this)


@JvmField
val ZWR: Currency = Currency.getInstance("ZWR")

fun ZWR(amount: Int): Amount<Currency> = AMOUNT(amount, ZWR)
fun ZWR(amount: Long): Amount<Currency> = AMOUNT(amount, ZWR)
fun ZWR(amount: Double): Amount<Currency> = AMOUNT(amount, ZWR)
val Int.ZWR: Amount<Currency> get() = ZWR(this)
val Long.ZWR: Amount<Currency> get() = ZWR(this)
val Double.ZWR: Amount<Currency> get() = ZWR(this)
