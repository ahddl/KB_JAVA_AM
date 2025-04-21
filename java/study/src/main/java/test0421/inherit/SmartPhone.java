package main.java.test0421.inherit;

public class SmartPhone extends Phone {
    //필드 2개+1개=3개, 메서드 4개+2개=6개

    //필드 선언
    public boolean wifi = false; //클래스 바로 아래 선언된 ㅣㄹ드는 자동 초기화
    //false 자동 초기화

    //생성자 선언
    //color, model 을 객체 생성시 초기화를 하고 싶은 경우
    public SmartPhone(String color, String model) {
        this.color = color; //눈에는 안보이지만 color, model 접근 가능해서 값 초기화
        this.model = model;
    }

    //메소드 선언
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
}
