/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reservation;

import Doctor.*;
import Patient.*;
import java.util.Scanner;

/**
 *
 * @author Khaled
 */
public class ReserveControl {
     CircularQueue<Reservation> list= new CircularQueue<>();
     Scanner input =new Scanner(System.in);
      PatientControl p1=new PatientControl();
        DoctorControl d1=new DoctorControl();
        Patient p=new Patient();
        Doctor d=new Doctor();
      public boolean isEmpty(){return list.isEmpty();}
       public int numberOfReserve()
    {
        return list.size();
    }
       public void addReserve(){
       
        System.out.println("enter the patient id");
         int id=input.nextInt();
         if(p.getId()==id)
         {
             p1.printPatient(id);
         }
          System.out.println("enter the Doctor id");
         int dID=input.nextInt();
         if(d.getId()==id)
         {
             d1.printDoctor(id);
         }
        Reservation r=new Reservation ();
           System.out.println("enter the Reserve id pls:");
       r.setId(input.nextInt());
       System.out.println("enter the Reserve Date pls:");
       r.setReservrDate(input.nextLine());
       r.setReservrDate(input.nextLine());
       System.out.println("enter the Reserve price pls:");
       r.setPrice(input.nextInt());
        list.enqueue(r);
    }
        public Reservation deleteReserve(int id){
            p1.removePatient(id);
            d1.removeDoctor(id);
             if(numberOfReserve()>0){
        boolean check=false;
        while(!check)
        {
            if(list.first().getId()==id)
            {
                check=true;
                list.dequeue();
                System.out.println("the data is deleted successfully ");
                 return null;
            }else 
            {
                list.rotate();
            }
            
        }
        if(!check )
            {
                System.out.println("the data is not exit ");
            }
    }else{
            System.out.println("there is no data");}
            
      
             
       
       //return  (Reservation) list.dequeue();
         return null;
        }
         public void printReserve(int id) {
             p1.printPatient(id);
             d1.printDoctor(id);
        if(numberOfReserve()>0){
        boolean check=false;
        while(!check)
        {
            if(list.first().getId()==id)
            {
                check=true;
                System.out.println(list.first().toString());
                System.out.println("the data is deleted successfully ");
                 return ;
            }else 
            {
                list.rotate();
            }
            
        }
        if(!check )
            {
                System.out.println("the data is not exit ");
            }
    }else{
            System.out.println("there is no data");}
       
      
    }
           public void printAllReserve()
       {
        p1.printPatientall();
        d1.printAllDoctor();
           
           int n=numberOfReserve();
           if(numberOfReserve() >0)
           {
           for (int i = 0; i <n ; i++)
           {
               list.first().toString();
               list.rotate();
           }
       }else
          {
              System.out.println("there is no data");
          }
       }
}
