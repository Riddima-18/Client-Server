import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;

        try {
            // Connect to the server running on the same machine ("localhost") at port 5000
            socket = new Socket("localhost", 5000);
            System.out.println("Connected to server.");

            // Stream to read data coming FROM the server
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            // Stream to send data TO the server (true = auto-flush after println)
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Send a message to the server
            output.println("Hello Server");

            // Read the server's reply
            String response = input.readLine();
            System.out.println("Server says: " + response);

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            // Always close the socket, even if an exception occurred
            try {
                if (socket != null) socket.close();
                System.out.println("Connection closed.");
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}