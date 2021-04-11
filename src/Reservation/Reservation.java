/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reservation;

import Doctor.DoctorControl;
import Patient.PatientControl;

/**
 *
 * @author Khaled
 */
public class Reservation {
    
private PatientControl patintInfo;
private DoctorControl doctorInfo;
private int id;
private String reserveDate;
private int price;

    public Reservation(PatientControl p, DoctorControl d, int id, String reserveDate, int price) {
        this.patintInfo = p;
        this.doctorInfo = d;
        this.id = id;
        this.reserveDate = reserveDate;
        this.price = price;
    }


    public Reservation() {
    }


    public Reservation(int id, String reservrDate, int price) {
        this.id = id;
        this.reserveDate = reserveDate;
        this.price = price;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReservrDate() {
        return reserveDate;
    }

    public void setReservrDate(String reservrDate) {
        this.reserveDate = reservrDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }  
   
    @Override
    public String toString() {
        //System.out.print("patintInfo="+ patintInfo+"\t\t\t");
        //System.out.print("doctorInfo="+ doctorInfo+"\t\t\t");
          System.out.print("the Reserve id:"+getId()+"\t\t\t");
          System.out.print("the Reserve Date :"+getReservrDate()+"\t\t");
          System.out.print("the Reserve Price:"+getPrice()+"\t\t\n\n");
           System.out.println("*******************************NEW RESERVATION*********************************\n");
           return null;
       // return  "" + patintInfo + ", doctorInfo=" + doctorInfo + ", id=" + id + ", reserveDate=" + reserveDate + ", price=" + price + '}';
    }

   /** void getPrice(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }**/

   
     
    
}
