/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Patient;
import Utilty.Person;
/**
 *
 * @author ameen
 */
public class Patient extends Person {

    public Patient() {
    }

    public Patient(int id, String name, String address) {
        super(id, name, address);
    }

      @Override
       public String toString() 
       {
            System.out.print("the Patient id:"+getId()+"\t\t\t");
          System.out.print("the Patient Nmae:"+getName()+"\t\t");
          System.out.print("the Patient Address:"+getAddress()+"\t\t\n\n");
           System.out.println("*******************************NEW PATIENT*********************************\n");
           return null;
       }

   
    
    
    
  
    
}
