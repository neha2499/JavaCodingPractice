import java.util.*;

public class FrequencyElement {
    public static void calculateFrequency(List<String> list){
        List<String> output = new ArrayList<>();
        Map<String,Integer> map= new HashMap<>();

        Collections.sort(list);
        int j;
        int i=0;
        while (i<list.size()){
            int count =1;
            j=i;
            while(j < list.size() - 1 && list.get(j)==list.get(j+1)){
                count++;
                j++;
            }
            map.put(list.get(i),count);

            i=i+count;
        }

        map.forEach((k, v)
                -> System.out.println(k + " : "
                + v ));

        map.forEach((k, v)
                -> output.add(k+Integer.toString(v)));

       output.forEach((temp)-> System.out.println(temp));
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("neha");
        list.add("neha");
        list.add("jass");
        list.add("tahi");
        list.add("jass");
        list.add("apporva");

        list.forEach((temp)-> System.out.println(temp));

        calculateFrequency(list);


    }
}
