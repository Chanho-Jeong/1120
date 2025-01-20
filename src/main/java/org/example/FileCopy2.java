package org.example;

import lombok.Cleanup;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy2 {
    //try -catch - finally
    public static void main(String[] args) throws Exception {
        // try with resource    // auto close
        @Cleanup

        InputStream in = new FileInputStream("C:\\zzz\\aaa.jpg");

        @Cleanup
        OutputStream out = new FileOutputStream("C:\\zzz\\copy_aaab.jpg");

        while (true) {
            int data = in.read();
            // System.out.println(data);
            if (data == -1) { //더이상 읽을 데이터가 없는 경우
                break;
            }

            System.out.println(in);


        }
    }
}


