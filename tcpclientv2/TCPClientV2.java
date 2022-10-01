
package com.mycompany.tcpclientv2;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientV2 {

    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost",6789);
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream =new DataOutputStream(outputStream);
        dataOutputStream.write(message.getBytes());
        socket.close();
    }
}
