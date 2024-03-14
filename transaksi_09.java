import java.util.Scanner;

public class transaksi_09 {
    int idTransaksi = 0;
    book_09[] books = new book_09[4];
    Scanner input = new Scanner(System.in);

    void addData(book_09[] arrBook) {
        for (int i = 0; i < arrBook.length; i++) {
            books[i] = new book_09("", "", "", 0, 0);
            books[i].inputBuku();
        }
    }

    void displayData() {
        for (int i = 0; i < books.length; i++) {
            books[i].displayBuku();
        }
    }

    void penguranganStock() {
        System.out.println("=====================");
        System.out.println("Kurangi stock karena rusak");
        System.out.print("Masukkan Kode Buku: ");
        String kodeBuku = input.nextLine();
        System.out.print("Masukkan jumlah: ");
        int rusak = input.nextInt();

        for (int i = 0; i < books.length; i++) {
            if (books[i].kodeBuku.equalsIgnoreCase(kodeBuku)) {
                books[i].Stock -= rusak;
            }
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i].kodeBuku.equalsIgnoreCase(kodeBuku)) {
                System.out.println("========================");
                books[i].displayBuku();
                break;
            }
        }
    }

    void peminjaman() {
        System.out.println("=====================");
        System.out.println("Peminjaman");
        System.out.println("Masukkan Kode Buku: ");
        String kodeBuku = input.nextLine();

        for (int i = 0; i < books.length; i++) {
            if (books[i].kodeBuku.equalsIgnoreCase(kodeBuku)) {
                books[i].Stock -= 1;
                int newIdTransaksi = ++idTransaksi;
                System.out.println("Nomor Transaksi: " + (newIdTransaksi));
                books[i].displayBuku();
                break;
            }
        }
    }
}
