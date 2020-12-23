/*
 * Class: SimpleTextWebSocketHandler
 *
 * Created on Aug 18, 2018
 *
 * (c) Copyright Swiss Post Solutions Ltd, unpublished work
 * All use, disclosure, and/or reproduction of this material is prohibited
 * unless authorized in writing.  All Rights Reserved.
 * Rights in this program belong to:
 * Swiss Post Solution.
 * Floor 4-5-8, ICT Tower, Quang Trung Software City
 */
package vn.minhtran.study.stompandsockjs;

import java.io.IOException;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class SimpleTextWebSocketHandler extends TextWebSocketHandler {

    private WebSocketSession session;

    @Override
    protected void handleTextMessage(
        WebSocketSession session,
        TextMessage message) throws Exception {
        this.session = session;
        super.handleTextMessage(session, message);

        System.out.println(message.getPayload());
        session.sendMessage(new TextMessage("Hi"));
    }

    public void sendMessage(String message) {
        if(session!=null) {
            try {
                session.sendMessage(new TextMessage(message));
            }
            catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
