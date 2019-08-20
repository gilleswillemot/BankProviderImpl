package be.abstraction.providers

actual fun platformSpecificBankNames(): List<String> {
    val bankNames = listOf(
        "Android_BNP Paribas",
        "Android_ING",
        "Android_KBC",
        "Android_Europabank",
        "Android_Beobank",
        "Android_Belfius",
        "Android_AXA",
        "Android_Argenta"
    )
    return bankNames
}