import javax.swing.JOptionPane;
public class LT01_ESTREP32 {
    public static void main(String args[]){
        int numero;
        double fatorial = 1;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        for(int i = numero; i >= 1; i--){
            fatorial = (fatorial * i);
        }    
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é " + fatorial);
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
    
}
