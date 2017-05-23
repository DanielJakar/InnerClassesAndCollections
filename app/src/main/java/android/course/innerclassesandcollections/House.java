package android.course.innerclassesandcollections;

import android.os.Build;
import android.support.v7.app.AlertDialog;

import java.util.ArrayList;

/**
 * Created by Jakars on 23/05/2017.
 */

//Class in a class
public class House {
    private String address;

    private ArrayList<Room> rooms = new ArrayList<>();

    //No Constructor: Must have a factory or builder
    private House() {
    }

    public static class Builder{
        private House h;

        public Builder (){
            this.h = new House();  //empty house, no rooms, no address.
        }

        public Builder addRoom(double width, double height){
            Room r = h.new Room(width, height);
            h.rooms.add(r);
            return this;
        }

        public Builder setAddress (String address){
            h.address = address;
            return this;
        }

        public House build(){
            return h;
        }


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



    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", rooms=" + rooms +
                '}';
    }
}
