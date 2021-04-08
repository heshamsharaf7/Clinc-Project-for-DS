/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doctor;

import Utilty.Person;

/**
 *
 * @author Ameen
 */
public class Doctor extends Person{
    Person p=new Person();
    private String qualfication;
    private String hiredDate;
    public Doctor()
    {
        super();
    }
  public Doctor(int id, String name, String address,String qualfication, String hiredDate) {
        super(id, name, address);
        this.qualfication = qualfication;
        this.hiredDate = hiredDate;
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
        
       
          System.out.print("the Doctor id:"+getId()+"\t\t\t");
          System.out.print("the Doctor Nmae:"+getName()+"\t\t\n");
          System.out.print("the Doctor Address:"+getAddress()+"\t\t");
          System.out.print("the Doctor qualfication:"+qualfication+"\t\t\n");
          System.out.println("the Doctor hiredDate:"+hiredDate+"\t\t\n");
          System.out.println("*************************************************************************");
        return null;
    }
   
    
    }
  
    

