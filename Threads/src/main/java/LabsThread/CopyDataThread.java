package LabsThread;
import java.io.*;

class CopyDataThread extends Thread {
    private FileReader source; //src filereader
    private FileWriter target; //target filereader

    public CopyDataThread(FileReader source, FileWriter target)//constructor 
    {
        this.source = source;
        this.target = target;
    }

    @Override
    public void run() {
        try {
            char[] buffer = new char[10]; //buffer to read 10 char at a time
            int charsRead; //store chars no.
            while ((charsRead = source.read(buffer, 0, 10)) != -1) //read frm src file and cpy to target
            {
                target.write(buffer, 0, charsRead);
                target.flush();
                System.out.println(charsRead + " characters are copied");
                Thread.sleep(5000); //required delay of 5 sec
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}