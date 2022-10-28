public class makanan_camilan {

    int id_makanan = 2;
    int harga = 12000;
    int porsi = 2;
    String nama_makanan = "wafer";
    String jenis_makanan = "camilan";

    void pembeli(){
        System.out.println("Saya membeli " + nama_makanan + " dengan id "+ id_makanan + ", jumlah" + porsi + " dan harganya Rp." + harga + ",00");
    }
    void kasir(){
        System.out.println("Saya melayani pembeli membeli  " + nama_makanan + " dengan id "+ id_makanan + ", jumlah" + porsi + " dan harganya Rp." + harga + ",00");
    }

    public static void main(String[] args) {
        makanan_camilan roti = new makanan_camilan();
        roti.pembeli();
        roti.kasir();
    }
}
