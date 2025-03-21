package section9_final.ex;

public class Member {

    private final String id; // final 키워드 사용
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String name){
//        this.id = id; // final이라 불변
        this.name = name;
    }

    public void print(){
        System.out.println("id : " + id + ", name : " + name);
    }
}
