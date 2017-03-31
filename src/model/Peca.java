package model;

public class Peca {

	
	
	public Peca(){
		
	}
	
	
	public Peca(int idPeca, String nomePeca, String descricaoPeca, String maracaCarro, String modeloCarro,
			float precoPeca) {
		super();
		this.idPeca = idPeca;
		this.nomePeca = nomePeca;
		this.descricaoPeca = descricaoPeca;
		this.maracaCarro = maracaCarro;
		this.modeloCarro = modeloCarro;
		this.precoPeca = precoPeca;
	}
	
	
	int idPeca;
    String nomePeca;
    String descricaoPeca;
    String maracaCarro;
    String modeloCarro;
    float precoPeca;
	public int getIdPeca() {
		return idPeca;
	}


	public void setIdPeca(int idPeca) {
		this.idPeca = idPeca;
	}


	public String getNomePeca() {
		return nomePeca;
	}


	public void setNomePeca(String nomePeca) {
		this.nomePeca = nomePeca;
	}


	public String getDescricaoPeca() {
		return descricaoPeca;
	}


	public void setDescricaoPeca(String descricaoPeca) {
		this.descricaoPeca = descricaoPeca;
	}


	public String getMaracaCarro() {
		return maracaCarro;
	}


	public void setMaracaCarro(String maracaCarro) {
		this.maracaCarro = maracaCarro;
	}


	public String getModeloCarro() {
		return modeloCarro;
	}


	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}


	public float getPrecoPeca() {
		return precoPeca;
	}


	public void setPrecoPeca(float precoPeca) {
		this.precoPeca = precoPeca;
	}


    



}
