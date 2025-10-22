import java.util.Scanner;

public class lunch {
    public static void main(String[] args) {
        System.out.println("배고파요");
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴추천");
        String lunch = sc.nextLine();
        System.out.println(lunch);
        System.out.println("수정");
        sc.close();
    }
}
