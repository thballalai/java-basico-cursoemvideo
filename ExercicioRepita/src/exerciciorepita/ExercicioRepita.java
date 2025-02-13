/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author thbal
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int ctotal = 0;
        int cpar = 0;
        int cimpar = 0;
        int c100 = 0;
        float media = 0f;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("<html>Informe um valor: <br><em>(valor 0 interrompe)</em></html>"));
            if(n != 0){
                ctotal++; // contagem do total de valores
                if (n % 2 == 0) cpar++; // contagem dos números pares
                else cimpar++; // contagem dos números impares
                if (n>100) c100++; //contagem dos números maiores do que 100
                media += n; //soma dos valores para calcular media
            }
        } while(n != 0);
        media /= ctotal; // divisão da soma pelo total de argumentos
        
        
        JOptionPane.showMessageDialog(null, "<html>Resultado: <br>--------------------------- <br>"
                + "Total de Valores: " + ctotal + "<br>Total de Pares: " + cpar + 
                "<br>Total de Ímpares: " + cimpar + "<br>Acima de 100: " + c100 + 
                "<br>Média dos Números: " + media + "</html>");
    }
    
}
