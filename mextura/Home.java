class Home{
	private int idade;
	private String nome;
	public Home(String nome,int idade){
		this.idade = idade;
		this.nome = nome;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String toString(){
		return String.format("%s %s",idade,nome);
	}
}
