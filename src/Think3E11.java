/*

    Bruce Eckel "Think in Java": Chapter 3 Exercise 11
    Binary shift demo: Shifting '1' from left edge to the right

*/

public class Think3E11 {

    /* Binary form of int with + left zeroes */
    private static String IntToBinary(int intVar) {
        String binString = Integer.toBinaryString(intVar);
        StringBuilder leftZeroes = new StringBuilder();
        for (int charCount = binString.length(); charCount < 31; charCount++) {
            leftZeroes.append("0");
        }
        return  leftZeroes + binString;
    }

    // Run point
    public static void main(String[] args) {
        int intVar = Integer.valueOf("1000000000000000000000000000000", 2);
        System.out.println(IntToBinary(intVar));
        // shift '1' from left edge to right
        do {
            intVar = intVar >> 1;
            System.out.println(IntToBinary(intVar));
        } while (intVar > 1);
    }

}
