Think Data Structures  
(자바로 배우는 핵심 자료구조와 알고리즘)
===
![Image by. hanbit](http://www.hanbit.co.kr/data/books/B1619666323_l.jpg)

> [자바로 배우는 핵심 자료구조와 알고리즘](http://www.hanbit.co.kr/store/books/look.php?p_code=B1619666323) 책을 통해 학습하면서 정리한 내용입니다.

C1. Interface
---

자바에서 interface는 method 집합을 의미한다.  
특정 interface를 구현하는 class는 반드시 interface가 명시한 method를 제공해야 한다.

Java Collection Framework는 List라는 interface를 정의하고 그 중 ArrayList와 LinkedList라는 클래스를 제공한다. 

위의 내용과 결합하면 List interface가 제공하는 메소드들은 ArrayList와 LinkedList 또는 List를 구현하는 어떤 객체와도 동작할 수 있어야 한다.

[code](./src/chapter1/ListClinetExample.java)

위 코드에서는 구현 클래스가 아닌 List를 사용함으로써 코드를 인터페이스를 기준으로 의존 시킴으로써 특정 구현 클래스에 대한 의존에서 벗어 날 수 있다.  

-> 이러한 장점으로 생성자만 변경하면 다른 구현 클래스를 사용할 수 있다.  


>Q1. ArrayList 객체를 List Interface로 교체하면?  
그리고 왜 List 인터페이스로는 Instance가 생성되지 않을까?

A. ArrayList 객체를 List로 수정하면 인터페이스로는 Instance를 생성할 수 없기 때문에 Code가 실행 될 수 없다. Interface로 Instance가 생성되지 않는 이유는 Interface는 선언 부분만 존재하고 구현 부분이 존재하지 않기 때문에 객체를 생성할 수 없다. ( 즉, 행동은 존재 하나 자기 자신의 Identitiy 또는 State가 존재 하지 않음. )
