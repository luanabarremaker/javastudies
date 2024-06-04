import javax.swing.*;

class AtividadePratica2
{
    public static void main (String entrada[])
    {
        int n1, n2;
        int div;
        double pot;
        String msg = "";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));

        //processamento
        div = (int)n1 / (int)n2;
        pot = Math.pow(n1, n2);

        //saída de resultados
        msg = "n1 = " + n1 + " n2 = " + n2 + "\n";
        msg = msg + "quociente da divisão de n1 por n2 = " + div + "\n";
        msg = msg + "potencia de n1 e n2 = " + pot + "\n";

        JOptionPane.showMessageDialog(null, msg);
      
        System.exit(0);
    }
}