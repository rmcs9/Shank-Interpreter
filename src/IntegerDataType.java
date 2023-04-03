/**
 * ICSI 311
 * Assignment 7
 * Ryan McSweeney
 * RM483514
 * 4/2/23
 */

public class IntegerDataType extends InterpreterDataType{

    private int value;

    /**
     * constructor for an integer data type
     * @param input integer being passed in
     */
    public IntegerDataType(int input){
        this.value = input;
    }

    /**
     * toString method for IntegerDataType
     * @return the integer held in this object, as a String
     */
    public String toString(){
        return Integer.toString(this.value);
    }

    /**
     * fromString method
     * @param input string input being passed into the object
     */
    public void fromString(String input){
        this.value = Integer.parseInt(input);
    }

    /**
     * getter method for the data in this object
     * @return the data in this object as an Object
     */
    public Object getData(){
        return this.value;
    }

    /**
     * setter method for the data in this object
     * @param data integer being passed in
     */
    public void setData(int data){
        value = data;
    }
}
