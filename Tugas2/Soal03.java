public class Soal03 {
    public static void main(String arg[]) {
        int i = 0;
        int j = 0;

        for (i = 0; i < 10; i++) {
            for (j = 1; j <= 10 - i; j++) {
                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }
}