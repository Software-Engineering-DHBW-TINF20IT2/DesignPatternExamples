package CreationalPattern.Builder.Factories;

public class PythonMessageBuilder extends MessageBuilder {


    /**
     * Generate python package declaration in beginning
     * of generated file
     */
    @Override
    public void buildPackageName() {
        System.out.println("Generate python package name");
        // nothing to do
    }

    /**
     * Extract class name and open a python class
     * @param line with class name from message
     */
    @Override
    public void buildNewClass(String line) {
        System.out.println("Generate python class");
        String className = getStringUsingRegexp(line, ":(.*)");
        String newClassCode = "class " + className + ":\n";
        getGeneratedProduct().addCode(newClassCode);
    }

    /**
     * Extract attribute names and write to generated class
     * @param line with attributes seperated by ","
     */
    @Override
    public void buildClassAttributes(String line) {
        System.out.println("Generate python attributes");
        String attributeString = getStringUsingRegexp(line, ": (.*)");
        String[] attributeList = attributeString.split("\\s*,\\s*");
        StringBuilder attributeCode = new StringBuilder();
        for (String attribute : attributeList) {
            attributeCode.append("\n  self.").append(attribute).append(" = ''");
        }
        getGeneratedProduct().addCode(attributeCode.append("\n").toString());
    }

    /**
     * Create operations defined by actions
     * @param line
     */
    @Override
    public void buildClassOperations(String line) {
        System.out.println("Generate python operations");
        String operationsString = getStringUsingRegexp(line, ": (.*)");
        String[] operationsList = operationsString.split("\\s*,\\s*");
        StringBuilder operationsCode = new StringBuilder();
        for (String operation : operationsList) {
            if (operation.contains("get")) {
                String variable = operation.substring("get".length()).toLowerCase();
                operationsCode.append("\n  def " + operation + "(self):");
                operationsCode.append("\n      return self." + variable);
                operationsCode.append("\n");
            } else if (operation.contains("set")) {
                String variable = operation.substring("set".length()).toLowerCase();
                operationsCode.append("\n  def " + operation + "(self, " + variable + "):");
                operationsCode.append("\n      self." + variable + " = " + variable);
                operationsCode.append("\n");
            }
        }
        getGeneratedProduct().addCode(operationsCode.toString());
    }

    @Override
    public void closeClass() {
        System.out.println("Generate python class closing");
        // Nothing to do
    }

    @Override
    public String getFileExtension() {
        return "py";
    }

    @Override
    public String getClassName(String filename) {
        return filename.split("\\.")[0];
    }

    @Override
    public String getProductPackage() {
        return "python";
    }

}
