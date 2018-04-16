package onlineDictionary;

import java.util.Scanner;

import static onlineDictionary.APIcall.playWordGame;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("Welcome to our command line online dictionary");
        System.out.println("To get the word definition, type './dict def <word>'");
        Scanner s = new Scanner(System.in);

        while (true){
            String input = s.nextLine();
            String inp[] = input.split(" ");

            if(inp[0].equals("./dict")) {

                if (inp.length == 1) {
                    String wordOfTheDay = APIcall.getWordOfTheDay();
                    System.out.println("Today's word : "+wordOfTheDay);
                    System.out.println("Definition : "+APIcall.getDefinition(wordOfTheDay) );
                    if(APIcall.getSynonym(wordOfTheDay).equals("Please try another word")) System.out.println("SynonymResponse not found");
                    else System.out.println("SynonymResponse : "+APIcall.getSynonym(wordOfTheDay));
                    if(APIcall.getAntonym(wordOfTheDay).equals("Please try another word")) System.out.println("AntonymResponse not found");
                    else System.out.println("AntonymResponse : "+APIcall.getAntonym(wordOfTheDay));
                    System.out.println("ExampleResponse : "+APIcall.getExample(wordOfTheDay));

                } else {


                    if (inp[1].equals("def")) {
                        System.out.println(APIcall.getDefinition(inp[2]));
                    } else if (inp[1].equals("syn")) {
                        String ans = APIcall.getSynonym(inp[2]);
                        if(ans.equals("Please try another word")) System.out.println("SynonymResponse not found");
                        else System.out.println("SynonymResponse : "+ans);
                    } else if (inp[1].equals("ant")) {
                        String ans = APIcall.getAntonym(inp[2]);
                        if(ans.equals("Please try another word")) System.out.println("AntonymResponse not found");
                        else System.out.println("AntonymResponse : "+ans);
                    } else if (inp[1].equals("ex")) {
                        APIcall.getExample(inp[2]);
                    } else if (inp[1].equals("play")) {
                        System.out.println("You'll be given some information about a word and you'll have to indentify that word.");
                        System.out.println("To try again, type - 'try again'");
                        System.out.println("To get a hint, type - 'hint'");
                        System.out.println("To get the answer, type - 'quit'");
                        playWordGame();
                    }else if ((inp.length==2 && (!inp[1].equals("play"))) || inp[1].equals("dict")) {
                        System.out.println("Definition : "+APIcall.getDefinition(inp[inp.length-1]));
                        System.out.println("SynonymResponse : "+ APIcall.getSynonym(inp[inp.length-1]));
                        System.out.println("AntonymResponse : "+APIcall.getAntonym(inp[inp.length-1]));
                        System.out.println("ExampleResponse : "+APIcall.getExample(inp[inp.length-1]));

                    }
                }
            }else{
                System.out.println("please enter valid command");
            }
        }
    }


}