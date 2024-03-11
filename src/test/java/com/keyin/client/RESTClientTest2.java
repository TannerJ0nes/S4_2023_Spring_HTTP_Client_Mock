//New test
//Written By:Tanner Jones

package com.keyin.client;

import com.keyin.domain.Airport;
import com.keyin.http.client.RESTClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RESTClientTest2 {
    /**
     * This test verifies that the RESTClient can correctly parse a JSON payload containing a list of airports into a list of Airport objects.
     */
    @Test
    public void testBuildAirportListFromResponse() throws Exception {
        String jsonResponse = "[\n{\n\"id\": 1,\n\"name\": \"St. John's\",\n\"code\": \"YYT\"\n},\n" +
                "{\n\"id\": 2,\n\"name\": \"Deer Lake\",\n\"code\": \"YDF\"\n}\n]";

        RESTClient restClientUnderTest = new RESTClient();

        List<Airport> airportList = restClientUnderTest.buildAirportListFromResponse(jsonResponse);

        Assertions.assertTrue(airportList.contains(new Airport("YYT")));

        Assertions.assertTrue(airportList.contains(new Airport("YDF")));
    }
}
