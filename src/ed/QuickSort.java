/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

import java.util.Arrays;

/**
 *
 * @author Mariana Villegas ACT 7
 */
public class QuickSort {
    //método para ordenar el arreglo
    public static int [] QuickSort(int arr[], int ini, int fin){ //este método tiene 3 parametros, recibira un arreglo y 2 valores de variables
   if (fin>1){//este  if tiene como condición que si el tamaño del arreglo es mayor a 1 hara lo siguiente:
        int i,j, pivote, aux; //Se declaran 4 variables 
            pivote = arr[(ini+fin)/2]; // a la variable pivote se le da el valor de la posicion central del arreglo
            i = ini; // a la variable i se le da la posicion 0 que es el inicio del arreglo
            j = fin; //a la variable j se le da la posicion final del arreglo 
            
 
  while(i<=j){  //Este ciclo va a ir recorriendo el arreglo para verificar los valores de las posiciones
     while(arr[i]<pivote){//Esta condicion establece que si el valor de la posicion i que vale 0 es menor a la del valor de la variable del pivote hara lo siguiente:
         i++; //se le sumará 1 a la variable i 
     }
     while(arr[j]>pivote){//Esta condicion establece que si el valor de la posicion j que vale el tamaño total del arreglo es mayor a la del valor de la variable del pivote hara lo siguiente:
         j--;       //j irá decrementando de 1 en 1
     }
     if (i<=j) { //Esta condición establece que si la posicion de i es menor o igual a la de j entonces hará lo siguiente:                     
         aux= arr[i];      //en una variable auxiliar guardaremos el valor de la posicion i para que no la perdamos
         arr[i]=arr[j]; //en la posicion i guardamos el valor de la posicion j
         arr[j]=aux; // y en la posicion j guardamos el valor que copiamos en la variable auxiliar
         i++;// i incrementara de 1 en 1
         j--; //j decrementara de 1 en 1
                 
     }
      System.out.println(Arrays.toString(arr)); //Se imprime el arreglo
   }
  
   if(ini<j){//Una vez terminado el ciclo tendremos este if que como condición establece que si ini es menor que j entonces:
      QuickSort(arr,ini,j); // ordenamos el sub array por recursividad, dandole los valores del arreglo como ahora esta, la posicion inicial y j como posicion ultima
   }if(fin>i){// En caso de que lo anterior no se cumpla esta la condición de si el tamaño del arreglo es mayor a el valor de la variable i entonces
      QuickSort(arr,i,fin); // ordenamos el sub array por recursividad dandole los valores del arreglo, el valor de la variable i y el valor de la variable fin
    }
      }
   return arr;
    }
}
