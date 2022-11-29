/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1.demoapp.projectperusahaan;

/**
 *
 * @author 21103007
 */
public class CommissionEmployee {
    String nama_3007;
    int nip_3007;
    double gajiPokok_3007;
    double komisi_3007;
    double totalPenjualan_3007;
    private double GajiCommisionEmploye_3007;
    String nama3007;
    
    //Method passed by reference dengan parameter tipe data class
    public double totalGaji (){
        return GajiCommisionEmploye_3007 = gajiPokok_3007 + (komisi_3007*totalPenjualan_3007);
    }
    
     public void cetakCommissionEmployee(){
        System.out.println(" \n");
        System.out.println(" Data Commission Employee \n");
        System.out.println("Nama :"+nama_3007);
        System.out.println("NIP :"+nip_3007);
        System.out.println("gaji Pokok :"+gajiPokok_3007);
        System.out.println("Komisi : "+komisi_3007);
        System.out.println("Total Penjualam :"+totalPenjualan_3007);
    }
}