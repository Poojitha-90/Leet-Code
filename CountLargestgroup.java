class CountLargestgroup {
    public int countLargestGroup(int n) {
    Map<Integer,Integer> cnt=new HashMap<>();
    for(int i=1;i<=n;i++){
      int tot = digitsum(i);
      if(cnt.containsKey(tot)){
        cnt.put(tot,cnt.get(tot)+1);
      }
      else{
        cnt.put(tot,1);
      }
   }
   int mx=0;
   for(int c : cnt.values()){
    if(c>mx){
      mx=c;
    }
   }
  int res=0; 
  for(int val:cnt.values()){
    if(val==mx){
      res ++;
    }
  }
  return res;
    }
    private int digitsum(int n){
      int sum=0;
      while(n>0){
        sum+=n%10;
        n=n/10;
      }
      return sum;
    }
}