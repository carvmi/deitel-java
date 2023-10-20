# Revisão
## 2.1 Preencha as lacunas em cada uma das seguintes afirmações:
- Um(a) <b>chave esquerda ({)</b> começa o corpo de cada método e um(a) <b>chave direita (})</b> termina o corpo de cada método.
- Você pode usar a declaração <b>if</b> para tomar decisões.
-  <b>//</b> começa em um comentário de fim de linha.
- <b>Caracteres de espaço, novas linhas e tabulações</b> são chamados espaço em branco.
- <b>Palavras-chave</b> são reservadas para uso pelo Java.
- Aplicativos Java iniciam a execução no método <b>main</b>.
- Os métodos <b>System.out.print, System.out.println e System.out.printf</b> exibem informações em uma janela de comando.
## 2.2 Determine se cada uma das seguintes afirmações é verdadeira ou falsa. Se falsa, explique por quê.
- Os comentários fazem com que o computador imprima o texto depois das // na tela quando o programa executa.
  <b><i> Falso. Os comentários não causam nenhuma ação quando o programa executa. Eles são utilizados para documentar programas e melhoram sua legibilidade. </i></b>
- Todas as variáveis devem ser atribuídas a um tipo quando são declaradas. <b><i>Verdadeiro.</i></b>
- O Java considera que as variáveis number e NuMbEr são idênticas. <b><i> Falso. Java diferencia letras maiúsculas de minúsculas, então essas variáveis são distintas </i></b>
- O operador de resto (%) pode ser utilizado apenas com operandos inteiros. <b><i>Falso. O operador de resto também pode ser utilizado com operandos não inteiros em Java.</i></b>
- Os operadores aritméticos *, /, %, + e - têm, todos, o mesmo nível de precedência. <b><i>Falso. Os operadores *, / e % têm uma precedência mais alta que os operadores + e -.</b></i>
## 2.3 Escreva instruções para realizar cada uma das tarefas a seguir:
:hammer: Declare que as variáveis c, thisIsAVariable, q76354 e number serão do tipo int.
<br>
 <b><i>int c, thisIsAVariable, q76354, number;</b></i>
 <br>
 ou
<br>
 <b><i>int c;</b></i>
 <br>
 <b><i>int thisIsAVariable;</b></i>
  <br>
<b><i>int q76354;</b></i>
 <br>
<b><i>int number;</b></i>
<br>
 :hammer: Solicite que o usuário insira um inteiro.
  <br>
 <b><i> System.out.print(“Enter an integer: “);</b></i>
  <br>
:hammer: Insira um inteiro e atribua o resultado à variável int value. Suponha que a variável Scanner input possa ser utilizada para ler um valor digitado pelo usuário.
  <br>
