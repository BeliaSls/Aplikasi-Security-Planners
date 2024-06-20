/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author User
 */
public class Schedule {
    private int idJadwal;
    private String namaPetugas;
    private String lokasi;
    private String shift;
    private String tanggal;

    public Schedule(int idJadwal, String namaPetugas, String lokasi, String shift, String tanggal) {
        this.idJadwal = idJadwal;
        this.namaPetugas = namaPetugas;
        this.lokasi = lokasi;
        this.shift = shift;
        this.tanggal = tanggal;
    }

    public void tampilkanInfo() {
        System.out.println("ID Jadwal: " + idJadwal);
        System.out.println("Nama Petugas: " + namaPetugas);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Shift: " + shift);
        System.out.println("Tanggal: " + tanggal);
    }

    // Getter dan Setter
    public int getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(int idJadwal) {
        this.idJadwal = idJadwal;
    }

    public String getNamaPetugas() {
        return namaPetugas;
    }

    public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas = namaPetugas;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
