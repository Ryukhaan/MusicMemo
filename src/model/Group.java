package model;

import java.util.ArrayList;

public class Group {

  private static ArrayList<Group> allGroups = null;


  private String name;
  private Nationality nationality;
  private ArrayList<Style> genre;
  private ArrayList<String> music;
  private Period date;

  public Group() {}

  public String getName() {
    return this.name;
  }

  public Nationality getNationality() {
    return this.nationality;
  }

  public ArrayList<Genre> getGenre() {
    return this.genre;
  }

  public ArrayList<String> getMusic() {
    return this.music;
  }

  public Period getPeriod() {
    return this.date;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setNationatlity(Nationality nation) {
    this.nationality = nation;
  }

  public void addGenre(Style style) {
    this.genre.add(genre);
  }
  public void addMusic(String music) {
    this.music.add(music);
  }
  public void setPeriod(Period date) {
    this.date = date;
  }
  public void removeGenre(Style style) {
    this.genre.remove(genre);
  }
  public void removeMusic(String music) {
    this.music.remove(music);
  }
}
