class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
    Map<Character,Character> s_dict = new HashMap<>(); 
    Map<Character,Character> t_dict = new HashMap<>(); 
    // hash map creating and character character mapping 
    int n=s.length();
    for(int i=0;i<n;i++){
      char s_ch=s.charAt(i);
      char t_ch=t.charAt(i);
      if(s_dict.containsKey(s_ch)){
        if(s_dict.get(s_ch)!=t_ch){
          return false;
        }
      }
      else{
        s_dict.put(s_ch,t_ch);
      }
      if(t_dict.containsKey(t_ch)){
        if(t_dict.get(t_ch)!=s_ch){
          return false;
        }
      }
      else{
        t_dict.put(t_ch,s_ch);
      }
     }
     return true;
    }
}