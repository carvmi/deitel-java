// Compara inteiros utilizando instruções if, operadores relacionais
// e operadores de igualdade.
import java.util.Scanner; // programa utiliza a classe Scanner

public class Comparison
{
 // método main inicia a execução do aplicativo Java
 public static void main(String[] args)
{
// cria Scanner para obter entrada a partir da linha de comando
 Scanner input = new Scanner(System.in);

 int number1; // primeiro número a comparar
 int number2; // segundo número a comparar

 System.out.print("Enter first integer: "); // prompt
 number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário

 System.out.print("Enter second integer: "); // prompt
 number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário

 if (number1 == number2) 
  System.out.printf("%d == %d%n", number1, number2);

 if (number1 != number2) 
   System.out.printf("%d != %d%n", number1, number2);

 if (number1 < number2) 
   System.out.printf("%d < %d%n", number1, number2); 

 if (number1 > number2) 
   System.out.printf("%d > %d%n", number1, number2); 
  
  if (number1 <= number2) 
   System.out.printf("%d <= %d%n", number1, number2);

  if (number1 >= number2) 
   System.out.printf("%d >= %d%n", number1, number2);
  } // fim do método main
} // fim da classe Comparison
