//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
            String mensagem = JOptionPane.showInputDialog("Entre com uma String");


            char[] caracteres = mensagem.toCharArray();
            int[] asciiValores = new int[caracteres.length];

            for (int i = 0; i < caracteres.length; i++) {
                asciiValores[i] = (int) caracteres[i] + 10; // Soma 10 unidades para criptografar
            }

            // Conversão de volta para caracteres
            char[] criptografado = new char[asciiValores.length];
            for (int i = 0; i < asciiValores.length; i++) {
                criptografado[i] = (char) asciiValores[i];
            }

            // Construção da String criptografada
            String mensagemCriptografada = new String(criptografado);

            // Exibição da mensagem criptografada
            JOptionPane.showMessageDialog(null, "Mensagem criptografada: " + mensagemCriptografada);

    }
}