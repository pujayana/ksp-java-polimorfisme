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

//Extends Animal

//public class Horse extends Animal {
//       
//    @Override
//    public double avgWeight(){
//        return 700;
//    }
//    
//    @Override
//    public double runningSpeed(){
//        return 88;
//    }
//    
//    @Override
//    public void display(){
//        System.out.println("\n[Horse]");
//        super.display();
//    }
//    
//}

//Implements LAnimal
public class Horse implements LAnimal{
    @Override
    public double avgWeight(){
        return 700;
    }
    
    @Override
    public double runningSpeed(){
        return 88;
    }
    
    @Override
    public void display(){
        System.out.println("\n[HORSE]");
        System.out.println("Average Weight : "+avgWeight()+" kg");
        System.out.println("Running Speed : "+runningSpeed()+" km/h");
    }
}
