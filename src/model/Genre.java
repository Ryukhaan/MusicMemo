package model;

import java.util.ArrayList;

public class Genre {
  private static ArrayList<Genre> allGenres = null;

  private String genre;

  public Genre() {
    this.genre = "";
  }

  public Genre(String genre) {
    this.genre = genre;
  }

  public static ArrayList<Genre> getAllGenres() {
    // If all genre have not already been instancied, then do it.
    if (allGenres == null) {
      // TODO
    }
    // Return a clone
    return (ArrayList<Genre>) allGenres.clone();
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
    Genre other = (Genre) object;
    return this.genre == other.getGenre();
  }
}
