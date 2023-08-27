# Design Pattern
## 싱글톤(Singleton) 패턴
 - 인스턴스를 오직 한개만 제공하는 클래스

## 팩토리 메소드(Factory method) 패턴
 - 구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다
 - 다양한 구현체(Product) 가 있고, 그중에서 특정한 구현체를 만들 수 있는 다양한 팩토리(Creator)를 제공할 수 있다.

팩토리 메서드 4부 - 장점과 단점
 - 팩터리 메소드 패턴을 적용했을 때의 장점? 단점?
 - "확장에 열려있고 변경에 닫혀있는 객체 지향 원칙" 을 설명하세요.
 - 자바 8에 추가된 default 메서드에 대해 설ㅊ 

## 추상 팩토리(Abstract Factory) 패턴
 - 서로 관련있는 여러 객체를 만들어주는 인터페이스
 - 구체적으로 어떤 클래스의 인스턴스(Concrete Product)를 사용하는지 감출 수 있다.
 - 팩토리 메서드 패턴과 추상 팩토리 패턴
    - 팩토리 메서드
        - 구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다.
        - 다양한 구현체가 있고, 그중에서 특정한 구현체를 만들 수 있는 다양한 팩토리를 제공할 수 있다.
    - 추상 팩토리
        - 서로 관련있는 여러 객체를 만들어주는 인터페이스
        - 구체적으로 어떤 클래서의 인스턴스를 사용하는지 감출 수 있다
 - 추상 팩토리와 팩토리 메서드 패턴과 흡사한데 무엇이 다른가
    - 모양과 효과는 비슷
        - 둘 다 구체적인 객체 생성 과정을 추상화한 인터페이스를 제공
    - 관점이 다르다
        - 팩토리 메소드 패턴은 팩터리를 구현하는 방법(inheritance)에 초점을 둔다
        - 추상 팩토리 패턴은 "팩토리를 사용하는 방법"(composition)에 초점을 둔다
    - 목적이 다르다
        - 팩토리 메소드 패턴은 구체적인 객체 생성 과정을 하위 또는 구체적인 클래스로 옮기는 것이 목적
        - 추상 팩토리 패턴은 관련있는 여러 객체를 구체적인 클래스에 의존하지 않고 만들 수 있게 해주는 목적
