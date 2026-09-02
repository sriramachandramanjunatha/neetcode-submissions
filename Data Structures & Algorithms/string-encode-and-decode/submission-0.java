class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String str:strs){
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        
        List<String> res = new ArrayList<>();
        int i=0;
        while(i < str.length()){
            int j=i;
            //find the 1st character and  ....
            while(str.charAt(j)!='#'){
                j++;
            }
            // ["HELLO","WORLD"]
            // 5#HELLO5#WORLD
            // j=1
            // length="5#"=5
            int length = Integer.parseInt(str.substring(i,j));
            //index point to the 1st character to decode and  ....
            //i=2
            i=j+1;
            // j=7
            j=i+length;
            //(2,7)=HELLO
            res.add(str.substring(i, j));
            i = j;
        }
        return res;
    }
}
