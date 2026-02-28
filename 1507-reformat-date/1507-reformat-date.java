class Solution {
   public String getActualMonth(String s) {
    if (s.equals("Jan")) return "01";
    if (s.equals("Feb")) return "02";
    if (s.equals("Mar")) return "03";
    if (s.equals("Apr")) return "04";
    if (s.equals("May")) return "05";
    if (s.equals("Jun")) return "06";
    if (s.equals("Jul")) return "07";
    if (s.equals("Aug")) return "08";
    if (s.equals("Sep")) return "09";
    if (s.equals("Oct")) return "10";
    if (s.equals("Nov")) return "11";
    if (s.equals("Dec")) return "12";
    
    return ""; 
}
    public String reformatDate(String date) {
        int n=date.length();
        StringBuilder help = new StringBuilder();
        help.append(date.charAt(n-1));
        help.append(date.charAt(n-2));
        help.append(date.charAt(n-3));
        help.append(date.charAt(n-4));
        help.reverse();
        StringBuilder month = new StringBuilder();
        month.append(date.charAt(n-6));
        month.append(date.charAt(n-7));
        month.append(date.charAt(n-8));
        month.reverse();
        String actualMonth = getActualMonth(month.toString());
        StringBuilder day = new StringBuilder();
        day.append(date.charAt(n-12));
        if(n-13>=0) day.append(date.charAt(n-13));
        else day.append('0');
        day.reverse();
        return help.toString()+"-"+actualMonth+"-"+day.toString();
    }
}