package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {
    
    public static void main(String[] args) {
        

        int n, soma =0, totPar = 0, totImpar = 0, up100 = 0, med = 0,cont=0;
        /*Mostrar  a soma, o total de pares e impares 
        os maiores que 100 e a media dos valores*/
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número:<br><em>(valor 0 interrrompe)</em></html>"));
            soma +=n;
            cont++;
            if(n % 2 == 0){
                totPar++;
            }
            else{
                totImpar++;
            }
            if(n >= 100){
                up100++;
            }
            med = soma/cont;
        }while(n != 0);
        
        JOptionPane.showMessageDialog(null,
                "<html>Resultado:<br><hr>" + 
                        "Total de valores: " + cont +
                        "<br>Total dos Pares: "+ totPar + 
                        "<br>Total de Ímpares: " + totImpar +
                        "<br>Acima de 100: " + up100 +
                        "<br>Média dos valores: " + med +
                "</html>");
       
    }
    
}

