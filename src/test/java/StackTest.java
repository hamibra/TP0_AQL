import org.example.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackTest {
    Stack pile;
    @BeforeEach
    void setUp(){
         pile = new Stack();

    }
    @Test
    void PeekTest(){
        assertThrows(IllegalStateException.class, pile::peek);
        assertEquals("[]", pile.toString());
    }
    @Test
    void PushTest(){
        for(int i=0;i<10;i++){
            pile.push(i);
        }
        assertEquals(9,pile.peek());
        assertEquals(10,pile.size());
    }

    @Test
    void PopTest(){
        pile.push(5);
        pile.pop();
        assertThrows(IllegalStateException.class, pile::peek);
        assertEquals(0,pile.size());
    }


}
