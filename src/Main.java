public class Main {
    public static void main(String[] args) {
        // Verifica se há argumentos de linha de comando
        if (args.length == 0) {
            System.out.println("Usage: java Main \"<XMLString>\"");
            return;
        }

        // Obtém a string XML do primeiro argumento da linha de comando
        String xmlString = args[0];

        // Valida a string XML
        String result = XMLValidator.validateXML(xmlString);

        // Exibe o resultado
        System.out.println(result);
    }
}

