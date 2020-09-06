# Getting started with hoverfly.

Run this command to install hoverfly on your host machine, if you have brew installed.
```
brew install SpectoLabs/tap/hoverfly
```
Otherwise, depending upon the system, follow instructions from [official Site](https://docs.hoverfly.io/en/latest/pages/introduction/downloadinstallation.html).

## What is Hoverfly?
- Hoverfly is a lightweight, open source API simulation tool. Using Hoverfly, you can create realistic simulations of the APIs your application depends on.

- It is also known as service virtualization tool. It is actually some sort of mocking, but with real response.

## When to use Hoverfly?
- Mainly used in testing.
- As an alternative for mocks/ stubs, component tests, performance tests.
- simulate flakiness, errors.
- To simulate API functionality that doesn't exist (yet) by modifying the simulation file.
- Useful for developers, when the system being tested depends on other services. 

## Hoverfly as a proxy server.
**Capture Mode :** Can capture and store request/response of the actual API.







**Simulate Mode :** It will simulate from the stored response and will not make a call to the actual API.







It can also switch between different modes, for example: If there is no response stored. It will call the actual API and capture the response.

We can always use capture/simulate dual mode. so that some new data will be captured.


## Implementation
Minimal configuration to integrate hoverfly with existing Junit 5 test class.

Add dependency
```
	<dependency>
		<groupId>io.specto</groupId>
		<artifactId>hoverfly-java-junit5</artifactId>
		<version>0.13.0</version>
		<scope>test</scope>
	</dependency>
```
The below code snippet shows how easy it is.
```
@ExtendWith(HoverflyExtension.class)
@HoverflySimulate(source = 
@HoverflySimulate.Source(value = "simulation.json", 
			type = HoverflySimulate.SourceType.DEFAULT_PATH),
			enableAutoCapture = true)
public class HoverflyTest {
  .
  .
  .
  --some code here--
  .
  .
  .
}
```

This can be bundled inside the service or it can be externalized and run as a proxy in a separate container.

### Clone or download the application from this repository to see it in action.
- There are 2 applicaions 
1. deviceAPI - Which Runs on 8900
2. hoverfly - Used to demo Hoverfly


