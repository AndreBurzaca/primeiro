/**
 * Este programa mostra ao aluno:
 * 1) Que um programa Java � construido dendo de um projeto Java
 * 2) Todo programa Java deve ter uma classe com um m�todo main
 * 3) Como exibir informa��es no terminal (console) do Java. 
 * 4) Como ler uma String do terminal (console) do Java.
 */
package meuPrimeiroProgramaJava;
import java.util.Scanner;

/**
 * @author Andr� Burzaca Lopes
 * Data: 03/02/2021
 * 
 */
public class Principal { //Classe que cont�m o m�todo principal.
	public static void main(String[] args) {
		System.out.println("Voc� sabe quem � a melhor namorada do mundo?"); //Uso do println
	
		// Ler uma string do console usando a biblioteca Scanner.
		Scanner in = new Scanner (System.in);
		String nome = in.nextLine();
		
		//Exibir uma string usando printf.
		System.out.printf("A Milena a namorada do Andr� u�");
		in.close();
		
	}

}
