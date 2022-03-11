import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FizzBuzzTest {
    @Test
    public void play() {
        play_give_3();
        play_give_33();
        play_give_12();
        play_give_5();
        play_give_10();
        play_give_25();
        play_give_15();
        play_give_30();
    }

    @Test
    public void play_give_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(3);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void play_give_33() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(33);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void play_give_12() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(12);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void play_give_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(5);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void play_give_10() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(10);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void play_give_25() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(25);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void play_give_15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(15);
        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    public void play_give_30() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(30);
        Assertions.assertEquals("FizzBuzz", result);
    }


}