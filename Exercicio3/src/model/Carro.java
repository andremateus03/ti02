package model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
public class Carro {
	private String nome;
	private int ano;
	private String fabricante;
	private int ID;
	
	public  void Usuario() {
		this.nome = -1;
		this.ano = "";
		this.fabricante = '*';
	}
	
	public void Usuario(int nome, String login, String ano, char fabricante) {
		this.nome = nome;
		this.ano = ano;
		this.fabricante = fabricante;
	}

	public int getnome() {
		return nome;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}

	public void setnome(int nome) {
		this.nome = nome;
	}

	
	public String getano() {
		return ano;
	}

	public void setano(String ano) {
		this.ano = ano;
	}

	public char getfabricante() {
		return fabricante;
	}

	public void setfabricante(char fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + nome + ", login=" + login + ", ano=" + ano + ", fabricante=" + fabricante + "]";
	}	
}


