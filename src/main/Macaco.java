package main;

public class Macaco extends Animal {
	private int comprimentoRabo; // em mm

	/**
	 * Passe o comprimento em centimetros
	 */
	public Macaco(int novoComprimento) {
		super("Macaco", 40);
		comprimentoRabo = novoComprimento * 10;
	}
	/*
	 * Retorna o comprimento em mm
	 */
	public int getComprimentoRabo() {
		return comprimentoRabo / 10;
	}
}
