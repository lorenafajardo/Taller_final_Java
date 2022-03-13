package calculadora;

import java.util.Scanner;  // Importaci�n de libreria Scanner, utilizada para capturar los datos que ingresa el usuario


public class Calculadora {

	public static void main(String[] args) {
		
		//Instacia de la clase Datos y de la libreria Scanner  
		Datos datos = new Datos();
		Scanner input= new Scanner(System.in);
		
		//Captura del primer n�mero 
		System.out.println("-------------------");
		System.out.println("C A L C U L A D O R A");
		System.out.println("-------------------");
		System.out.println("|  1  |  2  |  3  |");
		System.out.println("|  4  |  5  |  6  |");
		System.out.println("|  7  |  8  |  9  |");
		System.out.println("|  ,  |  0  |     |");
		System.out.println("-------------------");
        datos.setNro1(input.nextFloat()); input.nextLine();
        
        // Inicializaci�n de las variables resultado y operacion. 
        datos.setResultado(0);
        datos.setOperacion("null");;
        
        // Declaraci�n del Ciclo Do -While, el cual se ejecutara hasta que el usuario envie AC para salir
        do {
        	
		// Captura de la operaci�n o acci�n a realizar
        System.out.println("-------------------");
        System.out.println("|  +  |  -  |   *  |");
        System.out.println("|  /  |  %  |  AC  |");
        System.out.println("-------------------");
        datos.setOperacion(input.nextLine());
        
        //Validaci�n de la operacion, mediante el condicional if 
        if(datos.getOperacion().equals("+") || datos.getOperacion().equals("-") || datos.getOperacion().equals("*") || datos.getOperacion().equals("/")|| datos.getOperacion().equals("%") ){
        
        	//Captura del siguiente numero
        System.out.println("-------------------");
        
        System.out.println("|  1  |  2  |  3  |");
    	System.out.println("|  4  |  5  |  6  |");
    	System.out.println("|  7  |  8  |  9  |");
    	System.out.println("|  ,  |  0  |     |");
    	System.out.println("-------------------");
        datos.setNro2(input.nextFloat()); input.nextLine(); 
        
        		//Resultado de la operacion, si es suma 
        
		        if (datos.getOperacion().equals("+")) {
		        	datos.setResultado(datos.getNro1() + datos.getNro2());
		        	 System.out.println("-------------------");
		        	System.out.println(datos.getResultado());
				}
		        
		        
		      //Resultado de la operacion, si es resta
		        
		        if (datos.getOperacion().equals("-")) {			
		        	datos.setResultado(datos.getNro1() - datos.getNro2());
		        	 System.out.println("-------------------");
		        	System.out.println(datos.getResultado());
				}
		
		      //Resultado de la operaci�n, si es multiplicaci�n
		        
		        if (datos.getOperacion().equals("*")) {
		        	datos.setResultado(datos.getNro1() * datos.getNro2());
		        	 System.out.println("-------------------");
		        	System.out.println(datos.getResultado());
		        }
		        
		      //Resultado de la operaci�n si es divisi�n
		        
		        if (datos.getOperacion().equals("/")) {
		        	// Validaci�n de la operaci�n entre cero
		        	if(datos.getNro2() == 0){
		        		System.out.println("-------------------");
		        		System.out.println("Operaci�n invalida");
		        		break;
		        	}else{
		        		datos.setResultado(datos.getNro1() / datos.getNro2());
		        		System.out.println("-------------------");
		        		System.out.println(datos.getResultado());
		        	}
		        }
		        
		      //Resultado de la operacion si se quiere conocer el modulo de la divisi�n
		        
		        if (datos.getOperacion().equals("%")) {
		        	datos.setResultado(datos.getNro1() % datos.getNro2());
		        	 System.out.println("-------------------");
		        	System.out.println(datos.getResultado());
		        }
      
		// Almacenamiento del valor a seguir operando 
		System.out.println("-------------------");
		datos.setNro1(datos.getResultado());
        
        }
        
        // Validaci�n de la acci�n salir del programa mediante la opci�n AC o ac. 
        if((datos.getOperacion().equals("ac")) || (datos.getOperacion().equals("AC"))){
        	System.out.println("  Fin");
        } 
        
        //Validaci�n de la correscta escritura de los signos de operaci�n 
        if(!datos.getOperacion().equals("+") && !datos.getOperacion().equals("-") && !datos.getOperacion().equals("*") &&  !datos.getOperacion().equals("/") && !datos.getOperacion().equals("%") && !(datos.getOperacion().equals("AC")) && !(datos.getOperacion().equals("ac"))){
        	System.out.println("    Opci�n invalida   ");
        	break;
        }
        
        //Declaraci�n de la condici�n para salir del programa
        } while (!(datos.getOperacion().equals("AC")) && !(datos.getOperacion().equals("ac")) );
        
	}
}
