public class TestXMLValidator {

    public static void main(String[] args) {
        testValidXML();
        testInvalidXML_MissingClosingTag();
        testInvalidXML_ExtraClosingTag();
    }

    public static void testValidXML() {
        String validXML = "<book><title>Java Programming</title><author>John Doe</author></book>";
        String result = XMLValidator.validateXML(validXML);
        System.out.println("Valid XML: " + result);
    }

    public static void testInvalidXML_MissingClosingTag() {
        String invalidXML = "<book><title>Java Programming</title><author>John Doe</author></book";
        String result = XMLValidator.validateXML(invalidXML);
        System.out.println("Invalid XML (Missing Closing Tag): " + result);
    }

    public static void testInvalidXML_ExtraClosingTag() {
        String invalidXML = "<book><title>Java Programming</title><author>John Doe</author></book><extra>";
        String result = XMLValidator.validateXML(invalidXML);
        System.out.println("Invalid XML (Extra Closing Tag): " + result);
    }
}
