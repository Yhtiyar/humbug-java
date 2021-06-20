package main;

/**
 * @author Yhtyyar created on 19.06.2021
 */
public class Report {
    private String title;
    private String content;
    private String[] tags;

    public Report(String title, String content, String[] tags) {
        this.title = title;
        this.content = content;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String[] getTags() {
        return tags;
    }
}
