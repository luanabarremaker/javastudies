import javax.swing.*;

class ProgMatriz
{
    public static void main (String entrada[])
    {
        int vetor[] = {2,4,6,8,10};
        //duas linhas e tres colunas
        int matriz[][] = new int [2] [3];
        String msg = "vetor = "; //variavel global

        //enquanto indice for menor que o tamanho do vetor, faca:
        //vai percorrer todo o vetor a partir de suas posicoes
        //int vetor[] = {2,4,6,8,10}
        //posicoes       0 1 2 3 4
        //depois vai mostrar qual a posicao de cada vetor
        
        for (int i = 0; i < vetor.length; i++)
        {
            msg = msg + vetor[i] + "  ";
        }
        JOptionPane.showMessageDialog(null,msg);

        //mmudanca da variavel global
        msg = "Matriz = \n\n";

        //criacao de matriz com conteudo externo
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[0].length; j++)
            {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para posicao " + i  + " e " + j));
                msg = msg + matriz[i][j] + "  ";
            }
            msg = msg + "\n";
        }     

        JOptionPane.showMessageDialog(null,msg);
        System.exit(0);


    }

}
