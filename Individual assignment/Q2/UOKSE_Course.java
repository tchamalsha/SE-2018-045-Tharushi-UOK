package com.company;

import java.util.SplittableRandom;

public class UOKSE_Course {
        private static int capacity;
        private UOKSE_Student[] roster;
        private static int enrolled;


    public UOKSE_Course(int capacity) {
        this.capacity=capacity;
        this.roster = new UOKSE_Student[this.capacity];
        this.enrolled=0;
    }

    public boolean addStudent( String name, int num_exams )
    {
        if (enrolled>=0 && enrolled<capacity)
        {
            this.roster[enrolled]=new UOKSE_Student(name,num_exams);
            enrolled++;
            return true;
        }
        else
            return false;

    }
    public UOKSE_Student findStudent( String name )
    {
        for(UOKSE_Student student:this.roster)
        {
            if (student.getName().equalsIgnoreCase(name))
            {
                return student;
            }
        }
        return null;
    }
    public double computeAverage(int exams)
    {
        double average=0;
        int grade=0;
        for(int i=0;i<=enrolled;i++)
        {
            UOKSE_Student student=this.roster[i];
            grade =grade+student.getGrade(exams);
        }
        try{
            average=(double) grade/enrolled;
            return average;
        }catch (ArithmeticException e)
        {
            System.out.println("Error!!");
            return 0;
        }
    }
    //main method
    public static void main(String[] args) {
        //creating the course
        UOKSE_Course uokseCourse=new UOKSE_Course(30);
        //adding students
        uokseCourse.addStudent("Sally smarty",3);
        uokseCourse.addStudent("Phil Phaliure",3);

        //searching for students
        try{
            uokseCourse.findStudent("Sally smarty").addGrade(1,100);
            uokseCourse.findStudent("Phil Phaliure").addGrade(1,60);
        }
        catch (Exception e)
        {
            System.out.println("Something is not right!!");
        }


        //average calculation
        double average=uokseCourse.computeAverage(1);
        System.out.println("The average of the exam 1 is "+average);
    }
}
