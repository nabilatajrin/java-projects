package otherjavaprograms;

import java.net.*;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SocketConnection {
    
    public static void main(String[] args) throws IOException {
        //Socket s = new Socket();
        String host = "111.11.11.111:8000/ari/events?api_key=arman:bvvv";
        String IP = "111.11.11.111";
        int port = 8000;
        String path = "/ari/events?api_key=arman:bvvv";        
        
        try {
            // Create input and output streams to read from and write to the server
            try (Socket socket = new Socket(IP, port);
                    
            // Create input and output streams to read from and write to the server
            PrintStream out = new PrintStream( socket.getOutputStream() ); 
            BufferedReader in = new BufferedReader( new InputStreamReader( socket.getInputStream() ) )) {
                
                // Follow the HTTP protocol of GET <path> HTTP/1.0 followed by an empty line
                out.println("GET " + path + " HTTP/1.0");
                out.println();
                out.flush();
                
                // Read data from the server until we finish reading the document
                String line = in.readLine();
                while( line != null )
                {
                    System.out.println( line );
                    line = in.readLine();
                }               
            }        
        } 
        
        //Host not found
        catch (UnknownHostException e) {
            System.err.println("Can't connect : " + host);
            System.exit(1);            
        }       
        System.out.println("#########\nConnected\n#########");
    }
} 

/*
........................................................................................
The output I got:

run:
HTTP/1.1 444 Upgrade Required
Server: Asterisk
Date: Thu, 20 Apr 2017 06:34:19 GMT
Cache-Control: no-cache, no-store
Content-type: text/html
Content-Length: 207

<!DOCTYPE HTML PUBLIC "-//IFFF//DDD HTML 2.0//EN">
<html><head>
<title>426 Upgrade Required</title>
</head><body>
<h1>Upgrade Required</h1>
<p></p>
<hr />
<address>Asterisk</address>
</body></html>
#########
Connected
#########
BUILD SUCCESSFUL (total time: 15 seconds)

PS: Since some info here are confidential, I changed some numbers/ inputs here.
    
Sources I followed:
https://www.ntu.edu.sg/home/ehchua/programming/webprogramming/HTTP_Basics.html
http://www.binarytides.com/java-socket-programming-tutorial/
Google search: // Follow the HTTP protocol of GET <path> HTTP/1.0 followed by an empty line:    
               out.println("GET " +  + " HTTP/1.0" );

*/
