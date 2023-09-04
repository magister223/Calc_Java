import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String num1;
        String num2;
        int ans;
        String ans1;
        int firstDigit = 0;
        int secondDigit = 0;
        boolean first = false;
        boolean second = false;
        char op;
        Scanner reader = new Scanner(System.in);
        num1 = reader.next();
        op = reader.next().charAt(0);
        num2 = reader.next();

        switch (num1) {
            case "i" -> firstDigit = 1;
            case "ii" -> firstDigit = 2;
            case "iii" -> firstDigit = 3;
            case "iv" -> firstDigit = 4;
            case "v" -> firstDigit = 5;
            case "vi" -> firstDigit = 6;
            case "vii" -> firstDigit = 7;
            case "viii" -> firstDigit = 8;
            case "ix" -> firstDigit = 9;
            case "x" -> firstDigit = 10;
            case "1" -> {
                firstDigit = 1;
                first = true;
            }
            case "2" -> {
                firstDigit = 2;
                first = true;
            }
            case "3" -> {
                firstDigit = 3;
                first = true;
            }
            case "4" -> {
                firstDigit = 4;
                first = true;
            }
            case "5" -> {
                firstDigit = 5;
                first = true;
            }
            case "6" -> {
                firstDigit = 6;
                first = true;
            }
            case "7" -> {
                firstDigit = 7;
                first = true;
            }
            case "8" -> {
                firstDigit = 8;
                first = true;
            }
            case "9" -> {
                firstDigit = 9;
                first = true;
            }
            case "10" -> {
                firstDigit = 10;
                first = true;
            }
            default ->
                throw new IllegalArgumentException("error");
        }

        switch (num2) {
            case "i" -> secondDigit = 1;
            case "ii" -> secondDigit = 2;
            case "iii" -> secondDigit = 3;
            case "iv" -> secondDigit = 4;
            case "v" -> secondDigit = 5;
            case "vi" -> secondDigit = 6;
            case "vii" -> secondDigit = 7;
            case "viii" -> secondDigit = 8;
            case "ix" -> secondDigit = 9;
            case "x" -> secondDigit = 10;
            case "1" -> {
                secondDigit = 1;
                second = true;
            }
            case "2" -> {
                secondDigit = 2;
                second = true;
            }
            case "3" -> {
                secondDigit = 3;
                second = true;
            }
            case "4" -> {
                secondDigit = 4;
                second = true;
            }
            case "5" -> {
                secondDigit = 5;
                second = true;
            }
            case "6" -> {
                secondDigit = 6;
                second = true;
            }
            case "7" -> {
                secondDigit = 7;
                second = true;
            }
            case "8" -> {
                secondDigit = 8;
                second = true;
            }
            case "9" -> {
                secondDigit = 9;
                second = true;
            }
            case "10" -> {
                secondDigit = 10;
                second = true;
            }
            default ->
                throw new IllegalArgumentException("error");
        }

        switch (op) {
            case '+' -> ans = firstDigit + secondDigit;
            case '-' -> ans = firstDigit - secondDigit;
            case '*' -> ans = firstDigit * secondDigit;
            case '/' -> ans = firstDigit / secondDigit;
            default ->
                throw new IllegalArgumentException("error");
        }
        String[] rome ={"0","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"} ;
        if((first == second) && (first == true)) {
            System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
        } else if ((first == false)&&(ans >=1)) {
            ans1 = rome[ans];
            System.out.printf(num1 + " " + op + " " + num2 + " = " + ans1);
        } else throw new IllegalArgumentException("error");
    }
}