# spring-websocket
## Websocket and Stomp and SockJS
Access http://jxy.me/websocket-debug-tool/ from Chrome
Input following:
* URL: http://localhost:8081/process 
* Tick SockJS and STOMP then hit Connect
* At "STOMP subscribe destination", input topic "/topic/client-inbound-channel" and hit Subscribe
* At "STOMP send destination", input "/app/hello" to indicate the destination for the message you want to send to server
* At "Message Content", input the message you want to send to server. E.g: John. And finally hit Send 
