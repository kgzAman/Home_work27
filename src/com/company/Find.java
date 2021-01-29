package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find {
    private  List<Movie> movies= new ArrayList<>();

    public void findByName(String str){
            try {
                Pattern p =  Pattern.compile(str,Pattern.CASE_INSENSITIVE);
             for (Movie movie :
                  movies) {
                 Matcher m = p.matcher(movie.getName());
                if(m.equals(false)){
                    throw new Exception();
                }
             }
         }catch (Exception  a){
                System.out.println("Фильм не найден ");
            }
    }

    public Movie findByNumber(String year){
        movies= Reader.read();
        try {
            Integer.parseInt(year);
                Pattern p =  Pattern.compile(year,Pattern.CASE_INSENSITIVE);
            for (Movie movie :
                    movies) {
                Matcher m = p.matcher(movie.getName());
                if(m.lookingAt()){
                    return movie;
                }
                else {
                    throw new Exception();
                }
            }
        }catch (Exception  a){
            System.out.println("Фильм не найден ");
        }

        return null;
    }
    public Movie findByDirector(String director){
        movies= Reader.read();
        try {
            Pattern p =  Pattern.compile(director,Pattern.CASE_INSENSITIVE);
            for (Movie movie :
                    movies) {
                Matcher m = p.matcher(movie.getName());
                if(m.lookingAt()){
                    return movie;
                }
                else {
                    throw new Exception();
                }
            }
        }catch (Exception  a){
            System.out.println("Фильм не найден ");
        }
        return null;
    }
}
