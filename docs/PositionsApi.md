# PositionsApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**devicePositionsGet**](PositionsApi.md#devicePositionsGet) | **GET** /positions/{deviceId} | 
[**positionsGet**](PositionsApi.md#positionsGet) | **GET** /positions | 


<a name="devicePositionsGet"></a>
# **devicePositionsGet**
> Position devicePositionsGet(deviceId)



Get latest positions of device with specified identifier

### Example
```java
// Import classes:
//import lk.trackme.android.api.PositionsApi;

PositionsApi apiInstance = new PositionsApi();
Long deviceId = 789L; // Long | 
try {
    Position result = apiInstance.devicePositionsGet(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PositionsApi#devicePositionsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **Long**|  |

### Return type

[**Position**](Position.md)

### Authorization

[TrackMe-Api-Key](../README.md#TrackMe-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="positionsGet"></a>
# **positionsGet**
> positionsGet()



List latest positions of all available devices for user

### Example
```java
// Import classes:
//import lk.trackme.android.api.PositionsApi;

PositionsApi apiInstance = new PositionsApi();
try {
    apiInstance.positionsGet();
} catch (ApiException e) {
    System.err.println("Exception when calling PositionsApi#positionsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[TrackMe-Api-Key](../README.md#TrackMe-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

