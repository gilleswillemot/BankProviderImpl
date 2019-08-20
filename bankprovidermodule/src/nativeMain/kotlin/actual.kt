package be.abstraction.providers

actual fun platformSpecificBankNames(): List<String> {
    val bankNames = listOf(
        "Native_BNP Paribas",
        "Native_ING",
        "Native_KBC",
        "Native_Europabank",
        "Native_Beobank",
        "Native_Belfius",
        "Native_AXA",
        "Native_Argenta"
    )
    return bankNames
}