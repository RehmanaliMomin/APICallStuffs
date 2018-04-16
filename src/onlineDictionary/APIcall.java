package onlineDictionary;

import com.google.gson.Gson;
import response.*;
import response.Example.ExampleResponse;
import response.WordOfTheDay.WordOfTheDayResponse;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;


public class APIcall {

    static String apiKey = "a2a73e7b926c924fad7001ca3111acd55af2ffabf50eb4ae5";
    static String urlWordnik = "http://api.wordnik.com:80/v4/";



    public static String getDefinition(String s){
        String ans = "";
        try {
            URL url = new URL(urlWordnik+"word.json/"+s+"/definitions?limit=1&includeRelated=true&sourceDictionaries=all&useCanonical=false&includeTags=false&api_key="+apiKey);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responsecode = conn.getResponseCode();
            if(responsecode != 200)
            {
                throw new RuntimeException("HttpResponseCode: " +responsecode);
            }
            else
            {
                String jsonString="";
                Scanner sc = new Scanner(url.openStream());
                while(sc.hasNext())
                {
                    jsonString+=sc.nextLine();
                }
                Gson gson = new Gson();
                DefinationResponse[] enums = gson.fromJson(jsonString, DefinationResponse[].class);
                if(enums.length==0) ans = "Please try another word";
                else ans = enums[0].getText();
                sc.close();

            }
        }catch (Exception e){
            System.out.println(e);
        }
        return ans;
    }


    public static String getExample(String s){

        String ans = "";
        try {
            URL url = new URL(urlWordnik+"word.json/"+s+"/examples?includeDuplicates=false&useCanonical=false&skip=0&limit=1&api_key="+apiKey);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responsecode = conn.getResponseCode();
            if(responsecode != 200)
            {
                throw new RuntimeException("HttpResponseCode: " +responsecode);
            }
            else
            {
                String jsonString="";
                Scanner sc = new Scanner(url.openStream());
                while(sc.hasNext())
                {
                    jsonString+=sc.nextLine();
                }
                Gson gson = new Gson();
                ExampleResponse enums = gson.fromJson(jsonString, ExampleResponse.class);
                ans = enums.getExamples()[0].getText();
                sc.close();
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return ans;
    }


    public static String getSynonym(String s){
        String ans = "";
        try {
            URL url = new URL(urlWordnik+"word.json/"+s+"/relatedWords?useCanonical=false&relationshipTypes=synonym&limitPerRelationshipType=1&api_key="+apiKey);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responsecode = conn.getResponseCode();
            if(responsecode != 200)
            {
                throw new RuntimeException("HttpResponseCode: " +responsecode);
            }
            else
            {
                String jsonString="";
                Scanner sc = new Scanner(url.openStream());
                while(sc.hasNext())
                {
                    jsonString+=sc.nextLine();
                }
                Gson gson = new Gson();
                SynonymResponse[] enums = gson.fromJson(jsonString, SynonymResponse[].class);
                if(enums.length==0)  ans = "Please try another word";
                else ans = enums[0].getWords()[0];
                sc.close();
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return ans;
    }


    public static String getAntonym(String s){
        String ans="";
        try {
            URL url = new URL(urlWordnik+"word.json/"+s+"/relatedWords?useCanonical=false&relationshipTypes=antonym&limitPerRelationshipType=1&api_key="+apiKey);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responsecode = conn.getResponseCode();
            if(responsecode != 200)
            {
                throw new RuntimeException("HttpResponseCode: " +responsecode);
            }
            else
            {
                String jsonString="";
                Scanner sc = new Scanner(url.openStream());
                while(sc.hasNext())
                {
                    jsonString+=sc.nextLine();
                }
                Gson gson = new Gson();
                AntonymResponse[] enums = gson.fromJson(jsonString, AntonymResponse[].class);
                if(enums.length==0)  ans = "Please try another word";
                else ans = enums[0].getWords()[0];
                sc.close();
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return ans;
    }


    static String getWordOfTheDay(){
        try {
            URL url = new URL(urlWordnik+"words.json/wordOfTheDay?api_key="+apiKey);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responsecode = conn.getResponseCode();
            if(responsecode != 200)
            {
                throw new RuntimeException("HttpResponseCode: " +responsecode);
            }
            else
            {
                String jsonString="";
                Scanner sc = new Scanner(url.openStream());
                while(sc.hasNext())
                {
                    jsonString+=sc.nextLine();
                }
                Gson gson = new Gson();
                WordOfTheDayResponse enums = gson.fromJson(jsonString, WordOfTheDayResponse.class);
                sc.close();
                return enums.getWord();
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return "";
    }


    static void playWordGame(){
        String ans = "";

        try{
        while (ans.equals("")||ans.equals("Please try another word")) {
            URL url = new URL(urlWordnik+"words.json/randomWord?hasDictionaryDef=true&minCorpusCount=0&maxCorpusCount=-1&minDictionaryCount=1&maxDictionaryCount=-1&minLength=5&maxLength=-1&api_key=a2a73e7b926c924fad7001ca3111acd55af2ffabf50eb4ae5");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responsecode = conn.getResponseCode();
            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {
                String jsonString = "";
                Scanner sc = new Scanner(url.openStream());
                while (sc.hasNext()) {
                    jsonString += sc.nextLine();
                }
                Gson gson = new Gson();
                PlayGameResponse enums = gson.fromJson(jsonString, PlayGameResponse.class);
                String word = enums.getWord();
                if(getSynonym(word).equals("Please try another word")||getAntonym(word).equals("Please try another word")||getDefinition(word).equals("Please try another word")){
                    ans = "Please try another word";
                }else{
                    ans = word;
                }
                sc.close();
            }
        }
        playWithWord(ans);
    }catch (Exception e){
        System.out.println(e);
        }
    }


    static void playWithWord(String word){

        String syn = getSynonym(word);
        String ant = getAntonym(word);
        String def = getDefinition(word);

        System.out.println("Definition = "+def);
        System.out.println("SynonymResponse = "+syn);
        System.out.println("Antonyn = "+ant);

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (!s.equals(word)) {
            String command = sc.nextLine();
            if(command.equals("try again")){
                s = sc.nextLine();
            }else if(command.equals("hint")){
                System.out.println(getJumbled(word));
                s = sc.nextLine();
            }else if(command.equals("quit")){
                System.out.println("The word is "+word);
                System.out.println("Definition : "+def);
                System.out.println("ExampleResponse : "+getExample(word));
                return;
            }
        }
        if (s.equals(word)) {
            System.out.println("You are correct");
            sc.close();
            return;
        }

    }

    static String getJumbled(String s){
        String ans = "";
        char[] a = s.toCharArray();
        Arrays.sort(a);
        ans = String.valueOf(a);
        return ans;
    }
}