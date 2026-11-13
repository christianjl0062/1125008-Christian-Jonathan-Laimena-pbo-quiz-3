package christian.jonathan.laimena.pbo.view;
import christian.jonathan.laimena.pbo.utility.InputUtility;

public class MahasiswaAppView {
    public int viewMenuUtama() {
        System.out.println("PILIH MENU");
        System.out.println("1. Mahasiswa");
        System.out.println("2. Mata Kuliah");
        System.out.println("3. Ruangan");
        System.out.println("4. Keluar");
        return InputUtility.inputInt("Masukkan Angka: ");
    }

    public int viewMenuAksi() {
        System.out.println("PILIH AKSI");
        System.out.println("1. Tampilkan semua data");
        System.out.println("2. Cari satu data");
        System.out.println("3. Tambah data");
        System.out.println("4. Ubah data");
        System.out.println("5. Delete data");
        return InputUtility.inputInt("Masukkan Angka Untuk Pilih aksi: ");
    }
}
