package logica;

import dominio.Cuenta;
import dominio.Personaje;
import dominio.Skin;

public class SistemaIMPL implements Sistema{
	private ListaCuentas generalCuentas;
	private ListaPersonajes generalPersonajes;
	private ListaSkins generalSkins;
	
	public SistemaIMPL() 
	{
		generalCuentas = new ListaCuentas(999);
		generalPersonajes = new ListaPersonajes(999);
		generalSkins = new ListaSkins(999);
	}
	@Override
	public boolean agregarCuenta(String nomCuenta, String contrasena, String nickName, int nivel, int RP, int cantPersonajes) {
		Cuenta c = generalCuentas.getCuentaNombre(nomCuenta);
		if(c==null) 
		{
			//la cuenta no existe
			Cuenta cuenta = new Cuenta(nomCuenta,contrasena,nickName,nivel,RP,cantPersonajes);
			boolean retorno = generalCuentas.ingresarCuenta(cuenta);
			return retorno;
			
		}else{ 
		
			//la cuenta existe
			//throw new NullPointerException("la cuenta ya existe");
			System.out.println("la cuenta ya esta ingresada ");
			return false;
		}
		
	}

	@Override
	public boolean agregarPersonaje(String nombre, String rol) {
		//Personaje personaje = generalPersonajes.buscarPersonajeNombre(nombre);
		Personaje p = new Personaje(nombre,rol);
		return generalPersonajes.agregarPersonaje(p);
		/**
		if(personaje == null) 
		{
			Personaje p = new Personaje(nombre,rol);
			boolean  retorno = generalPersonajes.agregarPersonaje(p);
			return retorno;
			
		}else {
			//el personaje ya existe
			throw new NullPointerException("el personaje ya existe");
		}	
		**/
	}

	@Override
	public boolean agregarSkin(String nombre, String tipo) {
		Skin s = generalSkins.buscarSkinNombre(nombre);
		if(s==null) {
			Skin skin = new Skin(nombre,tipo);
			boolean retorno = generalSkins.ingresarSkin(skin);
			return retorno;
		}else {
			//la skin ya existe
			return false;//throw new NullPointerException("la skin ya existe");
		}
	}

	@Override
	public void agregarRecaudacion(String nomPersonaje, int montoRecaudacion) {
		Personaje p = generalPersonajes.buscarPersonajeNombre(nomPersonaje);
		p.setRecaudacionCLP(montoRecaudacion);
		
		
	}

	@Override
	public void asociarCuentaPersonaje(String nomCuenta, String nomPersonaje) {
		Cuenta c = generalCuentas.getCuentaNombre(nomCuenta);
		Personaje p = generalPersonajes.buscarPersonajeNombre(nomPersonaje);
		c.agregarPersonaje(p);
		p.setCuenta(c);
		
	}

	@Override
	public void asociarPersonajeSkin(String nomPersonaje, String nomSkin) {
		Personaje p = generalPersonajes.buscarPersonajeNombre(nomPersonaje);
		Skin s = generalSkins.buscarSkinNombre(nomSkin);
	
		p.agregarSkin(s);
		s.setPersonaje(p);
		
		
	}

	@Override
	public void asociarRecaudacionPersonaje(String nomPersonaje) {
		
		
	}

	@Override
	public boolean comprarSkin(String nomCuenta,String nomPersonaje, String nomSkin) {
		//verificar que exista el personaje y la skin que se desea comprar
		Personaje p = generalPersonajes.buscarPersonajeNombre(nomPersonaje);
		Cuenta c = generalCuentas.buscarCuenta(nomCuenta);
		Skin s = generalSkins.buscarSkinNombre(nomSkin);
		if(p != null && c!= null && s!= null) 
		{	
			if(p.getListaSkins().buscarSkinNombre(nomSkin)!= null) {
				//el personaje y la skin que se desean comprar existen
				//debe tener RP suficientes
				if(s.getPrecio()<=c.getRP()) {
					//tiene suficiente rp
					//subir nivel a la cuenta
					c.setNivel(c.getNivel()+1);
					//restar los RP de la compra a los RP de la cuenta
					c.setRP(c.getRP()-s.getPrecio());
					boolean b  = c.getListaPersonajes().buscarPersonajeNombre(nomPersonaje).agregarSkin(s);//agrego la skin al personaje
					return b;
					
				}
				else 
				{
					return false;//throw new NullPointerException("la cuenta no tiene saldo suficiente");
					//return false;
				}
			}else {
				return false;//throw new NullPointerException("la skin a comprar no pertenece al personaje suministrado");
			}	
		}else {
			return false;//throw new NullPointerException("el personaje o la skin no existen");
		}
		
	}

