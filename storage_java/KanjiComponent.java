package me.kotlia;

public class KanjiComponent {
    private String component;
    public KanjiComponent(String component) {
        this.component = component;
    }
    public String format() {
        String temp = this.component;
        Integer counter = null;
        temp = temp.substring(1, temp.length()-1);
        String[] eachArr = temp.trim().split("");

        int index = 0;
        for (String s : eachArr) {
            if (counter == null) {
                counter = 0;
            } else if (s.equals("[")) {
                counter = counter + 1;
            } else if (s.equals("]")) {
                counter = counter - 1;
            } else if (counter == 0) {
                temp = temp.substring(0, index-1) + ";" + temp.substring(index);
            }
            index++;
        }
        String[] arr = temp.split(";");
        StringBuilder res = new StringBuilder();
        String inner = "";
        for (String it : arr) {
            inner = it.substring(it.indexOf(",") + 2, it.length() - 1);
            res.append(inner.split(",")[0].replace("\"", ""));
        }
        return res.toString();
    }
}
