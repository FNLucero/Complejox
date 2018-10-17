package Model;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.google.common.net.HttpHeaders;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;

import Model.Asignacion;

public class ClienteHTTP {

	private static String URI = "http://notitas.herokuapp.com/student";
	private Client cliente = Client.create();
	private String token;
	
	public ClienteHTTP(String token) {
		this.token = token;
	}
	
	private  <T> T armarInstancia(WebResource w, String token, Class<T> type) {
		ClientResponse respuesta = w.header("Authorization", "Bearer " + token).get(ClientResponse.class);
		Gson gson = new Gson();
		
		String respuestaGET=respuesta.getEntity(String.class);
		
		return gson.fromJson(respuestaGET, type);
		
	}
	
	public List <Asignacion> getAsignaciones() {
		WebResource w = cliente.resource(URI).path("assignments");
		
		return armarInstancia( w,token,Alumno.class).getAsignaciones();
	}
	
	
	public Alumno getAlumno() {
		WebResource w = cliente.resource(URI);
		return armarInstancia(w, token, Alumno.class);
	}



	public int actualizarAlumno(Alumno al) {
		
    	String input = "{"
				+ "\"code\":	\""	+ al.getLegajo().toString()	+ "\","
				+ "\"first_name\":	\"" + al.getNombre() + "\","
				+ "\"last_name\":	\"" + al.getApellido() + "\","
				+ "\"github_user\":	\"" + al.getGithub() + "\""
				+ "}";
		
		WebResource w = cliente.resource(URI);
		try {
			w.header("Authorization", "Bearer " + token).put(ClientResponse.class, input);
			return 0;
		} catch (UniformInterfaceException e) {
			return 1;
		}
	}
	 
}
