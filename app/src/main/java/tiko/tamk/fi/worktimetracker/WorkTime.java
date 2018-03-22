package tiko.tamk.fi.worktimetracker;

/**
 * Created by risto on 22.3.2018.
 */

public class WorkTime {
    private String title;
    private double hours;
    private String description;

    public WorkTime(String title, double hours, String description) {
        this.title = title;
        this.hours = hours;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "WorkTime{" +
                "title='" + title + '\'' +
                ", hours=" + hours +
                ", description='" + description + '\'' +
                '}';
    }
}
