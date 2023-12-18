package Vetores_Exerc2;

import javax.swing.*;

public class Vetores_Exerc2 {

    public static void main(String[] args) {
        
        //Questão_2
        int[] valor = new int[10];
        
        int i;
        for(i = 0; i < valor.length; i++){
            valor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:"));
            System.out.println("valor = " + valor[i]);
        }
        
        int maiorValor = 0;
        
        for(i = 0; i < valor.length; i++){
           if(valor[i] > maiorValor){
               maiorValor = valor[i];
           }
        }
        
        JOptionPane.showMessageDialog(null, "Maior Valor = " + maiorValor);
    }
    
}
