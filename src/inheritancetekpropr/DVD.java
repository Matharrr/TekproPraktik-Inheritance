package inheritancetekpropr;

public class DVD {
    String judul;
    String publisher;
    char kategori;
    int stok;

    public DVD(String judul, String publisher, char kategori, int stok) {
        this.judul = judul;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
    }

    public void viewData() {
        System.out.println("Judul\t\t: " + judul);
        System.out.println("Publisher\t: " + publisher);
        System.out.println("Kategori\t: " + kategori);
        System.out.println("Stok\t\t: " + stok);
    }
}