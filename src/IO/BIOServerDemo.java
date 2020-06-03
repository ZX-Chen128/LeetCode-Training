package IO;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class BIOServerDemo {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9900);
        System.out.println("Server online!");
        while (true){
            Socket socket = serverSocket.accept();
            if(socket != null) {
                new Thread(() -> {
                    System.out.println("Client " + socket.getPort() + " online!" );
                    try {
                        int len;
                        byte[] data = new byte[1024];
                        InputStream inputStream = socket.getInputStream();
                        //InputStream中的read方法是阻塞的
                        while((len = inputStream.read(data)) != -1){
                            System.out.println("Client port "+socket.getPort()+": "+ new String(data,0,len));
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();
            }
        }
    }

}
