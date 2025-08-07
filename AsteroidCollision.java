class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int a: asteroids){
            boolean destroyed= false;
            while((!stack.isEmpty()) && (a <0) && (stack.peek())>0){
                if(Math.abs(a)>stack.peek()){
                    stack.pop();
                    continue;
                }
                else if(Math.abs(a)==stack.peek()){
                    stack.pop();
                    destroyed=true;
                    break;
                }
                else{
                    destroyed = true ;
                    break;
                }
            }
            if(!destroyed){
                stack.push(a);
            }
        }
        int [] res=new int [stack.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i]=stack.pop();
        }
        return res;
    }
}