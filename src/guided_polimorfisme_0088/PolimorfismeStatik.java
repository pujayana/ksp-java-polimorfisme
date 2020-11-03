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
public class PolimorfismeStatik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SimpleCalculator obj = new SimpleCalculator();
        
        System.out.println("Penjumlahan 2 Angka : "+obj.add(10, 20));
        System.out.println("Penjumlahan 3 Angka : "+obj.add(10, 20, 30));
        
    }
    
}
