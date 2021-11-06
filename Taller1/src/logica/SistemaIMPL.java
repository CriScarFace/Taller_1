package logica;

public class SistemaIMPL implements Sistema{
	private ListaCuentas generalCuentas;
	private ListaPersonajes generalPersonajes;
	private ListaSkins generalSkins;
	@Override
	public boolean agregarCuenta(String nomCuenta, String contrasena, String nickName, int nivel, int RP, int cantPersonajes) {
		Cuenta c = generalCuentas.getCuentaNombre(nomCuenta);
		if(c==null) 
		{
			//la cuenta no existe
			Cuenta cuenta = new Cuenta(nomCuenta,contrasena,nickName,nivel,RP,cantPersonajes);
			boolean retorno = generalCuentas.ingresarCuenta(c);
			return retorno;
			
		}else 
		{
			//la cuenta existe
			throw new NullPointerException("la cuenta ya existe");
		}
		
	}

	@Override
	public boolean agregarPersonaje(String nombre, String rol) {
		Personaje p = new Personaje(nombre,rol);
		boolean  retorno = generalPersonajes.agregarPersonaje(p);
		return retorno;
	}

	@Override
	public boolean agregarSkin(String nombre, String tipo) {
		Skin skin = new Skin(nombre,tipo);
		boolean retorno = generalSkins.ingresarSkin(skin);
		return false;
	}

	@Override
	public boolean agregarRecaudacion(String nomPersonaje, int montoRecaudacion) {
		// TODO Auto-generated method stub
		return false;
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
	public boolean comprarSkin(String nomPersonaje, String nomSkin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean comprarPersonaje(String nomPersonaje, String nomCuenta) {
		// TODO Auto-generated method stub
		return false;
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

	@Override
	public boolean registro(String nomCuenta, String contrasena, String nickName, String region) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean agregarPersonajePoseido(String nomPersonaje,String nomCuenta) {
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
