package model;

import java.util.ArrayList;

public class Nationality implements Comparable<Nationality> {
  private static ArrayList<Nationality> allNationalities = null;

  private String nationality;

  public Nationality() {
    this.nationality = "";
  }

  public Nationality(String nation) {
    this.nationality = nation;
  }

  public static ArrayList<Nationality> getAllNationalities() {
    // If all genre have not already been instancied, then do it.
    if (allNationalities == null) {
      // TODO
    }
    // Return a clone
    return (ArrayList<Nationality>) allNationalities.clone();
  }

  public String getNationality() {
    return this.nationality;
  }
  public void setNationatlity(String nation) {
    this.nationality = nation;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object)
      return true;
    if (object == null)
      return false;
    if (getClass() != object.getClass())
      return false;
    Nationality other = (Nationality) object;
    return this.nationality == other.getNationality();
  }

  @Override
  public int hashCode() {
    return this.nationality.hashCode();
  }

  @Override
  public int compareTo(Nationality other) {
    return this.nationality.compareTo(other.getNationality());
  }

  public String toString() {
    return "Nationality : " + this.nationality;
  }
}
