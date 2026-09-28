
package studiomusik;

public class Pelanggan {
    
    private String idPelanggan;
    private String nama;
    private String noTelepon;
    private String alamat;

    // Constructor
    public Pelanggan(String idPelanggan, String nama, String noTelepon, String alamat) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noTelepon = noTelepon;
        this.alamat = alamat;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getNoTelepon() {
        return noTelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    // Setter
    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getInfo() {
        return "Pelanggan: " + nama;
    }
}