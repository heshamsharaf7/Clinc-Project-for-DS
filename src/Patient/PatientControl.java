/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patient;

import Utilty.CircularlyLinkedList;
import java.util.Scanner;

/**
 *
 * @author Hesham
 */
public class PatientControl {
    // deeclare the list and thr scanner 
    CircularlyLinkedList<Patient> list=new CircularlyLinkedList<>();
    Scanner input =new Scanner(System.in);
    
    
    //function to add patient to the list 
      public void addPatient()
    {
        Patient p=new Patient();
        System.out.println("enter the Patient id pls:");
       p.setId(input.nextInt());
       System.out.println("enter the Patient name pls:");
       p.setName(input.nextLine());
       p.setName(input.nextLine());
       System.out.println("enter the Patient address pls:");
       p.setAddress(input.nextLine());
       
       list.addLast(p);
       
      
    }
      
      //function to remove the specific patient by his/her id
      
        public void removePatient(int id)
    {
        if(nuberOfPatient()>0){
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
        
        //function to get the size of the list
      public int nuberOfPatient()
    {
        return list.size();
    }
      
      //function to print the specific patient by his/her id
      
        public void printPatient(int id)
    {
        if(nuberOfPatient()>0){
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
      
      // function to print all the data in the list 
       public void printPatientall()
       {
        
           
           int n=nuberOfPatient();
           if(nuberOfPatient() >0)
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
