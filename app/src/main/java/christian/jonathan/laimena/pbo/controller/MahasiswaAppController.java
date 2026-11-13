package christian.jonathan.laimena.pbo.controller;

import christian.jonathan.laimena.pbo.view.MahasiswaAppView;

public class MahasiswaAppController {
    MahasiswaAppView view = new MahasiswaAppView();
    public void runMahasiswaApp() {
        boolean isRunning = true;
        while (isRunning == true) {
            int menuChoice = view.viewMenuUtama();

            if (menuChoice == 1) {
                showMenuAksi();
            } else if (menuChoice == 2) {
                showMenuAksi();
            } else if (menuChoice == 3) {
                showMenuAksi();
            } else if (menuChoice == 4) {
                System.out.println("Keluar Program");
                isRunning = false;
            } else {
                System.out.println("Maaf, angkanya gak valid.");
            }
            
        }
    }

    public void showMenuAksi() {
        int menuAksiChoice = view.viewMenuAksi();
        
        if (menuAksiChoice == 1) {

        } else if (menuAksiChoice == 2) {

        } else if (menuAksiChoice == 2) {
            
        } else if (menuAksiChoice == 2) {
            
        } else if (menuAksiChoice == 2) {
            
        } else {
            System.out.println("Maaf angkanya gak valid.");
        }
    }
}
