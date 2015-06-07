# Proof of Concept for Blogpost http://www.java-adventures.com/jee/2014/07/01/jboss-eap6-upgrade-to-resteasy3x


This is a simple example that uses RestEasy3 in JBoss EAP 6.3 and 6.4. It upgrades RestEasy as described in my
blog post http://www.java-adventures.com/jee/2014/07/01/jboss-eap6-upgrade-to-resteasy3x.

Deploy the application and go to: http://localhost:8080/resteasy-eap-app/resources/ping

It should return `pong`

## Proof that RestEasy 3 is running

Call an non existing resource like http://localhost:8080/resteasy-eap-app/resources/ping/fail then
look into your logfile. You'll get something like:

```
18:46:24,664 WARN  [org.jboss.resteasy.core.ExceptionHandler] (http-/127.0.0.1:8080-1) failed to execute: javax.ws.rs.NotFoundException: Could not find resource for full path: http://localhost:8080/resteasy-eap-app/resources/ping/fail
	at org.jboss.resteasy.core.registry.SegmentNode.match(SegmentNode.java:112) [resteasy-jaxrs-3.0.8.Final.jar:]
	at org.jboss.resteasy.core.registry.RootNode.match(RootNode.java:43) [resteasy-jaxrs-3.0.8.Final.jar:]
```

As we can see `resteasy-jaxrs-3.0.8.Final.jar` is handling our REST calls.


# JBoss EAP 6.3 and 6.4

The working demo deployed with JBoss EAP 6.3 and 6.4 can be downloaded from  
https://www.dropbox.com/sh/s3wras1k1kc3rg9/AAAbYkuwS7BHsmkVXktE3j3pa?dl=0

HAVE FUN!