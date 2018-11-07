class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1s = version1.split("\\.");
        String[] v2s = version2.split("\\.");
        int i = 0;
        for(i = 0; i < Math.min(v1s.length, v2s.length); i++){
            
            if(Integer.parseInt(v1s[i]) > Integer.parseInt(v2s[i])){
                return 1;
            }
            if(Integer.parseInt(v1s[i]) < Integer.parseInt(v2s[i])){
                return -1;
            }
        }
        int reminder = 0;
        if(i == v2s.length){
            for(;i < v1s.length;i++){
                reminder += Integer.parseInt(v1s[i]);
            }
            return reminder == 0 ? 0 : 1;
        }
        
        if(i == v1s.length){
            for(;i < v2s.length;i++){
                reminder += Integer.parseInt(v2s[i]);
            }
            return reminder == 0 ? 0 : -1;
        }
        return 0;
        
    }
}
