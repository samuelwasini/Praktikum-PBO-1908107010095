public class Soal04 {
    public static void main(String[] args) {

        System.out.println("Tampilkan Bilangan genap 1-20 = ");

        int bil;
        for (bil = 1; bil < 20; bil++) {
            if ((bil != 1) && (bil % 2 == 0))
                System.out.println(bil);
        }
    }
}
