package test;

import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("C:\\Users\\curso\\Documents\\New folder\\threads\\ThreadsTest1\\src\\test\\input.txt");
         out = new FileWriter("C:\\Users\\curso\\Documents\\New folder\\threads\\ThreadsTest1\\src\\test\\output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