<b><i>value = input.nextInt();</b></i>
<br>
:hammer: Imprima “This is a Java program" em uma linha na janela de comando. Use o método System.out.println.
<br>
<b><i>System.out.println(“This is a Java program”);</b></i>
<br>
:hammer: Imprima “This is a Java program" em duas linhas na janela de comando. A primeira deve terminar com Java. Utilize o método System.out.printf e dois especificadores de formato %s.
<br>
<b><i>System.out.printf(“%s%n%s%n”, “This is a Java”, “program”);</b></i>
<br>
:hammer: Se a variável number não for igual a 7, exiba “The variable number is not equal to 7".
<br>
<b><i>if (number != 7)</b></i>
<br>
<b><i>System.out.println(“The variable number is not equal to 7”);</b></i>
## 2.4 Identifique e corrija os erros em cada uma das seguintes instruções:
:hammer: if (c < 7);
<br>
System.out.println(“c is less than 7”);
<br>
<b><i>Erro: o ponto e vírgula depois do parêntese direito da condição (c < 7) no if.
Correção: remova o ponto e vírgula depois do parêntese direito. [Observação: como resultado, a instrução de saída executará independentemente
de a condição em if ser verdadeira.] </b></i>
:hammer: if (c => 7)
<br>
System.out.println(“c is equal to or greater than 7”);
<br>
<b><i>Erro: o operador relacional => é incorreto. Correção: altere => para >=.</b></i>
### Mais Exercícios
## 2.7 Preencha as lacunas em cada uma das seguintes afirmações:
- <b>Comentários</b> são utilizados para documentar um programa e aprimorar sua legibilidade.
- Uma decisão pode ser tomada em um programa Java com um(a) <b>if</b>.
- Os cálculos normalmente são realizados pelas instruções <b>aritméticas/matemáticas</b>.
- Os operadores aritméticos com a mesma precedência da multiplicação são <b>divisão (/) e módulo(%) </b>. [2].
- Quando parênteses em uma expressão aritmética estão aninhados, o conjunto de parênteses <b>interno</b> é avaliado primeiro.
- Uma posição na memória do computador que pode conter valores diferentes várias vezes ao longo da execução de um programa é chamada <b>variável</b>.
## 2.8 Escreva instruções Java que realizem cada uma das seguintes tarefas:
- Exibir a mensagem “Enter an integer: “, deixando o cursor na mesma linha.
- Atribuir o produto de variáveis b e c para a variável a.
- Utilizar um comentário para afirmar que um programa executa um cálculo de exemplo de folha de pagamento.
## 2.9 Determine se cada uma das seguintes afirmações é verdadeira ou falsa. Se falsa, explique por quê.
- Operadores Java são avaliados da esquerda para a direita.
- Os seguintes nomes são todos de variável válidos: _under_bar_, m928134, t5, j7, her_sales$, his_$account_total, a, b$, c, z e z2.
- Uma expressão aritmética Java válida sem parênteses é avaliada da esquerda para a direita.
- Os seguintes nomes são todos de variável inválidos: 3g, 87, 67h2, h22 e 2h.
## 2.10 Supondo que x = 2 e y = 3, o que cada uma das instruções a seguir exibe?
- System.out.printf(“x = %d%n”, x);
- System.out.printf(“Value of %d + %d is %d%n”, x, x, (x + x));
- System.out.printf(“x =”);
- System.out.printf(“%d = %d%n”, (x + y), (y + x));
## 2.11 Quais instruções Java a seguir contêm variáveis cujos valores são modificados?
- p = i + j + k + 7;
- System.out.println(“variables whose values are modified”);
- System.out.println(“a = 5”);
- value = input.nextInt();
## 2.12 Dado que y = ax3 + 7, quais das seguintes alternativas são instruções Java corretas para essa equação?
- y = a * x * x * x + 7;
- y = a * x * x * (x + 7);
- y = (a * x) * x * (x + 7);
- y = (a * x) * x * x + 7;
- y = a * (x * x * x) + 7;
- y = a * x * (x * x + 7);
## 2.13 Declare a ordem de avaliação dos operadores em cada uma das seguintes instruções Java e mostre o valor de x depois que cada instrução
é realizada:
- x = 7 + 3 * 6 / 2 - 1;
- x = 2 % 2 + 2 * 2 - 2 / 2;
- x = (3 * 9 * (3 + (9 * 3 / (3))));
## 2.19 O que o seguinte código imprime?
- System.out.printf("*%n**%n***%n****%n*****%n");
## 2.20 O que o seguinte código imprime?
- System.out.println("*");
- System.out.println("***");
- System.out.println("*****");
- System.out.println("****");
- System.out.println("**");
## 2.21 O que o seguinte código imprime?
- System.out.print("*");
- System.out.print("***");
- System.out.print("*****");
- System.out.print("****");
- System.out.println("**");
## 2.22 O que o seguinte código imprime?
- System.out.print("*");
- System.out.println("***");
- System.out.println("*****");
- System.out.print("****");
- System.out.println("**");
## 2.23 O que o seguinte código imprime?
- System.out.printf("%s%n%s%n%s%n", "*", "***", "*****");
