package sealedexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        // yield test
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(
                switch (br.readLine()){
                    case "O"->{
                        yield "You chose 'O'";
                    }
                    case "X"->{
                        yield  "You chose 'X'";
                    }
                    default -> {
                        yield "You had a wrong choice";
                    }
                }
        );

        // Record 활용 예시
        PersonData personData = new PersonData(1L, "박상기");

        System.out.println(personData);
        System.out.println(personData.id);
        System.out.println(personData.name);
        System.out.println(personData.id());
        System.out.println(personData.name());

        br.close();
    }

    record PersonData(Long id, String name){
        @Override
        public Long id() {
            return id;
        }

        @Override
        public String name() {
            if(name.isBlank())
                throw new IllegalArgumentException("이름의 내용이 올바르지 않습니다.");
            return name;
        }
    }
}