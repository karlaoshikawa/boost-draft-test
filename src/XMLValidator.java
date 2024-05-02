import java.util.Stack;

public class XMLValidator {

    public static String validateXML(String xml) {
        Stack<String> stack = new Stack<>();
        String xmlWithoutWhitespace = removeWhitespace(xml);

        for (int i = 0; i < xmlWithoutWhitespace.length(); i++) {
            if (xmlWithoutWhitespace.charAt(i) == '<') {
                if (xmlWithoutWhitespace.charAt(i + 1) != '/') {
                    int j = findClosingTag(xmlWithoutWhitespace, i);
                    if (j == -1) return "Invalid";
                    String tag = xmlWithoutWhitespace.substring(i + 1, j);
                    stack.push(tag);
                    i = j;
                } else {
                    int j = findClosingTag(xmlWithoutWhitespace, i);
                    if (j == -1) return "Invalid";
                    String closingTag = xmlWithoutWhitespace.substring(i + 2, j);
                    if (stack.isEmpty() || !stack.pop().equals(closingTag)) {
                        return "Invalid";
                    }
                    i = j;
                }
            }
        }

        return stack.isEmpty() ? "Valid" : "Invalid";
    }

    private static String removeWhitespace(String xml) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < xml.length(); i++) {
            char currentChar = xml.charAt(i);
            if (!Character.isWhitespace(currentChar)) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    private static int findClosingTag(String xml, int startIndex) {
        int i = startIndex;
        while (i < xml.length()) {
            if (xml.charAt(i) == '>') {
                return i;
            }
            i++;
        }
        return -1;
    }
}
