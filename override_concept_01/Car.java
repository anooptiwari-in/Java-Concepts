/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package override_concept_01;

public class Car extends Vehicle {
    
    Car(String name){
        this.name = name;
    }
    
    //@Override
    void display(){
    System.out.println("Hi");    
    }
    
    
}
