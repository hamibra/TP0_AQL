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
    }
    @Test
    void PushTest(){
        pile.push(5);
        assertEquals(5,pile.peek());
        assertEquals(1,pile.size());
    }

    @Test
    void PopTest(){
        pile.pop();
        assertThrows(IllegalStateException.class, pile::peek);
    }


}
