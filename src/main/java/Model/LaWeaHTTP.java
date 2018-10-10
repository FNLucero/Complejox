package Model;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.google.common.net.HttpHeaders;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;

import Model.AsignacionPosta;

public class LaWeaHTTP {

	private static String URI = "http://notitas.herokuapp.com/student";
	private Client cliente = Client.create();
	private String token;
	
	public LaWeaHTTP(String token) {
		this.token = token;
	}

	private static <T> T armarInstancia(WebResource w, String token, Class<T> clase) {
		ClientResponse respuesta = w.header("Authorization", "Bearer " + token).get(ClientResponse.class);
		Gson gson = new Gson();
		return gson.fromJson(respuesta.getEntity(String.class), clase);
	}
	
	public Alumno getAlumno() {
		WebResource w = cliente.resource(URI);
		return armarInstancia(w, token, Alumno.class);
	}

	public List <AsignacionPosta> getAsignaciones() {
		WebResource w = cliente.resource(URI).path("assignments");
		return armarListaAsignaciones(w, token);
	}

	public int actualizarAlumno(Alumno al) {
		
    	String input = "{"
				+ "\"code\":	\""	+ al.getLegajo().toString()	+ "\","
				+ "\"first_name\":	\"" + al.getNombre() + "\","
				+ "\"last_name\":	\"" + al.getApellido() + "\","
				+ "\"github_user\":	\"" + al.getGit() + "\""
				+ "}";
		
		WebResource w = cliente.resource(URI);
		try {
			w.header("Authorization", "Bearer " + token).put(ClientResponse.class, input);
			return 0;
		} catch (UniformInterfaceException e) {
			return 1;
		}
	}

	
	public List <AsignacionPosta> armarListaAsignaciones (WebResource w, String token) {
		
		ClientResponse respuesta = w.header("Authorization", "Bearer " + token).get(ClientResponse.class);
		JsonObject nuevo =(JsonObject) new JsonParser().parse(respuesta.getEntity(String.class) );//Parseo a jsonobject
		AsignacionPosta[] tareasLocales= new Gson().fromJson(nuevo.get("assignments"), AsignacionPosta[].class);
		
		return Arrays.asList(tareasLocales);
	}
	 
}
