import java.util.LinkedList;
public class test {
    public static void main(String[] args) {


        LinkedList<String> texts = new LinkedList<>();

        texts.add("딸기");
        

        // 딸기 -> 포도 -> 사과

        // 첫 번째 Node의 앞에 삽입
        texts.addFirst("시작");
        texts.add(1,"딸기");

        // 마지막 Node의 뒤에 삽입
        texts.addLast("마지막");
        System.out.println(texts);
    }
}
