import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeTests {

    @ParameterizedTest(name = "{0} is prime.")
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17})
    @DisplayName("Prime numbers test")
    void primeNumbers(int n) {
        assertTrue(Main.isPrime(n));
    }

    @ParameterizedTest(name = "{0} is not prime.")
    @ValueSource(ints = {1, 4, 6, 8, 9, 10, 12, 14, 15, 16})
    @DisplayName("Not prime numbers test")
    void notPrimeNumbers(int n) {
        assertFalse(Main.isPrime(n));
    }
}
