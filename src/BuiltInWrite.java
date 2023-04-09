/**
 * ICSI 311
 * Assignment 7
 * Ryan McSweeney
 * RM483514
 * 4/2/23
 */

import java.util.LinkedList;

public class BuiltInWrite extends FunctionNode{
    /**
     * getter method for the name of this function
     * @return "Write" as a string
     */
    public String getFunctionName(){
        return "Write";
    }

    /**
     * execute method for the Write functions
     * @param paramList parameters being passed into the function
     */
    public void execute(LinkedList<InterpreterDataType> paramList){
       //for each parameter in the list, prints out each one with a space in between
        for (InterpreterDataType interpreterDataType : paramList) {
            System.out.print(interpreterDataType.toString() + " ");
        }
        System.out.print("\n");
    }

    /**
     * Write method is variadic
     * @return true
     */
    public boolean isVariadic(){
        return true;
    }

    /**
     * toString for Write function
     * @return a string containing information about the function including its parameters and what it does
     */
    public String toString(){
        return "function Write\nParameters: a, b, c, ...\nprints the variables entered into console";
    }
}