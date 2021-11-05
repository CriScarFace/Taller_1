package logica;

public interface Sistema {
	
	boolean agregarCuenta(String nomCuenta,String contrasena,String nickName,String nivel ,int RP ,String region,int cantPersonajes);
	boolean agregarPersonaje(String nombre,String rol);
	boolean agregarSkin(String nombre,String tipo);
	boolean agregarRecaudacion(String nomPersonaje,int montoRecaudacion);
	void asociarCuentaPersonaje(String nomCuenta,String nomPersonaje);
	void asociarPersonajeSkin(String nomPersonaje,String nomSkin);
	void asociarRecaudacionPersonaje(String nomPersonaje);
	boolean comprarSkin(String nomPersonaje,String nomSkin);
	boolean comprarPersonaje(String nomPersonaje,String nomCuenta);
	String obtenerSkinDisponibles(String nomCuenta);
	String obtenerInventarioCuenta(String nomCuenta);
	boolean agregarRP(String nomCuenta,int monto);
	String obtenerDatosCuenta(String nomCuenta);
	void setPass(String newPass);
	String obtenerRecaudacionRol();
	String obtenerRecaudacionTotal();
	String obtenerRecaudacionPersonaje();
	String obtenerPersonajesPorRol();
	boolean agregarPersonajeJuego(String nomPersonaje,String rol,int cantSkins);
	boolean agregarSkinJuego(String nomPersonaje,String nomSkin,String tipoSkin);
	boolean bloquearJugador(String nomCuenta);
	String obtenerCuentasMayoraMenor();
	String escribirPersonajes();
	String escribirCuentas();
	String escribirEstadisticas();
	void login(String nomCuenta,String contrasena);
	boolean registro(String nomCuenta,String contrasena,String nickName,String region);
	
	

}
