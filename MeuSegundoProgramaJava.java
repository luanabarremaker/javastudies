//salvar como MeuSegundoProgramaJava.java

//nome da classe
class MeuSegundoProgramaJava
{
   //módulo principal com a entrada pela linha de comando
   public static void main (String entrada[])
   {
      //declaração de variáveis
	int n1, n2, soma;
	
	//entrada de dados
	//na linha de comando do java só recebe strign, então utiliza-se a função integer.pareint para transformar string em inteiro
	n1 = Integer.parseInt(entrada[0]);
	n2 = Integer.parseInt(entrada[1]);
	//processamento
	soma = n1 + n2;
	//saída de resultados
	System.out.println(n1 + " + " + n2 + " = " + soma);
	System.exit(0);
   }
}  

//passar 2 parâmetros na hora de executar