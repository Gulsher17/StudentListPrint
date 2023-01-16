/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2;

/**
 *
 * @author 14372
 */
public class Code {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] list=new Student[3];
        Student first1=new Student(); 
        first1.setName("Gulsher0");
        first1.setAge(20);
        
 
        Student first2=new Student(); 
        first2.setName("Gulsher1");
        first2.setAge(21);
        
 
        Student first3=new Student(); 
        first3.setName("Gulsher2");
        first3.setAge(22);
        
        list[0]=first1;
        list[1]=first2;
        list[2]=first3;
        for(int i=0;i<list.length;i++)
        {
    System.out.println(list[i].getName() + " "+list[i].getAge());
        }
    }
    
}
