#Create a UOKSE Class (10 Points)

For this assignment, you will create a Java class named UOKSE. This program can be used to
manage this SENG 12233 course. Your task is to extend the base Student class definition
(below) and customize it for SENG 12233 students. Next, you will create a new class definition
which will manage all SENG 12233 students in this course. So, your program will have the
following classes:
1. Student (already written for you as a base class)
2. UOKSE_Student (extends Student, you will have to write this)
3. UOKSE_Course (manages all UOKSE_Student objects, you will have to write this)

Here are the methods needed for UOKSE_Student:

Constructor: public UOKSE_Student( String name, int num_exams )
Create an int array exams[num_exams] which will hold all exam grades for a student
Save num_exams for later error checking
public boolean addGrade( int exam, int grade )
Save a grade in the exams[ ] array at index exam
If exam is out of range, return false (Note: exams are numbered 1,2,3,....)
If OK, save the grade in exams[ ] array and return true
public int getGrade( int exam )
Return grade saved in exams[ ] array at index exam
If exam is out of range, return -1
If OK, return grade from exams[ ] array
public String getName( )
Return student name

Here are the methods needed for UOKSE_Course:

Constructor, create a class of (int capacity) UOKSE_Students
Use an array: roster[ ] of size capacity to hold the UOKSE_Student objects
Also, save the capacity as a class variable and set an enrolled class variable to 0
public boolean addStudent( String name, int num_exams )
Creates a new UOKSE_Student( name, num_exams ) object and add to the roster[ ] array
Check to see if there is space for the new student, if no room, return false
Create a new UOKSE_Student object and add to the roster[ ] array, return true
public UOKSE_Student findStudent( String name )
Find student with name and return object
If student cannot be found, return null
public double computeAverage( int exam )
Compute and return the course average on a specific exam ( that is, 1, 2, …) for all the students
Check for divide by 0 and other errors

main( )

Create a UOKSE_Course of 30 students
Add two (2) students: Sally Smarty and Phil Phailure, each with 3 exams
Search for these two students and give them a grade of 100 and 60 respectively on exam 1
Output the average of the class on exam 1
