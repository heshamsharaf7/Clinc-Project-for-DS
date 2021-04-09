
import Doctor.DoctorControl;
import Patient.PatientControl;
import Doctor.DoctorControl;
import Reservation.ReserveControl;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hesham
 * @author Ameen
 * @author Khaled
 * @author Mohaned
 * @author eisa
 */
public class TestClass {
    public static void main(String[] args) {
        PatientControl p=new PatientControl();
        DoctorControl d=new DoctorControl();
        ReserveControl r=new ReserveControl();
        r.addReserve();
        r.printPatientall();
        
        p.addPatient();
          p.addPatient();
            p.addPatient();
        p.printPatientall();
        
       p.removePatient(1);
       
       p.printPatientall();

//        
//        d.addDoctor();
//       
//      d.addDoctor();
//         d.addDoctor();
//        d.printAllDoctor();
//        d.removeDoctor(3);
//         d.printAllDoctor();
        
    }
    
}
