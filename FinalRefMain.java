package section9_final;
/**
 * final 변수와 참조
 */
public class FinalRefMain {
    public static void main(String[] args) {
        final Data d = new Data();
//        d = new Data(); //참조 대상을 변경할 수 없다.
        
        //참조 대상의 값은 변경 가능 (변수에 final이 없었기에)
        d.val = 20;
        System.out.println(d.val);

        d.val = 55;
        System.out.println(d.val);
    }
}
