package otherjavaprograms;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @ME-PC
 */
public class Alex {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args)throws IOException
      {
		
    	FileWriter fw = new FileWriter("callfile.call"); //here call file is another java file which is used to call.
		for (String s: args) 
		{			
            		fw.write("Channel: SIP/" + s + "@111.11.111.11\n" + "CallerID: \"0xy0600abcd\"<0xy0600abcd>\n" + "MaxRetries: 0\n" + "WaitTime: 35\n" + "Archive: yes\n" + "Account: " + s + "\n" + "Context: stcobd\n" + "Extension: s\n" + "Set: callerno=" + s + "\n" + "Set: audiofile=/var/lib/asterisk/sounds/xyz_content/ab/1_cd/1_PRIMARY/U_Prg_0903_004");
        	}  //added the audio file folder destination at the end
		fw.close();
    }
}
