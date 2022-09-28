public class Soal05 {
    public static void main(String[] args) {
        int x;
        for (x = 2; x < 20; x = x + 2) {
            if (x == 6)
                continue;
            System.out.println(x);
        }
    }
}
