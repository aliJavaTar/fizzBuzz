public class FizzBuzz {

    public  String play(int number) {
        if (aya_bakhs_pazer_3_hast(number)) {
            if (aya_bakhs_pazer_5_hast(number)) {
                return "FizzBuzz";
            }
            return "Fizz";
        } else if (aya_bakhs_pazer_5_hast(number)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private  boolean aya_bakhs_pazer_3_hast(int number) {
        return number % 3 == 0;
    }

    private  boolean aya_bakhs_pazer_5_hast(int number) {
        return number % 5 == 0;
    }
}
