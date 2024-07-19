public class is_palindrom {
        public String firstPalindrome(String[] words) {
            for(String word:words){
                if(isPalindrom(word)){
                    return word;
                }
            }
            return "";
        }
        public boolean isPalindrom(String word){
            int i =0;
            int j = word.length()-1;
            while(i <j){
                if(word.charAt(i) != word.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
}