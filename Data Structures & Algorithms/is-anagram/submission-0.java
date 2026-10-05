class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Integer> hs = new HashMap<>();
        for(char c : s.toCharArray()){
            hs.put(c,hs.getOrDefault(c,0)+1);
        }
        for(char c : t.toCharArray()){
            hs.put(c,hs.getOrDefault(c,0)-1);
        }
        for(int count: hs.values()){
            if(count!=0){
                return false;
            }
        }
        return true;

    }
}
