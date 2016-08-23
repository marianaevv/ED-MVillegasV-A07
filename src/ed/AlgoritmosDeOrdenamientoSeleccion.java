/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

import java.util.Scanner;

/**
 *
 * @author Mariana Villegas
 */
public class AlgoritmosDeOrdenamientoSeleccion {
  int vector[]; //crear variable para un vector
  
  public void setVector  (){ //Método para crear un vector
          Scanner sc; 
          int t; 
          sc = new Scanner(System.in);
          System.out.println("De que tamaño quieres el arreglo");//Pedimos el tamaño del vector
          t = sc.nextInt(); // guardamos en la variable t lo que introdujo el usuario
          vector= new int [t];// el valor guardado en la variable t se lo damos como tamaño al vector
          
          for(int i=0;i<vector.length;i++){/*mientras una variable i igualada a 0 sea menor que el tamaño introducido
              anteriormente, se seguiran metiendo valores en el arreglo*/
                System.out.println("Mete los valores del vector"); //Pedimos al usuario los valores del vector
                 vector[i] = sc.nextInt();//variable que pide los elementos y los guarda en el arreglo
                }  
         }
  public void desordenado() { //método para mostrar el vector desordenado
      
    for(int i=0;i<(vector.length);i++){//for para recorrer el arreglo y mostrar entre corchetes los valores del vector
     //Se imprimen los valores del arreglo desordenado
            System.out.print("[");
            System.out.print(vector[i]);
            System.out.print("]");
            }
        }

  public void ordenar() {//método para ordenar el arreglo y mostrarlo, se ocupan ciclos anidados
    for(int i=0;i<(vector.length);i++){// ciclo que recorrera el vector desde la posicion 0
        for(int j=i+1;j<vector.length;j++){//ciclo que ira una posicion adelante del ciclo anterior, empieza en la posicion 1
                if(vector[i]>vector[j]){ //este if tiene como condicion que si el valor de la posicion 1 es mayor que el de la posicion 0:
              int aux=vector[i]; //se declara una variable auxiliar en la que se guardara el valor de la posicion 0
              vector[i]=vector[j]; //en la posicion 0 se guardara el valor de la posicion 1
              vector[j]=aux;// y en la posición 1 se guardara el valor que guardamos en la variable auxiliar, es decir el valor previamente guardado en la posición 0
              }
            }
        //Se imprimen los valores ordenados 
            System.out.print("[");
            System.out.print(vector[i]);
            System.out.print("]");
            }
 
}
}

