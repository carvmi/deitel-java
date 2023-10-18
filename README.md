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
