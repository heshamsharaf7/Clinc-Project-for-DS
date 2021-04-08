/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doctor;

import java.util.LinkedList;
import java.util.Scanner;
import DataStuctureClasses.DoublyLinkedList;

/**
 *
 * @author Hesham
 */
public class DoctorControl {
   public   LinkedList<Doctor> list= new LinkedList<>();
   DoublyLinkedList link=new DoublyLinkedList<>();
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
       
        list.add(d);
        
    }
    
    
    public boolean removeDoctor(int id)
    {
        return true;
       
    }
    public int NuberOfDoctor()
    {
        return list.size();
    }
    public void PrintDoctor()
    {
       int n=NuberOfDoctor();
        for (int i = 0; i <n ; i++) {
            System.out.println(list.getFirst().toString());
            list.iterator();
        }
        
    }
    }

