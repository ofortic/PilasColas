
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ofortich
 */
public class NewClass {
    public static void main (String[] args){
        
        cola();
        System.out.println("....");
        pila();
    }
    
    /**
     * Uso de las colas
     */
    public static void cola(){
        Queue<Integer> cola = new LinkedList();
        
        for (int i = 0; i < 10; i++) {
            cola.add(i);
        }
        while(!cola.isEmpty()){
            int temp = cola.poll();
            System.out.println(temp);
        }
    }
    
    /**
     * 
     * Uso de las pilas
     */
    public static void pila(){
        Stack<Integer> pila = new Stack();
        
        for (int i = 0; i < 10; i++) {
            pila.push(i);
        }
        while(!pila.isEmpty()){
            int temp = pila.pop();
            System.out.println(temp);
        }
    }
}
