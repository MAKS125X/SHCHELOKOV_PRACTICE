package suggested;

// Create Phone Number (6 kyu)
// https://www.codewars.com/kata/525f50e3b73515a6db000b83/javascript

public class CreatePhoneNumber {
    public static String createPhoneNumber1(int[] numbers) {
        return "(" +
                numbers[0] +
                numbers[1] +
                numbers[2] +
                ") " +
                numbers[3] +
                numbers[4] +
                numbers[5] +
                '-' +
                numbers[6] +
                numbers[7] +
                numbers[8] +
                numbers[9];
    }

    public static String createPhoneNumber2(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                numbers[0], numbers[1], numbers[2], numbers[3], numbers[4],
                numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }

    public static void main(String[] args) {
        System.out.println(createPhoneNumber1(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        System.out.println(createPhoneNumber2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}