import java.net.*;
import java.io.*;

public class TcpServer extends Thread{
	private static int remoteServerPort = 5555;
	private ServerSocket localServerSocket = null;

	public TcpServer() {
		try {
			localServerSocket = new ServerSocket(remoteServerPort);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		while (true) {
			try {
				System.out.println("Waiting for client on port " + localServerSocket.getLocalPort() + "...");
				Socket server = localServerSocket.accept();

				System.out.println("Connected to remote client " + server.getRemoteSocketAddress());
				DataInputStream in = new DataInputStream(server.getInputStream());

				System.out.println(in.readUTF());
				DataOutputStream out = new DataOutputStream(server.getOutputStream());;
				out.writeUTF("Response/Ack to your data received at server: " + server.getLocalSocketAddress() + "\nThank You!");
				server.close();
			} catch (SocketTimeoutException s) {
				System.out.println("Socket time out!");
				break;
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
	}

	public static void main(String[] args) {
		TcpServer tcpServer = new TcpServer();
		tcpServer.start();
	}
}