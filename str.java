class str {
    public static void main(String[] args) {
        String a = "applejuice";
        String b = "aeiou";
        String ans = "";
        

        for (int i = 0; i < a.length(); i++) {
            boolean flag = false; 
            for (int j = 0; j < b.length(); j++) { 
                if (a.charAt(i) == b.charAt(j)) { 
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                ans += a.charAt(i); 
            }
        }
        
        System.out.println(ans);
    }
}