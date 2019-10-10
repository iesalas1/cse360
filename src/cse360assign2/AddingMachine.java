/*
Isaac Salas
CSE360 Mon 9:40am-10:30am
Assignment 1
This package contains a AddingMachine.
 */
package cse360assign2;

/*
This class is an adding machine which has an int total, a constructor
getTotal, and 4 methods that act as operators of the adding machine. 
 */
public class AddingMachine 
{
    //**Data**

    private int total; //This is the current total of the adding machine
    
    //This is a string that keeps a history of the transactions made to 
    //be returned by the toString method
    private String equation;

    //**Constructor**
    public AddingMachine() 
    {
        this.total = 0;  // not needed - included for clarity
        this.equation = "0"; //always begins with intial 0 value
    }
    //**Methods**
    
    public int getTotal() //Returns total 
    {
        return total;
    }
    
    public void add(int value) //this is the '+' operator
    {
        total = total + value;
        equation += " + " + value;
        
    }
   
    public void subtract(int value)  //this is the '-' operator
    {
        total = total - value;
        equation += " - " + value;
    }
    
    public String toString() //returns a string of the equation	
    {
        return equation;
    }
   
    public void clear()  //clears the current equation
    {
        total = 0;
        equation = "0";
    }
}
