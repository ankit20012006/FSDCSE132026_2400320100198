import java.util.stream.Stream;

void main(){
    int []arr ={1,4,3,2,6,7,8,10,2};
 Stream<Integer> st1 = Arrays.stream(arr).boxed();

 Integer[]arr2 = {1,4,3,2,6,7,8,10,2};
 Stream<Integer> st2 = Arrays.stream(arr2);

 st1.forEach(s-> System.out.print(s+" "));
 System.out.println();
 Stream<String> st3 = Stream.of("a","b","c","d");
 st2.forEach(s-> System.out.print(s+" "));
 st3.forEach(s-> System.out.print(s+" "));


 Stream<Integer> nums=
 Stream.iterate(10, n -> n + 1).limit(5);
 nums.forEach(s-> System.out.print(s+" "));
 System.out.println();
 nums.forEach(s-> System.out.print());
 Stream<Double> randoms = Stream.generate(() -> Math.random());

