package poly_lms;
// Common Behvaiours for Students, Trainers etc
public interface Personable {
    public void setPersonDetails();
    public void displayPersonDetails();
    default void achievementStatus() {}
}