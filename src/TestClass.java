
import Doctor.DoctorControl;
import Patient.PatientControl;
import Doctor.DoctorControl;
import Reservation.ReserveControl;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hesham
 * @author Ameen
 */
public class TestClass {
    public static void main(String[] args) {
       PatientControl p=new PatientControl();
        DoctorControl d=new DoctorControl();
        ReserveControl r=new ReserveControl();
       // r.addReserve();
       // r.printReserveall();
        
      //  p.addPatient();
      //    p.addPatient();
     //       p.addPatient();
      //  p.printPatientall();
        
     //  p.removePatient(1);
       
     //  p.printPatientall();

//        
//        d.addDoctor();
//       
//      d.addDoctor();
//         d.addDoctor();
//        d.printAllDoctor();
//        d.removeDoctor(3);
//         d.printAllDoctor();
        //PatientControl p=new PatientControl();
      // DoctorControl d= new DoctorControl();
       
       Scanner sc = new Scanner(System.in);
        int choice;
       do{
       
        System.out.println("Choose from the list");
       //  System.out.println("1- Doctor");
        // System.out.println("2- Patient");
           System.out.println("1- Doctors");
              System.out.println("2- Add Doctor");
             System.out.println("3- Remove Doctor");
              System.out.println("4- Patients");
              System.out.println("5- Add Patient");
              System.out.println("6- Remove Patient");
               System.out.println("7- Reservation");
                System.out.println("8- Add Reserve");
                 System.out.println("9- Remove Reserve");
                System.out.println("10- Exit");
            
             
              choice = sc.nextInt();
              switch(choice){
                  case 1:
                   
                     
      d.printAllDoctor();
      break;
      case 2:
           d.addDoctor();
        
            break;
            case 3:
                  d.removeDoctor(1);
              
             
                 break;
                 case 4:
                       p.printPatientall();
               
                    break;
                     case 5:
                         
                          p.addPatient();
                           break;
                            case 6:
                                   p.removePatient(1);  
                            break;
                             case 7:
                                   r.printAllReserve();
                            break;
                             case 8:
                                   r.addReserve();  
                            break;
                             case 9:
                                   r.deleteReserve(81);  
                            break;
              }
       } while(choice !=10);
        
    }
    
}
