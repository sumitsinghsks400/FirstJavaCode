package JavaInterviewQ;

import java.util.Arrays;

public class ContinuousSequencesNumber6 {
    public static void main(String[] args) {

        String inputArray[]= {"1","2","3","5","9","a","6","7","8","4","@","-5","-7","-3","-2","-1"};

        int array[]= Arrays.stream(inputArray).filter(in -> {
            boolean out =true;
            try {
                Integer.valueOf(in);

            } catch(Exception e ) {
                out = false;
            }
            return out;
        }).mapToInt(e->Integer.valueOf(e)).toArray();

        for(int i=0;i<array.length;i++) {
            StringBuffer result = new StringBuffer("");
            for(int j=i+1;j<array.length;j++) {
                int next= array[i]+1;
                if(next== array[j]) {
                    if(result.toString().isEmpty())
                        result.append(array[i]+"::"+array[j]);
                    else
                        result.append("::"+array[j]);

                    i=j;


                }else {
                    break;

                }
            }
            if(!result.toString().isEmpty())
                System.out.println(result.toString());
        }


    }
}
