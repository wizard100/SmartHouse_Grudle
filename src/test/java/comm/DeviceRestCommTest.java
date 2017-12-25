package comm;

import Devices.Device;
import Devices.FireAlaram;
import Hub.Home;
import Hub.smartHome;
import datatTypes.HomePosition;
import datatTypes.Position;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;

public class DeviceRestCommTest {

    Device fireAlarm;
    Position pos;
    @Mock
    Home home;

    @Before
    public void setUp() throws Exception {
        pos = new HomePosition(1,1,1);
        fireAlarm = new FireAlaram(pos);
        //home = new smartHome(null,null);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sendEvent() {
        fireAlarm.
    }

    @Test
    public void reportEvent() {
    }

    @Test
    public void subscribe() {
    }

    @Test
    public void unSubscribe() {
    }
}