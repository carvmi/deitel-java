# Java: Como Programar 

## :file_folder: Projetos  
-

## :file_folder: Exercícios 
 ## :pushpin: Capítulo 1 - Introdução a computadores, internet e Java
 ### Revisão
- Os computadores processam dados sob o controle de conjuntos de instruções chamados <b>programas</b>.
- As principais unidades lógicas do computador são <b>unidade de entrada, unidade de saída, unidade de memória, unidade de central de processamento, unidade aritmética e lógica, unidade de armazenamento secundário</b>.
- Os três tipos de linguagens discutidas no capítulo são <b>linguagens de máquina, linguagens de assembly, linguagens de alto nível</b>.
- Os programas que traduzem programas de linguagem de alto nível em linguagem de máquina são chamados <b>compiladores</b>.
- <b>Android</b> é um sistema operacional para dispositivos móveis baseados no kernel do Linux e Java.
- O software <b>candidato a lançamento ("Release candidate")</b> em geral tem todos os recursos, sendo (supostamente) livre de erros e pronto para uso pela comunidade.
- O Wii Remote, bem como muitos smartphones, usa um(a) <b>acelerômetro</b> que permite ao dispositivo responder ao movimento.
- O comando <b>java</b> do JDK executa um aplicativo Java.
- O comando <b>javac</b> do JDK compila um programa Java.
- Um arquivo de código-fonte aberto Java deve terminar com a extensão <b>.java</b>.
- Quando um programa Java é compilado, o arquivo produzido pelo compilador termina com a extensão <b>.class</b>.
- O arquivo produzido pelo compilador Java contém <b>bytecodes</b>, que são executados pela Java Virtual Machine.
- Os objetos permitem a prática de <b>ocultamento de informações</b> — embora eles possam se comunicar entre si por meio de interfaces bem definidas, normalmente não têm autorização para descobrir como outros objetos são implementados.
- Os programadores Java concentram-se na criação de <b>classes</b>, que contêm campos e o conjunto de métodos que manipulam esses campos, além de fornecer serviços para clientes.
- O processo de analisar e projetar um sistema de um ponto de vista orientado a objetos é chamado <b>análise e projeto orientados a objetos (OOAD)</b>.
- Uma nova classe de objetos pode ser convenientemente criada por <b>herança</b> — a nova classe (chamada subclasse) começa com as características de uma classe existente (chamada superclasse), personalizando-as e talvez adicionando características próprias.
- <b>Unified Modeling Language (UML)</b> é uma linguagem gráfica que permite às pessoas que projetam sistemas de software utilizar uma notação padrão da indústria para representá-las.
- O tamanho, forma, cor e peso de um objeto são considerados <b>atributos</b> da classe dele.
 ### Mais Exercícios
  - A unidade lógica que recebe informações de fora do computador para uso por ele é a <b>unidade de entrada</b>.
  - O processo de instrução do computador para resolver um problema específico é chamado <b>programação</b>.
  - A <b>linguagem assembly</b> é um tipo de linguagem de computador que utiliza abreviações em inglês para instruções de linguagem de máquina.
  - <b>Unidade de saída</b> é uma unidade lógica que envia informações que já foram processadas pelo computador para vários dispositivos, de modo que possam ser utilizadas fora da máquina.
  - <b>Unidade de Memória e Unidade de armazenamento secundária</b> são unidades lógicas do computador que retêm informações.
  - <b>Unidade de aritmética e lógica (ALU)</b> é uma unidade lógica do computador que realiza cálculos.
  - <b>Unidade de controle</b> é uma unidade lógica do computador que toma decisões lógicas.
  - As linguagens mais convenientes para que o programador escreva programas rápida e facilmente são as <b>linguagens de alto nível</b>.
  - A única linguagem que um computador pode entender diretamente é a <b>linguagem de máquina</b> dele.
  - <b>Unidade de Controle</b> é uma unidade lógica do computador que coordena as atividades de todas as outras unidades lógicas.
  - A linguagem de programação <b>Java</b> é agora utilizada para desenvolver aplicativos corporativos de grande porte, aprimorar a funcionalidade de servidores da web, fornecer aplicativos a dispositivos de consumo popular e para muitos outros propósitos.
  - Inicialmente, o <b>C</b> tornou-se muito conhecido como a linguagem de desenvolvimento do sistema operacional UNIX.
  - O <b>TCP (Transmission Control Protocol)</b> garante que as mensagens, que consistem em partes sequencialmente numeradas chamadas bytes, sejam adequadamente
encaminhadas do emissor para o receptor, cheguem intactas e sejam montadas na ordem correta.
  - A linguagem de programação <b>C++</b> foi desenvolvida por Bjarne Stroustrup no início dos anos 1980 na Bell Laboratories.
  - Os programas Java normalmente passam por cinco fases: <b>edição, compilação, carregamento, verificação e execução</b>.
  - Um(a) <b>ambiente de desenvolvimento integrado (IDE)</b> fornece muitas ferramentas que suportam o processo de desenvolvimento de software, como editores para escrever e editar programas, depuradores a fim de localizar erros de lógica em programas e muitos outros recursos.
  - O comando java invoca <b>Máquina Virtual Java (JVM)</b>, que executa programas Java.
  - Um(a) <b>máquina virtual</b> é um aplicativo de software que simula um computador, mas oculta o sistema operacional e o hardware subjacentes
dos programas que interagem com ela(e).
  - O <b>carregador de classe da JVM</b> transfere os arquivos .class contendo os bytecodes do programa para a memória principal.
  - O <b>verificador de bytecode</b> examina bytecodes para assegurar que eles são válidos.

 ## :pushpin: Capítulo 2 Introdução a aplicativos Java – entrada/saída e operadores
 ### Revisão
