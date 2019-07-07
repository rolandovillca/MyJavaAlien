// A Java program for a Client.
import java.net.*;
import java.io.*;

public class TcpClient {
	private static String remoteServerAddress = "127.0.0.1";
	private static int remoteServerPort = 5555;

	public static void main(String args[]) throws Exception{
		InetAddress remoteServerInetAddress = InetAddress.getByName(remoteServerAddress);
		Socket localSocket = new Socket(remoteServerAddress, remoteServerPort);

		String message = "This is a string sent from TcpClient.";

		System.out.println("Connected to remote client: " + localSocket.getRemoteSocketAddress());
		OutputStream outToServer = localSocket.getOutputStream();
		DataOutputStream out = new DataOutputStream(outToServer);

		out.writeUTF(message + " : " + localSocket.getLocalSocketAddress());

		InputStream inFromServer = localSocket.getInputStream();
		DataInputStream in = new DataInputStream(inFromServer);

		System.out.println("Server sent usreply as: " + in.readUTF());
		localSocket.close();
	}
}