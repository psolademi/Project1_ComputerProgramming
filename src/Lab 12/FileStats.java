import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class FileStats
{
    public static void main(String args[])
    {
//To create a file chooser object
        final JFileChooser file_chooser = new JFileChooser();
//To show dialog to select file
        int returnVal = file_chooser.showOpenDialog(null);
//To get selected file
        File file=file_chooser.getSelectedFile();
//To variable to store data
        int line_count=0;
        int word_count=0;
        int character_count=0;
        String line="";
        try {
//TO create a scanner to read from file
            Scanner read=new Scanner(file);
//To keep on reading untill the file is empty
            while(read.hasNextLine())
            {
                line=read.nextLine();
//TO split line by spaces
                String words[]=line.split(" ");
//TO update counts
                character_count=character_count+line.length();
                word_count=word_count+words.length;
                line_count=line_count+1;
            }
        } catch (FileNotFoundException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
//To display stats
        System.out.printf("file name: %s \n character count: %d \n word count: %d \n line count: %d \n",file.getName(),character_count,word_count,line_count);
    }
}