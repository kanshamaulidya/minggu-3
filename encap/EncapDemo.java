/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encap;

/**
 *
 * @author HP
 */
public class EncapDemo {
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if(newAge < 18 || newAge > 30 ){
            System.out.println("Tidak memenuhi syarat");
        }else{
            age = newAge;
        }
    }
}
