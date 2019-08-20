package be.abstraction.providers

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

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
        assertTrue(bank.name.contains("BNP Paribas")) // Assert because JVM it will be 'Android_BNP Paribas' and common 'BNP Paribas'
    }
}