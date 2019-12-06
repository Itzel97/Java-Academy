package com.softtek.academy;

import java.util.Arrays;
import java.util.Collections;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Integer arr[]= {1,2,4,0,6,7,0,9};
        for ( Integer element:arr) {
        	
        	System.out.print(element + " ");
        }
        System.out.println(" ");
        //usando la  lase ARRAYS de java ordenamos el arreglo del mayor al menor.
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(Integer element : arr) {
        	System.out.print(element+" ");
        }
        
    }
}
