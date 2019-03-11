package javaaudioplayer2;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class AudioInput {   
    public AudioInput(){
    }
    public byte[] takeInput(String audioFile){
        byte[] audioBytes = null;
        
        /// Converting WAV audio file to byte code
        try {
            File file = new File(audioFile);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));

            int read;
            
            byte[] buff = new byte[1024];
            while ((read = in.read(buff)) > 0) {
                out.write(buff, 0, read); 
            }
            out.flush(); //flush to refresh

            audioBytes = out.toByteArray();
            System.out.println(audioBytes.length);
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return audioBytes;
    } 
}
