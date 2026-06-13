class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        char[] arr = {
            'z','y','x','w','v','u','t','s','r','q','p','o',
            'n','m','l','k','j','i','h','g','f','e','d','c','b','a'
        };

        StringBuilder result = new StringBuilder();

        for (String str : words) {

            int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                int position = ch - 'a';

                sum += weights[position];
            }

            result.append(arr[sum % 26]);
        }

        return result.toString();
    }
}