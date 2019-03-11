package javaaudioplayer2;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.SourceDataLine;

public class AudioOutput {
    public AudioOutput(){
    }
    
    //##### method 4: play audio file
    public void play(AudioInputStream audioInputStream, SourceDataLine sLine, AudioFormat audioFormat){
        
        try {
            sLine.open(audioFormat);
        } catch (Exception e){
            e.printStackTrace();
        }
        sLine.start();
        System.out.println("Line Started"); 
        
        try {
            byte bytes[] =  new byte[1024];
            int bytesRead = 0;
            int loop = 0;

            while ( (bytesRead=audioInputStream.read(bytes, 0, bytes.length))!= -1) {
                
                //getVolumeLevel(bytes);
        
                try {
                    sLine.write(bytes, 0, bytesRead); //playing the audio file
                    System.out.println(loop);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                loop+=1;
            }
            System.out.println("No bytes anymore !");

        } catch (Exception e) {
            e.printStackTrace();
        }       
        System.out.println("Line stopped"); 
    }    
}
