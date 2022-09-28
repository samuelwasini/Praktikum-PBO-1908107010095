import java.util.Scanner;

/**
 * Barang
 */
public class Barang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jmlh, total, diskon_hrg, total_bayar;

        System.out.print("Harga Barang =");
        harga = input.nextInt();

        System.out.print("Jumlah Barang = ");
        jmlh = input.nextInt();

        total = harga * jmlh;
        diskon_hrg = harga * jmlh * 15 / 100;
        total_bayar = (harga * jmlh) - (harga * jmlh * 15 / 100);

        System.out.println("Total Harga (Diskon 15% ) adalah" + harga + "*" + jmlh + "=" + total);

    }
}
