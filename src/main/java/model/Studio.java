package model;

public class Studio {

    private String idStudio;
    private String namaStudio;
    private String jenisStudio;
    private double hargaPerJam;

    public Studio(String idStudio, String namaStudio,
                  String jenisStudio, double hargaPerJam) {

        this.idStudio = idStudio;
        this.namaStudio = namaStudio;
        this.jenisStudio = jenisStudio;
        this.hargaPerJam = hargaPerJam;
    }

    public String getIdStudio() {
        return idStudio;
    }

    public void setIdStudio(String idStudio) {
        this.idStudio = idStudio;
    }

    public String getNamaStudio() {
        return namaStudio;
    }

    public void setNamaStudio(String namaStudio) {
        this.namaStudio = namaStudio;
    }

    public String getJenisStudio() {
        return jenisStudio;
    }

    public void setJenisStudio(String jenisStudio) {
        this.jenisStudio = jenisStudio;
    }

    public double getHargaPerJam() {
        return hargaPerJam;
    }

    public void setHargaPerJam(double hargaPerJam) {
        this.hargaPerJam = hargaPerJam;
    }
}