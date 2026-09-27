class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>s1=new Stack<>();
        Stack<Character>s2=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s1.size()!=0 && s.charAt(i)!='#'){
                s1.push(s.charAt(i));
            }
            else if(s1.size()!=0 && s.charAt(i)=='#'){
                s1.pop();
            }
            else if(s1.size()==0 && s.charAt(i)!='#'){
                s1.push(s.charAt(i));
            }
        }
        String res1="";
        while(s1.size()!=0){
            res1+=s1.pop();
        }
        for(int i=0;i<t.length();i++){
            if(s2.size()!=0 && t.charAt(i)!='#'){
                s2.push(t.charAt(i));
            }
            else if(s2.size()!=0 && t.charAt(i)=='#'){
                s2.pop();
            }
            else if(s2.size()==0 && t.charAt(i)!='#'){
                s2.push(t.charAt(i));
            }
        }
        String res2="";
        while(s2.size()!=0){
            res2+=s2.pop();
        }
        if(res1.equals(res2)){
            return true;
        }
        return false;
    }
}