package main;

public class Animal {
	private String nome;
	private int peso;
	public Animal(String newNome, int novoPeso) {
		nome = newNome;
		peso = novoPeso;
	}
	public String getNome() {
		return nome;
	}
	public int getPeso() {
		return peso;
	}
}
