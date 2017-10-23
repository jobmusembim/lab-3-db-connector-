/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class CrudOperations {
    private int student_no;
    private String first_name;
    private String last_name;
    private String gender;
    private String programme;
//setter
    public void setStudent_no(int student_no) {
        this.student_no = student_no;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setProgramme(String programe) {
        this.programme = programe;
    }
//getter
    public int getStudent_no() {
        return student_no;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getGender() {
        return gender;
    }

    public String getProgramme() {
        return programme;
    }
    //methods
    public int processGender(String g){
        if(g.equalsIgnoreCase("male")){
            return 1;
        }
        return 0;
    }
    public boolean save(){
        PreparedStatement pst = null;
        Connection con = new Demo().connector();
       try{
        pst = con.prepareStatement("INSERT INTO student details (student_id, first_name, last_name, gender, degree_programme) VALUES(?,?,?,?,?)");
            pst.setInt(1,getStudent_no());
            pst.setString(2, getFirst_name());
            pst.setString(3,getLast_name() );
            pst.setInt(4, processGender(getGender()));
            pst.setString(5, getProgramme());
            pst.executeUpdate();
                    }catch (SQLException ex){
    System.out.println("Error"+ ex.getMessage());
}


        return true;
    }
    public boolean removeRecord(){
        return true;
       
    }
    public boolean updateRecord(){
        return true;
    }
}
