package in.other;

public class TestNeighbor {
    Parent aparent;
    TestNeighbor(){
        aparent = new Parent();
    }
    public static void main(String ... args){
        System.out.println(new TestNeighbor().aparent.x);
    }
}
