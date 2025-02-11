package section9_final;
/**
 * final 변수와 상수1
 */
public class ConstructInit {
    final int val;

    //생성자를 통해 값을 넣어야 한다, 이후에는 값을 바꿀수 없다.
    public ConstructInit(int val) {
        this.val = val;
    }
}
