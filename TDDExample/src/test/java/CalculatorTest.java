import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;



/*
SWE202 SOFTWARE VERIFICATION AND VALIDATION
Arman Yaycı
B201202050
Github Repo: https://github.com/armanyayci/SWE202-HW1
*/
class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "10, 4, 2.5",
            "12.5, 5, 2.5",
            "10, 2.5, 4",
            "12.5, 2.5, 5"
    })
    void divide_WhenCalledWithParameters_itShouldReturnResult(double a, double b, double expectedValue) {
        assertEquals(expectedValue, Calculator.divide(a, b));
    }

    @ParameterizedTest
    @CsvSource({"12.5, 0.0"})
    void divide_WhenDivideByZero_itShouldThrowIllegalArgumentException(double a, double b) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculator.divide(a, b);
        });
    }

}