# DevicesApi

All URIs are relative to *https://trackme.lk/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deviceDelete**](DevicesApi.md#deviceDelete) | **DELETE** /devices | 
[**devicePost**](DevicesApi.md#devicePost) | **POST** /devices | 
[**devicePut**](DevicesApi.md#devicePut) | **PUT** /devices | 
[**deviceShare**](DevicesApi.md#deviceShare) | **POST** /devices/{deviceId}/share | 
[**deviceStopSharing**](DevicesApi.md#deviceStopSharing) | **DELETE** /devices/{deviceId}/share | 
[**devicesGet**](DevicesApi.md#devicesGet) | **GET** /devices | 


<a name="deviceDelete"></a>
# **deviceDelete**
> deviceDelete(id, uniqueId)



Removes existing device

### Example
```java
// Import classes:
//import lk.trackme.client.api.DevicesApi;

DevicesApi apiInstance = new DevicesApi();
Long id = 789L; // Long | identifier of device to be deleted
String uniqueId = "uniqueId_example"; // String | IMEI of device to be deleted
try {
    apiInstance.deviceDelete(id, uniqueId);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#deviceDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| identifier of device to be deleted | [optional]
 **uniqueId** | **String**| IMEI of device to be deleted | [optional]

### Return type

null (empty response body)

### Authorization

[TrackMe-Api-Key](../README.md#TrackMe-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="devicePost"></a>
# **devicePost**
> Device devicePost(body)



Register new device

### Example
```java
// Import classes:
//import lk.trackme.client.api.DevicesApi;

DevicesApi apiInstance = new DevicesApi();
Device body = new Device(); // Device | user to add to the system
try {
    Device result = apiInstance.devicePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Device**](Device.md)| user to add to the system |

### Return type

[**Device**](Device.md)

### Authorization

[TrackMe-Api-Key](../README.md#TrackMe-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="devicePut"></a>
# **devicePut**
> Device devicePut(body)



Updates existing device

### Example
```java
// Import classes:
//import lk.trackme.client.api.DevicesApi;

DevicesApi apiInstance = new DevicesApi();
Device body = new Device(); // Device | user to add to the system
try {
    Device result = apiInstance.devicePut(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Device**](Device.md)| user to add to the system |

### Return type

[**Device**](Device.md)

### Authorization

[TrackMe-Api-Key](../README.md#TrackMe-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceShare"></a>
# **deviceShare**
> deviceShare(deviceId, userId, userEmail, userName)



Shares existing device to user

### Example
```java
// Import classes:
//import lk.trackme.client.api.DevicesApi;

DevicesApi apiInstance = new DevicesApi();
Long deviceId = 789L; // Long | identifier of device to be shared
Long userId = 789L; // Long | identifier of user to share device to
String userEmail = "userEmail_example"; // String | email of user to share device to
String userName = "userName_example"; // String | username of user to share device to
try {
    apiInstance.deviceShare(deviceId, userId, userEmail, userName);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#deviceShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **Long**| identifier of device to be shared |
 **userId** | **Long**| identifier of user to share device to | [optional]
 **userEmail** | **String**| email of user to share device to | [optional]
 **userName** | **String**| username of user to share device to | [optional]

### Return type

null (empty response body)

### Authorization

[TrackMe-Api-Key](../README.md#TrackMe-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceStopSharing"></a>
# **deviceStopSharing**
> deviceStopSharing(deviceId, userId, userEmail, userName)



Stop sharing existing device to user

### Example
```java
// Import classes:
//import lk.trackme.client.api.DevicesApi;

DevicesApi apiInstance = new DevicesApi();
Long deviceId = 789L; // Long | identifier of device
Long userId = 789L; // Long | identifier of user
String userEmail = "userEmail_example"; // String | email of user to share device to
String userName = "userName_example"; // String | username of user to share device to
try {
    apiInstance.deviceStopSharing(deviceId, userId, userEmail, userName);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#deviceStopSharing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **Long**| identifier of device |
 **userId** | **Long**| identifier of user | [optional]
 **userEmail** | **String**| email of user to share device to | [optional]
 **userName** | **String**| username of user to share device to | [optional]

### Return type

null (empty response body)

### Authorization

[TrackMe-Api-Key](../README.md#TrackMe-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="devicesGet"></a>
# **devicesGet**
> List&lt;Device&gt; devicesGet()



List all available devices for user

### Example
```java
// Import classes:
//import lk.trackme.client.api.DevicesApi;

DevicesApi apiInstance = new DevicesApi();
try {
    List<Device> result = apiInstance.devicesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Device&gt;**](Device.md)

### Authorization

[TrackMe-Api-Key](../README.md#TrackMe-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

