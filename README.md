
ABOUT:
Camunda with websockets
(Camunda + Spring Boot 2 + Websocket (socket.js, stomp.js))

CAMUNDA API:
https://blog.camunda.com/post/2015/08/start-and-complete-process-with-rest-api/
/rest/process-definition/key/Sample/start
/rest/task/?processInstanceId={processInstanceId}
/rest/task/{processInstanceTaskId}/complete

TODO:
* podpiąć websocket (https://www.baeldung.com/websockets-spring) +
* zrobić prosty formularz                                        +
* dodać do formularza websocket
* dodać plugin do tasklisty, request interceptor                 +
 (https://github.com/camunda/camunda-bpm-examples/tree/master/cockpit)
 (https://github.com/camunda/camunda-bpm-examples/tree/7.9/cockpit/cockpit-sample-plugin)
* exception handler - skonfigurować w camunda
 (https://www.baeldung.com/exception-handling-for-rest-with-spring)
* logback.xml                                                    +
(https://springframework.guru/using-yaml-in-spring-boot-to-configure-logback/)
* audyt (security eventy) // filtry w Camunda                    +
 (https://www.baeldung.com/spring-delegating-filter-proxy)
 (https://www.baeldung.com/jersey-filters-interceptors)
 (https://dennis-xlc.gitbooks.io/restful-java-with-jax-rs-2-0-2rd-edition/en/part1/chapter12/server_side_filters.html)
* testy camundy
* podgląd formularzy z tasklisty (return link - tryb podglądu)
* dodać integracje z zewnętrznym systemem (scheduler)
* ssl
* flyway
 (https://github.com/jangalinski/camunda-bpm-flyway)
* rabbitMQ? potrzebny? (kafka, akka)
* więcej pluginów? do camundy?
* instrukcja instalacji lokalnie
* maven profiles
* katalon - testy
* heroku? jenkins?

LINKS:
https://demo.bpmn.io - free online bpmn-modeler