// Programa de adição que insere dois números, então exibe a soma deles.
3 ïimport java.util.Scanner; // programa utiliza a classe Scannerÿ
4
5 public class Addition
6 {
7 // método main inicia a execução do aplicativo Java
8 public static void main(String[] args)
9 {
10 ï// cria um Scanner para obter entrada a partir da janela de comandoÿ
11 ïScanner input = new Scanner(System.in); ÿ
12
13 ïint number1; // primeiro número a somar ÿ
14 ïint number2; // segundo número a somar ÿ
15 ïint sum; // soma de number1 e number2 ÿ
16
17 System.out.print("Enter first integer: "); // prompt
18 ïnumber1 = input.nextInt(); // lê primeiro o número fornecido pelo usuário ÿ
19
20 System.out.print("Enter second integer: "); // prompt
21 ïnumber2 = input.nextInt(); // lê o segundo número fornecido pelo usuário ÿ
22
23 ïsum = number1 + number2; // soma os números, depois armazena o total em sumÿ
24
25 ïSystem.out.printf("Sum is %d%n", sum); // exibe a soma ÿ
26 } // fim do método main
27 } // fim da classe Addition
