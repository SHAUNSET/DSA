class Solution {
    public int maxVowels(String s, int k) {

        int count = 0 ;

        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');


        for(int i = 0 ; i < k ; i++){
            char c = s.charAt(i);

            if(vowels.contains(c)){
                count++;
            }
        }

        int maxcount = count;

        for(int i = k ; i < s.length() ; i++ ){

            char prev = s.charAt(i - k);
            char next = s.charAt(i);

            if(vowels.contains(prev)){
                count--;
            }

            if(vowels.contains(next)){
                count++;
            }

            maxcount = Math.max(count , maxcount);

        }

        return maxcount;
        
    }
}