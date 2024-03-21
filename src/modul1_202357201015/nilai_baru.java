/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1_202357201015;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class nilai_baru {
    public static void main(String[] args) {
        int data[][] = {{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
        int total = 0;      
        int baris = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Baris ke "));
        int kolom = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Kolom ke "));
        
        int nilai_Baru = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Baru "));
        data[baris][kolom] = nilai_Baru;

        for(int x =0; x <data.length; x++){
            for(int y =0; y <data[x].length; y++){
                if(y % 2==1){
                System.out.print(data[x][y] + " ");
                total += data[x][y];
                }
            }
            System.out.println("\n");
        } 
          System.out.println("Total : "+ total);       
    }
    
}
