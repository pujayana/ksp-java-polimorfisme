/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guided_polimorfisme_0088;

/**
 *
 * @author pujayana
 */

//Extedns Animal

//public class Cat extends Animal {
//    
//    @Override
//    public double avgWeight(){
//        return 4.05;
//    }
//    
//    @Override
//    public double runningSpeed(){
//        return 48;
//    }
//    
//    @Override
//    public void display(){
//        System.out.println("\n[CAT]");
//        super.display();
//    }
//    
//}

// Implements LAnimal

public class Cat implements LAnimal{
    
    @Override
    public double avgWeight(){
        return 4.05;
    }
    
    @Override
    public double runningSpeed(){
        return 48;
    }
    
    @Override
    public void display(){
        System.out.println("\n[CAT]");
        System.out.println("Average Weight : "+avgWeight()+" kg");
        System.out.println("Running Speed : "+runningSpeed()+" km/h");
    }
    
    public void lol(){
        System.out.println("lol");
    }
}
