# Islands of a map API

This project contains a simple endpoint that exposes the coordinates of a map with islands for testing purposes

## Getting started

These instructions will get you a copy of the project up and running on a local machine for testing purposes.

### Prerequisites

Docker is required in order to start the app

### Building the docker image

To build the docker image to use it in the app that consumes this API endpoint just execute the following command in the root directory 
```
docker build -t islands-api .
```
Once everything is up and running, the API endpoint will be exposed at
```
localhost:8090/api/map/islands
```