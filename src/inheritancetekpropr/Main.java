package inheritancetekpropr;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<DVD> listDVD = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Input data DVD Film");
            System.out.println("2. Input data DVD Musik");
            System.out.println("3. View data DVD");
            System.out.println("4. Exit");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addDVDFilm();
                    break;
                case 2:
                    addDVDMusik();
                    break;
                case 3:
                    viewData();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (choice != 4);
    }

    public static void addDVDFilm() {
        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Kategori (SU, D, R, A): ");
        char kategori = scanner.nextLine().charAt(0);
        System.out.print("Stok: ");
        int stok = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Pemeran (pisahkan dengan koma jika lebih dari 1): ");
        String pemeran = scanner.nextLine();
        System.out.print("Sutradara: ");
        String sutradara = scanner.nextLine();

        DVDFilm dvd = new DVDFilm(judul, publisher, kategori, stok, pemeran, sutradara);
        listDVD.add(dvd);
        System.out.println("Data berhasil dimasukkan.");
    }

    public static void addDVDMusik() {
        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Kategori (C, J, P, R, O): ");
        char kategori = scanner.nextLine().charAt(0);
        System.out.print("Stok: ");
        int stok = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Penyanyi: ");
        String penyanyi = scanner.nextLine();
        System.out.print("Produser: ");
        String produser = scanner.nextLine();
        System.out.print("Top hits (pisahkan dengan koma jika lebih dari 1): ");
        String topHits = scanner.nextLine();

        DVDMusik dvd = new DVDMusik(judul, publisher, kategori, stok, penyanyi, produser, topHits);
        listDVD.add(dvd);
        System.out.println("Data berhasil dimasukkan.");
    }

    public static void viewData() {
        if (listDVD.isEmpty()) {
            System.out.println("Belum ada data yang dimasukkan.");
            return;
        }

        for (int i = 0; i < listDVD.size(); i++) {
            System.out.println("Data ke-" + (i+1));
            listDVD.get(i).viewData();
            System.out.println();
        }
    }
}