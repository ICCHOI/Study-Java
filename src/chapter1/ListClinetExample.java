package chapter1;

import java.util.LinkedList;
import java.util.List;

public class ListClinetExample {
    private List list;

    public ListClinetExample(){
        list = new LinkedList();
    }

    private List getList() {
        return list;
    }

    public static void main(String[] args) {
        ListClinetExample lce = new ListClinetExample();
        List list = lce.getList();
        System.out.println(list);
    }
}
