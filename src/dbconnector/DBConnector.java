/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnector;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class DBConnector {

    

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = new Demo().connector();
        
        System.out.println("Please select what you want to do. Reply with");
        System.out.println("A: To add a new record");
        System.out.println("D: To delete/remove a record");
        System.out.println("U: To update a record");
        String reply;
        Scanner scanner = new Scanner(System.in);
        reply = scanner.nextLine();
        switch (reply){
            case "A":
               int student_no;
               String first_name, last_name, gender, programme;
                System.out.println("Your student number");
                student_no = scanner.nextInt();
                System.out.println("Your f name");
                first_name = scanner.nextLine();
                System.out.println("Your l name");
                last_name = scanner.nextLine();
                System.out.println("Your gender");
                gender = scanner.nextLine();
                System.out.println("Your programme");
                programme = scanner.nextLine();
                CrudOperations crudOperations = new CrudOperations();
                crudOperations.setStudent_no(student_no);
                crudOperations.setFirst_name(first_name);
                crudOperations.setLast_name(last_name);
                crudOperations.setGender(gender);
                crudOperations.setProgramme(programme);
               break;
            case "D":
                
                break;
            case "U":
                
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
        
    
    
}
