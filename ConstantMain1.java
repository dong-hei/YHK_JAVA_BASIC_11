package section9_final;

/**
 * final 변수와 상수2
 */
public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여 자수" + Constant.MAX_USERS); // 관리하기 편하고 가독성이 좋아진다
        int currentUserCnt = 999;
        process(currentUserCnt++);
        process(currentUserCnt++);
        process(currentUserCnt++);
        process(currentUserCnt++);

    }

    private static void process(int currentUserCnt){
        System.out.println("참여자 수" + currentUserCnt);
        if (currentUserCnt > Constant.MAX_USERS){
            System.out.println("대기자로 등록합니다.");
        } else{
            System.out.println("게임에 참여 합니다.");

        }    }
}
