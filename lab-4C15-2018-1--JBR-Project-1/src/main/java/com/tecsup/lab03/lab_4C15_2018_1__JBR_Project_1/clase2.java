package com.tecsup.lab03.lab_4C15_2018_1__JBR_Project_1;

import javax.swing.JOptionPane;

public class clase2 {

	public static void main( String[] args )
    {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "dame un numero"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "dame otro numero"));
        double resultado1 = n1 * n2 ;
        double resultado2 = n1 / n2 ;
        
        JOptionPane.showMessageDialog(null,"La multiplicaciòn es --> " + resultado1+" \n"+
        		"La divisiòn es --> " + resultado2);
    }
	
}
