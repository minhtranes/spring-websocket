/*
 * Class: MessageGateway
 *
 * Created on Oct 31, 2018
 *
 * (c) Copyright Swiss Post Solutions Ltd, unpublished work
 * All use, disclosure, and/or reproduction of this material is prohibited
 * unless authorized in writing.  All Rights Reserved.
 * Rights in this program belong to:
 * Swiss Post Solution.
 * Floor 4-5-8, ICT Tower, Quang Trung Software City
 */
package vn.minhtran.study.stompandsockjs;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageGateway {

    @MessageMapping(value = "/hello")
    @SendTo("/topic/client-inbound-channel")
    public String process(String value) {
        System.out.println("Received [" + value + "]");
        String message = isHumanName(value) ? "Hello " + value
                : "Received [" + value + "]";
        thinking(3);
        return message;
    }

    private void thinking(int i) {
        try {
            TimeUnit.SECONDS.sleep(i);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private final String[] humanNames = { "Minh", "Khanh", "Thai", "Nguyen",
        "Vien" };

    private boolean isHumanName(final String value) {
        return Arrays.asList(humanNames).contains(value);
    }
}
