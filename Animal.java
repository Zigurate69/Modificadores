package Modificadores;

class Animal { //Foi modificado para default
	
	private String nome; //Foi modificado para private
	private String cor; //Foi modificado para private
	private String tamanho; //Foi modificado para private
	private String peso; //Foi modificado para private
	private String raca; //Foi modificado para private
	
	protected String getNome() { //Foi modificado para protected
		return nome;
	}
	
	protected void setNome (String nome) { //Foi modificado para protected
		this.nome = nome;
	}
	
	protected String getCor() { //Foi modificado para protected
		return cor;
	}
	
	protected void setCor (String cor) { //Foi modificado para protected
		this.cor = cor;
	}
	
	protected String getTamanho() { //Foi modificado para protected
		return tamanho;
	}
	
	protected void setTamanho (String tamanho) { //Foi modificado para protected
		this.tamanho = tamanho;
	}
	
	protected String getPeso() { //Foi modificado para protected
		return peso;
	}
	
	protected void setPeso (String peso) { //Foi modificado para protected
		this.peso = peso;
	}
	
	protected String getRaca() { //Foi modificado para protected
		return raca;
	}
	
	protected void setRaca (String raca) { //Foi modificado para protected
		this.raca = raca;
	}
}