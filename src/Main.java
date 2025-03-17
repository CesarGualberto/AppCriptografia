//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
            String mensagem = JOptionPane.showInputDialog("Entre com uma String");

            JOptionPane.showMessageDialog(null,mensagem);

            char[] caracteres = mensagem.toCharArray();
            JOptionPane.showMessageDialog(null,caracteres);

    }
}