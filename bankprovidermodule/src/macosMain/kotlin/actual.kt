package be.abstraction.providers

actual fun platformSpecificBankNames(): List<String> {
    val bankNames = listOf(
        "macOS_BNP Paribas",
        "macOS_ING",
        "macOS_KBC",
        "macOS_Europabank",
        "macOS_Beobank",
        "macOS_Belfius",
        "macOS_AXA",
        "macOS_Argenta"
    )
    return bankNames
}