package com.example.movieapp.Domains;

import java.io.Serializable;
import java.util.ArrayList;

public class Film implements Serializable {
    private String Title;
    private String Description;
    private String Poster;
    private String Time;
    private String Trailer;
    private int Imbd = 9;
    private int Year;
    private ArrayList<String> Genre;
    private ArrayList<Cast> Casts;

    public Film(){}

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPoster() {
        return Poster;
    }

    public void setPoster(String poster) {
        Poster = poster;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getTrailer() {
        return Trailer;
    }

    public void setTrailer(String trailer) {
        Trailer = trailer;
    }

    public int getImbd() {
        return Imbd;
    }

    public void setImbd(int imbd) {
        Imbd = imbd;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public ArrayList<String> getGenre() {
        return Genre;
    }

    public void setGenre(ArrayList<String> genre) {
        Genre = genre;
    }

    public ArrayList<Cast> getCasts() {
        return Casts;
    }

    public void setCasts(ArrayList<Cast> casts) {
        Casts = casts;
    }
}
