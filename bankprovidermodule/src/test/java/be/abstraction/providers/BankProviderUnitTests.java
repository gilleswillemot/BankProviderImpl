package be.abstraction.providers;

import be.abstraction.core.models.Bank;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class BankProviderUnitTests {
    @Test
    public void bankSize_isCorrect() {
        BankProvider bankProvider = new BankProvider();
        List<Bank> banks = bankProvider.getBanks();

        assertEquals(8, banks.size());
    }
}
