package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Reader {

    public static List<Movie> read(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String listOfMovie ="";
        try(
                FileReader reader = new FileReader("./Movies.json");
                Scanner sc = new Scanner(reader);
                ){
            while (sc.hasNextLine()){
                listOfMovie += sc.nextLine();
            }

        } catch (IOException e ){
            e.printStackTrace();
        }
        Type itemMapType = new TypeToken<Map<String, List<Movie>>>(){}.getType();

        Map<String, List<Movie>> movies = gson.fromJson(listOfMovie,itemMapType);
        return movies.get("movies");
    }

}
