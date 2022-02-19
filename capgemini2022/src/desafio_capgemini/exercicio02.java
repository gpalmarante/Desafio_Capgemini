package desafio_capgemini;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercicio02 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Teste de senha forte! ?\nPor favor digite a senha para teste:");

		String senha = br.readLine();

		Boolean verificado = senhaForte(senha);

		if (verificado) {
			System.out.println("senha é forte");
		} else {
			if (senha.length() < 6) {
				int faltante = 6 - senha.length();
				System.out.println("senha curta falta " + faltante);
			}
			System.out.println("senha NÃO e forte");
		}

	}

	public static Boolean senhaForte(String senha) {
		// texto em caso de erro na senha
		String maiu = " falta uma letra maiuscula ";
		String minus = " falta uma letra minuscula ";
		String numero = " falta um numero ";
		String esp = " falta um caracter especial ";
		String erro = "Erro encontrado -";
		//verifica tamanho da senha
		if (senha.length() < 6)
			return false;

		boolean achouNumero = false;
		boolean achouMaiuscula = false;
		boolean achouMinuscula = false;
		boolean achouSimbolo = false;
		//analisa a senha em cada uma das verificacoes de seguranca
		for (char c : senha.toCharArray()) {
			if (c >= '0' && c <= '9') {
				achouNumero = true;
			} else if (c >= 'A' && c <= 'Z') {
				achouMaiuscula = true;
			} else if (c >= 'a' && c <= 'z') {
				achouMinuscula = true;
			} else {
				achouSimbolo = true;
			}
		}
		// verifica se foi encontrado algum erro e quais os erros encontrados para cada opcao de erro 
		if (!achouNumero) {
			erro = erro + numero;
		}
		if (!achouMaiuscula) {
			erro = erro + maiu;
		}
		if (!achouMinuscula) {
			erro = erro + minus;
		}
		if (!achouSimbolo) {
			erro = erro + esp;
		}
		// verifica se tem algum erro para apresentar no terminal
		if (!achouNumero || !achouMaiuscula || !achouMinuscula || !achouSimbolo) {
			System.out.println(erro);
		}
		return achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo;
	}

}
