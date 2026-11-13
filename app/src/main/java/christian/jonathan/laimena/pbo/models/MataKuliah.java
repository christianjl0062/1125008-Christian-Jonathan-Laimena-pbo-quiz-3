package christian.jonathan.laimena.pbo.models;

public class MataKuliah {
    private String kode;
    private String nama;
    private int jumlahSKS;
    private int semester;

    public MataKuliah(String kode, String nama, int jumlahSKS, int semester) {
        this.kode = kode;
        this.nama = nama;
        this.jumlahSKS = jumlahSKS;
        this.semester = semester;
    }


    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getJumlahSKS() {
        return jumlahSKS;
    }
    public void setJumlahSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }
    public int getSemester() {
        return semester;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
}
