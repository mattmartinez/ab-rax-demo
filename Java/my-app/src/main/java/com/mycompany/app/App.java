package com.mycompany.app;
import java.io.*;
import org.apache.log4j.*;
import airbrake.*;

// File Name : ExcepTest.java


public class App{

   public static void main(String args[]){
      try{
         int a[] = new int[2];
         System.out.println("Access element three :" + a[3]);
      }catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Exception thrown  :" + e);
      }
      System.out.println("Out of the block");
   }
}


class Hello 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
