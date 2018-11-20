package mock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StockServiceTest {

    StockService stockServiceMock = mock(StockService.class);

    @Before
    public void setUp() {
        when(stockServiceMock.getPrice("Dupa")).thenReturn(777);
        when(stockServiceMock.getPrice("Artur")).thenReturn(0);
    }

    @Test
    public void test1() {
        assertEquals(777, stockServiceMock.getPrice("Dupa"));
        assertEquals(0, stockServiceMock.getPrice("Artur"));
        assertEquals(0, stockServiceMock.getPrice("123"));
    }

}