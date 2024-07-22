package org.example.Behavioral.ChainOfResponsibility.Trimmers;

public class PointFilter extends StringFilter {
    @Override
    public String trim(String str) {

        char[] charArray = str.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (char c : charArray) {
            if (!(c == '.')) {
                builder.append(c);
            }
        }
        if (next != null) {
            return next.trim(builder.toString());
        }
        return builder.toString();
    }
}
