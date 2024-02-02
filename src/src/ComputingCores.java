import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComputingCores {



    public static int minCost(int n, int k, List<List<Integer>> plans) {
        // Sort the lists in descending order based on the last element
       // plans.sort(Comparator.comparingInt((List<Integer>plan) -> plan.get(plan.size() - 1)).reversed());
        plans.sort(Comparator.comparingInt((List<Integer>plan) -> plan.get(plan.size() - 1)));
        // Display the sorted lists
        plans.forEach(plan-> System.out.println(plan));
        int price=0;
        int n0=n;
        int i=0;
        int c0=k;
       while (n0>=0 && i<plans.size()){
           List<Integer> plan= plans.get(i);
           int l = plan.get(0);
           int r = plan.get(1);
           int c = plan.get(2);
           int p = plan.get(3);

           if (c>=k){

           n0=n-(r-l+1);
           price=price+k*(r-l+1);
               System.out.println("p1"+price);
           } else {
               if(c0==k) {
                   n0 = n - (r - l +2);
                   System.out.println("c "+c+" n0 "+n0+" p "+p);
                   price = price + c * p * n0;
                   System.out.println("price2" + price);
                   c0=c0-c;
               } else{
                   System.out.println(" c0 "+c0+" n0 "+n0+" p "+p);
                   price = price + c0 * p * n0;
               }
           }
           System.out.println("dhjhfj"+n0);
           i++;
       }
        System.out.println("final price"+price);
        return  price;
    }

    public static void main(String[] args) {

            int n = 5;
            int k = 7;
            List<List<Integer>> plans = new ArrayList<>();
            plans.add(Arrays.asList(1, 3, 5, 2));
            plans.add(Arrays.asList(1, 4, 5, 3));
            plans.add(Arrays.asList(2, 5, 10, 1));

            int result = minCost(n, k, plans);
            System.out.println(result);


    }
}
//A company plans to shift its infrastructure to the cloud. As a result, they will rent k computing cores per day for n days. The company is provided with m pricing plans for this duration. Each pricing plan has a l[i] and r[i] representing the days when it is available, c[i] cores available each day, and it costs p[i] to rent one core per day.
//
//The company can rent an arbitrary number of cores on each day from each available plan, ranging from 0 to c[i] cores. Given n, k, and plans as a 2d array, the function returns the minimum cost to complete the process.
//
//Example
//
//Suppose n = 5, k 7, and plans = [[1, 3, 5, 2], [1, 4, 5, 3], [2, 5, 10, 1]]
//
//The optimal strategy is shown.
//
//Day
//
//1
//
//Purchase cores/plan
//
//Cost
//
//5 from plan 1, 2 from plan 2
//
//5*2+2*3=16
//
//7 from plan 3
//
//7*1=7
//
//7 from plan 3
//
//7*1=7
//
//4
//
//5
//
//7 from plan 3
//
//7*1=7
//
//7 from plan 3
//
//The sum of costs is 16+7+7+7+7 = 44. Return 44.