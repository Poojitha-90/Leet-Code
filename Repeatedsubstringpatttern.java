class Repeatedsubstringpatttern {
    public boolean repeatedSubstringPattern(String s) {
        String doubled=s+s;
        if(doubled.indexOf(s,1)<s.length()){
            return true;
        }
        else{
            return false;
        }
    
        
    }
}