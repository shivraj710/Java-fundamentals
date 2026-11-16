import java.io.*;
import java.util.*;

class FileAnalysis
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name:");
        FileReader fr = new FileReader(sc.nextLine());

        int ch, chars = 0, words = 0, lines = 0;

        while((ch = fr.read()) != -1)
        {
            chars++;

            if(ch == ' ')
                words++;

            if(ch == '\n')
                lines++;
        }

        fr.close();

        System.out.println("Characters: " + chars);
        System.out.println("Words: " + (words + 1));
        System.out.println("Lines: " + (lines + 1));
    }
}

