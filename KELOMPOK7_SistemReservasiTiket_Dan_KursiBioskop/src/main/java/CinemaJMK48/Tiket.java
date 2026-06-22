package CinemaJMK48;

public class Tiket {

    private String nama;
    private String noHp;
    private String tanggalPemesanan;
    private String film;
    private String jamTayang;
    private String kursi;
    private int harga;

    public Tiket(String nama, String noHp, String tanggalPemesanan,
                 String film, String jamTayang, String kursi, int harga) {

        this.nama = nama;
        this.noHp = noHp;
        this.tanggalPemesanan = tanggalPemesanan;
        this.film = film;
        this.jamTayang = jamTayang;
        this.kursi = kursi;
        this.harga = harga;
    }

    // Getter dan Setter

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getTanggalPemesanan() {
        return tanggalPemesanan;
    }

    public void setTanggalPemesanan(String tanggalPemesanan) {
        this.tanggalPemesanan = tanggalPemesanan;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getJamTayang() {
        return jamTayang;
    }

    public void setJamTayang(String jamTayang) {
        this.jamTayang = jamTayang;
    }

    public String getKursi() {
        return kursi;
    }

    public void setKursi(String kursi) {
        this.kursi = kursi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}