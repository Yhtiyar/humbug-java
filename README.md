# humbug-java
Java frontend of humbug library: https://github.com/bugout-dev/humbug

## Usage
```java
HumbugConsent c = new HumbugConsent();
String token = "";
Reporter r = new Reporter("<name>", c, "<client_id>", "<session_id>", token);

String[] tags = new String[]{"<version>"};
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

```
