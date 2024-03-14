import java.util.Scanner;

public class libMain {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String yn;

        transaksi_09 transaksi = new transaksi_09();

        do {
            System.out.println("Menu: \n1. Input buku\n2. Display data\n3. Kurangi Stock\n4. Peminjaman\n5. Exit");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    transaksi.addData(transaksi.books);
                    break;
                case 2:
                    transaksi.displayData();
                    break;
                case 3:
                    transaksi.penguranganStock();
                    break;
                case 4:
                    transaksi.peminjaman();
                    break;
                case 5:
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
            System.out.println("=========================================");
            System.out.println("Apakah ingin kembali ke menu (y/n)? ");
            yn = input.next();
        } while (yn.equalsIgnoreCase("y"));
    }
}
