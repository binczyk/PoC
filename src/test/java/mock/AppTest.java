package mock;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AppTest {

    @InjectMocks
    private App app;
    @Mock
    private StockService stockServiceMock = mock(StockService.class);


    @Before
    public void setUp() {
        when(stockServiceMock.getPrice("Dupa")).thenReturn(123);
        when(stockServiceMock.getPrice("Apud")).thenReturn(321);
    }

    @Test
    public void useTest() {
        assertEquals("123 ok.", app.use("Dupa"));
        assertEquals("321 ok.", app.use("Apud"));
    }
}