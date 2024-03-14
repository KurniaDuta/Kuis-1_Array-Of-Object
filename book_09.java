import java.util.Scanner;

/**
 * book_09
 */
public class book_09 {

    String kodeBuku;
    String judulBuku;
    String pengarang;
    int tahunTerbit;
    int Stock;

    public book_09(String kodeBuku, String judulBuku, String pengarang, int tahunTerbit, int Stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.Stock = Stock;
    }

    void inputBuku() {
        Scanner input09 = new Scanner(System.in);

        System.out.println("================================");
        System.out.print("Masukkan kode buku : ");
        kodeBuku = input09.nextLine();
        System.out.print("Masukkan judul buku : ");
        judulBuku = input09.nextLine();
        System.out.print("Masukkan pengarang buku : ");
        pengarang = input09.nextLine();
        System.out.print("Masukkan tahun terbit buku : ");
        tahunTerbit = input09.nextInt();
        System.out.print("Masukkan stock buku : ");
        Stock = input09.nextInt();
    }

    void displayBuku() {
        System.out.println("================================");
        System.out.println("Kode buku : " + kodeBuku);
        System.out.println("Judul buku : " + judulBuku);
        System.out.println("Pengarang buku : " + pengarang);
        System.out.println("Tahun terbit buku : " + tahunTerbit);
        System.out.println("Stock buku : " + Stock);
    }
}