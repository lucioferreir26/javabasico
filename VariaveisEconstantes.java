package cursoJava.basco;
/*
 * Classe demostrativa de variáveis e constantes
 * 
 * versão 1.0
 * 
 * autor : Lucio
 * 
 * 
 **/
public class VariaveisEconstantes {

	public static void main(String[] args) {
	
		//Criação de constantes.
		final double ACELERACAO_GRAVIDADE_TERRA = 9.80665;
		
		//Criação de variáveis
		String nome="José";
		
		int idade=48;
		
		double peso=73.4,altura=1.73;
		
		char sexo='m',cnh='a';
		
		boolean doadorOrgaos=true;
		
		
		System.out.println("Nome: "+nome);
				
		System.out.println("Idade: "+idade);		
		
		System.out.println("Peso: "+peso);
		
		System.out.println("Altura: "+altura);
		
    	System.out.println("Sexo: "+sexo);
    			
    	System.out.println("Habilitacao: "+cnh);
	
    	System.out.println("Doador de orgaos: "+doadorOrgaos);
    			
    	System.out.println("Graviade na terra: "+ACELERACAO_GRAVIDADE_TERRA+" m/s2");
    	

	}

}
