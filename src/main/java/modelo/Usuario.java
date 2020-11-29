package modelo;

public class Usuario {

	private String nombre;
	private String apellido;
	private String correo;
	private String clave;
	private String ciudad;
	private String region;
	private String pais;
	private String continente;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nombre, String apellido, String correo, String clave, String ciudad, String region,
			String pais, String continente) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.clave = clave;
		this.ciudad = ciudad;
		this.region = region;
		this.pais = pais;
		this.continente = continente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	@Override
	public String toString() {
		return "\nnombre:" + nombre + "\nnapellido:" + apellido + "\nncorreo:" + correo + "\nclave:" + clave
				+ "\nciudad:" + ciudad + "\nregion:" + region + "\npais:" + pais + "\ncontinente:" + continente;
	}

}
