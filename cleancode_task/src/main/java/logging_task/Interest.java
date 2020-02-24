package logging_task;
import simpleandcompoundinterest.*;
import java.io.*;
public class Interest {
	public static void main(String args[]) 
	{
		SIandCI si=new SIandCI();
		si.readsiandciparameters();
		si.simpleinterest();
		si.compoundinterest();
	}

}
