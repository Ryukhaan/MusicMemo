package model;

public class Period {
  private int start;
  private int end;

  public Period() {
    this.start = 0;
    this.end = 0;
  }

  public Period(int value, boolean isStartValue) {
    if (isStartValue)
      this.start = value;
    else
      this.end = value;
  }

  public Period(int start, int end) {
    this.start = start;
    this.end  = end;
  }

  /**
   * Get start attribute
   * @method getStart
   * @return (int) Start attribute
   */
  public int getStart() {
    return this.start;
  }

  /**
   * Get end attribute
   * @method getEnd
   * @return (int) End attribute
   */
  public int getEnd() {
    return this.end;
  }

  /**
   * Set start attribute
   * @method setStart
   * @param  int      start [new start value]
   */
  public void setStart(int start) {
    this.start = start;
  }

  /**
   * Set end attribute
   * @method setEnd
   * @param  int    end [new end value]
   */
  public void setEnd(int end) {
    this.end = end;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object)
      return true;
    if (object == null)
      return false;
    if (getClass() != object.getClass())
      return false;
    Period other = (Period) object;
    return (this.start == other.getStart() && this.end == other.getEnd());
  }
}
