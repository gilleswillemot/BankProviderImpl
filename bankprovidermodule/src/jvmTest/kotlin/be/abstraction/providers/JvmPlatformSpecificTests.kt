package be.abstraction.providers

import assemblers.bankProviderModule
import be.abstraction.core.interfaces.IBankProvider
import org.junit.Test
import org.junit.Assert.*
import org.koin.core.context.GlobalContext.get
import org.koin.core.context.startKoin

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class JvmPlatformSpecificTests {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    /**
     * Test if bankProvider module type is an IBankProvider interface.
     * Otherwise the injection in Android won't work, as Android works with IBankProvider
     * in the code and not BankProvider class.
     */
    @Test
    fun bankProviderAssembler_createIBankProviderModule() {
//        // Lazy inject property
//        val bankProvider: IBankProvider by inject()
//
//        startKoin {
//            modules(bankProviderModule)
//        }
//
//        val bankProvider2 = get<IBankProvider>()
//        declareMock<IBankProvider>()
//
//        assertEquals("IBankProvider", bankProvider.toString())
    }
}
