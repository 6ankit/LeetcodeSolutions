class Solution {
    public int getMonthStartDay(int monthStart){
        if(monthStart==1){
            return 1;
        }if(monthStart==2){
            return 32;
        }if(monthStart==3){
            return 60;
        }if(monthStart==4){
            return 91;
        }if(monthStart==5){
            return 121;
        }if(monthStart==6){
            return 152;
        }if(monthStart==7){
            return 182;
        }if(monthStart==8){
            return 213;
        }if(monthStart==9){
            return 244;
        }if(monthStart==10){
            return 274;
        }if(monthStart==11){
            return 305;
        }return 335;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int aliceArrive = Integer.valueOf(arriveAlice.substring(3,5));
        int aliceLeave = Integer.valueOf(leaveAlice.substring(3,5));
        int aliceArriveMonth = Integer.valueOf(arriveAlice.substring(0,2));
        int aliceLeaveMonth =  Integer.valueOf(leaveAlice.substring(0,2));
        
        int bobArrive = Integer.valueOf(arriveBob.substring(3,5));
        int bobLeave = Integer.valueOf(leaveBob.substring(3,5));
        int bobArriveMonth = Integer.valueOf(arriveBob.substring(0,2));
        int bobLeaveMonth = Integer.valueOf(leaveBob.substring(0,2));

        int[] yearDays = new int[365+1];
        
        int startMonth = getMonthStartDay(aliceArriveMonth)-1+aliceArrive;
        int endMonth = getMonthStartDay(aliceLeaveMonth)-1+aliceLeave;
       

        for(int i=startMonth;i<=endMonth;i++){
            yearDays[i]+=1;
        }
         startMonth = getMonthStartDay(bobArriveMonth)-1+bobArrive;
         endMonth = getMonthStartDay(bobLeaveMonth)-1+bobLeave;
        for(int i=startMonth;i<=endMonth;i++){
            yearDays[i]+=1;
        }
        int ans = 0;
        for(int i=0;i<yearDays.length;i++){
            if(yearDays[i]==2){
                ans+=1;
            }
        }

        return ans;
    }
}