package section9_final;
/**
 * final 변수와 상수1
 */
public class FinalFieldMain {

    public static void main(String[] args) {
        
        //final 필드 - 생성자 초기화
        System.out.println("Final - 생성자 초기화");
        ConstructInit ci1 = new ConstructInit(10); // 생성자를 사용해 초기화하면 인스턴스마다 값이 바뀐다.
        ConstructInit ci2 = new ConstructInit(20);
        System.out.println(ci1.val);
        System.out.println(ci2.val);

        //final - 필드 초기화
        System.out.println("Final - 필드 초기화");
        FieldInit fi1 = new FieldInit(14); // 이 값은 10으로 지정되서 항상 10
        FieldInit fi2 = new FieldInit(11); // 어차피 10인데 메모리 낭비아닌가? -> 이럴때 static을 사용하는게 좋다
        FieldInit fi3 = new FieldInit(24);
        System.out.println(fi1.val);
        System.out.println(fi2.val);
        System.out.println(fi3.val);
        
        //final - 상수
        System.out.println("Final - 상수");
        System.out.println(FieldInit.CONST_VAL);
    }
}
