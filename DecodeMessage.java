class DecodeMessage{
    public String decodeMessage(String key, String message) {
    Map<Character,Character> dict  = new HashMap<>();
    char curCh ='a';
    for(char ch : key.toCharArray()){
      if(Character.isLetter(ch)){
        if(!dict.containsKey(ch)){
          dict.put(ch, curCh);
          curCh++;
        }
      }
    }  
  dict.put(' ',' ');
  String res="";
  for(char c: message.toCharArray()){
       res+=dict.get(c);
  }
      return res;  
    }
}