
package viernesabril20;

import javax.swing.JOptionPane;

public class Ejemplos {
    public static void main(String[] args) {
        int[] edad;
        edad = new int [10];
        double [] precio = new double [3];
        double total = 0;
        
        /*for (int i = 0; i < precio.length; i++) {
            precio[i]= Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el precio: "));
            total += precio[i];
        }
        
        JOptionPane.showMessageDialog(null,"El total es de: " + total);*/
        
        int seguir;
        String nombre;
        
        do{
            nombre=JOptionPane.showInputDialog("Ingrese un nombre: ");
            JOptionPane.showMessageDialog(null,"Hola " + nombre);
            seguir=JOptionPane.showConfirmDialog(null,"Desea continuar? ","Confirmar",JOptionPane.YES_NO_OPTION);
        }while(seguir==JOptionPane.YES_NO_OPTION);
               
        
        
    }
}
