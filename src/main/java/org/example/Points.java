package org.example;
import java.util.*;
import java.util.logging.*;

class Coordi implements Cloneable {
    int x1;
    int y1;
    Coordi(int x1,int y1){
        this.x1=x1;
        this.y1=y1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equalling(int x2, int y2){
        String a1=String.valueOf(x1);
        String b1=String.valueOf(y1);
        String a2=String.valueOf(x2);
        String b2=String.valueOf(y2);
        return a1.equals(a2) && b1.equals(b2);
    }

}
public class Points {
    public static void main(String[] args)throws Exception  {
        Scanner sc=new Scanner(System.in);
        Logger l = Logger.getLogger("com.api.jar");
        l.info("Welcome guys");
        l.info("Enter the co-ordinates X: ");
        int x1=sc.nextInt();
        l.info("Enter the co-ordinates Y: ");
        int y1=sc.nextInt();
        Coordi c1=new Coordi(x1,y1);
        l.info("Enter the co-ordinate X to check:");
        int x2=sc.nextInt();
        l.info("Enter the co-ordinates Y to check: ");
        int y2=sc.nextInt();
        Coordi c2=(Coordi) c1.clone();
        l.log(Level.INFO, () -> "The result is: " + c2.equalling(x2,y2));
    }
}