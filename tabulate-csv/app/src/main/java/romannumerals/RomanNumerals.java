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
        switch (letter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Wrong Roman Numeral");
        }
    }


}
