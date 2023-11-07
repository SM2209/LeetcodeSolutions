public class Solution {
    public String originalDigits(String s) {
        char[] dic = {'z','w','g','x','u','s','v','o','t','i'};
        String[] digits = {"zero","two","eight","six","four","seven","five","one","three","nine"};
        int[] index = {0,2,8,6,4,7,5,1,3,9};
        int[] map = new int[26];
        int[] arr = new int[10];
        for(int i=0; i<s.length(); i++){
            map[s.charAt(i)-'a']++;
        }
        for(int i=0; i<10; i++){
            getNum(map, dic[i], digits[i], arr, index[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<10; i++){
            for(int t=0; t<arr[i]; t++){
                sb.append(i);
            }
        }
        return sb.toString();
    }
    private void getNum(int[] map, char c, String s, int[] arr, int index){
        int dup = map[c-'a'];
        for(int i=0; i<dup; i++){
            arr[index]++;
            for(int j=0; j<s.length(); j++){
                map[s.charAt(j)-'a']--;
            }
        }
    }
}