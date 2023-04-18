/**
 * ICSI 311
 * Assignment 9
 * Ryan McSweeney
 * RM483514
 * 4/17/23
 */

import java.util.LinkedList;

public abstract class BuiltIn extends FunctionNode{

    public boolean isBuiltIn(){
        return true;
    }

    public abstract void execute(LinkedList<InterpreterDataType> parameterList);

    public abstract boolean isVar(int paramNumber);

}
