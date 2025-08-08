package Lib;
/**
 * จะโยนException ก็ต่อเมื่อไม่เจอสินค้า
 */
public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(String message){
        super(message);
    }
}
