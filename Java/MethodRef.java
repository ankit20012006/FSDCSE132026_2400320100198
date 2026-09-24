class Traverse{
    public void print(int x){
        
    }
}
void main(){
    Stream<Integer> nums=
    Stream.iterate(10, n -> n + 1).limit(5);

    // nums.forEach(new Traverse():: print);
    nums.forEach(x-> System.out.print(x+" "));  
}