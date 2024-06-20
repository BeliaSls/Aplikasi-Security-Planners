/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author User
 */
public class Lokasi {
    private int idLokasi;
    private String namaLokasi;

    public Lokasi(int idLokasi, String namaLokasi) {
        this.idLokasi = idLokasi;
        this.namaLokasi = namaLokasi;
    }

    public void tampilkanInfo() {
        System.out.println("ID Lokasi: " + idLokasi);
        System.out.println("Nama Lokasi: " + namaLokasi);
    }

    // Getter dan Setter
    public int getIdLokasi() {
        return idLokasi;
    }

    public void setIdLokasi(int idLokasi) {
        this.idLokasi = idLokasi;
    }

    public String getNamaLokasi() {
        return namaLokasi;
    }

    public void setNamaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }
}
