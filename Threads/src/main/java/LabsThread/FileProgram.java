package LabsThread;
import java.io.*;
public class FileProgram {
    public static void main(String[] args) {
        try (FileReader sourceReader = new FileReader("source.txt");
             FileWriter targetWriter = new FileWriter("target.txt")) {
            CopyDataThread copyThread = new CopyDataThread(sourceReader, targetWriter);
            copyThread.start(); //start thread
            copyThread.join(); // Wait for it
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();//excep
        }
    }
}