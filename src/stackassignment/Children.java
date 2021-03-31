/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stackassignment;

/**
 *
 * @author ِABO-DALAL
 */
public class Children {
  String name ; 
 int age ;
char gender ; 

    public Children() {
        this.name = "not found";
        this.age = 0;
        this.gender = 'M';
    }

    public Children(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Children{" + "name=" + name + ", age=" + age + ", gender=" + gender + '}';
    }
 
}
