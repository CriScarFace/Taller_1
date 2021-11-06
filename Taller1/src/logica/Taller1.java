package logica;
import java.io.IOException;
import java.util.Iterator;

import dominio.Cuenta;
import ucn.*;

public abstract class Taller1 {

	public static void main(String[] args) throws IOException {
		Menu();
	}
	
	public static void Menu() throws IOException {
		Sistema sistema = new SistemaIMPL();
		leerPersonajes(sistema);
		leerCuentas(sistema);
		int opcion1 = 0;
		boolean error = false;
		try{
			while (opcion1 != 3){

	            //Login
	            if (opcion1 ==1) {
		            StdOut.println("-------------------------------------");
		            StdOut.println(" - Bienvenido a Juego Genérico - ");
		            StdOut.println("-------------------------------------");
		            StdOut.println("1) Iniciar Sesion");
		            StdOut.println("2) Registrarse");
		            StdOut.println("3) Salir");
		            StdOut.println("-------------------------------------");
		            StdOut.print("Seleccione una opcion: ");
		            opcion1 = StdIn.readInt();
		            StdOut.println("-------------------------------------");
		            Cuenta c = null;
		            String tipo = null;
		            int encontrado = 0;
		            String cerrarSistema = "Y";
		            StdOut.print("Ingrese el nombre de su cuenta: ");
		            String nCuenta = StdIn.readString();
		            while (encontrado == 0 && cerrarSistema.equalsIgnoreCase("y")){
		            	
                        if(nCuenta.equals("ADMIN")){
                            encontrado = 1;
                            tipo = "admin";
                            break;
                        }
                        //Distinta de admin
                        else{
                        	sistema.buscarCuenta(nCuenta);
                        	if (c == null) { //No registrado
                        		StdOut.println(" La cuenta ingresada no existe. ");
                        		StdOut.println("¿Desea registrarse? <si - no> : ");
                        		String opcion2 = StdIn.readString();
                        		
                                while (!opcion2.equalsIgnoreCase("si") && !opcion2.equalsIgnoreCase("no") ){
                                    StdOut.print("La opcion ingresada no es válida, por favor vuelva a intentarlo. ");
                                    StdOut.println("Ingrese una opcion : ");
                                    opcion2=StdIn.readString();
                                }
                                //Registrarse
                                if(opcion2.equalsIgnoreCase("si") ) {
                                	opcion1 = 2;
                                	
                                }
                                //No registrarse
                                if(opcion2.equalsIgnoreCase("no") ) {
                                	opcion1 = 3;       
                                	
                                	
                                }
                        		
                        		
                        	} //Fin de No registrado
                        	
                        	else { //Registrados
                        		encontrado = 1;
                        		tipo  = "cliente";
                        		
                        	}
                        	
                            if(encontrado == 0){
                                StdOut.println("-------------------------------------");
                                StdOut.println("Cuenta no encontrada!!!");
                                StdOut.print("¿Desea volver a intentarlo? (Y/N): ");
                                cerrarSistema = StdIn.readString();
                                while(!cerrarSistema.equalsIgnoreCase("y") && !cerrarSistema.equalsIgnoreCase("n")){
                                    StdOut.println("Opcion no valida!!!");
                                    StdOut.print("¿Desea volver a ingresar la cuenta? (Y/N): ");
                                    cerrarSistema = StdIn.readString();
                                }
                                if(cerrarSistema.equalsIgnoreCase("y")){
                                    StdOut.println("-------------------------------------");
                                    StdOut.print("Ingrese su cuenta: ");
                                    nCuenta = StdIn.readString();
                                }
                            }
                       

                        }
	            	
	            	
		            }
		            
                    //find password
                    if(cerrarSistema.equalsIgnoreCase("y")){
                        StdOut.println("-------------------------------------");
                        encontrado = 0;
                        StdOut.print("Ingrese su contraseña: ");
                        String contrasena = StdIn.readString();
                        while (encontrado == 0 && cerrarSistema.equalsIgnoreCase("y")){
                            if(tipo.equalsIgnoreCase("admin")){
                                if(contrasena.equals("ADMIN")){
                                    encontrado = 1;
                                    break;
                                }
                            }
                            if(tipo.equalsIgnoreCase("cliente")){
                                if(contrasena.equals(c.getContrasena())){
                                    encontrado = 1;
                                    break;
                                }
                            }

                            if(encontrado == 0){
                                StdOut.println("-------------------------------------");
                                StdOut.println("Contraseña incorrecta!!!");
                                StdOut.print("¿Desea volver a intentarlo? (Y/N): ");
                                cerrarSistema = StdIn.readString();
                                while(!cerrarSistema.equalsIgnoreCase("y") && !cerrarSistema.equalsIgnoreCase("n")){
                                    StdOut.println("Opcion no valida!!!");
                                    StdOut.print("¿Desea volver a intentarlo? (Y/N): ");
                                    cerrarSistema = StdIn.readString();
                                }
                                if(cerrarSistema.equalsIgnoreCase("y")){
                                    StdOut.println("-------------------------------------");
                                    StdOut.print("Ingrese su contraseña: ");
                                    contrasena = StdIn.readString(); 
                                } 
                            }
                        }
                    }// cerrar sistema
                    
                    //customer menu
                    int opcion3 = 0;
                    switch(tipo){
                        case "cliente":
                            while(opcion3 != 5){
                                StdOut.println("-------------------------------------");
                                StdOut.println(" - Bienvenido " + c.getNickName() +  " - " );
                                StdOut.println("-------------------------------------");
                                StdOut.println("1) Comprar Skin. ");
                                StdOut.println("2) Comprar Personaje. ");
                                StdOut.println("3) Skins  Disponibles. ");
                                StdOut.println("4) Mostrar Inventario .");
                                StdOut.println("5) Recargar RP. ");
                                StdOut.println("6) Mostrar datos de la cuenta. ");
                                StdOut.println("7) Cerrar Sesion");
                                		
                                StdOut.println("-------------------------------------");
                                
                                opcion3 = StdIn.readInt();
                                switch(opcion3){
                                    // Display all scheduled appointments of the client
                                    case 1:
                                    	
                                        break;
                                    // A new appointment is scheduled
                                    case 2:
                                        StdOut.println("-------------------------------------");
                                        
                                        break;
                                    // the customer selects an appointment which has already been completed
                                    case 3:
                                        StdOut.println("-------------------------------------");
                                        
                                        break;
                                    //The client cancels an appointment
                                    case 4:
                                        StdOut.println("-------------------------------------");

                                        break;
                                    //System shutdown
                                    case 5:
                                        StdOut.println("-------------------------------------");
                                        break;
                                        
                                    case 6:
                                        StdOut.println("-------------------------------------");
                                        break;
                                        
                                    case 7:
                                        StdOut.println("-------------------------------------");
                                        StdOut.println("Sesion cerrada correctamente");
                                        break;
                                        
                                    default:
                                        StdOut.println("Opcion no valida!!!");
                                        break;
                                }
                            }
                            
                            break;
                        
                        case "admin": 
                            while(opcion3 != 9){
                                StdOut.println("-------------------------------------");
                                StdOut.println(" - Modo Administrador - " );
                                StdOut.println("-------------------------------------");
                                StdOut.println("1) Desplegar recaudación de ventas por rol. ");
                                StdOut.println("2) Desplegar recaudación total de ventas por región. ");
                                StdOut.println("3) Desplegar recaudación de ventas por personaje. ");
                                StdOut.println("4) Desplegar la cantidad de personajes por cada rol existente .");
                                StdOut.println("5) Agregar un personaje al juego. ");
                                StdOut.println("6) Agregar una skin. ");
                                StdOut.println("7) Bloquear a un jugador. ");
                                StdOut.println("8) Desplegar todas las cuentas de mayor a menor. ");
                                StdOut.println("9) Cerrar Sesion");
                                		
                                StdOut.println("-------------------------------------");
                                
                                opcion3 = StdIn.readInt();
                                switch(opcion3){

                                    case 1:
                                    	
                                        break;

                                    case 2:
                                        StdOut.println("-------------------------------------");
                                        
                                        break;

                                    case 3:
                                        StdOut.println("-------------------------------------");
                                        
                                        break;
                                    
                                    case 4:
                                        StdOut.println("-------------------------------------");

                                        break;
                                    
                                    case 5:
                                        StdOut.println("-------------------------------------");
                                        break;
                                        
                                    case 6:
                                        StdOut.println("-------------------------------------");
                                        break;
                                        
                                    case 7:
                                        StdOut.println("-------------------------------------");
                                        StdOut.println("Sesion cerrada correctamente");
                                        break;
                                        
                                    case 8:
                                        StdOut.println("-------------------------------------");
                                        StdOut.println("Sesion cerrada correctamente");
                                        break;
                                    case 9:
                                        StdOut.println("-------------------------------------");
                                        StdOut.println("Sesion cerrada correctamente");
                                        break;
                                        
                                    default:
                                        StdOut.println("Opcion no valida!!!");
                                        break;
                                }
                            }
                            
                            break;
		
	            } //opcion 1
                    
			} //Fin Login
	            
	        if (opcion1 == 2) {
	        	
	        }    
			
			
		} // Fin del while
			
		}catch (Exception e){
		            error = true;
		            System.out.println("Error!. Ha ocurrido la siguiente excepción: " + ""+e+"");
		}finally{
			System.out.println("El programa se cerrará. Debe ingresar una opción válida. ");
		}

	} //try
//Menu
	    

	private static void leerPersonajes(Sistema s) throws IOException 
	{
		boolean ingreso = true;
		boolean ingreso2 = true;
		ArchivoEntrada arch = new ArchivoEntrada("personajes.txt");
		while(!arch.isEndFile() && ingreso) {
			Registro reg = arch.getRegistro();
			String nomPersonaje = reg.getString();
			String rol = reg.getString();
			ingreso = s.agregarPersonaje(nomPersonaje, rol);
			int cantSkins = reg.getInt();
			for (int i = 0; i < cantSkins; i++) {
				String nomSkin = reg.getString();
				String calidad = reg.getString();
				ingreso2 = s.agregarSkin(nomSkin, calidad);
			if(!ingreso) 
			{
				System.out.println("no se pudo ingresar el personaje");
			}	
			if(!ingreso2) 
			{
				System.out.println("no se pudo ingresar la skin");
			}
				
			}
			
			
		}
	}
	

	private static void leerCuentas(Sistema s) throws IOException {
		boolean ingreso = true;
		//ingreso de cuentas.txt
		ArchivoEntrada arch = new ArchivoEntrada("Cuentas.txt");
		
		
		
	}

}
