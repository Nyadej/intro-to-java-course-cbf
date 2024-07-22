package com.cbfacademy;

/* exception = an event that occurs during the execution of a program that, 
disrupts the normal flow of instructions */

public class FilenameException extends Exception { //exception class is the parent class for the child FilenameException 
    public FilenameException(String message) { //If the above exception is shown, a message is passed 
        super(message); //message thats passed in is sent to the super constructor for the exception class, that will handle exceptions like it normally does 
    }
}


