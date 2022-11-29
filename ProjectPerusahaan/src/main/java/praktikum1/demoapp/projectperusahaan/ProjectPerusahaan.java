/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package praktikum1.demoapp.projectperusahaan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 21103007
 */
public class ProjectPerusahaan {

      public static void main(String[] args) throws IOException {
        SalariedEmployee S = new SalariedEmployee();
        CommissionEmployee C = new CommissionEmployee();
        ProjectPlanner P = new ProjectPlanner();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        
        try{
           S.nama_3007 = "Via";
           S.nip_3007  = 21103007;
           S.upahMingguan_3007 = 1000000; 
        
           C.nama_3007 = "Keysya";
           C.nip_3007 = 21103000;
           C.gajiPokok_3007 = 2000000;
           C.komisi_3007 = 1000000;
           C.totalPenjualan_3007 = 100;
           
           P.nama_3007 = "Auliya";
           P.nip_3007 = 21103077;
           P.gajiPokok_3007 = 1500000;
           P.komisi_3007 = 500000;
           P.totalHasilProyek_3007 = 200;
           
           S.cetakSalariedEmployee();
           System.out.println("");
           C.cetakCommissionEmployee();
           System.out.println("");
           P.cetakProjectPlanner();
            System.out.println("");
        }  
    catch(Exception ex){
            System.out.println(ex);
        }
    }
}
