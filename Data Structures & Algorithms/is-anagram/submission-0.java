class Solution {
    public boolean isAnagram(String s, String t) {
       char[]arr = s.toCharArray();
       Arrays.sort(arr);
       char [] num = t.toCharArray();
       Arrays.sort(num);
       if(s.length()!=t.length())
       {
        return false;
       }
       for(int i =0 ;i<arr.length;i++)
       {
        if(arr[i]!=num[i])
        {
            return false;
        }
       }
       return true;
    }
}
