import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class client {
    public void run() throws UnknownHostException , IOException {
        int port=8018;
        InetAddress address=InetAddress.getByName("localhost");
        Socket socket=new Socket(address,port);
        PrintWriter tosocket= new PrintWriter(socket.getOutputStream());
        BufferedReader fromsocket=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        tosocket.print("Hello from the client side ");
        String line= fromsocket.readLine();
        System.out.println("Response from the socket is: "+ line);
        tosocket.close();
        fromsocket.close();
        socket.close();
    }

    public static void main(String[] args) {
        try {
            client client=new client();
            client.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