	@Override
	public boolean comprarPersonaje(String nomPersonaje, String nomCuenta) {
		//verificar que exista cuenta y que exista el personaje
		Cuenta c = generalCuentas.buscarCuenta(nomCuenta);
		Personaje p = generalPersonajes.buscarPersonajeNombre(nomPersonaje);
		if(c!=null && p!=null) 
		{
			//la cuenta y el personaje existen en el sistema
			return c.agregarPersonaje(p);
			
		}else {
			return false;//throw new NullPointerException("el personaje o la cuenta no existen en el sistema");
		}
		
		
	}

	@Override
	public String obtenerSkinDisponibles(String nomCuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String obtenerInventarioCuenta(String nomCuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean agregarRP(String nomCuenta, int monto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String obtenerDatosCuenta(String nomCuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPass(String newPass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String obtenerRecaudacionRol() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String obtenerRecaudacionTotal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String obtenerRecaudacionPersonaje() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String obtenerPersonajesPorRol() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean agregarPersonajeJuego(String nomPersonaje, String rol, int cantSkins) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean agregarSkinJuego(String nomPersonaje, String nomSkin, String tipoSkin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean bloquearJugador(String nomCuenta) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String obtenerCuentasMayoraMenor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String escribirPersonajes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String escribirCuentas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String escribirEstadisticas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void login(String nomCuenta, String contrasena) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean  buscarCuenta (String nomCuenta) {
		Cuenta c = generalCuentas.getCuentaNombre(nomCuenta);
		int e = 0;
		if(c == null) { //No registrado
			return false;
		}
		else { //Cuenta registrada
			return true;
		}
		
	}

	@Override
	public boolean registro(String nomCuenta, String contrasena, String nickName, String region) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean agregarPersonajePoseido(String nomPersonaje, String nomCuenta) {
		String rol = "";
		Personaje p = generalPersonajes.buscarPersonajeNombre(nomPersonaje);
		rol = generalPersonajes.buscarPersonajeNombre(nomPersonaje).getRol();
		if(p != null) 
		{
			//el personaje existe en la lista general de personajes
			//es un personaje valido
			rol = generalPersonajes.buscarPersonajeNombre(nomPersonaje).getRol();
			Personaje personajePoseido = new Personaje(nomPersonaje,rol);
			return generalCuentas.getCuentaNombre(nomCuenta).agregarPersonaje(personajePoseido);//agregamos el personaje poseido a la lista de personajes de la cuenta
			
		}else 
		{
			return false;
		}
	}

	@Override
	public boolean agregarSkinPoseida(String nomCuenta, String nomPersonaje, String nomSkinPersonajePoseido) {
		Skin s = generalSkins.buscarSkinNombre(nomSkinPersonajePoseido);
		if(s !=null) 
		{
			//la skin existe en el sistema
			String tipo = s.getTipo();
			Skin skinPoseida = new Skin(nomSkinPersonajePoseido,tipo);
			return generalCuentas.getCuentaNombre(nomCuenta).getListaPersonajes().buscarPersonajeNombre(nomPersonaje).agregarSkin(skinPoseida);
		}
		return false;
	}

	@Override
	public void setRegion(String nomCuenta, String region) {
		generalCuentas.getCuentaNombre(nomCuenta).setRegion(region);
		
	}

}
