package jpa.demoupdate.demoupdate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpa.demoupdate.demoupdate.entety.StudentEntity;

public class Updatestudent {  
      
    public static void main(String args[])  	    {  
		        EntityManagerFactory emf=Persistence.createEntityManagerFactory("student_update");  
		        EntityManager em=emf.createEntityManager();  
		          
		      
		          
		        StudentEntity s=em.find(StudentEntity.class,102);  
		        System.out.println("Before Updation");  
	       System.out.println("Student id = "+s.getId());  
		        System.out.println("Student Name = "+s.getName());  
		        System.out.println("Student Age = "+s.getAge());  
	          
		        s.setAge(30);  
          
	        System.out.println("After Updation");  
	        System.out.println("Student id = "+s.getId());  
		        System.out.println("Student Name = "+s.getName());  
	        System.out.println("Student Age = "+s.getAge());  
		          
		          
	    }  
	  
		}
