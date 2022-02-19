package desafio_capgemini;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class exercicio03 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Teste de anagrama! ?\nPor favor digite o anagrama para teste:");

		String palavra = br.readLine();

		int cont = 0;
		int cont2 = 0;
		int cont3 = 0;
		String testeAnag = "";
		String[] testesubs = new String[palavra.length() * palavra.length()];

		for (int i = 0; i <= palavra.length() - 1; i++) {
			for (int j = 0; j <= palavra.length(); j++) {

				if (cont > palavra.length()) {
					cont = 0;
				}
				if (i == cont || (palavra.length() - j >= palavra.length() - i)) {
					cont++;
				} else {
					testeAnag = palavra.substring(i, cont);
					cont++;
					testesubs[cont2] = testeAnag;
					cont2++;
				}
			}
		}
		for (int i = 0; i < testesubs.length; i++) {
			for (int j = 0; j < testesubs.length; j++) {

				if (testesubs[j] == null) {
					testesubs[j] = "";
				}

				if (IsAnagrama(testesubs[i], testesubs[j]) && i != j && testesubs[i] != "") {

					//System.out.println(testesubs[i] + " - e anagrama de - " + testesubs[j] + " - Esse Conta");
					cont3++;
				} else {
					// System.out.println(testesubs[i] + " - NAO anagrama de - " + testesubs[j]);
				}
			}

		}
		cont3 = cont3 / 2;
		System.out.println("A palavra "+palavra+ " possue "+ cont3 + " anagramas pares");
		System.out.println(cont3);
	}

	public static boolean IsAnagrama(String part1, String part2) {

		// tranfroma em arrays para poder ordenar
		char[] p1 = part1.toCharArray();
		char[] p2 = part2.toCharArray();
		// ordena para garantir a comparação simplificada
		Arrays.sort(p1);
		Arrays.sort(p2);
		// cria as novas strings baseadas nos arrays ordenados
		String sp1 = new String(p1);
		String sp2 = new String(p2);

		return sp1.equals(sp2);
	}
}
