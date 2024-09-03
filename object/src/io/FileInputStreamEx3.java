package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 파일 복사 프로그램
public class FileInputStreamEx3 {
    public static void main(String[] args) {
        // 입력스트림: file에서 읽어오기
        // FileInputStream fis = null;
        // 출력스트림: file에 쓰기
        // FileOutputStream fos = null;

        // try-with-resources
        // try(닫아야 하는 자원 생성): finally 안에 닫기 명시하지 않아도 자동으로 닫아 줌
        try (FileInputStream fis = new FileInputStream("c:\\temp\\image2.jpg");
                FileOutputStream fos = new FileOutputStream("c:\\temp\\output_image.jpg")) {

            int data = 0;

            // 1024 바이트로 읽고, 1024 바이트로 쓰고
            byte b[] = new byte[1024];
            while ((data = fis.read(b)) != -1) {
                // System.out.print((char) data);
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
