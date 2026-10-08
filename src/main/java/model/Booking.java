package model;

public class Booking {

    private String idBooking;
    private String idPelanggan;
    private String idStudio;
    private String tanggalBooking;
    private String jamBooking;
    private int durasi;

    public Booking(String idBooking, String idPelanggan,
                   String idStudio, String tanggalBooking,
                   String jamBooking, int durasi) {

        this.idBooking = idBooking;
        this.idPelanggan = idPelanggan;
        this.idStudio = idStudio;
        this.tanggalBooking = tanggalBooking;
        this.jamBooking = jamBooking;
        this.durasi = durasi;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getIdStudio() {
        return idStudio;
    }

    public void setIdStudio(String idStudio) {
        this.idStudio = idStudio;
    }

    public String getTanggalBooking() {
        return tanggalBooking;
    }

    public void setTanggalBooking(String tanggalBooking) {
        this.tanggalBooking = tanggalBooking;
    }

    public String getJamBooking() {
        return jamBooking;
    }

    public void setJamBooking(String jamBooking) {
        this.jamBooking = jamBooking;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }
}