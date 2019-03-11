package javaaudioplayer2;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
    
    //Put the targetted Audio File into " "
    public static String audioFile = "ab.wav";
      
    public static void main(String[] args) throws UnsupportedAudioFileException {   
        
        //Get the File Format
        AudioFileFormat aud = null;
        try {
            aud = AudioSystem.getAudioFileFormat(new File(audioFile));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        AudioFormat af = aud.getFormat();
        System.out.println("The Audio Format is: " + af.toString());
               
        //***** 
        //Call takeInput Method from AudioInput class  
        
        //* Create Object of audioInput
        AudioInput audioInput = new AudioInput();
        //Call takeInput Method
        byte[] audioBytes = audioInput.takeInput(audioFile);
        
        //***** 
        //Call info method from ByteProcessor class    
        
        //* Create Object of byteProcessor
        ByteProcessor byteProcessor = new ByteProcessor();
        //Call getAudioFormat Method
        AudioFormat audioFormat = byteProcessor.getAudioFormat();
        //Call process Method
        AudioInputStream audioInputStream = byteProcessor.process(audioBytes);
        //Call info Method
        SourceDataLine sourceDataLine = byteProcessor.info();
                        
        //*****
        //Call play method from ByteProcessor class
        
        //* Create Object of audioOutput
        AudioOutput audioOutput = new AudioOutput();
        audioOutput.play(audioInputStream, sourceDataLine, audioFormat);
    }
}
