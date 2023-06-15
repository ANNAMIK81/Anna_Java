import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.*;

public class ff {
    // Sends ping request to a provided IP address
    public static boolean checkInternetConnection() {
        boolean status = false;
        String[] site = {"www.google.com", "www.youtube.com", "www.facebook.com","www.imdb.com","hgjdsfggkjgk.com"};

        for (String an : site) {
            try (Socket sock = new Socket()) {
                InetSocketAddress address = new InetSocketAddress(an, 80);
                sock.connect(address, 3000);

                if (sock.isConnected()) {
                    status = true;
                    System.out.println(an+" is accessible from your device");
                }
            } catch (ProtocolException e) {
                System.out.println(an+" is not accessible from your device");
            } catch (IOException e) {
                System.out.println(an+" check your network connection");
            }
        }

        return status;
    }

    public static void main(String[] args) {
        checkInternetConnection();
    }
}

