package model;

import java.util.ArrayList;

public class Style implements Comparable<Style> {
  private static ArrayList<Style> allStyles = null;

  private String genre;

  public Style() {
    this.genre = "";
  }

  public Style(String genre) {
    this.genre = genre;
  }

  public static ArrayList<Style> getAllStyles() {
    // If all genre have not already been instancied, then do it.
    if (allStyles == null) {
      // TODO
    }
    // Return a clone
    return (ArrayList<Style>) allStyles.clone();
  }

  public String getGenre() {
    return this.genre;
  }
  public void setGenre(String genre) {
    this.genre = genre;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object)
      return true;
    if (object == null)
      return false;
    if (getClass() != object.getClass())
      return false;
    Style other = (Style) object;
    return this.genre == other.getGenre();
  }

  @Override
  public int hashCode() {
    return this.genre.hashCode();
  }

  @Override
  public int compareTo(Style other) {
    return this.genre.compareTo(other.getGenre());
  }
}
