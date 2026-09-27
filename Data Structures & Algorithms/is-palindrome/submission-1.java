class Solution {

    
    public boolean isSafe(char ch){
        return (ch >= '0' && ch <= '9') || 
           (ch >= 'A' && ch <= 'Z') || 
           (ch >= 'a' && ch <= 'z');
    }

    public boolean isUpperChar(char ch){
        return ch >= 'A' && ch <= 'Z';
    }
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while(i < j){
            char ch1 = s.charAt(i);
            while(i < j && !isSafe(ch1)){
                i++;
                ch1 = s.charAt(i);
            }

            char ch2 = s.charAt(j);
            while(i < j && !isSafe(ch2)){
                j--;
                ch2 = s.charAt(j);
            }


            if(Character.toLowerCase(ch1) != Character.toLowerCase(ch2)) return false;

            i++;
            j--;

        }

        return true;
    }
}
