/*
 * Class: WebSocketConfiguration
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
package vn.minhtran.study.sockjs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfiguration implements WebSocketConfigurer {
    
    @Bean
    SimpleTextWebSocketHandler webSocketHandler() {
        return new SimpleTextWebSocketHandler();
    }
    
    /*
     * 1. Browser will send request http://localhost:8081/echo to server
     * 2. If websocket supported, browser will send ws://localhost:8081/echo/431/rz2aulqm/websocket
     */
    
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry
            .addHandler(webSocketHandler(), "/echo")
            .setAllowedOrigins("*")
            .withSockJS();
    }

}