package OOPs;
import java.util.*;
import java.io.*;
public class TryWithResource {
    public static void Resourse() {
        try (FileReader reader = new FileReader("file.txt");
             BufferedReader br = new BufferedReader(reader)) {
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Resourse();
    }
}

