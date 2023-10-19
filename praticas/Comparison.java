// Compara inteiros utilizando instruções if, operadores relacionais
3 // e operadores de igualdade.
4 import java.util.Scanner; // programa utiliza a classe Scanner
5
6 public class Comparison
7 {
8 // método main inicia a execução do aplicativo Java
9 public static void main(String[] args)
10 {
11 // cria Scanner para obter entrada a partir da linha de comando
12 Scanner input = new Scanner(System.in);
13
14 int number1; // primeiro número a comparar
15 int number2; // segundo número a comparar
16
17 System.out.print("Enter first integer: "); // prompt
18 number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
19
20 System.out.print("Enter second integer: "); // prompt
21 number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
22
23 ïif (number1 == number2) ÿ
24 ï System.out.printf("%d == %d%n", number1, number2);ÿ
25
26 ïif (number1 != number2) ÿ
27 ï System.out.printf("%d != %d%n", number1, number2);ÿ
28
29 ïif (number1 < number2) ÿ
30 ï System.out.printf("%d < %d%n", number1, number2); ÿ
31
32 ïif (number1 > number2) ÿ
33 ï System.out.printf("%d > %d%n", number1, number2); ÿ
34
35 ïif (number1 <= number2) ÿ
36 ï System.out.printf("%d <= %d%n", number1, number2);ÿ
37
38 ïif (number1 >= number2) ÿ
39 ï System.out.printf("%d >= %d%n", number1, number2);ÿ
40 } // fim do método main
41 } // fim da classe Comparison
