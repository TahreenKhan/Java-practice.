// Create a class student with attributes rno, name , age and class. Initialize values
// through parameterize constructor. If age of student is not in between 15 to 21 then
// generate user defined exception as "InvalidAgeException". Similarly if name contains
// special symbols or digits then raise exception as "InvalidNameException". Handle these
// exceptions.


import java.io.*;

class InvalidAgeException extends Exception 
{
    InvalidAgeException(String msg)
    {
        super(msg);
    }
}
class InvalidNameException extends Exception
{
    InvalidNameException(String msg)
    {
        super(msg);
    }
}
class Student
{
    String name;
    int age;
    int Class;
    int roll_no;

    Student(String n, int a, int c, int rn)throws InvalidAgeException, InvalidNameException
    {
        name = n;
        for(int i = 0; i<n.length();i++)
        {
            if(!Character.isLetter(n.charAt(i)))
            {
                throw new InvalidNameException("The Name Should contain only alphabets, no other character allowed.");
            }
        }
        age = a;
        if(age<15 || age>21)
        {
            throw new InvalidAgeException("Age Should be between 15 and 21.");
        }
        Class = c;
        roll_no = rn;
    }

}

public class problem48
{
    public static void main(String[] args)
    {
        try
        {
        Student s1 = new Student("Rakesh", 21, 15, 567);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}