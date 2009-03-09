package Parser;

import javax.swing.JTextArea;

public class SlkLog {

	
	
	public SlkLog (){
		
	}
		
	public void trace (String  message){
		System.out.print ( message );
	
	}

	public void trace_depth (String message, int depth){
	    int i;
	    for (i=0; i<depth; ++i){
	        System.out.print ("    ");
	    	
	    }
	    System.out.print (message);
	   
	}

	public void trace_production (short production_number){
	    System.out.print (SlkString.GetProductionName (production_number) );
	    System.out.print ("\n");
		
	}

	public void trace_action(short  action_number){
	    System.out.print ("\n");
	    System.out.print (SlkString.GetSymbolName (action_number));
	    System.out.print ("\n\n");
	    
	}
};

