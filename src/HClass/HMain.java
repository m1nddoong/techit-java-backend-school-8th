package HClass;

import java.io.PrintStream;

public class HMain {
    public static void main(String[] args) {

        /*
            H1
         */
        Person me = new Person("M1nddong");
        for (int i = 0; i < 6; i++) {
            me.age();
        }
        System.out.println(me.getAge());
        me.SayHello();


        /*
            H2
         */
//        // 게좌번호 ("1111"), 잔고 (20000원), 비밀번호 ("1234")
//        BankAccount account1 = new BankAccount("1111", 20000, "1234");
//        account1.deposit(5000); // 계정1에 5000원 입금
//        // 게좌번호 ("2222"), 잔고 (10000원), 비밀번호 ("5678")
//        BankAccount account2 = new BankAccount("2222", 10000, "5678");
//        account2.withdraw(5000, "1234"); // 계정2에서 5000원 출금
//
//        // 총 생성된 계좌 숫자 출력
//        System.out.println(BankAccount.printAllAccounts());
//
//        // 잔고 총합
//        System.out.println(BankAccount.printSumOfAccounts());
//        System.out.println();
//        /*
//            H3
//         */
//        Post newPost = new Post("편지", "안녕", "1234");
//        newPost.printPost();
//        newPost.editTitle("이등병의 편지", "1234");
//        newPost.editContent("충성!", "1234");
//        newPost.printPost();

        /*
            H4
         */
        Note note = new Note("공부", 3);
        note.write(0, "영어 공부하기");
        note.write(1, "수학 공부하기");
        System.out.println(note.read(1));
        note.printWrittenPages();
        note.printAllPages();
    }
}
