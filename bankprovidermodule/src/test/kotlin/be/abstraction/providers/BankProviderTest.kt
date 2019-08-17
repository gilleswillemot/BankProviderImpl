package be.abstraction.providers

import kotlin.test.Test
import kotlin.test.assertEquals

class BankProviderTest {
    @Test
    fun bankProviderReturnsBanksTest() {
        val bankProvider = BankProvider()
        val numberOfBanks = bankProvider.getBanks().size
        assertEquals(numberOfBanks, 8)
    }

    @Test
    fun bankProviderFirstBankIsBNPParibasTest() {
        val bankProvider = BankProvider()
        val bank = bankProvider.getBanks().first()
        assertEquals(bank.name, "BNP Paribas")
    }
}