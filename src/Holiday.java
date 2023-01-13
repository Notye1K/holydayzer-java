public class Holiday {
    private String title;
    private String date;

    public Holiday(String date, String title) {
        this.title = title;
        this.date = date;
    }

    public Holiday() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
