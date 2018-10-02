package Model;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;

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

	public AsignacionPosta getAsignaciones() {
		WebResource w = cliente.resource(URI).path("assignments");
		return armarInstancia(w, token, AsignacionPosta.class);
	}

	public int actualizarAlumno(Alumno al) {
		WebResource w = cliente.resource(URI);
		try {
			w.header("Authorization", "Bearer " + token).put(al);
			return 0;
		} catch (UniformInterfaceException e) {
			return 1;
		}
	}
}
