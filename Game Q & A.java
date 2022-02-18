import java.util.Scanner;

public class PERGUNTASeRESPOSTAS {

	static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("============| PERGUNTAS E RESPOSTAS |==========");
		System.out.println("Regras: Perguntas de 4 alternativas.");
		System.out.println("É permitido errar apenas 5 vezes.");
		System.out.println("Iniciar Jogo? S/N");
		String inicJogo = ler.nextLine();
		
		if(inicJogo.equals("S") || inicJogo.equals("s")) {
			Perguntas jogador = new Perguntas();
			jogador.p1();
		if(Perguntas.erros != 0) {
				jogador.p15();
			}
		} else if(inicJogo.equals("N") || inicJogo.equals("n")) {
			System.out.println("Jogo não iniciado.");
		} else {
			System.out.println("Resposta inválida.");
		}	
	}
}

class Perguntas {
	
	static Scanner ler = new Scanner(System.in);
	int points = 0;
	String escolha = "";
	static int erros = 5;
	double coins = 0.0;
	
	void p1() {
		// Pergunta 1
					System.out.println("_____________________________________");
					System.out.println(" ");
					System.out.println("Pergunta 1");
					System.out.println("Valendo R$ 100,00 ");
					System.out.println("1. Qual a capital do Brasil?");
					System.out.println("--------- ALTERNATIVAS ---------");
					System.out.println("A - Brasília       B - São Paulo");
					System.out.println("C - Bahia          D - Nova York");
					System.out.println("--------------------------------");
					escolha = ler.nextLine();
					
					if(escolha.equals("A") || escolha.equals("a")) {
						coins = coins + 100.0;
						points++;
						System.out.println("Você acertou!!");
						System.out.println("Próxima pergunta.");
						p2();
					} else if (erros != 0){
						erros = erros - 1;
						
						if(erros == 0) {
							System.out.println("Você perdeu!!!");
							System.out.println("Acertos: " + points + "/15");
							System.out.println("Tente novamente.");
						} else if(erros != 0) {
							System.out.println("Você errou.");
							System.out.println("Resposta: A - Brasília");
							System.out.println("Restam " + erros + " tentativas.");
							p2();
						}
					}
	}	
				
