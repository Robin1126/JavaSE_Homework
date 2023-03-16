/**
 * Author : Binbin Luo
 * Date : 16.03.2023
 */

// 异常类，构造一个无参，构造一个有参
public class SoldoutException extends  Exception{
    public SoldoutException() {
    }

    public SoldoutException(String message) {
        super(message);
    }
}
