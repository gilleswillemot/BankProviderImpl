package be.abstraction.providers

import be.abstraction.core.interfaces.IBankProvider
import be.abstraction.core.models.Bank

class BankProvider : IBankProvider {
    private lateinit var banks: List<Bank>

    init {
        initBanks()
    }

    override fun getBanks(): List<Bank> {
        return banks
    }

    private fun initBanks() {
        val bankNames = listOf(
            "BNP Paribas",
            "ING",
            "KBC",
            "Europabank",
            "Beobank",
            "Belfius",
            "AXA",
            "Argenta"
        )

        banks = bankNames.map { Bank(it) }
    }
}