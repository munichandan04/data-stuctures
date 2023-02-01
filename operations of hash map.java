import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap();
        //creation
        map.put("muni",20);
        map.put("ram",100);
        map.put("ravi",200);
        System.out.println(map);
        //size
        System.out.println(map.size());
        //searching
        if(map.containsKey("muni")) {
            System.out.println("key is present");
        }else{
            System.out.println("key is not present");

        }
        System.out.println(map.get("muni"));
        //iteration-1
        for(Map.Entry<String,Integer> e:map.entrySet())
        {
            System.out.println(e.getKey());
        }



    }
}
