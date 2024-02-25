public class HelloNumber {
    public static void main (String[] agrs) {
        int i = 0, sum = 0;
        while (i < 10) {
            sum = sum + i;
            System.out.print(sum + " ");
            i = i + 1;
        }
        System.out.println();
    }
}