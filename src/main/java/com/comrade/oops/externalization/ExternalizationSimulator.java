package com.comrade.oops.externalization;



public class ExternalizationSimulator {
	public static void main(String[] args) {
		Room room=new Room().setRoomId(408).setRoomName("UVW").setRoomPassword(23L);
		ExternlizationProcessFactory<Object> factory=new ExternlizationProcessFactory<>();
		factory.processSeriallization(room);
		
		DeserializationProcessFactory<Room> deserializationTour=new DeserializationProcessFactory<>();
		Room oh=deserializationTour.processDeserialization(Room.class.getName()+".ser");
		System.out.println(oh.getRoomId());
		System.out.println(oh.getRoomName());
		System.out.println(oh.getRoomPassword());
		
	}
}
