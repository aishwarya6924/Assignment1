package BasicConcept;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray = { "AAAA", "BBBB", "CCCC", "DDDD", "EEEE" };
        boolean found = false;
        int index = 0;
        String searchStr = "AAAA";
       for (int i = 0; i <strArray.length; i++) {
       if(searchStr.equals(strArray[i])) {
            index = i; found = true; 
            break;
            }
        }
       if(found)
          System.out.println(searchStr +" found at the index "+index);
        else
          System.out.println(searchStr +" not found in the array");

    
	}

}
