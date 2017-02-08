/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author JAVIER
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    static int ordenarNumeros(int a,int b, int c){
            int d = 0;
            if (a > b){
                if ( a > c){
             d = a;
            } 
                else if( c > a) {
                    if (c > b){
                        d = c;
                    }      
                
            }
            
        } else {
                if (b > c){
                    d = b;
                }
            }
            return d;
    } 
    public static void main(String[] args) {
        int ordenarNumeros = ordenarNumeros(2, 4 ,6);
    }

    