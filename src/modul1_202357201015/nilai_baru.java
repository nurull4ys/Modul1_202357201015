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
                
        int baris = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Baris ke "));
        int kolom = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Kolom ke "));
        int nilai_Baru = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Baru "));
        data[baris][kolom] = nilai_Baru;
        
                            
        //x : variabel baris
        //y : variabel kolom
        System.out.println("array baru");
        for(int x =0; x <data.length; x++){
            for(int y =0; y <data[x].length; y++){
                System.out.print(data[x][y] + " ");
            }               
        }
        
        
        
    }
    
}
