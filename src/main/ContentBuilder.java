package main;

/**
 * @author Yhtyyar created on 20.06.2021
 */
public class ContentBuilder {
    StringBuilder content = new StringBuilder();
    public ContentBuilder() {

    }
    public ContentBuilder addHeader(String header) {
        this.content.append("### ").append(header).append('\n');
        return this;
    }

    public ContentBuilder addLine() {
        this.content.append('\n');
        return this;
    }

    public ContentBuilder addString(String s) {
        this.content.append(s);
        return this;
    }

    public ContentBuilder addCode(String s) {
        this.content.append('`').append(s).append('`');
        return this;
    }

    public ContentBuilder addMultilineCode(String s) {
        this.content.append("```").append('\n').append(s).append('\n').append("```").append('\n');
        return this;
    }

    public String toString() {
        return content.toString();
    }
}