	void p2() {
		// Pergunta 2
					System.out.println("__________________________________________________");
					System.out.println(" ");
					System.out.println("Pergunta 2:");
					System.out.println("Valendo R$ 100,00 ");
					System.out.println("2. De quem é a famosa frase “Penso, logo existo”?");
					System.out.println("------------- ALTERNATIVAS -------------");
					System.out.println("A - Platão       B - Galileu Galilei");
					System.out.println("C - Descartes    D - Ednaldo Pereira");
					System.out.println("----------------------------------------");
					escolha = ler.nextLine();
					
					if(escolha.equals("C") || escolha.equals("c")) {
						coins =  coins + 100.0;
						points++;
						System.out.println("Você acertou!!");
						System.out.println("Próxima pergunta.");
						p3();
					} else if (erros != 0){
						erros = erros - 1;
						
						if(erros == 0) {
							System.out.println("Você perdeu!!!");
							System.out.println("Acertos: " + points + "/15");
							System.out.println("Tente novamente.");
						} else if(erros != 0) {
							System.out.println("Você errou.");
							System.out.println("Resposta: C - Descartes");
							System.out.println("Restam " + erros + " tentativas.");
							p3();
						}	
					}
	}
	 void p3() {
		// Pergunta 3
					System.out.println("________________________________________________");
					System.out.println(" ");
					System.out.println("Pergunta 3:");
					System.out.println("Valendo R$ 500,00 ");
					System.out.println("3. De onde é a invenção do chuveiro elétrico?");
					System.out.println("--------- ALTERNATIVAS ---------");
					System.out.println("A - França        B - Inglaterra");
					System.out.println("C - Brasil        D - Austrália");
					System.out.println("--------------------------------");
					escolha = ler.nextLine();
					
					if(escolha.equals("C") || escolha.equals("c")) {
						coins = coins + 500.0;
						points++;
						System.out.println("Você acertou!!");
						System.out.println("Próxima pergunta.");
						p4();
					} else if (erros != 0) {
						erros = erros - 1;
						
						if(erros == 0) {
							System.out.println("Você perdeu!!!");
							System.out.println("Acertos: " + points + "/15");
							System.out.println("Tente novamente.");
						} else if(erros != 0) {
							System.out.println("Você errou.");
							System.out.println("Resposta: C - Brasil");
							System.out.println("Restam " + erros + " tentativas.");
							p4();
						}	
					}
	 }
	  void p4() {
		// Pergunta 4
					System.out.println("__________________________________________________");
					System.out.println(" ");
					System.out.println("Pergunta 4:");
					System.out.println("Valendo R$ 500,00 ");
					System.out.println("4. Qual é o menor e o maior país do mundo?");
					System.out.println("------------------- ALTERNATIVAS -----------------");
					System.out.println("A - Vaticano e Rússia          B - Mônaco e Canadá");
					System.out.println("C - Malta e Estados Unidos     D - Nauru e China");
					System.out.println("--------------------------------------------------");
					escolha = ler.nextLine();
				
					if(escolha.equals("A") || escolha.equals("a")) {
						coins = coins + 500.0;
						points++;
						System.out.println("Você acertou!!");
						System.out.println("Próxima pergunta.");
						p5();
					} else if (erros != 0) {
						erros = erros - 1;
					
						if(erros == 0) {
							System.out.println("Você perdeu!!!");
							System.out.println("Acertos: " + points + "/15");
							System.out.println("Tente novamente.");
						} else if(erros != 0) {
							System.out.println("Você errou.");
							System.out.println("Resposta: A - Vaticano e Rússia");
							System.out.println("Restam " + erros + " tentativas.");
							p5();
						}	
					}		
	  }
	   void p5() {
		// Pergunta 5
					System.out.println("__________________________________________________");
					System.out.println(" ");
					System.out.println("Pergunta 5:");
					System.out.println("Valendo R$ 500,00 ");
					System.out.println("1.  Atualmente, quantos elementos químicos "
							+ "a tabela periódica possui?");
					System.out.println("--------- ALTERNATIVAS ---------");
					System.out.println("A - 118                  B - 92");
					System.out.println("C - 108                  D - 109");
					System.out.println("--------------------------------");
					escolha = ler.nextLine();
				
					if(escolha.equals("A") || escolha.equals("a")) {
						coins = coins + 500.0;
						points++;
						System.out.println("Você acertou!!");
						System.out.println("Próxima pergunta.");
						p6();
					} else if (erros != 0){
						erros = erros - 1;
						
						if(erros == 0) {
							System.out.println("Você perdeu!!!");
							System.out.println("Acertos: " + points + "/15");
							System.out.println("Tente novamente.");
						} else if(erros != 0) {
							System.out.println("Você errou.");
							System.out.println("Resposta: A - 118");
							System.out.println("Restam " + erros + " tentativas.");
							p6();
						}	
						
					}
						
					
					
	   }
	   void p6() {
			// Pergunta 6
			System.out.println("__________________________________________________");
			System.out.println(" ");
			System.out.println("Pergunta 6:");
			System.out.println("Valendo R$ 1700,00 ");
			System.out.println("6. O que a palavra legend significa em português?");
			System.out.println("--------- ALTERNATIVAS ---------");
			System.out.println("A - Legenda       B - Conto");
			System.out.println("C - Lenda         D - Legendário");
			System.out.println("--------------------------------");
			escolha = ler.nextLine();
			
			if(escolha.equals("C") || escolha.equals("c")) {
				coins = coins + 1700.0;
				points++;
				System.out.println("Você acertou!!");
				System.out.println("Próxima pergunta.");
				p7();
			} else if (erros != 0){
				erros = erros - 1;
			
				if(erros == 0) {
					System.out.println("Você perdeu!!!");
					System.out.println("Acertos: " + points + "/15");
					System.out.println("Tente novamente.");
				} else if(erros != 0) {
					System.out.println("Você errou.");
					System.out.println("Resposta: C - Lenda");
					System.out.println("Restam " + erros + " tentativas.");
					p7();
				}	
			}
			
	   }
	   void p7() {
		// Pergunta 7
					System.out.println("__________________________________");
					System.out.println(" ");
					System.out.println("Pergunta 7:");
					System.out.println("Valendo R$ 70.000,00 ");
					System.out.println("7. Qual o número mínimo de jogadores"
							+ " numa partida de futebol?");
					System.out.println("--------- ALTERNATIVAS ---------");
					System.out.println("A - 8       B - 12");
					System.out.println("C - 5       D - 7");
					System.out.println("--------------------------------");
					escolha = ler.nextLine();
				
					if(escolha.equals("D") || escolha.equals("d")) {
						coins = coins + 70000.0;
						points++;
						System.out.println("Você acertou!!");
						p8();
						System.out.println("Próxima pergunta.");
					} else if (erros != 0){
						erros = erros - 1;
					
						if(erros == 0) {
							System.out.println("Você perdeu!!!");
							System.out.println("Acertos: " + points + "/15");
							System.out.println("Tente novamente.");
						} else if(erros != 0) {
							System.out.println("Você errou.");
							System.out.println("Resposta: D - 7");
							System.out.println("Restam " + erros + " tentativas.");
							p8();
						}	
					}
					
	   }
	   void p8() {
		// Pergunta 8
					System.out.println("______________________________________");
					System.out.println(" ");
					System.out.println("Pergunta 8:");
					System.out.println("Valendo R$ 750.000,00 ");
					System.out.println("8. Quanto tempo a luz do Sol "
							+ "demora para chegar à Terra?");
					System.out.println("--------- ALTERNATIVAS ---------");
					System.out.println("A - 1 hora       B - 20 minutos");
					System.out.println("C - Segundos     D - 8 minutos");
					System.out.println("--------------------------------");
					escolha = ler.nextLine();
				
					if(escolha.equals("D") || escolha.equals("d")) {
						coins = coins + 750000.0;
						points++;
						System.out.println("Você acertou!!");
						System.out.println("Próxima pergunta.");
						p9();
					} else if (erros != 0){
						erros = erros - 1;
					
						if(erros == 0) {
							System.out.println("Você perdeu!!!");
							System.out.println("Acertos: " + points + "/15");
							System.out.println("Tente novamente.");
						} else if(erros != 0) {
							System.out.println("Você errou.");
							System.out.println("Resposta: D - 8 minutos");
							System.out.println("Restam " + erros + " tentativas.");
							p9();
						}	
					}
					
	   }
	   void p9() {
		// Pergunta 9
					System.out.println("________________________________");
					System.out.println(" ");
					System.out.println("Pergunta 9:");
					System.out.println("Valendo R$ 900.000,00 ");
					System.out.println("1. Em que período da pré-história "
							+ "o fogo foi descoberto?");
					System.out.println("-------------------- ALTERNATIVAS --------------");
					System.out.println("A - Neolítico       		B - Paleolítico");
					System.out.println("C - Idade da Pedra Polida   D - Idade dos Metais");
					System.out.println("------------------------------------------------");
					escolha = ler.nextLine();
				
					if(escolha.equals("B") || escolha.equals("b")) {
						coins = coins + 900000.0;
						points++;
						System.out.println("Você acertou!!");
						System.out.println("Próxima pergunta.");
						p10();
					} else if (erros != 0){
						erros = erros - 1;
					
						if(erros == 0) {
							System.out.println("Você perdeu!!!");
							System.out.println("Acertos: " + points + "/15");
							System.out.println("Tente novamente.");
						} else if(erros != 0) {
							System.out.println("Você errou.");
							System.out.println("Resposta: B - Paleolítico");
							System.out.println("Restam " + erros + " tentativas.");
							p10();
						}	
					}
					
	   }
	   void p10() {
		// Pergunta 10
					System.out.println("________________________________");
					System.out.println(" ");
					System.out.println("Pergunta 10:");
					System.out.println("Valendo R$ 900.000,00 ");
					System.out.println("10. Em qual local da Ásia o "
							+ "português é língua oficial?");
					System.out.println("--------- ALTERNATIVAS ---------");
					System.out.println("A - Portugal       B - Brasil");
					System.out.println("C - Moçambique     D - Macau");
					System.out.println("--------------------------------");
					escolha = ler.nextLine();
				
					if(escolha.equals("D") || escolha.equals("d")) {
						coins = coins + 900000.0;
						points++;
						System.out.println("Você acertou!!");
						System.out.println("Próxima pergunta.");
						p11();
					} else if (erros != 0){
						erros = erros - 1;
					
						if(erros == 0) {
							System.out.println("Você perdeu!!!");
							System.out.println("Acertos: " + points + "/15");
							System.out.println("Tente novamente.");
						} else if(erros != 0) {
							System.out.println("Você errou.");
							System.out.println("Resposta: D - Macau");
							System.out.println("Restam " + erros + " tentativas.");
							p11();
						}	
					}
					
	   }
	   void p11() {
		// Pergunta 11
					System.out.println("_______________________________________");
					System.out.println(" ");
					System.out.println("Pergunta 11:");
					System.out.println("Valendo R$ 950.000,00 ");
					System.out.println("11.  Como é a conjugação do verbo "
							+ "caber na 1.ª pessoa do singular do presente do indicativo?");
					System.out.println("-------------------- ALTERNATIVAS --------------------");
					System.out.println("A - Eu caibo                     B - Que eu caiba");
					System.out.println("C - Nenhuma das alternativas     D - Eu cabo");
					System.out.println("-------------------------------------------------------");
					escolha = ler.nextLine();
				
					if(escolha.equals("A") || escolha.equals("a")) {
						coins = coins + 950000.0;
						points++;
						System.out.println("Você acertou!!");
						System.out.println("Próxima pergunta.");
						p12();
					} else if (erros != 0){
						erros = erros - 1;
						
						if(erros == 0) {
							System.out.println("Você perdeu!!!");
							System.out.println("Acertos: " + points + "/15");
							System.out.println("Tente novamente.");
						} else if(erros != 0) {
							System.out.println("Você errou.");
							System.out.println("Resposta: A - Eu caibo");
							System.out.println("Restam " + erros + " tentativas.");
							p12();
						}	
					}
					
	   }
	   void p12() {
		// Pergunta 12
					System.out.println("____________________________________________");
					System.out.println(" ");
					System.out.println("Pergunta 12:");
					System.out.println("Valendo R$ 1.000.000,00 ");
					System.out.println("12. Qual destes países é transcontinental?");
					System.out.println("------------- ALTERNATIVAS -----------");
					System.out.println("A - Rússia           B - Marrocos");
					System.out.println("C - Filipinas        D - Groenlândia");
					System.out.println("--------------------------------------");
					escolha = ler.nextLine();
				
					if(escolha.equals("A") || escolha.equals("a")) {
						coins = coins + 1000000.0;
						points++;
						System.out.println("Você acertou!!");
						System.out.println("Próxima pergunta.");
						p13();
					} else if (erros != 0){
						erros = erros - 1;
					
						if(erros == 0) {
							System.out.println("Você perdeu!!!");
							System.out.println("Acertos: " + points + "/15");
							System.out.println("Tente novamente.");
						} else if(erros != 0) {
							System.out.println("Você errou.");
							System.out.println("Resposta: A - Rússia");
							System.out.println("Restam " + erros + " tentativas.");
							p13();
						}	
					}
					
	   }
	   void p13() {
		// Pergunta 13
					System.out.println("___________________________________");
					System.out.println(" ");
					System.out.println("Pergunta 13:");
					System.out.println("Valendo R$ 1.000.000,00 ");
					System.out.println("13. Qual foi o recurso utilizado "
							+ "inicialmente pelo homem para explicar "
							+ "a origem das coisas?");
					System.out.println("------------- ALTERNATIVAS ---------------");
					System.out.println("A - A Filosofia       B - A Biologia");
					System.out.println("C - A Matemática      D - A Mitologia");
					System.out.println("------------------------------------------");
					escolha = ler.nextLine();
				
					if(escolha.equals("D") || escolha.equals("d")) {
						coins = coins + 1000000.0;
						points++;
						System.out.println("Você acertou!!");
						System.out.println("Próxima pergunta.");
						p14();
					} else if (erros != 0){
						erros = erros - 1;
					
						if(erros == 0) {
							System.out.println("Você perdeu!!!");
							System.out.println("Acertos: " + points + "/15");
							System.out.println("Tente novamente.");
						} else if(erros != 0) {
							System.out.println("Você errou.");
							System.out.println("Resposta: D - A Mitologia");
							System.out.println("Restam " + erros + " tentativas.");
							p14();
						}	
					}
					
	   }
	   void p14() {
		// Pergunta 14
					System.out.println("____________________________________");
					System.out.println(" ");
					System.out.println("Pergunta 14:");
					System.out.println("Valendo R$ 1.500.000,00 ");
					System.out.println("14. Júpiter e Plutão são os "
							+ "correlatos romanos de quais deuses gregos?");
					System.out.println("-------------- ALTERNATIVAS --------------");
					System.out.println("A - Ares e Hermes     B - Cronos e Apolo");
					System.out.println("C - Zeus e Hades      D - Zeus e Ares");
					System.out.println("------------------------------------------");
					escolha = ler.nextLine();
				
					if(escolha.equals("C") || escolha.equals("c")) {
						coins = coins + 1500000.0;
						points++;
						System.out.println("Você acertou!!");
						System.out.println("Próxima pergunta.");
						
					} else if (erros != 0){
						erros = erros - 1;
					
						if(erros == 0) {
							System.out.println("Você perdeu!!!");
							System.out.println("Acertos: " + points + "/15");
							System.out.println("Tente novamente.");
						} else if(erros != 0) {
							System.out.println("Você errou.");
							System.out.println("Resposta: C - Zeus e Hades");
							System.out.println("Restam " + erros + " tentativas.");
							
						}	
					}
					
	   }
	   void p15() {
		// Pergunta 15
					System.out.println("____________________________________");
					System.out.println(" ");
					System.out.println("Pergunta 15:");
					System.out.println("Valendo R$ 2.000.000,00 ");
					System.out.println("15. Qual o maior animal terrestre?");
					System.out.println("--------------- ALTERNATIVAS --------------");
					System.out.println("A - Baleia Azul          B - Dinossauro");
					System.out.println("C - Elefante Africano    D - Girafa");
					System.out.println("------------------------------------------");
					escolha = ler.nextLine();
				
					if(escolha.equals("C") || escolha.equals("c")) {
						coins = coins + 2000000.0;
						points++;
						System.out.println("Você acertou!!");
						System.out.println("=======================| VOCÊ VENCEU!!!!!!!! |===============");
						System.out.println("Acertos: " + points);
						System.out.println("Prêmmio: " + "R$ " + coins);
						System.out.println("Você ganharia isso se estivesse em um programa de TV.");
					}
				 else if (erros != 0){
						erros = erros - 1;
				
						if(erros == 0) {
							System.out.println("Você perdeu!!!");
							System.out.println("Acertos: " + points + "/15");
							System.out.println("Tente novamente.");
						} else if(erros != 0) {
							System.out.println("Você perdeu.");
							System.out.println("Resposta: C - Elefante Africano.");
							System.out.println("Restam " + erros + " tentativas.");
							System.out.println("Esta já era a última pergunta. Tentar novamente? S/N");
							escolha = ler.nextLine();
						
							if (escolha.equals("S") || escolha.equals("s")) {
								p1();
							} else {
								System.out.println("Execução finalizada...");
							}
								
						}	
					}
	   }
}
