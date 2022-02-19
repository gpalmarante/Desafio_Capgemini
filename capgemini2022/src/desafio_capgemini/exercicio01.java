package desafio_capgemini;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercicio01 {
	public static void main(String args[]) throws IOException {
		// recebe os dados do terminal
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Qual a quantidade de degraus que desejas ?\n\nPor favor digite a quantidade desejada:");
		// passa os dados recebidos do terminal para inteiro
		String se = br.readLine();
		int n = Integer.parseInt(se);
		String esp = " ";
		String ast = "*";
		String exit = "";
		String exit2 = "";

		int cont = n - 1;
		// criar linha do tamanho desejado
		for (int i = 0; i < n; i++) {
			exit = exit + esp;
		}
		// cria as proximas linhas com os degruas nescessarios
		for (int j = 0; j < n; j++) {
			exit2 = exit.substring(0, cont) + ast + exit.substring(cont + 1);
			exit = exit2;
			cont--;
			System.out.println(exit);

		}
		if (n == 1) {
			System.out.println("\nA escada foi criada com apenas " + n + " degrau foi criada.\n");
		} else {
			System.out.println("\nA escada foi criada com " + n + " degraus foi criada.\n");
		}
		System.out.println("Obrigado por utilizar o sistema de escada !");
	}
}
