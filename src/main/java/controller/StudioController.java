package controller;

import java.util.ArrayList;

import model.Studio;
import model.Pelanggan;
import model.PelangganUmum;
import model.PelangganMember;
import model.Booking;
import model.CRUD;

import view.MenuView;

public class StudioController implements CRUD {

    private ArrayList<Studio> daftarStudio;
    private ArrayList<Pelanggan> daftarPelanggan;
    private ArrayList<Booking> daftarBooking;

    private MenuView view;

    public StudioController() {

        daftarStudio = new ArrayList<>();
        daftarPelanggan = new ArrayList<>();
        daftarBooking = new ArrayList<>();

        view = new MenuView();

        tambahDummyData();
    }

    public void jalankanProgram() {

        int pilihan;

        do {

            pilihan = view.tampilkanMenu();

            switch (pilihan) {

                case 1:
                    tambah();
                    break;

                case 2:
                    lihat();
                    break;

                case 3:
                    ubah();
                    break;

                case 4:
                    hapus();
                    break;

                case 5:
                    tambahPelanggan();
                    break;

                case 6:
                    lihatPelanggan();
                    break;

                case 7:
                    tambahBooking();
                    break;

                case 8:
                    lihatBooking();
                    break;

                case 9:
                    view.tampilkanPesan("Selesai.... Terimakasih.");
                    break;

                default:
                    view.tampilkanPesan("Menu tidak tersedia!");
            }

        } while (pilihan != 9);
    }

    private void tambahDummyData() {

        daftarStudio.add(new Studio(
                "ST001",
                "Grace Room",
                "Band",
                75000
        ));

        daftarPelanggan.add(new PelangganUmum(
                "PL001",
                "Caleb",
                "081234567890",
                "Samarinda"
        ));

        daftarPelanggan.add(new PelangganMember(
                "PL002",
                "Eliana",
                "082345678901",
                "Balikpapan",
                "Gold"
        ));

        daftarBooking.add(new Booking(
                "BK001",
                "PL001",
                "ST001",
                "21-09-2026",
                "14:00",
                2
        ));
    }
    @Override
    public void tambah() {

        System.out.println("\n--- TAMBAH DATA STUDIO ---");

        String id = "ST" + String.format("%03d",
                daftarStudio.size() + 1);

        System.out.println("ID Studio otomatis: " + id);

        String nama = view.inputTeks("Nama Studio: ");

        String jenis = view.inputTeks("Jenis Studio: ");

        double harga = view.inputDouble("Harga per Jam: ");

        if (harga < 0) {

            view.tampilkanPesan(
                    "Harga tidak boleh negatif!"
            );

            return;
        }

        Studio studio = new Studio(
                id,
                nama,
                jenis,
                harga
        );

        daftarStudio.add(studio);

        view.tampilkanPesan(
                "Data studio berhasil ditambahkan!"
        );
    }

    @Override
    public void lihat() {

        System.out.println("\n--- DATA STUDIO ---");

        if (daftarStudio.isEmpty()) {

            view.tampilkanPesan(
                    "Belum ada data studio."
            );

            return;
        }

        for (Studio studio : daftarStudio) {

            System.out.println(
                    "ID Studio    : "
                    + studio.getIdStudio()
            );

            System.out.println(
                    "Nama Studio  : "
                    + studio.getNamaStudio()
            );

            System.out.println(
                    "Jenis Studio : "
                    + studio.getJenisStudio()
            );

            System.out.println(
                    "Harga/Jam    : "
                    + studio.getHargaPerJam()
            );

            System.out.println(
                    "-----------------------------"
            );
        }
    }

    @Override
    public void ubah() {

        System.out.println("\n--- UBAH DATA STUDIO ---");

        String id = view.inputTeks(
                "Masukkan ID Studio: "
        );

        Studio studio = cariStudio(id);

        if (studio == null) {

            view.tampilkanPesan(
                    "Studio tidak ditemukan!"
            );

            return;
        }

        String nama = view.inputTeks(
                "Nama baru: "
        );

        String jenis = view.inputTeks(
                "Jenis studio baru: "
        );

        double harga = view.inputDouble(
                "Harga per Jam baru: "
        );

        if (harga < 0) {

            view.tampilkanPesan(
                    "Harga tidak boleh negatif!"
            );

            return;
        }

        studio.setNamaStudio(nama);
        studio.setJenisStudio(jenis);
        studio.setHargaPerJam(harga);

        view.tampilkanPesan(
                "Data studio berhasil diubah!"
        );
    }

    @Override
    public void hapus() {

        System.out.println("\n--- HAPUS DATA STUDIO ---");

        String id = view.inputTeks(
                "Masukkan ID Studio: "
        );

        Studio studio = cariStudio(id);

        if (studio == null) {

            view.tampilkanPesan(
                    "Studio tidak ditemukan!"
            );

            return;
        }

        daftarStudio.remove(studio);

        view.tampilkanPesan(
                "Data studio berhasil dihapus!"
        );
    }

