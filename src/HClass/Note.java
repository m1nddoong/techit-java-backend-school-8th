package HClass;

/*

### Q4

`Note` 클래스를 만들어보자.

1. `Note`는 제목과 페이지를 각각 문자열과 문자열 배열로 가지고 있다.
2. `Note`의 생성자는 제목과 페이지 수를 인자로 받는다.
   - 페이지의 길이는 전달받은 페이지 수와 동일하다.
3. `Note`는 글을 작성할 수 있는 `write` 메서드와 글을 읽을 수 있는 `read` 메서드를 가지고 있다.
   - `write` 메서드는 작성할 쪽과 작성할 내용을 인자로 받는다. 이때 본래 적혀있던 내용이 있다면 지워진다.
   - `read` 메서드는 읽을 쪽을 인자로 받는다. 작성된 내용을 반환한다. (작성된 내용이 없다면 `null`이 반환될 것이다.)
4. 총 몇쪽이 작성되었는지를 반환하는 메서드를 가지고 있다.
5. 작성된 모든 내용을 페이지 순서대로 출력하는 메서드를 가지고 있다. 작성되지 않은 페이지는 출력하지 않는다.
 */

public class Note {
    private static int writtenPages = 0;
    private String title;   // 제목
    private String[] pages; // 내용을 적을 페이지

    private String[] description; // 해당 페이지의 내용

    public Note(String title, int NumPages) {
        this.title = title;
        this.pages = new String[NumPages];  // 전달받은 페이지 수 만큼의 페이지 문자열 배열 생성
    }

    public void write(int index, String content) { // 작성할 쪽, 작성할 내용
        if (pages[index].equals(content)) {
            System.out.println("겹치는 내용이 있습니다.");
        } else {
            pages[index] = content;
            writtenPages++;
        }
    }

    public String read(int index) {
        return pages[index];
    }

    public void printWrittenPages() {
        System.out.println(String.format("총 몇쪽이 작성되었는지? : ", writtenPages));
    }

    public void printAllPages() {
        for (String content : pages) {
            if (content == "") {
                break;
            } else {
                System.out.println(content);
            }
        }
    }

}
