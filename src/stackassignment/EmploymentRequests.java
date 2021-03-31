/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stackassignment;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ِABO-DALAL
 */
public class EmploymentRequests {
private String applicantName ;
private int applicantAge ;
private double salary ;
private char applicantGender; 
private String applicantJob ;
private Date applicationDate ;
private Boolean isMarried ;
private List <Children> childrens; 

    public EmploymentRequests() {
    }

    public EmploymentRequests(String applicantName, int applicantAge, double salary, char applicantGender, String applicantJob, Date applicationDate, Boolean isMarried,List<Children> children) {
        this.applicantName = applicantName;
        this.applicantAge = applicantAge;
        this.salary = salary;
        this.applicantGender = applicantGender;
        this.applicantJob = applicantJob;
        this.applicationDate = applicationDate;
        this.isMarried = isMarried;
           this.childrens=children;
 
    }
       public EmploymentRequests(String applicantName, int applicantAge, double salary, char applicantGender, String applicantJob, Date applicationDate, Boolean isMarried) {
        this.applicantName = applicantName;
        this.applicantAge = applicantAge;
        this.salary = salary;
        this.applicantGender = applicantGender;
        this.applicantJob = applicantJob;
        this.applicationDate = applicationDate;
        this.isMarried = isMarried;
 
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public int getApplicantAge() {
        return applicantAge;
    }

    public void setApplicantAge(int applicantAge) {
        this.applicantAge = applicantAge;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public char getApplicantGender() {
        return applicantGender;
    }

    public void setApplicantGender(char applicantGender) {
        this.applicantGender = applicantGender;
    }

    public String getApplicantJob() {
        return applicantJob;
    }

    public void setApplicantJob(String applicantJob) {
        this.applicantJob = applicantJob;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public Boolean isIsMarried() {
        return isMarried;
    }

    public void setIsMarried(Boolean isMarried) {
        this.isMarried = isMarried;
    }

    public List<Children> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<Children> childrens) {
        this.childrens = childrens;
    }

    @Override
    public String toString() {
        return "EmploymentRequests{" + "applicantName=" + applicantName + ", applicantAge=" + applicantAge + ", salary=" + salary + ", applicantGender=" + applicantGender + ", applicantJob=" + applicantJob + ", applicationDate=" + applicationDate + ", isMarried=" + isMarried + ", childrens=" + childrens + '}';
    }

    void getApplicantGender(char applicantGender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
