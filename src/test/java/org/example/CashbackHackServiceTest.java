package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainIfUnderBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 900;

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainIfOverBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 1900;

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotRemainIfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int amount = 1000;

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}