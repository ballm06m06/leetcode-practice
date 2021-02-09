import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) 
            return new ArrayList<>();
        
        Map<String, List<String>> ans = new HashMap<String, List<String>>();

        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca); //Fuck me dead O(nlogn)
            String key = String.valueOf(ca);
            
            if (!ans.containsKey(key)) 
                ans.put(key, new ArrayList<String>());
            
            ans.get(key).add(s);
            System.out.println("ca: "+key+" s: "+s);
        }

        System.out.println(ans);
        return new ArrayList(ans.values());
    }

    public static void main(String[] args){
        GroupAnagrams gp = new GroupAnagrams();
        gp.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});

    }
}
