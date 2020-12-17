import java.util.*;
import java.lang.*;

public class Syllables{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word;
        String[] dict = {"ae","ea","ou","io","oa","ao","ee","aa", "ie", "oo"}; // dictionary of vowels
        String[] wrdend = {"te","ke","ce","ne","se"}; // ends of words.

        while(sc.hasNextLine() && !(word = sc.nextLine()).equals("0")){ // 0 to exit loop

            if(word == "0") return;
            word = word.toLowerCase();

            char[] wordArray = word.toCharArray();
            int syllables = 0;

            for(char a:wordArray){ //counts all vowels
                if((a == 'a') || (a == 'e') || (a == 'i') || (a == 'o') || (a == 'u') || (a == 'y')){
                    syllables++;
                }
            }

            for(String a: dict){ // filters out two vowels next to each other
                if(word.contains(a)){
                    syllables--;
                }
            }

            for(String b: wrdend){ // Filters out words which ends with certain pattern
                if((word.substring((word.length()-2))).contains(b)){
                    syllables--;
                }
            }

            System.out.println(syllables);
            syllables = 0;
        }
        sc.close();
    }
}
