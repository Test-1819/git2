
public class SearchBook {

    public static void main(String[] args) {

        int[] bookIds = {101, 102, 103};

        int searchId = 102;
        boolean found = false;

        for (int id : bookIds) {
            if (id == searchId) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Book Found");
        } else {
            System.out.println("Book Not Found");
        }
    }
}
