import java.util.*;
// Student class
class Student
{
    // Having name and roll number
    String name;
    int rollNo;

    // Constructor 
    Student(String n, int r)
    {
        name = n;
        rollNo = r;
    }
    
    String getName()
    {
        return name;
    }
    int getRoll()
    {
        return rollNo;
    }
    public String toString()
    {
        return "(" + name + ", " + rollNo + ")";
    }
}

public class comparatorcomparing {
   public static void main(String[] args) {
       // Arrays of Students with name and rollNo
       Student arr[] = {new Student("abc", 120), 
       new Student("xyz", 110), 
       new Student("abc", 101)};

// Sorting first by name and then by rollNo
Arrays.sort(
arr, 
Comparator.comparing(
Student::getName).thenComparing(
   Student::getRoll));

// Displaying the Arrays
System.out.println(Arrays.toString(arr)); 
   } 
}
