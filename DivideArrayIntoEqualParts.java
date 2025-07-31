class DivideArrayIntoEqualParts {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> dict = new HashMap<>();
        for(int num:nums){
          if(!dict.containsKey(num)){
            dict.put(num,1);
          }
          else{
            dict.put(num,dict.get(num)+1);
          }
        }
        for(int val: dict.values()){
          if(val%2!=0){
            return false;
          }
        }
     return true;   
    }
}