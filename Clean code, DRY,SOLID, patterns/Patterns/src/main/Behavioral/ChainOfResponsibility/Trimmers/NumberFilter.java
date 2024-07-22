package org.example.Behavioral.ChainOfResponsibility.Trimmers;

public class NumberFilter extends StringFilter {
    @Override
    public String trim(String str) {

        char[] charArray = str.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (char c : charArray) {
            if (!Character.isDigit(c)) {
                builder.append(c);
            }
        }
        if (next != null) {
            return next.trim(builder.toString());
        }
        return builder.toString();
    }
}
