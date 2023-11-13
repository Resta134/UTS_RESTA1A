import java.util.Scanner;

public class penjualan {
    public static void main(String[] args) {
        //Daftar Kosmestik
        String[] daftarKosmetik = {"Lipserum", "Bedak", "Maskara", "Eyeliner", "Foundation", "Blush on", "Eyeshadow", "Pensil Alis", "Kuas Make-up", "Pelembab"};

        // Harga kosmetik
        double[] hargaKosmetik = {25.0, 30.0, 20.0, 15.0, 40.0, 35.0, 50.0, 10.0, 15.0, 45.0};

        // Input jumlah penjualan untuk setiap jenis kosmetik
        Scanner input = new Scanner(System.in);
        int[] jumlahPenjualan = new int[daftarKosmetik.length];

        System.out.println("Masukkan jumlah penjualan untuk setiap jenis kosmetik:");

        for (int i = 0; i < daftarKosmetik.length; i++) {
            System.out.print(daftarKosmetik[i] + ": ");
            jumlahPenjualan[i] = input.nextInt();
        }

        // Total penjualan dan pendapatan
        double totalPendapatan = 0;

        System.out.println("\nRincian Penjualan Kosmetik:");
        System.out.println("==========================");

        for (int i = 0; i < daftarKosmetik.length; i++) {
            double pendapatan = jumlahPenjualan[i] * hargaKosmetik[i];
            totalPendapatan += pendapatan;
            System.out.println(daftarKosmetik[i] + ": " + jumlahPenjualan[i] + " pcs * " + hargaKosmetik[i] + " = " + pendapatan);
        }

        System.out.println("\nTotal Pendapatan dari Penjualan: $" + totalPendapatan);
    }
}
