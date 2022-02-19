
import java.util.ArrayList;

public class Prova
{
	//Atributos
	private String nomeParticipante;
	private ArrayList <String> respostas = new ArrayList <String> ();
	private char[] gabarito = {'C','A','B','D','A','D','A','D','B','C'};
	private boolean situacao;
	private int pontuacao;

	//Métodos|Comportamentos
	
	void perguntas()
	{
		
		for(int i = 0; i < 10; i++)
			{
				switch(i)
				{
					case 0:
						System.out.println("01. Entre os itens abaixo, qual o que melhor se encaixa para a seguinte descrição:\n"
								+ "\n"
								+ "    É um espaço reservado na memória principal na qual se pode adicionar valores de\n"
								+ "    acordo com seu tipo e tamanho. Além disso, possui uma espécie de nome, chamado\n"
								+ "    de identificador, cujo possui regras para ser definido.");
						System.out.println
								(
								  "a. - Classe.\n"
								+ "\n"
								+ "b. - Função.\n"
								+ "\n"
								+ "c. - Variável.\n"
								+ "\n"
								+ "d. - Objeto."
								);
						
						respostas.add(ProvaMain.input.nextLine());
						System.out.println("=================================================");
						break;
						
					case 1:
						System.out.println("02. O Java foi e é uma das linguagens mais populares do mercado. Isso se deve, em\n"
								+ "    parte, ao seu slogan: \"Write once, run anywhere\", traduzindo, seria: \"Escreva\n"
								+ "    uma vez, execute em qualquer lugar.\" Entre as alternativas abaixo, qual a \n"
								+ "    melhor que explica esse slogan:");
						
						System.out.println
								(
								"  a. - A linguagem Java possui ferramentas que permitem a alta portabilidade. Temos\n"
								+ "    como principais a JVM, que permite a execução de códigos compilados, bytecodes,\n"
								+ "    que independem da máquina, apenas da versão da JVM e Java utilizado no desenvolvi - \n"
								+ "    mento do programa.\n"
								+ "\n"
								+ "b. - O slogan vem do fato de que o Javac, o compilador Java, transforma o código - fonte\n"
								+ "    em um código de linguagem universal para processadores Intel, permitindo a execução de\n"
								+ "    códigos compilados em máquinas diferentes de acordo com a marca do processador.\n"
								+ "\n"
								+ "c. - O bytecode, o código-fonte da linguagem Java, sequer necessita compilação, por funcio\n"
								+ "    nar em sua totalidade por meio de um interpretador, o Java ME.\n"
								+ "\n"
								+ "d. - Os códigos-fonte da linguagem Java são compilados em bytecodes pelo Javac, uma ferramen\n"
								+ "    ta que permite a execução do código de forma universal em todas os sistemas operacionais que\n"
								+ "    utilizam o Kernel Linux como base.\n"
								+ "");
						
						respostas.add(ProvaMain.input.nextLine());
						System.out.println("=================================================");
						break;
						
					case 2:
						System.out.println("03. Sobre os tipos existentes na linguagem Java, podemos afirmar:");
						
						System.out.println
								(
								"  a. - O tipo void pode ser usado tanto para declarar variáveis quanto métodos. No caso de variáveis,\n"
								+ "    seriam 'universais', isto é, poderiam aceitar qualquer valor, semelhante às linguagens que possuem ti\n"
								+ "    pagem dinâmica.\n"
								+ "\n"
								+ "b. - A String não é de fato um tipo primitivo do Java, sendo uma classe que foi adicionada após as\n"
								+ "    primeiras versões do Java.\n"
								+ "\n"
								+ "c. - Utilizamos o tipo double para adicionar valores numéricos inteiros, enquanto que o tipo float pa\n"
								+ "    ra valores fracionários.\n"
								+ "\n"
								+ "d. - Um array é um tipo já predefinido no Java, necessitando apenas declararmos a variável com a palavra-chave:\n"
								+ "    'array' para ser um array unidimensional e universal em termos de atribuição."
								);
						
						respostas.add(ProvaMain.input.nextLine());
						
						System.out.println("=================================================");
						break;
						
					case 3:
					        System.out.println("04. Dentre os conceitos abaixo, qual o melhor que se encaixa para a definição de 'Algoritmo'?:");
						
						System.out.println
						(
								"  a. - É a parte física de um sistema computacional, que é controlado pela 'parte virtual' para a \n"
								+ "    realização de instruções de tal.\n"
								+ "\n"
								+ "b. - É um método especial na construção de objetos no paradigma de programação orientada a objetos. \n"
								+ "    Ele é responsável pela 'construção' do objeto, sendo uma importante função para a manipulação dos\n"
								+ "    atributos e métodos de um objeto recém-criado.\n"
								+ "\n"
								+ "c. - Um algoritmo é quando declaramos e atribuimos valor a uma variável em um programa qualquer.\n"
								+ "\n"
								+ "d. - Algoritmo é a sequência de passos finitos realizados em uma certa ordem lógica afim de se ter\n"
								+ "    a solução de algum problema."
								);
						
						respostas.add(ProvaMain.input.nextLine());
						
						System.out.println("=================================================");
						break;
						
					case 4:
						System.out.println("05. Sabemos que existem dois tipos principais de estruturas de decisão na Linguagem de programação Java e em boa parte\n"
								+ "    das liguagens baseadas na Linguagem C. São elas:");
						
						System.out.println
								(
								""
								+ "a. - Switch Case e If Else.\n"
								+ "\n"
								+ "b. - For e While.\n"
								+ "\n"
								+ "c. - Void e Array.\n"
								+ "\n"
								+ "d. - Scanner e Random."
								);
						
						respostas.add(ProvaMain.input.nextLine());
						
						System.out.println("=================================================");
						break;
						
					case 5:
						System.out.println("06. Qual das alternativas abaixo não é uma das formas de representar um algoritmo:");
						
						System.out.println
								(
								"  a. - Fluxograma.\n"
								+ "\n"
								+ "b. - Pseudocódigo.\n"
								+ "\n"
								+ "c. - Receita.\n"
								+ "\n"
								+ "d.  CPU."
								);
						
						respostas.add(ProvaMain.input.nextLine());
						
						System.out.println("=================================================");
						break;
						
					case 6:
						System.out.println("07. Qual destas opções abaixo é uma ferramenta de versionamento?");
						
						System.out.println
								(
								""
								+ "a.	Git\n"
								+ "b.	Array\n"
								+ "c.	Import\n"
								+ "d.	Void"
								);
						
						respostas.add(ProvaMain.input.nextLine());
						
						System.out.println("=================================================");
						break;
						
					case 7:
						System.out.println("08. Qual caractere do código está ERRADO?\n"
								+ "System.out.println{“Hello World!”};");
						
						System.out.println
								(""
								+ "a. - !\n"
								+ "b. - “ ”\n"
								+ "c. - ;\n"
								+ "d. - {}"
								);
						
						respostas.add(ProvaMain.input.nextLine());
						
						System.out.println("=================================================");
						break;
						
					case 8:
						System.out.println("09. Do inglês Integrated Development Environment ou Ambiente de Desenvolvimento Integrado é...");
						
						System.out.println
								(
								""
								+ "a. - o Java\n"
								+ "b. - uma IDE\n"
								+ "c. - uma String\n"
								+ "d. - uma EDI"
								);
						
						respostas.add(ProvaMain.input.nextLine());
						
						System.out.println("=================================================");
						break;
						
					case 9:
						System.out.println("10. Qual  nome do erro dado na seguinte expressão?\n"
								+ "float divisão = 1 / 0;");
						
						System.out.println
								(
								""
								+ "a. - ParseException\n"
								+ "b. - ArrayOutOfBoundsException\n"
								+ "c. - ArithmeticException\n"
								+ "d. - RuntimeException"
								);
						
						respostas.add(ProvaMain.input.nextLine());
						
						System.out.println("=================================================");
						break;
						
				}
			}
		
	}
	
