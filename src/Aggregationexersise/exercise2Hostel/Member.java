package Aggregationexersise.exercise2Hostel;

public class Member {
private int memberId;
private String name;
private Room room;
public Member(int memberId,String name) {
	this.memberId= memberId;
	this.name=name;
}
public int getMemberId() {
	return memberId;
}
public void setMemberId(int memberId) {
	this.memberId = memberId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Room getRoom() {
	return room;
}
public void setRoom(Room room) {
	this.room = room;
}	
	
    public String toString(){
        return "Member\nmemberId: "+this.memberId+"\nname: "+this.name;

}
}
