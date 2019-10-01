package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class Usuario {

	private String login;
	private String senha;
	private Map<String, String> mapaUsuarios = new HashMap<>();

	public Usuario(String login, String senha) throws NoSuchAlgorithmException, IOException {
		this.login = login;
		MessageDigest algoritimo = MessageDigest.getInstance("MD5");
		byte mensagemHash[] = algoritimo.digest(senha.getBytes("UTF-8"));
		StringBuilder sb = new StringBuilder();
		for (byte b : mensagemHash) {
			sb.append(String.format("%02x", b));
		}
		this.senha = sb.toString();
		carregarUsuarios();
	}

	private void carregarUsuarios() throws IOException {
		File usuarios = new File("src/resources/usuarios.txt");
		InputStream input = new FileInputStream(usuarios);
		InputStreamReader inputReader = new InputStreamReader(input);
		BufferedReader bufferedReader = new BufferedReader(inputReader);
		String string = new String();
		string = bufferedReader.readLine();

		while (string != null) {
			String pares[] = string.split(";");
			mapaUsuarios.put(pares[0].toLowerCase(), pares[1]);
			string = bufferedReader.readLine();
		}

		bufferedReader.close();
	}

	public boolean checarUsuario() throws NullPointerException {
		if (mapaUsuarios.get(this.login).equals(this.senha))
			return true;
		else
			return false;
	}

	public void salvarUsuario() throws Exception {
		if (mapaUsuarios.get(this.login) == null && this.senha != null) {
			File usuarios = new File("src/resources/usuarios.txt");
			FileWriter fr = new FileWriter(usuarios, true);
			fr.write(this.login + ";" + this.senha + "\n");
			fr.close();
		} else {
			throw new Exception("Usuario já existe");
		}
	}
}
