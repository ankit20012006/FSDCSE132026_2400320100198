import java.util.*;
void main(){
    Set<Integer> list1 = new HashSet<>();
    list1.add(1);
    list1.add(2);
    list1.add(null);
    list1.add(-5);
    list1.add(0);

    System.out.println(list1);
    list1.addAll(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(list1);

    Set<Integer> list2 = new HashSet<>();
    for(int i=1;i<=10;i++){
        list2.add(i);
    }
    System.out.println(list2);

    Set<Integer> list3 = new HashSet<>();
    list3.addAll(list1);
    list3.addAll(list2);
    System.out.println(list3);

    Set<Integer> list4 = new HashSet<>();
    list4.addAll(list3);
    System.out.println(list4);

    Set<Integer> list5 = new HashSet<>();
    list5.addAll(list1);
    list5.addAll(list2);
    System.out.println(list5);
}