package javaaudioplayer2;

import java.io.ByteArrayInputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

public class ByteProcessor {
    
    AudioInputStream audioInputStream = null ;
    AudioFormat audioFormat = null;
    SourceDataLine sLine = null;
    
    //Create constructor of ByteProcessor
    public ByteProcessor(){
        audioFormat = new AudioFormat(8000, 16, 1, true, false);
    }
    
    //##### method 1: getAudioFormat
    public AudioFormat getAudioFormat(){
        return audioFormat;
    }
    
    //##### method 2: process
    public AudioInputStream process(byte[] audioBytes){     
        ByteArrayInputStream bis = new ByteArrayInputStream(audioBytes);    
        audioInputStream = new AudioInputStream(bis, audioFormat, audioBytes.length); 
              
        return audioInputStream;
    }
    
    //##### method 3: info
    public SourceDataLine info(){
    DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);    
        try  {
            //System.out.println(info);
            sLine=(SourceDataLine) AudioSystem.getLine(info);
            System.out.println(sLine.getLineInfo());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return sLine;
    }
}
