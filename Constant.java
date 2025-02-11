package section9_final;
/**
 * final 변수와 상수2
 * 대문자, 띄어쓰기는 _ 로 쓰는게 상수의 관례 
 * 기능이 아닌 고정값을 쓰는 것이 주 목적 (값이 불변하기에 데이터가 변하는 문제 없다)
 */
public class Constant {
    //수학 상수
    public static final double PI = 3.14;

    //시간 상수
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_HOUR = 60;
    
    //애플리케이션 설정 상수
    public static final int MAX_USERS = 1000;
}
