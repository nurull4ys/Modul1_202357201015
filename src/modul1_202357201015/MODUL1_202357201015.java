/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1_202357201015;

/**
 *
 * @author User
 */
public class MODUL1_202357201015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int data[][] = {{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
        double total =0;
        double jumlahElemen = 0;
        
        for(int baris= 0; baris <data.length; baris++){
            for(int kolom= 0; kolom <data[baris].length; kolom++){
                System.out.print(data[baris][kolom] + " ");
                total += data[baris][kolom];
                jumlahElemen++;
            }
            System.out.print("\n");
        }
        double rerata = total/jumlahElemen;
        System.out.println("Total = " + total);
        System.out.println("Rerata = " + rerata);
        
    }
    
}
