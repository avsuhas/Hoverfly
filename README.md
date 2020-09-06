# Getting started with hoverfly.

## What is Hoverfly?
- Hoverfly is a lightweight, open source API simulation tool. Using Hoverfly, you can create realistic simulations of the APIs your application depends on.

- It is also known as service virtualization tool. It is actually some sort of mocking, but with real response.

When to use Hoverfly?
Mainly used in testing.

As an alternative for mocks/ stubs
component tests, performance tests.
simulate flakiness, errors.
To simulate API functionality that doesn't exist (yet)
By modifying the simulation file.
Useful for developers, when the system being tested depends on other services. 

Hoverfly as a proxy server.
Capture Mode : Can capture and store request/response of the actual API.







Simulate Mode : it will simulate from the stored response and will not make a call to the actual API.







It can also switch between different modes, for example: If there is no response stored. It will call the actual API and capture the response.

We can always use capture/simulate dual mode. so that some new data will be captured.


Implementation
Minimal configuration to integrate hoverfly with existing Junit 5 test class.

The below code snippet shows how easy it is.





This can be bundled inside the service or it can be externalized and run as a proxy in a separate container.
