package week02;

import java.util.ArrayList;
import java.util.List;

public class Office {

    List<MeetingRoom> meetingRoom = new ArrayList<>();


    public void addMeetingRoom(MeetingRoom meetingRoom){
        this.meetingRoom.add(meetingRoom);
    }


    public void printNames(){
        System.out.println("_______________[Tárgyaló neve növekvő sorrendben]_______________");
        for(MeetingRoom m: meetingRoom) {
            System.out.println("Office name: " + m.getName());
        }
    }

    public void printNamesReverse(){
        System.out.println("_______________[Tárgyaló neve csökkenő sorrendben]_______________");
        for(int i=meetingRoom.size()-1; i>=0; i--) {
            System.out.println("Office name: " + meetingRoom.get(i).getName());
        }
    }

    public void printEventNames(){
        System.out.println("_______________[Minden második tárgyaló]_______________");
        for(int i=0; i<meetingRoom.size()-1; i+=2) {
            System.out.println("Every second office name: " + meetingRoom.get(i).getName());
        }
    }

    public void printAreas(){
        System.out.println("_______________[Tárgyaló területe]_______________");
        for(int i=meetingRoom.size()-1; i>=0; i--) {
            System.out.println("Területe: " + meetingRoom.get(i).getArea());
        }
    }
/*
    public String printMeetingRoomsWithName(){

    }

    public String printMeetingRoomsContains(){

    }

    public int printAreasLargerThan(){

    }*/

}
