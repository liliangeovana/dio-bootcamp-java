/*
        String plano = "M"; //M / T
		
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Intagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Intagram grátis");	
			System.out.println("5Gb Youtube");	
        */ 

// AO INVÉS DE REPETIR INFORMAÇÕES NA ESTRUTURA IF, O SWITCH CASE SE ENCAIXARIA MELHOR.
public class SwitchCase {
    public static void main(String[] args) {
            String plano = "M"; // M / T

		    switch (plano) {
			    case "T": {
				System.out.println("5Gb Youtube");
			    }
			    case "M": {
				System.out.println("Whats e Intagram grátis");
			    }
			    case "B": {
				System.out.println("100 minutos de ligação");
			    }
		    }
		}
			
	}


    