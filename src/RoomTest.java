import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void checkIn_shouldMarkRoomAsOccupiedAndDirty(){
       //arrange
       Room room = new Room(20, 200, false, false);

       //act
        room.checkIn();

        //assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvaliable());
    }
    @Test
    public void checkOut_shouldSetOccupiedFalse(){
        //arrange
        Room room = new Room(20, 200,true, true );

        //act
        room.checkOut();

        //assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
    }
    @Test
    public void cleanRoom_shouldSetDirtyFalse(){
        //arrange
        Room room = new Room(20, 200, false, false);

        //act
        room.cleanRoom();

        //assert
        assertFalse(room.isDirty());
        assertTrue(room.isAvaliable());
    }
}