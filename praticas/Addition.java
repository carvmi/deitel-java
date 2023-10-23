// Programa de adição que insere dois números, então exibe a soma deles.
import java.util.Scanner; // programa utiliza a classe Scanner

public class Addition
{
// método main inicia a execução do aplicativo Java
public static void main(String[] args)
{
// cria um Scanner para obter entrada a partir da janela de comando
Scanner input = new Scanner(System.in); 

int number1; // primeiro número a somar 
int number2; // segundo número a somar 
int sum; // soma de number1 e number2 

System.out.print("Enter first integer: "); // prompt
number1 = input.nextInt(); // lê primeiro o número fornecido pelo usuário 

System.out.print("Enter second integer: "); // prompt
number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário 
22
23 ïsum = number1 + number2; // soma os números, depois armazena o total em sumÿ
24
25 ïSystem.out.printf("Sum is %d%n", sum); // exibe a soma ÿ
26 } // fim do método main
27 } // fim da classe Addition
