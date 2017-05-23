package android.course.innerclassesandcollections;

/**
 * Created by Jakars on 23/05/2017.
 */

//Class in a class
public class House {
    private String address;

    public House(String address) {
        this.address = address;
    }

    //No room without a house.
    //Room always knows the house it's in. (IE a reference).

    public class Room{
        private double width;
        private double height;

        public Room(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public String toString() {
            //Option - House.this.toString();
            return "Room: Width: " + width +
                    " Height: " + height +
                    " Address: " + address;
        }
    }
}
