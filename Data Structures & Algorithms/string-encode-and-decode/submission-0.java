class Solution {

    public String encode(List<String> strs) {
        String encodedStr = "";
        for(String str : strs){
            int len = str.length();
            encodedStr += String.valueOf(len) + "@" + str; 
        }
        System.out.println(encodedStr);
        return encodedStr;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0, n = str.length(); 

        while(i < n){
            String digit = "";
            System.out.println(i);
            while(str.charAt(i) != '@'){
                digit += str.charAt(i);
                i++;
            }
            System.out.println(digit);
            int strLen = Integer.parseInt(digit);
            i++;
            String decodedStr = "";
            for(int j = 0; j < strLen; j++){
                decodedStr += str.charAt(i);
                i++;
            }
            System.out.println(decodedStr);

            list.add(decodedStr);
        }


        return list;
    }
}
