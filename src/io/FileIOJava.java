package io;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by Microsoft on 10/15/2015.
 */
public class FileIOJava {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        FileReader fileReader = null;
        FileWriter fileWriter = null;

        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            // Wrapes existing InputStream & OutputStream class and bufferes the input output
            bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(new URI("file:///F:/FileIOJava.java"))));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(new URI("file:///F:/FileIOOut.java"))));

            // classes are wraped by BufferedReader => this is recomended
            bufferedReader = new BufferedReader(new FileReader(new File(new URI("file:///F:/FileIOJava.java"))));
            bufferedWriter = new BufferedWriter(new FileWriter(new File(new URI("file:///F:/FileIOBufWr.java"))));

            // classes are not buffered
            fileInputStream = new FileInputStream(new File(new URI("file:///F:/FileIOJava.java")));
            fileOutputStream = new FileOutputStream(new File(new URI("file:///F:/FileIOWr.java")));

            // may induce some performance penalty
            // often wraped by BufferedReader
            fileReader = new FileReader(new File(new URI("file:///F:/FileIOJava.java")));
            fileWriter = new FileWriter(new File(new URI("file:///F:/FileWr.java")));

            // A class for turning a byte stream into a character stream
            inputStream = new FileInputStream(new File(new URI("file:///F:/FileIOJava.java")));
            outputStream = new FileOutputStream(new File(new URI("file:///F:/FileOutStream.java")));

            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);


            // for reading byte or character Equivalent integer
            Integer i;

            String[] x = bufferedReader.readLine().split(" ", 2);
            for (String s : x) {
                // System.out.println(s);
            }

            System.out.println();
            while ((i = bufferedInputStream.read()) != -1) {
                if (i == 10) {  // 10 means new line found
                    //System.out.println();
                } else {
                    //System.out.print(i + " ");
                    // temporarily comment as write operation occurs
//                    bufferedOutputStream.write(i);
//                    bufferedWriter.write(i);
//                    fileOutputStream.write(i);
                    fileWriter.write(i);
                    outputStreamWriter.write(i);
                }
            }
            bufferedInputStream.close();
            bufferedOutputStream.close();

            bufferedReader.close();
            bufferedWriter.close();

            fileInputStream.close();
            fileOutputStream.close();

            fileReader.close();
            fileWriter.close();

            inputStreamReader.close();
            outputStreamWriter.close();

        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}//}}}}}}