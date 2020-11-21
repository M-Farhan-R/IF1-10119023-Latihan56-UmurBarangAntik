/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan56.umurbarangantik;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : program umur barang antik...
 *
 */
public class IF110119023Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio r = new Radio(234);
        
        r.setName("Radio AM");
        
        System.out.println("Nama Barang Antik : "+r.getName());
        System.out.print("Umur dari barang antik ini adalah : "); r.tampilUmur();
    }

}
