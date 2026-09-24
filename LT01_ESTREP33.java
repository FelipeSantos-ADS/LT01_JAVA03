import javax.swing.JOptionPane;
public class LT01_ESTREP33 {
    public static void main(String args[]){
        int numero;
        double serie = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        for(int i = 1; i < (numero + 1); i++){
            serie = serie + (1.0/i);
            System.out.println("O resultado da série é: " + serie);
        }   
    }
    
}
