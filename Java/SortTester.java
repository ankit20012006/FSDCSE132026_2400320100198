void show(int[] nums){
    for(var a: nums)
        System.out.print(a+" ");
        System.out.println();
    }
    void main(){
        int[] nums = {2,4,-1,80,373,0};
        show(nums);
        Arrays.sort(nums);
        show(nums);
     }

  String   