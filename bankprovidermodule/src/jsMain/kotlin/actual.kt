package be.abstraction.providers

actual fun platformSpecificBankNames(): List<String> {
    val bankNames = listOf(
        "js_BNP Paribas",
        "js_ING",
        "js_KBC",
        "js_Europabank",
        "js_Beobank",
        "js_Belfius",
        "js_AXA",
        "js_Argenta"
    )
    return bankNames
}