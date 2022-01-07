package CreationalPattern.Builder.Factories;

import CreationalPattern.Builder.Products.GeneratedProduct;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Specify creational steps required to
 * generate each type of message class
 * -> Define all parts needed to all object types
 */
public abstract class MessageBuilder {

    // product with generated code and stats about code generation
    private GeneratedProduct codeProduct;
    final public String BASE_GEN_CLASSES_PACKAGE_NAME = "GeneratedClasses";
    final public String PACKAGE_NAME = "CreationalPattern.Builder.Messages";


    public MessageBuilder() {
        this.codeProduct = new GeneratedProduct();
    }

    /**
     * Interface to build the name of the package
     * where the generated code will be written
     */
    public abstract void buildPackageName();

    /**
     * Interface method to build new class
     * @param name
     */
    public abstract void buildNewClass(String name);

    /**
     * Interface method to build class attributes
     * @param attributeList
     */
    public abstract void buildClassAttributes(String attributeList);

    /**
     * Interface method to build class operations
     * @param operationList
     */
    public abstract void buildClassOperations(String operationList);

    /**
     * Interface method to close new class
     */
    public abstract void closeClass();

    /**
     * Get File extension for target programming language
     */
    public abstract String getFileExtension();


    /**
     * Create name for generated class from message
     * file name
     */
    public abstract String getClassName(String filename);

    /**
     * get package name for generated product package
     * in BASE_GEN_CLASSES_PACKAGE_NAME base package
     * @return
     */
    public abstract String getProductPackage();

    /**
     * Return generated product
     * @return
     */
    public GeneratedProduct getGeneratedProduct() {
        return this.codeProduct;
    }

    /**
     * return base path for generated classes
     * @return
     */
    public String getBasePath() {
        return BASE_GEN_CLASSES_PACKAGE_NAME;
    }

    /**
     * parse message lines using regexp
     * @param text containing substring
     * @return Substring extracted with regexp
     */
    public String getStringUsingRegexp(String text, String searchPattern) {
        Pattern pattern = Pattern.compile(searchPattern);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find())
        {
            return matcher.group(1);
        } else {
            return null;
        }
    }

    public String getBasePackageName() {
        return PACKAGE_NAME + "." + BASE_GEN_CLASSES_PACKAGE_NAME;
    }

    public void clearCode() {
        this.codeProduct.clearCode();
    }

}
