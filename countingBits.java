class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=count(i);
        }
        return arr;
    }
    public int count(int a){
        int count=0;
        while(a>0){
            if(a%2==1){
                count++;
            }
            a=a/2;
        }
        if(a==1){
            return count+1;
        }
        else{
            return count;
        }
    }
}
