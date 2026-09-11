class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
        List<List<String>> finalList = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            int[] count = new int[26];
            for (int j = 0; j < strs[i].length(); j++) {
                count[strs[i].charAt(j) - 'a']++;
            }

            // Convert the frequency array into a String key
            String key = Arrays.toString(count);

            if(!mp.containsKey(key)) {
                mp.put(key, new ArrayList<>());
            }

            mp.get(key).add(strs[i]);

        }
        finalList.addAll(mp.values());
        
        return finalList;
    }
}
