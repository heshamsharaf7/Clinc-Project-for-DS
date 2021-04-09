/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reservation;

import Doctor.DoctorControl;
import Patient.PatientControl;
import java.util.Scanner;

/**
 *
 * @author Khaled
 */
public class ReserveControl {
     CircularQueue<Reservation> list= new CircularQueue<>();
     Scanner input =new Scanner(System.in);
      public boolean isEmpty(){return list.isEmpty();}
       public int numberOfReserve()
    {
        return list.size();
    }
       public void addReserve(){
        PatientControl p1=new PatientControl();
        DoctorControl d1=new DoctorControl();
        p1.addPatient();
        d1.addDoctor();
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
           public void printPatientall()
       {
        
           
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
