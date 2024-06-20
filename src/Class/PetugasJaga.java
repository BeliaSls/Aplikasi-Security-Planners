/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author dwiap
 */
public class PetugasJaga {
    private int idPetugas;
    private String nomorTelepon;
    private String namaPetugas;
    private String alamat;

    public PetugasJaga(int idPetugas, String nomorTelepon, String namaPetugas, String alamat) {
        this.idPetugas = idPetugas;
        this.nomorTelepon = nomorTelepon;
        this.namaPetugas = namaPetugas;
        this.alamat = alamat;
    }

    public void tampilkanInfo() {
        System.out.println("ID Petugas: " + idPetugas);
        System.out.println("Nomor Telepon: " + nomorTelepon);
        System.out.println("Nama Petugas: " + namaPetugas);
        System.out.println("Alamat: " + alamat);
    }

    // Getter dan Setter
    public int getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(int idPetugas) {
        this.idPetugas = idPetugas;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getNamaPetugas() {
        return namaPetugas;
    }

    public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas = namaPetugas;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
