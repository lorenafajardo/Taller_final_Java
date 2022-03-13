package calculadora;

import java.util.Scanner;  // Importación de libreria Scanner, utilizada para capturar los datos que ingresa el usuario


public class Calculadora {

	public static void main(String[] args) {
		
		//Instacia de la clase Datos y de la libreria Scanner  
		Datos datos = new Datos();
		Scanner input= new Scanner(System.in);
		
		//Captura del primer número 
		System.out.println("-------------------");
		System.out.println("C A L C U L A D O R A");
		System.out.println("-------------------");
		System.out.println("|  1  |  2  |  3  |");
		System.out.println("|  4  |  5  |  6  |");
		System.out.println("|  7  |  8  |  9  |");
		System.out.println("|  ,  |  0  |     |");
		System.out.println("-------------------");
        datos.setNro1(input.nextFloat()); input.nextLine();
        
        // Inicialización de las variables resultado y operacion. 
        datos.setResultado(0);
        datos.setOperacion("null");;
        
        // Declaración del Ciclo Do -While, el cual se ejecutara hasta que el usuario envie AC para salir
        do {
        	
		// Captura de la operación o acción a realizar
        System.out.println("-------------------");
        System.out.println("|  +  |  -  |   *  |");
        System.out.println("|  /  |  %  |  AC  |");
        System.out.println("-------------------");
        datos.setOperacion(input.nextLine());
        
        //Validación de la operacion, mediante el condicional if 
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
		
		      //Resultado de la operación, si es multiplicación
		        
		        if (datos.getOperacion().equals("*")) {
		        	datos.setResultado(datos.getNro1() * datos.getNro2());
		        	 System.out.println("-------------------");
		        	System.out.println(datos.getResultado());
		        }
		        
		      //Resultado de la operación si es división
		        
		        if (datos.getOperacion().equals("/")) {
		        	// Validación de la operación entre cero
		        	if(datos.getNro2() == 0){
		        		System.out.println("-------------------");
		        		System.out.println("Operación invalida");
		        		break;
		        	}else{
		        		datos.setResultado(datos.getNro1() / datos.getNro2());
		        		System.out.println("-------------------");
		        		System.out.println(datos.getResultado());
		        	}
		        }
		        
		      //Resultado de la operacion si se quiere conocer el modulo de la división
		        
		        if (datos.getOperacion().equals("%")) {
		        	datos.setResultado(datos.getNro1() % datos.getNro2());
		        	 System.out.println("-------------------");
		        	System.out.println(datos.getResultado());
		        }
      
		// Almacenamiento del valor a seguir operando 
		System.out.println("-------------------");
		datos.setNro1(datos.getResultado());
        
        }
        
        // Validación de la acción salir del programa mediante la opción AC o ac. 
        if((datos.getOperacion().equals("ac")) || (datos.getOperacion().equals("AC"))){
        	System.out.println("  Fin");
        } 
        
        //Validación de la correscta escritura de los signos de operación 
        if(!datos.getOperacion().equals("+") && !datos.getOperacion().equals("-") && !datos.getOperacion().equals("*") &&  !datos.getOperacion().equals("/") && !datos.getOperacion().equals("%") && !(datos.getOperacion().equals("AC")) && !(datos.getOperacion().equals("ac"))){
        	System.out.println("    Opción invalida   ");
        	break;
        }
        
        //Declaración de la condición para salir del programa
        } while (!(datos.getOperacion().equals("AC")) && !(datos.getOperacion().equals("ac")) );
        
	}
}
