import javax.swing.*;

class Prog07
{
    public static void soma()
    {
        int s=0, vet[] = {1,2,3,4,5};
        
        for (int i = 0; i < vet.length; i++)
        {
            //soma todos os valores do vetor
            s = s + vet[i];
        }

        JOptionPane.showMessageDialog(null,"A somatoria eh " + s);
    }

    public static int produto()
    {
        int p=1, vet[] = {1,2,3,4,5};

        for (int i = 0; i < vet.length; i++)
        {
            //faz a multiplicacao dos valores do vetor
            p = p * vet[i];
        }

        return p;
    }

    public static void main (String entrada[])
    {
        int r;

        JOptionPane.showMessageDialog(null, "Para o vetor [1,2,3,4,5]: ");

        soma();
        r = produto();

        JOptionPane.showMessageDialog(null, "A produtoria eh " + r);

        System.exit(0);
    }
}