# android-api

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>lk.trackme</groupId>
    <artifactId>android-api</artifactId>
    <version>1.0.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "lk.trackme:android-api:1.0.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/android-api-1.0.1.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import lk.trackme.client.api.DevicesApi;

public class DevicesApiExample {

    public static void main(String[] args) {
        DevicesApi apiInstance = new DevicesApi();
        Long id = 789L; // Long | identifier of device to be deleted
        String uniqueId = "uniqueId_example"; // String | IMEI of device to be deleted
        try {
            apiInstance.deviceDelete(id, uniqueId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DevicesApi#deviceDelete");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://trackme.lk/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DevicesApi* | [**deviceDelete**](docs/DevicesApi.md#deviceDelete) | **DELETE** /devices | 
*DevicesApi* | [**devicePost**](docs/DevicesApi.md#devicePost) | **POST** /devices | 
*DevicesApi* | [**devicePut**](docs/DevicesApi.md#devicePut) | **PUT** /devices | 
*DevicesApi* | [**deviceShare**](docs/DevicesApi.md#deviceShare) | **POST** /devices/{deviceId}/share | 
*DevicesApi* | [**deviceStopSharing**](docs/DevicesApi.md#deviceStopSharing) | **DELETE** /devices/{deviceId}/share | 
*DevicesApi* | [**devicesGet**](docs/DevicesApi.md#devicesGet) | **GET** /devices | 
*LoginApi* | [**usersPost**](docs/LoginApi.md#usersPost) | **POST** /login | 
*PositionsApi* | [**devicePositionsGet**](docs/PositionsApi.md#devicePositionsGet) | **GET** /positions/{deviceId} | 
*PositionsApi* | [**historyPositionsGet**](docs/PositionsApi.md#historyPositionsGet) | **GET** /positions/history/{deviceId} | 
*PositionsApi* | [**positionsGet**](docs/PositionsApi.md#positionsGet) | **GET** /positions | 
*Recover_passwordApi* | [**recoveryPassword**](docs/Recover_passwordApi.md#recoveryPassword) | **POST** /recover_password | 
*Recover_passwordApi* | [**usersPut**](docs/Recover_passwordApi.md#usersPut) | **PUT** /recover_password | 
*UsersApi* | [**getCurrentUser**](docs/UsersApi.md#getCurrentUser) | **GET** /users/me | 
*UsersApi* | [**registerNewUser**](docs/UsersApi.md#registerNewUser) | **POST** /users | 
*UsersApi* | [**updateCurrentUser**](docs/UsersApi.md#updateCurrentUser) | **PUT** /users/me | 


## Documentation for Models

 - [Device](docs/Device.md)
 - [Error](docs/Error.md)
 - [LoginInfo](docs/LoginInfo.md)
 - [Position](docs/Position.md)
 - [User](docs/User.md)
 - [UserSettings](docs/UserSettings.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### TrackMe-Api-Key

- **Type**: API key
- **API key parameter name**: TrackMe-Api-Key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



