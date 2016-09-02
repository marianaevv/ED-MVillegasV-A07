package ed;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mariana Villegas
 */
public class mergeSortClass {

    public static int [] mergeSort (int[]arr){
        int i,j,k;
        if (arr.length>1){                              //Revisamos si el arreglo tiene mas de un elemento
            int nElementosI=arr.length/2;               //Dividimos el arreglo a la mitad y guardamos la cantidad de lementos del arreglo izq en una variable
            int nElementosD=arr.length-nElementosI;     //Guardamos la otra cantidad de elementos del arreglo la guardamos en otra variable.
            int arrI[]=new int[nElementosI];            //Creamos el arreglo de la derecha y la izquierda con el número de elementos que corresponde a cada uno.
            int arrD[]=new int[nElementosD];
            
            for (i=0; i<nElementosI; i++){              //Desde 0 hasta la cantiddad de elementos para el arreglo Izquierdo, copia elemento por elemento.
                arrI[i]=arr[i];
            }
            
            for (i=nElementosI;i<arr.length;i++){      //Desde el número de elementos de izq, hasta el tamaño total del arreglo original, copiamos elemento por elemento.
                arrD[i-nElementosI]=arr[i];
            }
            
            //Aquí llamamos a la recursividad
            arrI=mergeSort(arrI);
            arrD=mergeSort(arrD);
            
            i=0;j=0;k=0;
            
            while(arrI.length!=j && arrD.length!=k){    //Mientras cualquier arreglo, izq o der, no sea de un solo elemento.
                if(arrI[j] < arrD[k]){
                    arr[i]=arrI[j];
                    i++;
                    j++;
                    System.out.print("Arreglo izquierdo " + Arrays.toString(arrI)+ " ");
                    System.out.print("Arreglo derecho " + Arrays.toString(arrD) + " ");
                    System.out.println("Arreglo final " + Arrays.toString(arr) + "\n");
                }else{
                    arr[i]=arrD[k];
                    i++;
                    k++;
                  System.out.print("Arreglo izquierdo " + Arrays.toString(arrI)+ " ");
                    System.out.print("Arreglo derecho " + Arrays.toString(arrD) + " ");
                    System.out.println("Arreglo final " + Arrays.toString(arr) + "\n");
                }
            }
            //Arreglo Final
            while (arrI.length!=j){
                arr[i]=arrI[j];
                i++;
                j++;
              System.out.print("Arreglo izquierdo " + Arrays.toString(arrI)+ " ");
                    System.out.print("Arreglo derecho " + Arrays.toString(arrD) + " ");
                    System.out.println("Arreglo final " + Arrays.toString(arr) + "\n");
            }
            while (arrD.length!=k){
              arr[i]=arrD[k];
                i++;
                k++;
             System.out.print("Arreglo izquierdo " + Arrays.toString(arrI)+ " ");
                    System.out.print("Arreglo derecho " + Arrays.toString(arrD) + " ");
                    System.out.println("Arreglo final " + Arrays.toString(arr) + "\n");
            } 
        }
        return arr;
    }
}
