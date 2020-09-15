package mockito;

import mock.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import stub.GradeSystem;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class GradeServiceTestOfMockito {

    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */

    @InjectMocks // mock一个测试对象
    private SecurityCenter securityCenter;
    @Mock
    private DoorPanel doorPanel;

    @BeforeEach
    public void setUp() {
        securityCenter = new SecurityCenter(doorPanel);
    }


    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
        //assertTrue(doorPanel.isCallClosed());
    }

}
