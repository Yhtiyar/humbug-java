package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        HumbugConsent c = new HumbugConsent();
        String token = "";
        Reporter r = new Reporter("java app", c, "200", "201", token);

        String[] tags = new String[]{"0.0.2"};
        r.systemReport(tags);

        try {
            int i = 1/0;
        }
        catch (Exception e) {
            r.errorReport(e, tags);
        }

        try {
            InputStream i = new FileInputStream("not_existed_file");
        }
        catch (IOException e) {
            r.errorReport(e, tags);
        }
    }
}
