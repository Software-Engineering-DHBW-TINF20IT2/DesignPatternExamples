package CreationalPattern.Builder;


import CreationalPattern.Builder.Factories.CodeGenerator;
import CreationalPattern.Builder.Factories.JavaMessageBuilder;
import CreationalPattern.Builder.Factories.MessageBuilder;
import CreationalPattern.Builder.Factories.PythonMessageBuilder;

public class Client2 {

    /**
     * All stuff in main method
     * @param args
     */
    public static void main(String[] args) {
        // Project properties
        // define files and paths to generate code from
        final String MESSAGE_PATH = "/src/CreationalPattern/Builder/Messages";
        final String path = System.getProperty("user.dir") + MESSAGE_PATH;
        final String filename1 = "Message1.txt";
        final String filename2 = "Message2.txt";

        // generate java code from message
        System.out.println("1) Generate java code from broth messages");
        MessageBuilder builder1 = new JavaMessageBuilder();
        CodeGenerator generator1 = new CodeGenerator(builder1);
        System.out.println("\n-> " + filename1);
        generator1.generateCode(path, filename1);
        System.out.println("\n-> " + filename2);
        generator1.generateCode(path, filename2);

        // generate python code from message
        System.out.println("\n2) Generate python code from both message");
        MessageBuilder builder2 = new PythonMessageBuilder();
        CodeGenerator generator2 = new CodeGenerator(builder2);
        System.out.println("\n-> " + filename1);
        generator2.generateCode(path, filename1);
        System.out.println("\n-> " + filename2);
        generator2.generateCode(path, filename2);



    }

}