2.1 Preencha as lacunas em cada uma das seguintes afirmações:
a) Um(a) ________ começa o corpo de cada método e um(a) ________ termina o corpo de cada método.
b) Você pode usar a declaração ________ para tomar decisões.
c) ________ começa em um comentário de fim de linha.
d) ________, ________ e ________ são chamados espaço em branco.
e) ________ são reservadas para uso pelo Java.
f) Aplicativos Java iniciam a execução no método ________.
g) Os métodos ________, ________ e ________ exibem informações em uma janela de comando.
2.2 Determine se cada uma das seguintes afirmações é verdadeira ou falsa. Se falsa, explique por quê.
a) Os comentários fazem com que o computador imprima o texto depois das // na tela quando o programa executa.
b) Todas as variáveis devem ser atribuídas a um tipo quando são declaradas.
c) O Java considera que as variáveis number e NuMbEr são idênticas.
d) O operador de resto (%) pode ser utilizado apenas com operandos inteiros.
e) Os operadores aritméticos *, /, %, + e - têm, todos, o mesmo nível de precedência.
2.3 Escreva instruções para realizar cada uma das tarefas a seguir:
a) Declare que as variáveis c, thisIsAVariable, q76354 e number serão do tipo int.
b) Solicite que o usuário insira um inteiro.
c) Insira um inteiro e atribua o resultado à variável int value. Suponha que a variável Scanner input possa ser utilizada para ler
um valor digitado pelo usuário.
d) Imprima “This is a Java program" em uma linha na janela de comando. Use o método System.out.println.
e) Imprima “This is a Java program" em duas linhas na janela de comando. A primeira deve terminar com Java. Utilize o método
System.out.printf e dois especificadores de formato %s.
f) Se a variável number não for igual a 7, exiba “The variable number is not equal to 7".
2.4 Identifique e corrija os erros em cada uma das seguintes instruções:
a) if (c < 7);
System.out.println(“c is less than 7”);
b) if (c => 7)
System.out.println(“c is equal to or greater than 7”);
### Mais Exercícios
2.7 Preencha as lacunas em cada uma das seguintes afirmações:
a) ________ são utilizados para documentar um programa e aprimorar sua legibilidade.
b) Uma decisão pode ser tomada em um programa Java com um(a) ________.
c) Os cálculos normalmente são realizados pelas instruções ________.
d) Os operadores aritméticos com a mesma precedência da multiplicação são ________ e ________.
e) Quando parênteses em uma expressão aritmética estão aninhados, o conjunto de parênteses ________ é avaliado primeiro.
f) Uma posição na memória do computador que pode conter valores diferentes várias vezes ao longo da execução de um programa é
chamada ________.
2.8 Escreva instruções Java que realizem cada uma das seguintes tarefas:
a) Exibir a mensagem “Enter an integer: “, deixando o cursor na mesma linha.
b) Atribuir o produto de variáveis b e c para a variável a.
c) Utilizar um comentário para afirmar que um programa executa um cálculo de exemplo de folha de pagamento.
2.9 Determine se cada uma das seguintes afirmações é verdadeira ou falsa. Se falsa, explique por quê.
a) Operadores Java são avaliados da esquerda para a direita.
b) Os seguintes nomes são todos de variável válidos: _under_bar_, m928134, t5, j7, her_sales$, his_$account_total, a, b$,
c, z e z2.
c) Uma expressão aritmética Java válida sem parênteses é avaliada da esquerda para a direita.
d) Os seguintes nomes são todos de variável inválidos: 3g, 87, 67h2, h22 e 2h.
2.10 Supondo que x = 2 e y = 3, o que cada uma das instruções a seguir exibe?
a) System.out.printf(“x = %d%n”, x);
b) System.out.printf(“Value of %d + %d is %d%n”, x, x, (x + x));
c) System.out.printf(“x =”);
d) System.out.printf(“%d = %d%n”, (x + y), (y + x));
2.11 Quais instruções Java a seguir contêm variáveis cujos valores são modificados?
a) p = i + j + k + 7;
b) System.out.println(“variables whose values are modified”);
c) System.out.println(“a = 5”);
d) value = input.nextInt();
2.12 Dado que y = ax3 + 7, quais das seguintes alternativas são instruções Java corretas para essa equação?
a) y = a * x * x * x + 7;
b) y = a * x * x * (x + 7);
c) y = (a * x) * x * (x + 7);
d) y = (a * x) * x * x + 7;
e) y = a * (x * x * x) + 7;
f) y = a * x * (x * x + 7);
2.13 Declare a ordem de avaliação dos operadores em cada uma das seguintes instruções Java e mostre o valor de x depois que cada instrução
é realizada:
a) x = 7 + 3 * 6 / 2 - 1;
b) x = 2 % 2 + 2 * 2 - 2 / 2;
c) x = (3 * 9 * (3 + (9 * 3 / (3))));
2.19 O que o seguinte código imprime?
System.out.printf("*%n**%n***%n****%n*****%n");
2.20 O que o seguinte código imprime?
System.out.println("*");
System.out.println("***");
System.out.println("*****");
System.out.println("****");
System.out.println("**");
2.21 O que o seguinte código imprime?
System.out.print("*");
System.out.print("***");
System.out.print("*****");
System.out.print("****");
System.out.println("**");
2.22 O que o seguinte código imprime?
System.out.print("*");
System.out.println("***");
System.out.println("*****");
System.out.print("****");
System.out.println("**");
2.23 O que o seguinte código imprime?
System.out.printf("%s%n%s%n%s%n", "*", "***", "*****");
