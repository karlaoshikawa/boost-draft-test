public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Usage: java Main \"<XMLString>\"");
            return;
        }

        String xmlString = args[0];

        String result = XMLValidator.validateXML(xmlString);

        System.out.println(result);
    }
}

