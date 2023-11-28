package HClass;

/*
### Q2
은행 계좌를 나타내는 `BankAccount` 클래스를 만들어보자.
 */

import java.awt.image.BandCombineOp;
import java.util.Scanner;

public class BankAccount {
    /*
    1. 계좌 번호, 잔고, 비밀번호에 대한 정보가 담겨있다.
   - 계좌 번호는 0~9 사이의 숫자로 이루어진 8자리 문자열이다.
   - 비밀번호는 0~9 사이의 숫자로 이루어진 4자리 문자열이다.
     */
    private String accountNumber; // 계좌번호
    private String password;  // 비밀번호 : "1234" 문자열
    private int balance;  // 잔고
    private static int acountCount = 0;
    private static int totalBalance = 0;

    // 생성자
    public BankAccount(String accountNumber, String password) {
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.password = password;
        acountCount++;
    }

    /*
    2. 입금을 나타내는 `deposit` 메서드를 가지고 있다.
    - 입금액을 인자로 받는다.
    - 이후 결과를 정수로 반환한다.
     */

    public int deposit(int depositAmount) { // 입금하는 메서드
        // 내 잔고
        this.balance += depositAmount;
        // 은행 잔고
        this.totalBalance += depositAmount; // 임금한 만큼 총액 업데이트
        // 내 잔고 반환
        return this.balance;
    }

    /*
    3. 출금을 나타내는 `withdraw` 메서드를 가지고 있다.
    - 성공 여부를 `boolean` 데이터로 반환한다.
    - 출금액과 비밀번호를 인자로 받는다.
    - 비밀번호가 일치하지 않으면 실패한다.
       - 비밀번호의 일치 여부는 문자열 객체의 '.equals()' 를 활용한다.
    - 계좌 잔고가 부족하면 실패한다. (false 를 반환한다)
     */
    public boolean withdraw(int withdrawAmount, String password) {
        if (!this.password.equals(password) || this.balance < withdrawAmount) {
            return false;
        }

        this.balance -= withdrawAmount;
        totalBalance -= withdrawAmount;
        return true;
    }

    /*
    4. 총 생성된 계좌의 숫자와, 전체 계좌들의 잔고 총합에 대한 정보를 가지고 있다.
    - 이 정보를 반환하는 메서드를 가지고 있다.
     */

    public static int getAcountCount() {
        return acountCount;
    }

    public static int getTotalBalance() {
        return totalBalance;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("asdf", "1234");
        BankAccount account2 = new BankAccount("qwer", "1234");
        account1.deposit(100);
        account1.deposit(200);
        account1.deposit(300);
        System.out.println(account1.withdraw(300, "1234"));
        System.out.println(account1.withdraw(300, "1234"));
        System.out.println(BankAccount.getAcountCount());
        System.out.println(BankAccount.getTotalBalance());
    }
}