    private void tambahPelanggan() {

        System.out.println(
                "\n--- TAMBAH DATA PELANGGAN ---"
        );

        String id = "PL" + String.format(
                "%03d",
                daftarPelanggan.size() + 1
        );

        System.out.println(
                "ID Pelanggan otomatis: " + id
        );

        String nama = view.inputTeks(
                "Nama: "
        );

        String noTelepon = view.inputTeks(
                "No. Telepon: "
        );

        String alamat = view.inputTeks(
                "Alamat: "
        );

        System.out.println("\nJenis Pelanggan:");
        System.out.println("1. Pelanggan Umum");
        System.out.println("2. Pelanggan Member");

        int jenis = view.inputAngka(
                "Pilih jenis pelanggan: "
        );

        if (jenis == 1) {

            PelangganUmum pelanggan =
                    new PelangganUmum(
                            id,
                            nama,
                            noTelepon,
                            alamat
                    );

            daftarPelanggan.add(pelanggan);

        } else if (jenis == 2) {

            String jenisMember =
                    view.inputTeks(
                            "Jenis Member: "
                    );

            PelangganMember pelanggan =
                    new PelangganMember(
                            id,
                            nama,
                            noTelepon,
                            alamat,
                            jenisMember
                    );

            daftarPelanggan.add(pelanggan);

        } else {

            view.tampilkanPesan(
                    "Jenis pelanggan tidak tersedia!"
            );

            return;
        }

        view.tampilkanPesan(
                "Data pelanggan berhasil ditambahkan!"
        );
    }

    private void lihatPelanggan() {

        System.out.println(
                "\n--- DATA PELANGGAN ---"
        );

        if (daftarPelanggan.isEmpty()) {

            view.tampilkanPesan(
                    "Belum ada data pelanggan."
            );

            return;
        }

        for (Pelanggan pelanggan :
                daftarPelanggan) {

            System.out.println(
                    "ID Pelanggan : "
                    + pelanggan.getIdPelanggan()
            );

            System.out.println(
                    "Nama         : "
                    + pelanggan.getNama()
            );

            System.out.println(
                    "No. Telepon  : "
                    + pelanggan.getNoTelepon()
            );

            System.out.println(
                    "Alamat       : "
                    + pelanggan.getAlamat()
            );

            System.out.println(
                    "Jenis        : "
                    + pelanggan.getInfo()
            );

            System.out.println(
                    "-----------------------------"
            );
        }
    }


    private void tambahBooking() {

        System.out.println(
                "\n--- TAMBAH DATA BOOKING ---"
        );

        String id = "BK" + String.format(
                "%03d",
                daftarBooking.size() + 1
        );

        System.out.println(
                "ID Booking otomatis: " + id
        );

        String idPelanggan =
                view.inputTeks(
                        "ID Pelanggan: "
                );

        if (cariPelanggan(idPelanggan)
                == null) {

            view.tampilkanPesan(
                    "Pelanggan tidak ditemukan!"
            );

            return;
        }

        String idStudio =
                view.inputTeks(
                        "ID Studio: "
                );

        if (cariStudio(idStudio)
                == null) {

            view.tampilkanPesan(
                    "Studio tidak ditemukan!"
            );

            return;
        }

        String tanggal =
                view.inputTeks(
                        "Tanggal Booking: "
                );

        String jam =
                view.inputTeks(
                        "Jam Booking: "
                );

        int durasi =
                view.inputAngka(
                        "Durasi (jam): "
                );

        if (durasi <= 0) {

            view.tampilkanPesan(
                    "Durasi harus lebih dari 0!"
            );

            return;
        }

        Booking booking =
                new Booking(
                        id,
                        idPelanggan,
                        idStudio,
                        tanggal,
                        jam,
                        durasi
                );

        daftarBooking.add(booking);

        view.tampilkanPesan(
                "Data booking berhasil ditambahkan!"
        );
    }

    private void lihatBooking() {

        System.out.println(
                "\n--- DATA BOOKING ---"
        );

        if (daftarBooking.isEmpty()) {

            view.tampilkanPesan(
                    "Belum ada data booking."
            );

            return;
        }

        for (Booking booking :
                daftarBooking) {

            System.out.println(
                    "ID Booking   : "
                    + booking.getIdBooking()
            );

            System.out.println(
                    "ID Pelanggan : "
                    + booking.getIdPelanggan()
            );

            System.out.println(
                    "ID Studio    : "
                    + booking.getIdStudio()
            );

            System.out.println(
                    "Tanggal      : "
                    + booking.getTanggalBooking()
            );

            System.out.println(
                    "Jam          : "
                    + booking.getJamBooking()
            );

            System.out.println(
                    "Durasi       : "
                    + booking.getDurasi()
                    + " jam"
            );

            System.out.println(
                    "-----------------------------"
            );
        }
    }


    private Studio cariStudio(String id) {

        for (Studio studio :
                daftarStudio) {

            if (studio.getIdStudio()
                    .equalsIgnoreCase(id)) {

                return studio;
            }
        }

        return null;
    }

    private Pelanggan cariPelanggan(String id) {

        for (Pelanggan pelanggan :
                daftarPelanggan) {

            if (pelanggan.getIdPelanggan()
                    .equalsIgnoreCase(id)) {

                return pelanggan;
            }
        }

        return null;
    }

    private Booking cariBooking(String id) {

        for (Booking booking :
                daftarBooking) {

            if (booking.getIdBooking()
                    .equalsIgnoreCase(id)) {

                return booking;
            }
        }

        return null;
    }
}