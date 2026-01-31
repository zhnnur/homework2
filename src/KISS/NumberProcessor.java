package KISS;

public class NumberProcessor {
    public void processNumbers(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return;
        }


        for (int number : numbers) {
            if (number > 10) {
                System.out.println(number);
            }
        }
    }
}