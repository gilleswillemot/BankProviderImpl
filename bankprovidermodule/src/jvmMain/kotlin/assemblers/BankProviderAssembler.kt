package assemblers

import be.abstraction.core.interfaces.IBankProvider
import be.abstraction.providers.BankProvider
import org.koin.dsl.module

val bankProviderModule = module {
    single { BankProvider() as IBankProvider }
}