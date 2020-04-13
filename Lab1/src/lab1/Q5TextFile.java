package lab1;
import java.util.*;
import java.io.*;
/**
 *
 * @author Sya
 */
public class Q5TextFile {

    try{
            
            PrintWriter a = new PrintWriter(new FileOutputStream("Hye"));
            a.println("Write ti text file");
            a.println("Welcome to FSKTM!");
            a.println("Please register your matric number.");
            a.println("Please register your UMMail account");
            
        }catch(IOException e){
            System.out.println("Hye");
        }
    
}
