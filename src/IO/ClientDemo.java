package IO;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",9900);
        while(true) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            socket.getOutputStream().write(s.getBytes());
        }
    }

}
