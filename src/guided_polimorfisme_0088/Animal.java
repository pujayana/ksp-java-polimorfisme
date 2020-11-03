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
public abstract class Animal {
    
//    Polimorfisme Dinamis
    
//    public double avgWeight(){
//        return 0;
//    }
//    
//    public double runningSpeed(){
//        return 0;
//    }
//    
//    public void display(){
//        System.out.println("Average Weight : "+avgWeight()+" kg");
//        System.out.println("Running Speed : "+runningSpeed()+" km/h");
//    }
    
    public abstract double avgWeight();
    public abstract double runningSpeed();
    
    public void display(){
        System.out.println("Average Weight : "+avgWeight()+" kg");
        System.out.println("Running Speed : "+runningSpeed()+" km/h");
    }
    
}
