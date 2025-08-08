package Lib;
/**
 * จะโยนException ก็ต่อเมื่อคืนค่าสินค้าไม่สำเร็จ
 */
public class InvaidOperationException extends Exception {
    public InvaidOperationException(String message){
        super(message);
    }
}
