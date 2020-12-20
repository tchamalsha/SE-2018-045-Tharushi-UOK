package com.company;

import java.util.SplittableRandom;

public class UOKSE_Course {
        private static int capacity;
        private UOKSE_Student[] roster;
        private static int enrolled=0;


    public UOKSE_Course(UOKSE_Student[] roster) {
        this.roster = new UOKSE_Student[capacity];
    }

    public boolean addStudent( String name, int num_exams )
    {
        if (enrolled<0 && enrolled>capacity)
        {
            roster[enrolled]=new UOKSE_Student(name,num_exams);
            enrolled++;
            return true;
        }
        else
            return false;

    }
    public UOKSE_Student findStudent( String name )
    {
        UOKSE_Student student=null;
        for (int i=0; i<=enrolled;i++)
        {
            if (roster[i].getName().equalsIgnoreCase(name))
                student= roster[i];

        }
        return student;
    }
    public double computeAverage(int exams)
    {
        if(exams<0 || enrolled==0)
        {
           return 0.0;
        }
        else
            return exams/enrolled;
    }
}
