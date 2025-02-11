package section9_final.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member m = new Member("Id11", "kim");
        m.print();
        m.changeData("kimkim");
        m.print();
    }
}
