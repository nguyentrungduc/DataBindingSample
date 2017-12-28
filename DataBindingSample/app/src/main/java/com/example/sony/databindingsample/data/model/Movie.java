package com.example.sony.databindingsample.data.model;

import java.util.ArrayList;

/**
 * Created by Sony on 12/28/2017.
 */

public class Movie {
    private String title;
    private String link;

    public Movie(String title, String link) {
        this.title = title;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public static ArrayList<Movie> createListMovie(){
        ArrayList<Movie> arrayList = new ArrayList<>();
        for(int i = 0; i < 10; i ++){
            arrayList.add(new Movie("IT","https://img.cinemablend.com/filter:scale/quill/e/1/0/3/e/e/e103ee82b2d6307e4d881c75942ff473e08eb0e0.jpg?mw=600"));
        }
        return  arrayList;
    }
}
