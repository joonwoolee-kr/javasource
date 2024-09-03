package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class FileReaderEx2 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader(".\\src\\io\\fileEx.java", Charset.forName("utf-8"));
                BufferedReader br = new BufferedReader(fr)) {

            int i = 1;
            String str = null;
            // br.readLine(): 줄 단위로 읽어오기
            while ((str = br.readLine()) != null) {
                System.out.println(i++ + "\t" + str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
