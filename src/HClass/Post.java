package HClass;

/*
게시판의 게시글을 나타내는 `Post` 클래스를 만들어보자.
1. `Post`는 제목, 본문, 작성일, 수정일, 비밀번호에 대한 정보가 담겨있다.
   - 비밀번호는 게시글을 작성한 사람을 구분하기 위한 임의의 문자열이다.
   - 작성일, 수정일은 `LocalDateTime` 클래스를 활용한다.
     - `LocalDateTime.now()` 메서드는 현재 시각을 반환한다.
2. `Post`가 최초로 생성될 때 전달되는 데이터는 제목, 본문, 비밀번호이다.
   - 작성일, 수정일은 현재 시각으로 자동으로 할당된다.
   - 이때, 최초로 할당되는 시각은 둘이 일치해야 한다.
3. `printPost` 메서드를 가지고 있다.
   - `printPost`는
     ```
     제목: <제목>
     본문: <본문>
     작성일: <작성일>
     수정일: <수정일>
     ```
     의 형태로 내용물을 출력한다.
4. 제목을 수정할 `editTitle` 메서드를 가지고 있다.
   - 성공 여부를 `boolean` 데이터로 반환한다.
   - 인자로 새로 작성할 제목과 비밀번호를 받는다.
   - 입력된 비밀번호가 원래의 비밀번호와 다를 경우 실패한다.
5. 본문을 수정할 `editContent` 메서드를 가지고 있다.
   - 성공 여부를 `boolean` 데이터로 반환한다.
   - 인자로 새로 작성할 본문과 비밀번호를 받는다.
   - 입력된 비밀번호가 원래의 비밀번호와 다를 경우 실패한다.
 */

import java.time.LocalDateTime;
import jdk.jshell.execution.LoaderDelegate;

public class Post {
    private String title;
    private String body;
    private String password; // 임의의 문자열
    private LocalDateTime createDate; // 작성일
    private LocalDateTime modifyDate; // 수정일

    public Post(String title, String body, String password) {   //제목, 본문, 비밀번호
        this.title = title;
        this.body = body;
        this.password = password;
        this.createDate = LocalDateTime.now();
        this.modifyDate = LocalDateTime.now();
    }

    public void printPost() {
        System.out.println(String.format("제목: %s", title));
        System.out.println(String.format("본문: %s", body));
        System.out.println(String.format("작성일: %s", createDate));
        System.out.println(String.format("수정일: %s", LocalDateTime.now()));
        System.out.println();
    }

    public boolean editTitle(String newTItle, String passwd) { // 새로작성할 제목, 비밀번호
        boolean result = false;
        if (password.matches(passwd)) {
            title = newTItle;
            result = true;
        }
        return result;
    }

    public boolean editContent(String newBody, String passwd) { // 새로 작성할 본문과 비밀번호
        boolean result = false;
        if (password.matches(passwd)) {
            body = newBody;
            result = true;
        }
        return result;
    }


}
