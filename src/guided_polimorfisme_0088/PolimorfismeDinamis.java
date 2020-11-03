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
public class PolimorfismeDinamis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
// Animal
//        Animal animal;
//        
//        //contoh penulisan animal 1
//        Cat cat1 = new Cat();
//        animal = cat1;
//        cat1.display();
//        
//        //contoh penulisan animal 2
//        animal = new Horse();
//        animal.display();

// LAnimal
        LAnimal animal;
        Cat cat1 = new Cat();
        animal = cat1;
        animal.display();
        
        animal = new Horse();
        animal.display();
        
    }
    
}
