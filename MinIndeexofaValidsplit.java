class MinIndeexofaValidsplit {
    public int minimumIndex(List<Integer> nums) {
     Map<Integer,Integer> left= new HashMap<>();
     Map<Integer,Integer> right=new HashMap<>();
     for(int num:nums) {
      right.put(num,right.getOrDefault(num,0)+1);
      }
      int n=nums.size();
      for(int i=0;i<n;i++){
        int ele=nums.get(i);
        left.put(ele,left.getOrDefault(ele,0)+1);
        right.put(ele,right.get(ele)-1);
        if(left.get(ele)*2>(i+1)&&right.get(ele)*2 >(n-1-i)){
            return i;
        }   
      }
      return -1;
     }
       
    }
