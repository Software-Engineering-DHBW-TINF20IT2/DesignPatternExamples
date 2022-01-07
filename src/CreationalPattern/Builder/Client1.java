package CreationalPattern.Builder;


import CreationalPattern.Builder.Factories.CodeGenerator;
import CreationalPattern.Builder.Factories.JavaMessageBuilder;
import CreationalPattern.Builder.Factories.MessageBuilder;
import CreationalPattern.Builder.Factories.PythonMessageBuilder;

public class Client1 {

    /**
     * Generate code for special kind of builder
     * @param builder
     */
    public static void generateCode(MessageBuilder builder) {
        final String path = System.getProperty("user.dir") + "/src/CreationalPattern/Builder/Messages";
        CodeGenerator generator1 = new CodeGenerator(builder);
        generator1.generateCode( path, "Message1.txt");
    }

    /**
     * simplified main method
     * @param args
     */
    public static void main(String[] args) {
        // generate java code from message
        System.out.println("1) Generate java code from messages1");
        MessageBuilder builder1 = new JavaMessageBuilder();
        generateCode(builder1);

        // generate python code from message
        System.out.println("\n2) Generate python code from message2");
        MessageBuilder builder2 = new PythonMessageBuilder();
        generateCode(builder2);
    }

}
