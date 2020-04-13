package lab1;
import java.text.*;
import java.util.*;
/**
 *
 * @author Iqa
 */
public class Q1Time {

    private int hour, minute;

    public Q1Time() {
        this.hour = 0;
        this.minute = 0;
    }

    public Q1Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    
    public boolean check(){
        
        boolean ch=true;
        if(hour>23 || minute>59){
            ch=false;
        }
            return ch;        
    }
    
    public void display(){
//        SimpleDateFormat time = new SimpleDateFormat("hh:mm");
//        Date date = null;
        int nhour;
        String str="";
        
        if(check()==true&&hour>=12&&hour<=24){
            nhour=hour-12;
            str=nhour+":"+minute+" PM";
        }
        else if(check()==true&&hour<12){
            nhour=hour;
            str=nhour+":"+minute+" AM";
        }
        else if(check()==false){
            str="Invalid time input";
        }
        
        System.out.print("Hour: "+hour+" Minute: "+minute+"  "+str+"\n");
        
        
    }
    
}
