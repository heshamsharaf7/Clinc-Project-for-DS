/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doctor;
import Person.Person;
/**
 *
 * @author ameen
 */

public class Doctor extends Person{
   
    private String qualfication;
    private String hiredDate;
    private int id;
    private String name;
    private String address;
    public Doctor() {
        super();
    }

    public Doctor(String qualfication, String hiredDate, int id, String name, String address) {
        this.qualfication = qualfication;
        this.hiredDate = hiredDate;
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    

    public String getQualfication() {
        return qualfication;
    }

    public void setQualfication(String qualfication) {
        this.qualfication = qualfication;
    }

    public String getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(String hiredDate) {
        this.hiredDate = hiredDate;
    }

    @Override
    public String toString() {
        return "Doctor{" + "qualfication=" + qualfication + ", hiredDate=" + hiredDate + ", id=" + id + ", name=" + name + ", address=" + address + '}';
    }

   

   

   
    
    
    
}
