
ABOUT:
Camunda with Angular integration through sockets
(Camunda + Spring Boot 2 + Web socket (socket.js, stomp.js) + Angular 7 + Web app plugins)

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
* nadpisać @EventListener
* exception mapper - skonfigurować w camunda
* logback.xml
* audyt (security eventy) // filtry w Camunda (https://docs.camunda.org/optimize/latest/technical-guide/plugins/engine-rest-filter/)
(https://dennis-xlc.gitbooks.io/restful-java-with-jax-rs-2-0-2rd-edition/en/part1/chapter12/server_side_filters.html)
* testy camundy
* podgląd formularzy z tasklisty (return link - tryb podglądu)
* dodać integracje z zewnętrznym systemem (scheduler)
* ssl
* rabbitMQ? potrzebny?
* więcej pluginów? do camundy?
* instrukcja instalacji lokalnie
* maven profiles
* heroku? jenkins?