

import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args){
        String[]words= {"Test","Test1","Test2"};
        printWords(words);
words=addWords(words);
printWords(words);
    }

    public static String[] addWords(String[] words)
    {
String[]moreWords=new String[words.length+1];
for(int i=0; i<words.length; i++){
    moreWords[i]=words[i];
}
Scanner in = new Scanner(System.in);
System.out.println("New word:");
moreWords[moreWords.length-1]=in.nextLine();
return moreWords;

    }
    public static void printWords(String[] words){
        for(int i=0; i<words.length; i++){
            System.out.println( words[i]);
        }
    }
    }
    
    



