/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1.demoapp.projectperusahaan;

/**
 *
 * @author 21103007
 */
public class ProjectPlanner {
    String nama_3007;
    int nip_3007;
    double gajiPokok_3007;
    double komisi_3007;
    double totalHasilProyek_3007;
    private double GajiProjectPlanner_3007;
    private double pajak_3007;
    int komisi3007;

    //Method passed by reference dengan parameter tipe data class
    public double totalGaji (){
        pajak_3007 = (0.05 * gajiPokok_3007);
        GajiProjectPlanner_3007 = gajiPokok_3007 + (komisi_3007*totalHasilProyek_3007) - pajak_3007;
        return GajiProjectPlanner_3007;
    }
    
    public void cetakProjectPlanner(){
        System.out.println(" \n");
        System.out.println(" Data Project Planner \n");
        String nama_3007 = null;
        System.out.println("Nama :"+nama_3007);
        String nip_3007 = null;
        System.out.println("NIP :"+nip_3007);
        System.out.println("gaji Pokok :"+gajiPokok_3007);
        System.out.println("Komisi : "+komisi_3007);
        System.out.println("Total Hasil Proyek :"+totalHasilProyek_3007);

    }
}

