package org.example;

import java.io.*;
import java.net.URL;
import java.util.InputMismatchException;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws Exception {

        String path = "http://mp4.cine21.com/cine21.com/movie/making/2025/01/realpain_ptmk.mp4";
        URL url = new URL(path);
        InputStream in  = url.openStream();

// Menu -m = new PizzaMenu();
        // Scanner scanner = new scanner(System.in)에서 젤 많이 씀
        //InputStream in = new FileInputStream("C:\\zzz\\aaa.jpg");
        OutputStream out = new FileOutputStream("C:\\zzz\\`movie.mp4");

        //모든 빨대는 사용후에 닫는다.
        while (true) {
            int data = in.read();
           // System.out.println(data);
            if (data == -1) { //더이상 읽을 데이터가 없는 경우
                break;
            }

            out.write(data);

        }
        in.close();
        out.close();
        //매번 할때마다 in out 하기 좀 귀찮으니까 다른 방법을 사용해서 편하게 할 수도 있다.

    }
}