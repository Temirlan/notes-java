package model;

public class Note {
  private int id;
  private String title;
  private String text;

  /**
   * int id.
   * String title.
   * String text.
   */
  public Note(int id, String title, String text) {
    this.id = id;
    this.title = title;
    this.text = text;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Note note = (Note) o;

    if (id != note.id) {
      return false;
    }
    if (title != null ? !title.equals(note.title) : note.title != null) {
      return false;
    }
    return text != null ? text.equals(note.text) : note.text == null;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (title != null ? title.hashCode() : 0);
    result = 31 * result + (text != null ? text.hashCode() : 0);
    return result;
  }
}
