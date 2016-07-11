
package programinha;

import static java.lang.Math.sqrt; // ATE QUE TAVA BONITINHO HEHEHE
import java.util.Scanner;
import javax.swing.JOptionPane;


public class EquacaoDoSegundoGrau? {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite, respectivamente, qual o valor de A, B e C OBS: Digite o valor e de enter");
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
     //(b)^2 -4.a.c
     
     int delta = ( b * b)  -4 * a * c;
        
        System.out.println("Seu delta vale " + delta);
        
        
        if(delta < 0){
            System.out.println("Seu delta é menor que 0\nNão há resposta dentro dos conjuntos reais");          
        }
        
        else if(delta == 0){
            
            int x = ((b * -1)) / 2 * a; 
            System.out.println("As duas raizes são iguais a " + x);
            
        }
        else{
            
            int l1 = (int) (((b * -1) + sqrt(delta)) / 2 * a);
            int l2 = (int) (((b * -1) - sqrt(delta)) / 2 * a);
            
           System.out.println("Raiz 1 =" + l1);
           System.out.println("Raiz 2 =" + l2);
        }
        
        
        int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Você quer a resolução?");
        System.out.println(showConfirmDialog);
        
        if(showConfirmDialog == 0){
           System.out.println("Ok, vamos lá");
           
           if(delta < 0){
               System.out.println("B^2 - 4 . a .c\nA = " + a + "\nB= " + b + "\nC= " + c);
               System.out.println("(" + b + ")" + "^2 - 4 ." + a + "." + c);
               System.out.println((b * b) + "+" + "  " );
               
               
           } else {
            }
        }else{
           System.out.println("Ta bom");
        }
            
        
        
        
        
        
        
        
        
        
        
        
        
    
}
}
