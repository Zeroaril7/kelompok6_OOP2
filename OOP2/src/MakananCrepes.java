/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makanancrepes;

/**
 *
 * @author ASUSVivoBook
 */
public class MakananCrepes {

    int idmakanan =2;
    String namamakanan= " Crepes";
    String jenismakanan= " jajanan";
    int harga =5000;
    int jumlahporsi=1;
    
    void dibuat () {
        System.out.println( jenismakanan+ namamakanan +" Sedang dibuat...");
    }
    
    void dijual () {
        System.out.println("====================================================");
        System.out.println(" Sudah matang siap dijual");
        System.out.println("Nama Makanan : " + jenismakanan + namamakanan  );
        System.out.println("Harga : " + harga);
        System.out.println("Porsi : " + jumlahporsi);
        System.out.println("====================================================");
    }
    
    
     void dibeli () {
        System.out.println(jenismakanan+ namamakanan +" Sudah habis...");
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        MakananCrepes crepes = new MakananCrepes();
        crepes.dibuat();
        crepes.dijual();
        crepes.dibeli();
    }
    
}
