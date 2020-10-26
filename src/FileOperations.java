
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileOperations {
    public ArrayList<Word> getFile(){
        File file = new File("words.txt");
        ArrayList<Word> wordList = new ArrayList<Word>();
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(file));
            Object[] lines = bReader.lines().toArray();
            for (Object line : lines){
                String currentLine = line.toString().trim();
                String[] seperator = currentLine.split("/");
                wordList.add(new Word(seperator[0],seperator[1],seperator[2]));
                
            }



        } catch (Exception ex) {
            Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return wordList;
    }   
}
