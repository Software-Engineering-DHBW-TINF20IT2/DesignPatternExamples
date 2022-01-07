package CreationalPattern.Builder.Factories;

public class JavaMessageBuilder extends MessageBuilder {


    /**
     * Generate java package declaration in beginning
     * of generated file
     */
    @Override
    public void buildPackageName() {
        System.out.println("Generate java package name");
        String packageCode = "package " + getBasePackageName() + "." + getProductPackage() + ";\n\n";
        getGeneratedProduct().addCode(packageCode);
    }

    /**
     * Extract class name and open a java class
     * @param line with class name from message
     */
    @Override
    public void buildNewClass(String line) {
        System.out.println("Generate java class");
        String className = getStringUsingRegexp(line, ":(.*)");
        String newClassCode = "public class " + className + " {\n";
        getGeneratedProduct().addCode(newClassCode);
    }

    /**
     * Extract attribute names and write to generated class
     * @param line with attributes seperated by ","
     */
    @Override
    public void buildClassAttributes(String line) {
        System.out.println("Generate java attributes");
        String attributeString = getStringUsingRegexp(line, ": (.*)");
        String[] attributeList = attributeString.split("\\s*,\\s*");
        StringBuilder attributeCode = new StringBuilder();
        for (String attribute : attributeList) {
            attributeCode.append("\n public String ").append(attribute).append(";");
        }
        getGeneratedProduct().addCode(attributeCode.append("\n").toString());
    }

    /**
     * Create operations defined by actions
     * @param line
     */
    @Override
    public void buildClassOperations(String line) {
        System.out.println("Generate java operations");
        String operationsString = getStringUsingRegexp(line, ": (.*)");
        String[] operationsList = operationsString.split("\\s*,\\s*");
        StringBuilder operationsCode = new StringBuilder();
        for (String operation : operationsList) {
            if (operation.contains("get")) {
                String variable = operation.substring("get".length()).toLowerCase();
                operationsCode.append("\n public String " + operation + "() {");
                operationsCode.append("\n      return " + variable + ";");
                operationsCode.append("\n }");
            } else if (operation.contains("set")) {
                String variable = operation.substring("set".length()).toLowerCase();
                operationsCode.append("\n public void " + operation + "(String " + variable + ") {");
                operationsCode.append("\n      this." + variable + " = " + variable + ";");
                operationsCode.append("\n }");
            }
        }
        getGeneratedProduct().addCode(operationsCode.toString());
    }

    @Override
    public void closeClass() {
        System.out.println("Generate java class closing");
        getGeneratedProduct().addCode("\n}\n\n");
    }

    @Override
    public String getFileExtension() {
        return "java";
    }

    @Override
    public String getClassName(String filename) {
        return filename.split("\\.")[0];
    }

    @Override
    public String getProductPackage() {
        return "Java";
    }

}
