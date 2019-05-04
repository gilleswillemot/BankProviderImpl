package be.abstraction.bank.implementations
import models.Bank

class BankProvider : IBankProvider {
    override fun getBanks(): List<Bank> {
        val bankNames = listOf( // todo: make json of each bank, for if we'd add fields in the future.
            "BNP Paribas",
            "ING",
            "KBC",
            "Europabank",
            "Beobank",
            "Belfius",
            "AXA",
            "Argenta"
        )

        val banks = bankNames.map { Bank(it) }

        return banks
    }
}