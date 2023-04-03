/**
 * ICSI 311
 * Assignment 7
 * Ryan McSweeney
 * RM483514
 * 4/2/23
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class ProgramNode extends Node{
    /**
     * hash map for the program
     */
    private HashMap<String, FunctionNode> functions;
    /**
     * linked list containing function names in the program
     */
    private LinkedList<String> functionNames = new LinkedList<String>();

    /**
     * constructor for a new program node
     */
    public ProgramNode(){
        this.functions = new HashMap<String, FunctionNode>();
    }

    /**
     * method that adds a function to the program node
     * @param func function being added to the program node
     */
    public void addFunction(FunctionNode func){
        functionNames.add(func.getFunctionName());
        functions.put(func.getFunctionName(), func);
    }

    /**
     * to string method for the program node
     * @return a string representation of the functions inside of the program node
     */
    public String toString() {
        String s = "\nFunctions: \n";

        for(int i = 0; i < functionNames.size(); i++){
            s += "\n" + functions.get(functionNames.get(i));

            s += "\n";
        }

        return s;
    }
}
