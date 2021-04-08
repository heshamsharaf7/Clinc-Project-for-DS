/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doctor;
import Person.Person;
import java.util.LinkedList;
/**
 *
 * @author ameen
 */

public class Doctor extends Person{
    LinkedList<Doctor> list= new LinkedList<>();
    public Doctor(int id, String name, String address) {
        super(id, name, address);
    }
    public void AddDoctor(int id, String name, String address)
    {
        
        Doctor D=new Doctor(id,name,address);
        list.add(D);
    }
    public int NuberOfDoctor()
    {
        return list.size();
    }
    
    
}
