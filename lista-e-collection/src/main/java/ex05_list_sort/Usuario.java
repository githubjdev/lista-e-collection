package ex05_list_sort;

class Usuario {
	String nome;
	int pontos;

	Usuario(String nome, int pontos) {
		this.nome = nome;
		this.pontos = pontos;
	}

	public String toString() {
		return nome + ":" + pontos;
	}
}
