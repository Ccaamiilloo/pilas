/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cami;

import java.util.Stack;


public class NewClass {
    
    public void problema1(){
        
        Stack pila = new Stack();
        pila.push("Juegos favoritos:");
        pila.push("Need for speed");
        pila.push("Terraria");
        pila.push("Outlast");
        pila.push("Amnesia");
        pila.push("Rocket Lenguage");
        pila.push("Cube 3D");
        System.out.println(pila);
        System.out.println("Tamaño pila:"+pila.size());
        System.out.println("Cima:"+pila.peek());
        System.out.println("Posición del elemento:"+pila.search("Terraria"));
        System.out.println("Posición del elemento:"+pila.search("Dragon Ball Z"));
        System.out.println("Elemento des-apilado"+pila.pop());
        System.out.println("¿Está la pila vacía?:"+pila.empty());
        
    }
    public void problema2(){
        Stack pila = new Stack();
        pila.push(7.0);
        pila.push(6.5);
        pila.push(6.0);
        pila.push(4.0);
        pila.push(5.7);                                 
        
        for(int i=0;i<pila.size();i++)
        {
            System.out.println(pila.get(i));      
        } 
        System.out.println("==================");
    }
    
    
    public void problema3(){
       Stack pila = new Stack();
        pila.push(5.5);
        pila.push(6.0);
        pila.push(7.0);
        pila.push(6.3);
        pila.push(6.9);
        for (Object a : pila)
        {
            System.out.println(a);        
        }
        System.out.println("==================");
        
        
    }
    public void problema4(){
        Stack pila = new Stack();
        pila.push("Nascar");
        pila.push("Julito Cabello");
        pila.push("Luna de pluton");
        pila.push("Chupa el perro");
        while(!pila.empty()){
            System.out.println(pila.pop());
    }
        
    }
}

