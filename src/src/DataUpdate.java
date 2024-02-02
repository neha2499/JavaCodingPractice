import java.util.ArrayList;
import java.util.List;

public class DataUpdate {

    public static List<Integer> performUpdates(List<Integer> data, List<int[]>updates) {

        int l;
        int r;
        int[] prefixSum= new int[data.size()];
        for (int[] update : updates) {
            l = update[0];
            r = update[1];



//
//            for (int i = update1; i <= update2; i++){
//
//                data.set(i-1,-data.get(i-1));
//            }
// You can reduce the time complexity of the code by using a more efficient approach to perform the updates.
// Instead of iterating through each update range and modifying the elements in the ArrayList one by one, you can
// calculate the cumulative effect of all updates and apply them in a single pass.


            prefixSum[l-1] +=1;
            if(r< data.size()){
                prefixSum[r] -=1;
            }

        }

        int sum=0;
        for(int i =0; i< data.size();i++){
            sum += prefixSum[i];
            data.set(i,data.get(i)*((sum%2 == 0)?1:-1));
        }

        return data;
    }

}

class main {
    public static void main(String[] args) {

        List<Integer> data= new ArrayList<>();
        data.add(1);
        data.add(-4);
        data.add(-5);
        data.add(2);
        List<int[]> updates= new ArrayList<>();
        updates.add(new int[]{2, 4});
        updates.add(new int[]{1,2});

        DataUpdate dataUpdate =new DataUpdate();
        List<Integer> data1= dataUpdate.performUpdates(data,updates);
        System.out.println("updated data: "+ data1);


    }
}
