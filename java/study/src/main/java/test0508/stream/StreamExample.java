package main.java.test0508.stream;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = {"홍길동", "신용권", "김미나"};

        //1. 배열에 있는 내용을 하나씩 꺼내와서 , 로 연결한 후 프린트
        //stream을 사용해보자!

        //스트림으로 만들어라 -> 중간처리(filter, map) -> 집계처리(sum, avg , ...)
        Stream<String> strStream = Arrays.stream(strArray);
        //strStream.forEach(하나씩 꺼내서 처리할 내용! 람다식으로 써주세요);
        strStream.forEach(item-> System.out.print(item+", "));  //홍길동, 신용권, 김미나,  ln생략시, 가로로 출력

        /*--------------------------------------------------------*/

        int[] intArray = {1, 2, 3, 4, 5};

        //2. 배열에 있는 내용을 하나씩 꺼내와서 , 로 연결한 후 프린트
        //stream을 사용해보자!
        //스트림으로 만들어라 -> 중간처리(filter, map) -> 집계처리(sum, avg , ...)

        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(item-> System.out.print(item+", "));

    }
}
