public class CTCIConversion {
    public static void main(String[] args) {
        try{
            CTCIConversion obj = new CTCIConversion();
            obj.run(args);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void run(String[] args){
        //Prints the number of bits that need to be changed to convert A to B
        System.out.println("Number of bits flipped to convert A to B: " + findNumberOfDifferentBits(29,15));
    }
    public int findNumberOfDifferentBits(int a,int b){
        int xorResult = a ^ b;
        String xorAsString = Integer.toString(xorResult,2);
        int numOfOnes = 0;
        for(int x=0;x<xorAsString.length();x++){
            if(xorAsString.charAt(x) == 49){
                numOfOnes++;
            }
        }
        return numOfOnes;
    }
}