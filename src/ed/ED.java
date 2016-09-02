/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

import java.util.Arrays;

/**
 *
 * @author Mariana Villega
 */
public class ED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     int [] arreglo ={20,-3,1,3,7,-1,43};//Se crea el arreglo y se le dan valores 
        System.out.println("Arreglo dado:");
    	System.out.println(Arrays.toString(arreglo));// imprimimos el arreglo dado
 	QuickSort.QuickSort(arreglo, 0, arreglo.length-1);//llamamos al metodo de ordenamiento y le damos los parametro
        System.out.println(Arrays.toString(arreglo));//imprimimos el arreglo ya ordenado

 }    
}
