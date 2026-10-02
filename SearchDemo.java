public class SearchDemo {

    public static int linearSearch(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {1001, 1002, 1003, 1004, 1005};

        int target = 1003;

        int result = linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Account found at index: " + result);
        } else {
            System.out.println("Account not found.");
        }
    }
}