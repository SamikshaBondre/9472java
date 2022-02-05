package jpa.demofind.demofind;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jpa.demofind.demofind.entity.StudentEntity;

public class StudentFind {  
    public static void main(String args[])  
    {  
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_Find");  
        EntityManager em=emf.createEntityManager();  
          
      
          
        StudentEntity s=em.find(StudentEntity.class,103);  
          
        System.out.println("Student id = "+s.getId());  
        System.out.println("Student Name = "+s.getName());  
        System.out.println("Student Age = "+s.getAge());  
          
    }  
}
