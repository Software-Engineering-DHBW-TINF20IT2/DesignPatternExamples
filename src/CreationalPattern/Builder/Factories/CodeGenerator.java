package CreationalPattern.Builder.Factories;

import java.io.*;
import java.util.Scanner;

public class CodeGenerator {

    private MessageBuilder builder;

    public CodeGenerator(MessageBuilder builder) {
        this.builder = builder;
    }

    /**
     * Interface to build a new class
     * @param fileName
     */
    public void generateCode(String path, String fileName) {
        try {
            // create package declaration
            builder.buildPackageName();

            // read message line by line
            File myObj = new File(path, fileName);
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()) {
                String line = myReader.nextLine();

                // process message parts
                if(line.contains("name")) {
                    // process class name
                    builder.buildNewClass(line);
                } else if(line.contains("properties")) {
                    // process attribute lists with attributes
                    builder.buildClassAttributes(line);
                } else if(line.contains("actions")) {
                    // process operation lists with operations
                    builder.buildClassOperations(line);
                }
            }

            // close generated class
            builder.closeClass();

            // write file with generated input
            //String path = builder.getBasePath() + "/" + builder.getProductPackage();
            String generatedPath = path + "/" + builder.getBasePath() + "/" + builder.getProductPackage();
            String className = builder.getClassName(fileName) + "." + builder.getFileExtension();
            File file = new File(generatedPath, className);
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(builder.getGeneratedProduct().getCode());
            writer.close();

            // clear code after writing to file
            builder.clearCode();

        } catch(FileNotFoundException ex) {
            System.out.println("Error occured");
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
