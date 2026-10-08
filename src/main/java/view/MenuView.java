package view;

import java.util.Scanner;

public class MenuView {

    private Scanner input = new Scanner(System.in);

    public int tampilkanMenu() {

        System.out.println();
        System.out.println("======================================");
        System.out.println("      SISTEM MANAJEMEN STUDIO MUSIK");
        System.out.println("======================================");
        System.out.println("1. Tambah Studio");
        System.out.println("2. Lihat Studio");
        System.out.println("3. Ubah Studio");
        System.out.println("4. Hapus Studio");
        System.out.println("5. Tambah Pelanggan");
        System.out.println("6. Lihat Pelanggan");
        System.out.println("7. Tambah Booking");
        System.out.println("8. Lihat Booking");
        System.out.println("9. Keluar");
        System.out.println("======================================");

        System.out.print("Pilih menu: ");

        return input.nextInt();
    }

    public String inputTeks(String pesan) {

        input.nextLine();

        System.out.print(pesan);

        return input.nextLine();
    }

    public double inputDouble(String pesan) {

        System.out.print(pesan);

        return input.nextDouble();
    }

    public int inputAngka(String pesan) {

        System.out.print(pesan);

        return input.nextInt();
    }

    public void tampilkanPesan(String pesan) {

        System.out.println(pesan);
    }
}