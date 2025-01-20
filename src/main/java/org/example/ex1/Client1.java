package org.example.ex1;

import lombok.Cleanup;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client1 {
    //bad
    public static void main(String[] args) throws Exception{
        @Cleanup
        Socket socket = new Socket("192.168.0.8",5555);
        System.out.println(socket);

        @Cleanup
        InputStream inputStream = socket.getInputStream();

        @Cleanup
        OutputStream outputStream = socket.getOutputStream();

        String randomSaying = WiseSaying.shuffleNumbers();

        byte[] arr = (randomSaying+"\n").getBytes();
        outputStream.write(arr);

//        int data = inputStream.read();
//        System.out.println(data);
    }
}
