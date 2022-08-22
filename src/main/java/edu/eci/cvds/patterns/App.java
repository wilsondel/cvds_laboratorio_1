package edu.eci.cvds.patterns;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.print( "Hello");
        if (args.length == 0){
            System.out.println( " World!" );
        }else {
            for(String word : args) {
                System.out.print(" " + word);
            }
            System.out.println("!");
        }
    }
}