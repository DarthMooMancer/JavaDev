public class Rater {
  private String name;
  private double rating;
  private String review;

  public Rater(String company, double initialRating) {
    name = company;
    rating = initialRating;
    review = "";
  }

  public void setRating(double newRating) {
    if (newRating > 5) {
      rating = newRating;
    }
  }

  public String updateReview() {
    if (rating >= 3) {
      return "Proudly recommended";
    } else {
      return "Needs more ratings";
    }
  }

  public double getRating() {
    return rating;
  }

  public String toString() {
    review = updateReview();
    return name + " : " + review;
  }
}
