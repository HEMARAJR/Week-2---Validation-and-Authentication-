package sample;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider
    public Object[][] dataProvider_BookingTicket() {

        Object[][] objArr = new Object[3][2];

        objArr[0][0] = "TamilNadu";
        objArr[0][1] = "Cuddalore";

        objArr[1][0] = "TamilNadu";
        objArr[1][1] = "Erode";

        objArr[2][0] = "TamilNadu";
        objArr[2][1] = "Chennai";

        return objArr;
    }
}
