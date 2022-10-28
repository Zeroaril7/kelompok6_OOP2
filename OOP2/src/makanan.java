public class makanan {

    int idMakanan = 3;
    String namaMakanan = "Nasi Goreng";
    String jenisMakanan = "Berat";
    int harga = 10000;
    int jumlahPorsi = 2;

    void buat() {
        System.out.println("Buat " + "makanan " + jenisMakanan + " bernama " + namaMakanan + " dengan harga " + harga);
    }

    void jual() {
        System.out.println("Jual " + namaMakanan + " dengan harga: " + harga);
    }

    void beli() {
        System.out.println("Beli " + namaMakanan + " " + jumlahPorsi + " " + "porsi");
    }

    public static void main(String[] args) {

        makanan mangan = new makanan();

        mangan.buat();
        mangan.jual();
        mangan.beli();

    }
}
