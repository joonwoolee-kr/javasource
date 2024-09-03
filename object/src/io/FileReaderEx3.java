package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class FileReaderEx3 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader(".\\src\\io\\fileEx.java", Charset.forName("utf-8"));
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter("c:\\temp\\source.txt");
                BufferedWriter bw = new BufferedWriter(fw)) {

            int i = 1;
            String str = null;
            // br.readLine(): 줄 단위로 읽어오기
            while ((str = br.readLine()) != null) {
                bw.write(i++ + "\t" + str);
                bw.newLine(); // 엔터
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
