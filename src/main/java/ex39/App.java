package ex39;


import java.util.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ArrayList<Map<String,String>> mapList = createMapList();
        Collections.sort(mapList, mapComparator);

        //print out the maps
        System.out.println(String.format(" %20s | %20s | %20s", "Name", "Position", "Separation Date")); //format
        System.out.println("----------------------|----------------------|----------------------"); //division things

        Map<String,String> map;
        String Names, jobs, dates;
        for (int i = 0; i < mapList.size(); i++) { //for the size of the map
            map = mapList.get(i);

            Names = map.get("First Name")  + " " + map.get("Last Name");
            jobs = map.get("Position");
            dates = map.get("Separation Date");
            System.out.print(String.format(" %20s | %20s | %20s", Names, jobs, dates + "\n"));

        }
    }
    //functions

    //comparator thing
    public static Comparator<Map<String, String>> mapComparator = new Comparator<Map<String, String>>() {
        public int compare(Map<String, String> fName, Map<String, String> lName) {
            return fName.get("First Name").compareTo(lName.get("Last Name"));
        }
    };

    //create a map
    public static Map<String, String> newMap(String firstName, String lastName, String job, String date){
        Map<String, String> map = new HashMap<String, String>(); //creates the map
        //put info inside of map
        map.put("First Name", firstName);
        map.put("Last Name", lastName);
        map.put("Position", job);
        map.put("Separation Date", date);
        return map; //return the created map
    }
    public static ArrayList<Map<String,String>> createMapList(){ //create a list of maps
        ArrayList<Map<String,String>> mapList = new ArrayList<Map<String,String>>();
        Map<String,String> map;

        //create the list of maps using the data in the exercise
        map = newMap("John", "Johnson", "Manager", "2016-12-31");
        mapList.add(map);
        map = newMap("Tou", "Xiong", "Software Engineer", "2016-10-05");
        mapList.add(map);
        map = newMap("Michaela", "Michaelson", "Distriict Manager", "2015-12-19");
        mapList.add(map);
        map = newMap("Jake", "Jacobson", "Programmer", " "); //date is empty, so I put a space
        mapList.add(map);
        map = newMap("Jacquelyn", "Jackson", "DBA", " ");
        mapList.add(map);
        map = newMap("Sally", "Webber","Web Developer", "2015-12-18");
        mapList.add(map);

        //return the list
        return mapList;
    }
}
