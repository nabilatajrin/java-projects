# Play-WAV-Audio-File-using-Java
This project is just to play WAV/ PCM audio file using Java. This project splitted a whole program into different multiple methods, so that we can use any of these method in any kind of project. 

Get the WAV audio file format:

      //Get the File Format
      AudioFileFormat aud = null;
      try {
          aud = AudioSystem.getAudioFileFormat(new File(audioFile));
      } catch (IOException ex) {
          Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      }

      AudioFormat af = aud.getFormat();
      System.out.println("The Audio Format is: " + af.toString());

Change the audio format to be compatible with the player:

    public ByteProcessor(){
        audioFormat = new AudioFormat(8000, 16, 1, true, false);
    }
    
If the WAV audio file format matches the values of ByteProcessor constructor, it should play the WAV audio file perfectly.
