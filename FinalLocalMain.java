package section9_final;

/**
 * final 변수와 상수1
 */
public class FinalLocalMain {
    public static void main(String[] args) {
        //파이널 지역 변수 :최초 한번만 할당 가능
        final int d1;
        d1 = 10;
//        d1 = 15; // 컴파일 오류

        //파이널 지역변수 2
        final int d2 = 10;
//        d2 = 20; // 컴파일 오류
        method(10); //여기에 10을 넣으면

    }
    static void method(final int param){
//        param = 20; // 중간에 파람 값은 불변
    }

    }
