package be.abstraction.providers

actual fun platformSpecificBankNames(): List<String> {
    val bankNames = listOf(
        "iOS_BNP Paribas",
        "iOS_ING",
        "iOS_KBC",
        "iOS_Europabank",
        "iOS_Beobank",
        "iOS_Belfius",
        "iOS_AXA",
        "iOS_Argenta"
    )
    return bankNames
}