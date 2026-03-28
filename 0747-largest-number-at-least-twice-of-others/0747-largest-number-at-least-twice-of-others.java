import java.util.OptionalInt;
import java.util.concurrent.atomic.AtomicInteger;
class Solution {
    public int dominantIndex(int[] nums) {

        OptionalInt maxi=Arrays.stream(nums).max();
        AtomicInteger index = new AtomicInteger(0);
        AtomicInteger finalIndex = new AtomicInteger();
        Arrays.stream(nums).peek(i->index.set(index.get()+1)).filter(i->i==maxi.getAsInt()).peek(i->finalIndex.set(index.get()-1)).count();
        long countTing= Arrays.stream(nums).map(i->i*2).filter(i->i<=maxi.getAsInt()).count();
        System.out.print(countTing);
        if(countTing==nums.length-1) return finalIndex.get();
        return -1;
    }
}