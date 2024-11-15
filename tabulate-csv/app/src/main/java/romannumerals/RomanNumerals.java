package romannumerals;

public class RomanNumerals {
    
    public int convert (String number) {
        int result = 0;
        int previousNumber = 0;


        for(int i = number.length() - 1; i >= 0; i--) {
            char letter = number.charAt(i);
            int currentNumber = convertLetterToNumber(letter);

            if (currentNumber < previousNumber) {
                result -= currentNumber;
            } else {
                result += currentNumber;
            }

            previousNumber = currentNumber;
        }

        return result;
    }

    /*
     * Roman Numeral Conversion Table
     * ------------------------------
     * Roman digit    | I  | V   | X   | L   | C    | D    | M
     * Decimal values | 1  | 5   | 10  | 50  | 100  | 500  | 1000
     */
    private int convertLetterToNumber (char letter) {
        return switch (letter) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("Wrong Roman Numeral");
        };
    }


}
