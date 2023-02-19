package inheritancetekpropr;

public class DVDMusik extends DVD{
    String penyanyi;
    String produser;
    String topHits;

    public DVDMusik(String judul, String publisher, char kategori, int stok, String penyanyi, String produser, String topHits) {
        super(judul, publisher, kategori, stok);
        this.penyanyi = penyanyi;
        this.produser = produser;
        this.topHits = topHits;
    }

    public void viewData() {
        super.viewData();
        System.out.println("Penyanyi\t: " + penyanyi);
        System.out.println("Produser\t: " + produser);
        System.out.println("Top Hits\t: " + topHits);
    }
}