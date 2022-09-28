class Soal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2; // num3, num4, num5;

        System.out.println("Masukkan nilai Num1= ");
        num1 = input.nextInt();

        System.out.println("Masukk0an nilai Num2= ");
        num2 = input.nextInt();

        int hasilTambah = num1 + num2;
        int hasilKurang = num1 - num2;
        int hasilKali = num1 * num2;
        float hasilbagi = (float) num1 / num2;
        int hasilmod = num1 % num2;

        System.out.println("Hasil Tambah : " + num1 + "+" + num2 + "=" + hasilTambah);
        System.out.println("Hasil Kurang : " + num1 + " - " + num2 + " = " + hasilKurang);
        System.out.println("Hasil Kali : " + num1 + " * " + num2 + " = " + hasilKali);
        System.out.println("Hasil Bagi : " + num1 + " / " + num2 + " = " + hasilbagi);
        System.out.println("Hasil MOD : " + num1 + " MOD " + num2 + " = " + hasilmod);

    }
}
