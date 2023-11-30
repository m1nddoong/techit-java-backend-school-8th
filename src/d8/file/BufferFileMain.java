package d8.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferFileMain {
    public static void main(String[] args) {
        List<String> readLines = new ArrayList<>();

        //Map 으로 바꿔서, 이름에 해당하는 나이 ? 새해가 밝아서 한살씩 먹는다? 의 문제도 응용 가능
        List<Person> people = new ArrayList<>();

        // try-with-resource
        // BufferedReader 는 파일을 읽기 위해서가 아니라
        // 전체적인 입출력 과정에 버퍼링 기능을 더해주기 위해서
        // try (FileReader fileReader = new FileReader("hello"); // 어떤 파일을 열건지
        try (FileReader fileReader = new FileReader("people.csv"); // 어떤 파일을 열건지
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                // 데이터를 모으고 정리하는 부분
                System.out.println(line);
                readLines.add(line);
                // 쉼표를 기준으로 나눈다.
                String[] seperated = line.split(",");
                Person person = new Person(
                        seperated[0],
                        seperated[1],
                        Integer.parseInt(seperated[2]),
                        seperated[3]
                );
                people.add(person); // 데이터를 자바 객체로 저장
            }
        } catch (IOException e) {
            System.out.println("Error Opening File: " + e.getMessage());
        }

        for (Person person : people) {
            System.out.println("name : " + person.getName());
            System.out.println("age : " + person.getAge());
        }

        // 파일 입출력은 장기기억장치에 입출력을 하는 것이기 때문에
        // 입출력 횟수를 줄여야 속도가 빨라진다.
        try (FileWriter fileWriter = new FileWriter("people2.csv"); // 어떤 파일에 작성할건지
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
//            for (String line : readLines) {
//                // 무슨 내용을 작성할건지
//                writer.write(line);
//                writer.newLine();
//            }
            for (Person person : people) {
                String line = String.format(
                        "%s,%s,%d,%s",
                        person.getName(),
                        person.getEmail(),
                        person.getAge() + 1,
                        person.getGender()
                );
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error Writing File: " + e.getMessage());
        }
    }
}
