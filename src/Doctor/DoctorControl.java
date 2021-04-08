/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doctor;


import java.util.Scanner;

import Patient.Patient;
import Utilty.CircularlyLinkedList;

/**
 *
 * @author Hesham
 */
public class DoctorControl {
    CircularlyLinkedList<Doctor> list=new CircularlyLinkedList<>();
   Scanner input =new Scanner(System.in);
    public void addDoctor()
    {
       Doctor d=new Doctor();
       System.out.println("enter the doctor id pls:");
       d.setId(input.nextInt());
       System.out.println("enter the doctor name pls:");
       d.setName(input.nextLine());
        d.setName(input.nextLine());
       System.out.println("enter the doctor address pls:");
       d.setAddress(input.nextLine());
       System.out.println("enter the doctor qualfication pls:");
       d.setQualfication(input.nextLine());
       System.out.println("enter the doctor hiredDate pls:");
       d.setHiredDate(input.nextLine());
       
        list.addFirst(d);
        
    }
    
    
      public void removeDoctor(int id)
    {
        if(NuberOfDoctor()>0){
        boolean check=false;
        while(!check)
        {
            if(list.first().getId()==id)
            {
                check=true;
                list.removeFirst();
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
    public int NuberOfDoctor()
    {
        return list.size();
    }
     public void printDoctor(int id)
    {
        if(NuberOfDoctor()>0){
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
     
      public void printAllDoctor()
       {
        
           
           int n= NuberOfDoctor();
           if( NuberOfDoctor() >0)
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
    

