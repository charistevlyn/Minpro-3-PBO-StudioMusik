package model;

public class PelangganMember extends Pelanggan {

    private String jenisMember;

    public PelangganMember(String idPelanggan, String nama,
                           String noTelepon, String alamat,
                           String jenisMember) {

        super(idPelanggan, nama, noTelepon, alamat);

        this.jenisMember = jenisMember;
    }

    public String getJenisMember() {
        return jenisMember;
    }

    public void setJenisMember(String jenisMember) {
        this.jenisMember = jenisMember;
    }

    @Override
    public String getInfo() {

        return "Pelanggan Member: "
                + getNama()
                + " - "
                + jenisMember;
    }
}