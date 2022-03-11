import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FizzBuzzTest {
    FizzBuzz fizzBuzz;
    @BeforeEach
    private void beforeEach() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void play() {
        bakhpazerBar_3();
        bakhpazerBar_5();
        bakhshpazirBar_3_va_5();
    }

    @Test
    private void bakhpazerBar_3() {
        String result1 = fizzBuzz.play(3);
        Assertions.assertEquals("Fizz", result1);
        String result2 = fizzBuzz.play(33);
        Assertions.assertEquals("Fizz", result2);
        String result3 = fizzBuzz.play(12);
        Assertions.assertEquals("Fizz", result3);
    }

    @Test
    private void bakhpazerBar_5() {
        String result1 = fizzBuzz.play(5);
        Assertions.assertEquals("Buzz", result1);
        String result2 = fizzBuzz.play(10);
        Assertions.assertEquals("Buzz", result2);
        String result3 = fizzBuzz.play(25);
        Assertions.assertEquals("Buzz", result3);
    }

    private void bakhshpazirBar_3_va_5() {
        String result = fizzBuzz.play(15);
        Assertions.assertEquals("FizzBuzz", result);
        String result2 = fizzBuzz.play(30);
        Assertions.assertEquals("FizzBuzz", result2);
        String result3 = fizzBuzz.play(45);
        Assertions.assertEquals("FizzBuzz", result3);
    }
}