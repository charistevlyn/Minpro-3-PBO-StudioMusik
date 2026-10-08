package model;

public class PelangganUmum extends Pelanggan {

    public PelangganUmum(String idPelanggan, String nama,
                         String noTelepon, String alamat) {

        super(idPelanggan, nama, noTelepon, alamat);
    }

    @Override
    public String getInfo() {

        return "Pelanggan Umum: " + getNama();
    }
}