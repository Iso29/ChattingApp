
package com.mycompany.tcpserverv2;

import com.mycompany.fileutill.FileUtill;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerV2 {

    public static void main(String[] args) throws IOException, Exception {
        ServerSocket socket = new ServerSocket(6789);
        while(true){
            System.out.println("Server is waiting");
            Socket connection = socket.accept();
            System.out.println("socket is accepted");
            InputStream is = connection.getInputStream();
            InputStreamReader reader = new InputStreamReader(is);
            BufferedReader bReader = new BufferedReader(reader);
            String messageFromClient = bReader.readLine();
            FileUtill.writeInBytes("msgFromClient.txt", messageFromClient.getBytes());
        }
    }
}
