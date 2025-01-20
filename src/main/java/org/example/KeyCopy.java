package org.example;

import lombok.Cleanup;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class KeyCopy {
//bad
    public static void main(String[] args) throws Exception{

        InputStream in = System.in;

        @Cleanup
        OutputStream fos = new FileOutputStream("C:\\zzz\\input.txt");

        System.out.println("한글입력");

        for (int i = 0; i < 10; i++) {

            int data = in.read();
            fos.write(data);

        }
    }
}
