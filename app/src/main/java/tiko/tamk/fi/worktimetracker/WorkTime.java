package tiko.tamk.fi.worktimetracker;

/**
 * Constains WorkTime instances which are used to save user working hours.
 *
 * @author Risto Pulkkinen
 * @version 1.0
 * @since 1.0
 */

public class WorkTime {
    /**
     * Title for a single WorkTime instance.
     */
    private String title;

    /**
     * Hours for a single WorkTime instance.
     */
    private double hours;

    /**
     * Description for a single WorkTime instance.
     */
    private String description;

    /**
     * Constructor saves all the information in the object.
     *
     * @param title Title for the object.
     * @param hours Hours for the object.
     * @param description Description for the object.
     */
    public WorkTime(String title, double hours, String description) {
        this.title = title;
        this.hours = hours;
        this.description = description;
    }

    /**
     * Getter for title.
     *
     * @return object's title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter for object's title.
     *
     * @param title object's new title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for hours.
     *
     * @return object's hours.
     */
    public double getHours() {
        return hours;
    }

    /**
     * Setter for object's hours.
     *
     * @param hours object's new hours.
     */
    public void setHours(double hours) {
        this.hours = hours;
    }

    /**
     * Getter for object's description.
     *
     * @return object's description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for object's description.
     *
     * @param description object's new description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * toString prints the object's attributes in a nice format.
     *
     * @return object in a string.
     */
    @Override
    public String toString() {
        return "WorkTime{" +
                "title='" + title + '\'' +
                ", hours=" + hours +
                ", description='" + description + '\'' +
                '}';
    }
}
