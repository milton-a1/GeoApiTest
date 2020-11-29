package vista;


import java.util.Scanner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import modelo.InformacionIp;
import modelo.Usuario;

public class Main {

	public static void main(String[] args) {
		
		crearUsuario(ubicacion());
	}

	public static InformacionIp ubicacion() {
		Client client = ClientBuilder.newClient();

		WebTarget target = client.target("https://freegeoip.app").path("json");
		
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		
		Response respuestaInformacionIps = invocationBuilder.get();
		
		InformacionIp informacionIps = respuestaInformacionIps.readEntity(new GenericType<InformacionIp>(){});
		
		return informacionIps;
	}
	
	public static void crearUsuario(InformacionIp infoUbicacion) {
		Scanner sc = new Scanner(System.in);
		Usuario miUsuario = new Usuario();
		
		System.out.println("Bienvenido! \nPara crear un usuario debe llenar los siguientes campos:\nNombre:");
		miUsuario.setNombre(sc.next());
		System.out.println("\nApellido:");
		miUsuario.setApellido(sc.next());
		System.out.println("\nCorreo:");
		miUsuario.setCorreo(sc.next());
		System.out.println("\nContraseña:");
		miUsuario.setClave(sc.next());
		
		miUsuario.setCiudad(infoUbicacion.getCity());
		miUsuario.setRegion(infoUbicacion.getRegion_code());
		miUsuario.setPais(infoUbicacion.getCountry_name());
		miUsuario.setContinente(infoUbicacion.getTime_zone());
		
		System.out.println("\nGracias! su Usuario es: "+ miUsuario.toString());
		;
	}
}
