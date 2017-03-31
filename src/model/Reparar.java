package model;

import java.util.ArrayList;

public class Reparar {

	public Reparar(){
		
		
	}
	
	
	public Reparar(int idReparacao, Carro automovel, ArrayList<Peca> pecasTirada, ArrayList<Peca> pecasIntroduzida,
			String dataInicio, String dataFim, double custoMaoObra) {
		super();
		this.idReparacao = idReparacao;
		Automovel = automovel;
		this.pecasTirada = pecasTirada;
		this.pecasIntroduzida = pecasIntroduzida;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.custoMaoObra = custoMaoObra;
	}

	private int idReparacao;
    private Carro Automovel;
    private ArrayList<Peca> pecasTirada;
    private ArrayList<Peca> pecasIntroduzida;
    private String dataInicio;
    private String dataFim;
    private double custoMaoObra;
    
    
	public int getIdReparacao() {
		return idReparacao;
	}


	public void setIdReparacao(int idReparacao) {
		this.idReparacao = idReparacao;
	}


	public Carro getAutomovel() {
		return Automovel;
	}


	public void setAutomovel(Carro automovel) {
		Automovel = automovel;
	}


	public ArrayList<Peca> getPecasTirada() {
		return pecasTirada;
	}


	public void setPecasTirada(ArrayList<Peca> pecasTirada) {
		this.pecasTirada = pecasTirada;
	}


	public ArrayList<Peca> getPecasIntroduzida() {
		return pecasIntroduzida;
	}


	public void setPecasIntroduzida(ArrayList<Peca> pecasIntroduzida) {
		this.pecasIntroduzida = pecasIntroduzida;
	}


	public String getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}


	public String getDataFim() {
		return dataFim;
	}


	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}


	public double getCustoMaoObra() {
		return custoMaoObra;
	}


	public void setCustoMaoObra(double custoMaoObra) {
		this.custoMaoObra = custoMaoObra;
	}
    
    
	
}
