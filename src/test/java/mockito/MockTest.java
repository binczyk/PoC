package mockito;


import org.mockito.Matchers;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.mock;

class MockTest {

    private SomeMock someMock;

    public MockTest() {
        someMock = mock(SomeMock.class);
        String testString = "MockTest mockito.mock.test string";
        Mockito.when(someMock.doSomething()).thenReturn(testString);

        Mockito.when(someMock.doSomethingWithString(Matchers.anyString())).thenAnswer(new Answer<String>() {
            @Override
            public String answer(InvocationOnMock invocation) throws Throwable {
                return (String) invocation.getArguments()[0] + testString;
            }
        });
    }


    public void mockTest() {
        String testedString = someMock.doSomething();
        System.out.println(testedString);
        System.out.println("---------------------------------");
        testedString = someMock.doSomethingWithString("Dupa");
        System.out.println(testedString);

    }
}
