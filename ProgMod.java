import javax.swing.*;

class ProgMod
{
    public static void soma()
    {
        int n1,n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Para Soma: \n\n Digite um número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));

        JOptionPane.showMessageDialog(null, "A soma eh " + (n1+n2));
    }

    public static void subtracao (int x, int y)
    {
        int s;

        s = x - y;

        JOptionPane.showMessageDialog(null, "A diferenca eh " + s);
    }

    public static int produto()
    {
        int n1,n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Para Produto:\n\nDigite um número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));

        return (n1 * n2);
    }

    public static double divisao(int x, int y)
    {
        double d;

        d = (double)x / (double)y;

        return d;
    }

    public static void main (String entrada[])
    {
        int n1, n2, s;
        double r;

        soma();
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));

        subtracao(n1,n2);

        s= produto();

        JOptionPane.showMessageDialog(null, "O produto eh " + s);

        r = divisao(n1,n2);
        JOptionPane.showMessageDialog(null, "A divisao eh " + r);

        System.exit(0);

    }
}