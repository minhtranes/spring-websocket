# spring-websocket

## Websocket
Access http://jxy.me/websocket-debug-tool/ from Chrome
Input following:
* At "URL", input "ws://localhost:8081/echo", tick SockJS then hit Connect
* At "Message Content", input the message you want to send to server. E.g: John. And finally hit Send 

On dev tool of your browser, switch to tab Network, filter WS and Messages to see how SockJS heartbeat messages are sent

## Websocket and SockJS
Access http://jxy.me/websocket-debug-tool/ from Chrome
Input following:
* At "URL", input "http://localhost:8081/echo", tick SockJS then hit Connect
* At "Message Content", input the message you want to send to server. E.g: John. And finally hit Send 

On dev tool of your browser, switch to tab Network, filter WS and Messages to see how SockJS heartbeat messages are sent

## Websocket and Stomp
Access http://jxy.me/websocket-debug-tool/ from Chrome
Input following:
* At "URL", input "ws://localhost:8081/process", and STOMP then hit Connect
* At "STOMP subscribe destination", input topic "/topic/client-inbound-channel" and hit Subscribe
* At "STOMP send destination", input "/app/hello" to indicate the destination for the message you want to send to server
* At "Message Content", input the message you want to send to server. E.g: John. And finally hit Send 

Then in the Console panel, you will receive the message response from server. On dev tool of your browser, switch to tab Network, filter WS and Messages to see how SockJS heartbeat messages are sent

## Websocket and Stomp and SockJS
Access http://jxy.me/websocket-debug-tool/ from Chrome
Input following:
* At "URL", input "http://localhost:8081/process", tick SockJS and STOMP then hit Connect
* At "STOMP subscribe destination", input topic "/topic/client-inbound-channel" and hit Subscribe
* At "STOMP send destination", input "/app/hello" to indicate the destination for the message you want to send to server
* At "Message Content", input the message you want to send to server. E.g: John. And finally hit Send 

Then in the Console panel, you will receive the message response from server