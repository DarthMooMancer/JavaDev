public class Teen {
  private String firstName;
  private String lastName;
  private int grade;

  public Teen(String theFirstName, String theLastName, int theGrade) {
    firstName = theFirstName;
    lastName = theLastName;
    grade = theGrade;
  }

  public String toString() {
    return firstName + " " + lastName + " is in grade " + grade + " and wants to send this text:";
  }

  public String teenTalk(String m) {
    int x = 0;
    String out = "";
    for (int i = 0; i < m.length(); i++) {
      String s = m.substring(x, x + 1);
      if (s.equals(".") || s.equals("!")) {
        out += "!!";
      } else {
        out += s;
      }
      x++;
    }
    return out;
  }
}
