
import java.util.Scanner;

public class ProvaMain 
{
	
	//Var|Objetos
	
	public static Scanner input = new Scanner(System.in);
	public static Prova prova = new Prova();
	
	//Início Main
	public static void main (String[] args)
	{
		
		System.out.println("========================================================");
		System.out.println("#############"    +    "PROVA"      +     "#############");
		System.out.println("========================================================");
		
		System.out.print("Insira o seu nome:");
		prova.setNomeParticipante(input.nextLine());
		
		prova.perguntas();
		
		prova.setPontuacao();
		
	        prova.gabarito();
		
	}
}
