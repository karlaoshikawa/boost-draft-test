import java.util.Stack;

public class XMLValidator {

    public static String validateXML(String xml) {
        Stack<String> stack = new Stack<>();
        xml = xml.replaceAll("\\s", "");

        for (int i = 0; i < xml.length(); i++) {
            if (xml.charAt(i) == '<') {
                if (xml.charAt(i + 1) != '/') {
                    int j = findClosingTag(xml, i);
                    if (j == -1) return "Invalid";
                    String tag = xml.substring(i + 1, j);
                    stack.push(tag);
                    i = j;
                } else {
                    int j = findClosingTag(xml, i);
                    if (j == -1) return "Invalid";
                    String closingTag = xml.substring(i + 2, j);
                    if (stack.isEmpty() || !stack.pop().equals(closingTag)) {
                        return "Invalid";
                    }
                    i = j;
                }
            }
        }

        return stack.isEmpty() ? "Valid" : "Invalid";
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
