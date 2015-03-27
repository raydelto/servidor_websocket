package org.raydelto.websocket.servidor;

import java.net.InetSocketAddress;
import java.net.UnknownHostException;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

public class Servidor extends WebSocketServer{

	public Servidor(int puerto) throws UnknownHostException {
		super(new InetSocketAddress(puerto));
		System.out.println("Recibiendo conexiones en el puerto " + puerto);		
	}
	
	@Override
	public void onClose(WebSocket arg0, int arg1, String arg2, boolean arg3) {
		System.out.println("Se ha cerrado la conexión");
		
	}

	@Override
	public void onError(WebSocket arg0, Exception e) {
		System.out.println("Error de conexión");
		e.printStackTrace();
		
	}

	@Override
	public void onMessage(WebSocket webSocket, String mensaje) {
		webSocket.send("Gracias por el mensaje: " + mensaje);
		System.out.println("Se ha recibido el mensaje: " + mensaje);
		
		
	}

	@Override
	public void onOpen(WebSocket webSocket, ClientHandshake arg1) {
		webSocket.send("Bienvenido a mi servidor");
		System.out.println("Se ha iniciado una nueva conexión");
		
	}

}
