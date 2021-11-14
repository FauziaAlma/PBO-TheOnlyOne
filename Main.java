import java.util.Scanner;

/**
 *
 * @author hani
 */
public class Main {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        TokoSepatu pelanggan = new Pelanggan();
        TokoSepatu item = new Items();
        Bayar byr = new Bayar();
        System.out.println("                       WELCOME!                    ");
        System.out.println("                                                   ");
        System.out.println("===================================================");
        System.out.println("                       MY SHOES                    ");
        System.out.println("===================================================");
        System.out.println("                                                   ");
        
        System.out.print("Nama Customers : ");
        String nama = in.nextLine();
        System.out.print("Jenis Kelamin (P/L) : ");
        String jk = in.nextLine();
        System.out.print("Umur : ");
        int umur = in.nextInt();
        
        pelanggan.setId(nama,jk,umur);
       
        item.setBarang(1," Heels Nevada Rp ",240000);
        item.setBarang(2," Slipper Triset Rp ",300000);
        item.setBarang(3," Jaket Nevada Rp",150000);
        item.setBarang(4," Blouse Elzatta Rp",150000);
        System.out.print("Silahkan Pilih barang yang ingin di beli : ");
        int pil = in.nextInt();
        String merk = null;
        int harga = 0;
        switch (pil)
        {
            case 1:
                merk = "Heels Nevada" ;
                harga = 240000;
            break;
            case 2:
                merk = "Slipper Triset" ;
                harga = 3000000;
            break;
            case 3:
                merk = "Jaket Nevada" ;
                harga = 150000;
            break;
            case 4:
                merk = "Blouse Elzatta" ;
                harga = 150000;
            break;
        }
        System.out.print("Jumlah Barang : ");
        int jum = in.nextInt();
        int total = byr.bayar(harga,jum);
        
        String [][] pembayaran = new String[4][2];
        pembayaran[0][0] = "Item\t";
        pembayaran[0][1] = "Harga\t";
        pembayaran[1][0] = merk;
        pembayaran[1][1] = Integer.toString(harga)+"\t";
        pembayaran[2][0] = "Total Items";
        pembayaran[2][1] = Integer.toString(jum);
        pembayaran[3][0] = "Bayar\t";
        pembayaran[3][1] = Integer.toString(total)+"\t";
        System.out.println("         STRUK PEMBAYARAN         ");
        System.out.println("----------------------------------");
        for (int i = 0; i < pembayaran.length; i++) {
            for (int j = 0; j < pembayaran[i].length; j++) {
                System.out.print(pembayaran[i][j] + "\t\t");

            }
            System.out.println();
        }
    }
}
    

