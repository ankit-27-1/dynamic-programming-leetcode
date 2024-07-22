class Solution {
    public int maxRepeating(String sequence, String word) {
        int max=0;
        String rep=word;
        while(sequence.contains(rep)){
            max++;
            rep=rep+word;
        }
        return max;
    }
}
