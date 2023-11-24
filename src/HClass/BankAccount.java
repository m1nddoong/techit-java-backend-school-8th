package HClass;

/*
### Q2

은행 계좌를 나타내는 `BankAccount` 클래스를 만들어보자.

1. 계좌 번호, 잔고, 비밀번호에 대한 정보가 담겨있다.
   - 계좌 번호는 0~9 사이의 숫자로 이루어진 8자리 문자열이다.
   - 비밀번호는 0~9 사이의 숫자로 이루어진 4자리 문자열이다.
2. 입금을 나타내는 `deposit` 메서드를 가지고 있다.
   - 입금액을 인자로 받는다.
3. 출금을 나타내는 `withdraw` 메서드를 가지고 있다.
   - 성공 여부를 `boolean` 데이터로 반환한다.
   - 출금액과 비밀번호를 인자로 받는다.
   - 비밀번호가 일치하지 않으면 실패한다.
   - 계좌 잔고가 부족하면 실패한다.
4. 총 생성된 계좌의 숫자와, 전체 계좌들의 잔고 총합에 대한 정보를 가지고 있다.
   - 이 정보를 반환하는 메서드를 가지고 있다.
 */

import java.util.Scanner;

public class BankAccount {
    private static int allAccounts = 0;
    private static int SumOfAccounts = 0;
    private String accountNumber;
    private int balance;
    private String password;  // "1234" 문자열

    public BankAccount(String accountNumber, int balance, String password) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.password = password;
        allAccounts++;
        SumOfAccounts += balance; // 맨처음에는 잔고를 넣어줌
    }

    public void deposit(int depositAmount) {
        balance += depositAmount;
        SumOfAccounts += depositAmount; // 임금한 만큼 총액 업데이트
    }

    public boolean withdraw(int withdrawAmount, String password) {
        boolean result = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("비밀번호를 입력하세요 : ");
        String passwd = scanner.nextLine();
        if (password.matches(passwd)) {
            if (balance > 0 && balance > withdrawAmount) {
                balance -= withdrawAmount;
                SumOfAccounts -= withdrawAmount; // 출금한 만큼 총액 업데이트
                result = true;
            }
            else result = false;
        }
        else {
            result = false;
        }
        return result;
    }

    public static int printAllAccounts() {
        return allAccounts;
    }

    public static int printSumOfAccounts() {
        return SumOfAccounts;
    }
}
