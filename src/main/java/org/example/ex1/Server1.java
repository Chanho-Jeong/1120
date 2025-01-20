package org.example.ex1;

import lombok.Cleanup;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {
//bad code
    public static void main(String[] args) throws Exception{
        @Cleanup
        //5555로 가게를 여는것
        ServerSocket serverSocket = new ServerSocket(5555);

        System.out.println("Server opened....");


        for (int i = 0; i < 100; i++) {


            @Cleanup
            Socket clientSocket = serverSocket.accept();
            System.out.println(clientSocket);

            @Cleanup
            InputStream inputStream = clientSocket.getInputStream();

            @Cleanup
            Scanner inScanner = new Scanner(inputStream);
            String line = inScanner.nextLine();
            System.out.println(line);


            //ascii code (abcd)(97,98,99,100)
//            outputStream.write(72);
//            outputStream.write(101);
//            outputStream.write(108);
//            outputStream.write(108);
//            outputStream.write(111);
//            outputStream.write(44);
//            outputStream.write(32);
//            outputStream.write(87);
//            outputStream.write(111);
//            outputStream.write(114);
//            outputStream.write(108);
//            outputStream.write(100);
//            outputStream.write(33);
        } //for end

    }
}
