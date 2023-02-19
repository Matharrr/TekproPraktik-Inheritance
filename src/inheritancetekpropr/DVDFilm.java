package inheritancetekpropr;

public class DVDFilm extends DVD{
    String pemeran;
    String sutradara;

    public DVDFilm(String judul, String publisher, char kategori, int stok, String pemeran, String sutradara) {
        super(judul, publisher, kategori, stok);
        this.pemeran = pemeran;
        this.sutradara = sutradara;
    }

    public void viewData() {
        super.viewData();
        System.out.println("Pemeran\t\t: " + pemeran);
        System.out.println("Sutradara\t: " + sutradara);
    }
}