package section9_final;
/**
 * final 변수와 상수1
 */
public class FieldInit {
    //초기 값을 넣었을때는 생성자를 통해
    static final int CONST_VAL = 10; // 메모리 낭비를 막기위해 static 을 붙였다
    final int val = 10; // 초기값이 있는경우는

    public FieldInit(int val){
//        this.val = val; // 생성자를 사용해 주입이 불가능
    }
}
