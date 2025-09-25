class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length==0){
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for(String str:strs){
            String freqStr = getFreqString(str);

            if(map.containsKey(freqStr)){
                map.get(freqStr).add(str);
            }
            else{
                List<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(freqStr,strList);
            }
        }

        return new ArrayList<>(map.values());

    }


    private String  getFreqString(String str){
        int[] freq = new int[26];

        for(char c : str.toCharArray()){
            freq[c-'a']++;
        }


        StringBuilder freqString = new StringBuilder("");

        char c = 'a';

        for(int i:freq){
            freqString.append(c);
            freqString.append(i);
            c++;
        }

        return freqString.toString();

    }
}
