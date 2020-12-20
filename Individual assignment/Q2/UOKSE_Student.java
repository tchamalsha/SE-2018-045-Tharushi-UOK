package com.company;

public class UOKSE_Student extends Student {
    private int num_exams;
    private int[] exams;

    public UOKSE_Student(String name, int num_exams) {
        super(name);
        this.num_exams = num_exams;
        this.exams = new int[num_exams];
    }

    public boolean addGrade(int exam,int grade)
    {
        if (exam<0 || exam>num_exams)
        {
            return false;
        }
        else {
            exams[exam]=grade;
            return true;
        }
    }
    public int getGrade(int exam)
    {
        if (exam<0 || exam>num_exams)
            return -1;
        else
            return exams[exam];
    }
    public String getName()
    {
        return super.getName();
    }

}
