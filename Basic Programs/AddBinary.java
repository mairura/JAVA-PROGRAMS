public class AddBinary {

    static String add_Binary(String x, String y) {
        
        // converting binary string into integer(decimal number)
        int num1 = Integer.parseInt(x, 2);

        int num2 = Integer.parseInt(y, 2);

        int sum = num1 + num2;

        // Converting that resultant decimal into binary string
        String result = Integer.toBinaryString(sum);

        return result;
    }

    public static void main(String[] args) {
        String x = "011011", y = "1010111";

        System.out.print(add_Binary(x, y));
    }
}
