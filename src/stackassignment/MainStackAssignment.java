/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackassignment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ِABO-DALAL
 */
public class MainStackAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // © HarounTaHa https://github.com/HarounTaHa
        
        Scanner inputs = new Scanner(System.in);       
        EmploymentRequests employmentRequests, employmentRequests2;
        StackEmploymentRequests<EmploymentRequests> employmentRequestsStack
                = new StackEmploymentRequests<>();

//   ------------------------------------------------------
        employmentRequests = new EmploymentRequests("haroun",
                33, 350.2,
                'M',
                "Developer",
                new Date(),
                true);
        List<Children> childrens = new ArrayList<>();
        childrens.add(new Children());
        employmentRequests.setChildrens(childrens);
//   --------------------------------------------
        employmentRequests2 = new EmploymentRequests("Mosab",
                33, 5250.2,
                'M',
                "Developer",
                new Date(),
                true);
        List<Children> childrens_2 = new ArrayList<>();
        childrens_2.add(new Children());
        employmentRequests2.setChildrens(childrens_2);
//     -------------------------------------------------------

        employmentRequestsStack.push(employmentRequests);
        employmentRequestsStack.push(employmentRequests2);

//----------------------------------------------------------
        int size = employmentRequestsStack.getSize();
        System.out.println("Size: " + size);
//---------------------------------------------------------------
        int input;
        do {

            System.out.println("==================================================\n"
                    + "Employment requests Menu\n"
                    + "==================================================");

            System.out.println("==================================================\n"
                    + "1. Add items\n"
                    + "\n"
                    + "2. Delete items\n"
                    + "\n"
                    + "3. Show the number of items\n"
                    + "\n"
                    + "4. Show min and max items\n"
                    + "\n"
                    + "5. Find an item\n"
                    + "\n"
                    + "6. Print all items\n"
                    + "\n"
                    + "7. Exit"
                    + "\n"
                    + "==================================================");
            System.out.println("Enter Number 1to7 : ");
            
            
            input = inputs.nextInt();
            switch (input) {
                case 1:
//                    1. Add items in Stack
                    System.out.println("Enter applicantName :");
                    String applicantName = inputs.next();
                    System.out.println("Enter applicantAge :");
                    int age = inputs.nextInt();
                    System.out.println("Enter salary :");
                    double salary = inputs.nextDouble();
                    System.out.println("Enter applicantGender:");
                    char applicantGender = inputs.next().charAt(0);
                    System.out.println("Enter applicantJob :");
                    String applicantJob = inputs.next();
                    System.out.println("Enter isMarried true/false:");
                    boolean isMarried = inputs.nextBoolean();
                    System.out.println("do you hava childrens true/false:");
                     List<Children> children= new ArrayList<>();
                     boolean havaChildrens = inputs.nextBoolean();
                     if(havaChildrens){
                         System.out.println("Enter name children:-");  
                       String nameChildren = inputs.next();
                        System.out.println("Enter age children:-");  
                       int ageChildren = inputs.nextInt();
                        System.out.println("Enter gender children:-");  
                       char childrenGender = inputs.next().charAt(0);
                       children.add(new Children(nameChildren, ageChildren, childrenGender));                   
                  
                     }else{
                     children.add(new Children());
                     }
          employmentRequestsStack.push( new EmploymentRequests(applicantName, age, salary, applicantGender, applicantJob, new Date(), isMarried,children));
                    break;
                case 2:
                    //remove Last Employment Requests because ADT use Stack
                    EmploymentRequests temp= employmentRequestsStack.pop();
                    System.out.println("OK DELETED : "+"\n"+temp);
                    break;
                case 3:
//                    3. Show the number of items
                  int  numberOfItems = employmentRequestsStack.getSize();
                    System.out.println("Number Of Items : "+numberOfItems);
                    break;
                case 4:
//                    4. Show min and max items
                 List<EmploymentRequests>  itemsMaxAndMis =  employmentRequestsStack.getretriveItems();
                 double max= itemsMaxAndMis.get(0).getSalary();  
                 double min= itemsMaxAndMis.get(0).getSalary();  
                 for (int i = 0; i < itemsMaxAndMis.size(); i++) {
                        if(itemsMaxAndMis.get(i).getSalary() > max){
                                 max = itemsMaxAndMis.get(i).getSalary();
                        }else{
                                 min = itemsMaxAndMis.get(i).getSalary();
                        }
                    }
            
                    
                    System.out.println("MAX Sallary in Stack is :"+max);
                    System.out.println("MIN Sallary in Stack is :"+min);
                    break;
                case 5:
//                    5. Find an item
                 System.out.println("Enter applicantName :");
                String NameFound = inputs.next().toLowerCase();
                 List<EmploymentRequests>  items =  employmentRequestsStack.getretriveItems();
                    for (int i = 0; i < items.size(); i++) {
                        if(items.get(i).getApplicantName().toLowerCase().equals(NameFound)){
                            System.out.println("Founded : "+items.get(i));
                        }
                    }
         
                    break;
                case 6:
//                  ---------6. Print all items-------------------
                     List<EmploymentRequests>  allItems  =  employmentRequestsStack.getretriveItems();
                   for(EmploymentRequests item:allItems){
                         System.out.println(item);
                    }
                
                    break;
                default:
                    System.out.println("Enter Valid Number 1-7");
            }

        } while (input != 7);

    }

}
