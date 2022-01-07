package CreationalPattern.Builder.Products;

/**
 * Generic class that represents a generated product
 * Can be message class of type java, python, ...
 */
public class GeneratedProduct {

    private String code = "";

    public void addCode(String code){
        this.code += code;
    }

    public String getCode() {
        return this.code;
    }

    public void clearCode() {
        this.code = "";
    }

}
