package org.raydelto.websocket;

import java.net.UnknownHostException;

import org.raydelto.websocket.servidor.Servidor;

public class Sistema {
	public static void main(String[] args) {
		try {
			new Servidor(8887).start();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