	void gabarito()
	{
		System.out.println("=================================================");
		System.out.println("#############       GABARITO        #############");
		System.out.println("=================================================");
		
		System.out.println("PONTUAÇÃO: " + this.pontuacao);
		System.out.println("=================================================");
		System.out.println("GABARITO: ");
		
		for(int index = 0; index < 10; index++)
		{
			System.out.println(index + " - "+ this.gabarito[index] + "/10");
		}
		
		System.out.println("Pela a análise do sistema identificamos|calculamos que você foi: " + situacao());
	}
	
	void setPontuacao()
	{
		for (String respostas : this.respostas)
		{
			int indexRespostas = this.respostas.indexOf(respostas);
			
			switch (indexRespostas)
			{
				case 0:
					if(respostas.charAt(0) == gabarito[indexRespostas])
					{
						this.pontuacao++;
					}
					break;
					
				case 1:
					if(respostas.charAt(0) == gabarito[indexRespostas])
					{
						this.pontuacao++;
					}
					break;
					
				case 2:
					if(respostas.charAt(0) == gabarito[indexRespostas])
					{
						this.pontuacao++;
					}
					break;
					
				case 3:
					if(respostas.charAt(0) == gabarito[indexRespostas])
					{
						this.pontuacao++;
					}
					break;
					
				case 4:
					if(respostas.charAt(0) == gabarito[indexRespostas])
					{
						this.pontuacao++;
					}
					break;
					
				case 5:
					if(respostas.charAt(0) == gabarito[indexRespostas])
					{
						this.pontuacao++;
					}
					break;
					
				case 6:
					if(respostas.charAt(0) == gabarito[indexRespostas])
					{
						this.pontuacao++;
					}
					break;
					
				case 7:
					if(respostas.charAt(0) == gabarito[indexRespostas])
					{
						this.pontuacao++;
					}
					break;
					
				case 8:
					if(respostas.charAt(0) == gabarito[indexRespostas])
					{
						this.pontuacao++;
					}
					break;
					
				case 9:
					if(respostas.charAt(0) == gabarito[indexRespostas])
					{
						this.pontuacao++;
					}
					break;
					
				
			}
		}
	}
	
	int getPontuacao()
	{
		return this.pontuacao;
	}
	
	void setNomeParticipante(String nomeParticipante)
	{
		this.nomeParticipante = nomeParticipante;
	}
	
	String getNomeParticipante()
	{
		return this.nomeParticipante;
	}
	
	String situacao()
	{
		if(this.pontuacao >= 7)
		{
			return "APROVADO";
		}
		else
		{
			return "REPROVADO";
		}
	}
		
	
	
}
