package controller;

import java.util.Scanner;
import misc.MockupData;
import model.Carro;



public class ControllerCarro {

	Scanner n = new Scanner(System.in);
	MockupData bd;
	
	public ControllerCarro(){
		bd = new MockupData();
	}
	
	public void addCarro(int idCarro, String marca, String modelo, int cv, int cc, int lugares, String matricula,
			String combustivel, String primeiroRegisto, int kmsInicial, boolean estadoCarro){
			Carro c = new Carro(idCarro, marca,modelo,cv,cc,lugares,matricula,combustivel,primeiroRegisto,kmsInicial,estadoCarro);
			bd.carro.add(c);
	}
	
	public Carro listarCar(int idCar){
		
		///estanciar o objeto para receber 
		Carro cs =	new Carro();
		for(Carro c:bd.carro){
			if(idCar == c.getIdCarro()){
				cs = c;
			}
		}
		return cs;
	}
	
	public void listarCarros(){
		
		for(Carro c: bd.carro){
			System.out.println("\t\t Dados do carro\n\n");
			System.out.print("Marca: "+c.getMarca()+"\n");
			System.out.print("Modelo: "+c.getModelo()+"\n");
			System.out.print("Cavalos: "+c.getCv()+"\n");
			System.out.print("Cilindrada: "+c.getCc()+"\n");
			System.out.print("Lugares: "+c.getLugares()+"\n");
			System.out.print("Matricula: "+c.getMatricula()+"\n");
			System.out.print("Ano: "+c.getPrimeiroRegisto()+"\n");
			System.out.print("Combustivel: "+c.getCombustivel()+"\n");
			System.out.print("Kilometros Atuais: "+c.getKmsInicial()+"\n");
			if(c.isEstadoCarro()==true){
				System.out.println("Estado: Disponivel\n");
			}else{
				System.out.println("Estado: Indisponivel\n");
			}
		}
	}
	
	

	/*int dia, mes, ano;
	Scanner n = new Scanner(System.in);
	Carro[] car; 
	int car;
	
	@SuppressWarnings("deprecation")
	public void registarCarro(){
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Quantos registos deseja efetuar?");
		car =n.nextInt();
		for(int i=0; i<car; i++){
			System.out.println("\tInsira os dados do carro\n\n");
			System.out.print("Marca: ");
			String marca=n.nextLine();
			System.out.print("Modelo: ");
			String modelo=n.nextLine();
			System.out.print("Matricula: ");
			String matricula=n.nextLine();
			System.out.print("Data de Registo: ");
			String data=n.nextLine();
			System.out.print("Combustivel: ");
			String combustivel=n.nextLine();
			System.out.print("Kilometros Atuais: ");
			int kms=n.nextInt();
			boolean estado=true;
			
			addCarro();
		}
		
		
	}
	

	
	
	public void listarCarro(){
		if(car!=null){
			for(int i=0; i<car.length;i++){
				System.out.println("\t\t Dados do carro\n\n");
				System.out.print("Marca: "+car[i].getMarca()+"\n");
				System.out.print("Modelo: "+car[i].getModelo()+"\n");
				System.out.print("Matricula: "+car[i].getMatricula()+"\n");
				System.out.print("Ano: "+car[i].getAno()+"\n");
				System.out.print("Combustivel: "+car[i].getCombustivel()+"\n");
				System.out.print("Kilometros Atuais: "+car[i].getKmsInicial()+"\n");
				if(car[i].isEstado()==true){
					System.out.println("Estado: Disponivel\n");
				}else{
					System.out.println("Estado: Indisponivel\n");
				}
			}
		}else{
			System.out.println("Nao existem carros registados...\n\n");
		}
	}*/
	
	
	
}
