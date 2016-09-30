package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Lasses World!" + "From GitExample" );
        
        App app = new App();
        app.greetMessage("Java8_Ex");
    }
    
    
    public String greetMessage(String name){
    	return "Hello" + name;
    }
}
