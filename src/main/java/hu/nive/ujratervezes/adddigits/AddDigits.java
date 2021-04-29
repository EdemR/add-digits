package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    int addDigits (String input) {
        if (input == null || input.equals("")) {
            return -1;
        }

        String[] numbers = input.replaceAll("[^0-9]", "").split("");
        int result = 0;

        if (!numbers[0].equals("")) {
            for (String number : numbers) {
                result += Integer.parseInt(number);
            }
        }

        return result;
    }
}