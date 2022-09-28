import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        int nilai;
        int grade;
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROSES INPUT === ");
        System.out.println("NILAI : ");
        nilai = input.nextInt();

        if (nilai < 50) {
            grade = 'E';
        } else if (nilai >= 50 && nilai < 60) {
            grade = 'D';
        } else if (nilai >= 60 && nilai < 70) {
            grade = 'C';
        } else if (nilai >= 70 && nilai < 80) {
            grade = 'B';
        } else if (nilai >= 80 && nilai < 90) {
            grade = 'A';
        } else if (nilai >= 90 && nilai < 100) {
            grade = 'A';
        } else {
            System.out.println("Invalid!");
        }
    }
}
