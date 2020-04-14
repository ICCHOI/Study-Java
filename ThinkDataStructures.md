Think Data Structures(자바로 배우는 핵심 자료구조와 알고리즘)
===

1.Interface
---

자바에서 interface는 method들의 집합을 의미한다.  

interface를 구현하는 class는 반드시 interface가 명시한 method를 제공해야 한다.

Java Collection Framework는 List라는 interface를 정의하고 ArrayList와 LinkedList라는 클래스를 제공한다. 

위의 내용과 결합하면 List interface가 제공하는 메소드들은 ArrayList와 LinkedList 또는 List를 구현하는 어떤 객체와도 동작할 수 있어야 한다.

[code](/src/chapter1/ListClinetExample.java)

구현 클래스가 아닌 List를 사용함으로써 코드를 인터페이스에 의존 시킴으로써 특정 구현에 대한 의존에서 벗어 날 수 있음.  

-> 이러한 장점으로 생성자만 변경하면 다른 구현 클래스를 사용할 수 있음.  


>Q1. ArrayList 객체를 List Interface로 교체하면?  
그리고 왜 List Interface로는 Instance가 생성되지 않을까?

