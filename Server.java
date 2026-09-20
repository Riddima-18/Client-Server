import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            // Create a ServerSocket that listens for incoming TCP connections on port 5000
            serverSocket = new ServerSocket(5000);
            System.out.println("Server started...");
            System.out.println("Waiting for client...");

            // accept() blocks until a client connects, then returns a Socket for that connection
            socket = serverSocket.accept();
            System.out.println("Client connected.");

            // Stream to read data coming FROM the client
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            // Stream to send data TO the client (true = auto-flush after println)
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Read the message sent by the client
            String message = input.readLine();
            System.out.println("Client says: " + message);

            // Reply back to the client
            output.println("Hello Client");

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            // Always close sockets, even if an exception occurred
            try {
                if (socket != null) socket.close();
                if (serverSocket != null) serverSocket.close();
                System.out.println("Connection closed.");
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}