# PositionsApi

All URIs are relative to *https://trackme.lk/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**devicePositionsGet**](PositionsApi.md#devicePositionsGet) | **GET** /positions/{deviceId} | 
[**historyPositionsGet**](PositionsApi.md#historyPositionsGet) | **GET** /positions/history/{deviceId} | 
[**positionsGet**](PositionsApi.md#positionsGet) | **GET** /positions | 


<a name="devicePositionsGet"></a>
# **devicePositionsGet**
> Position devicePositionsGet(deviceId)



Get latest position of device with specified identifier

### Example
```java
// Import classes:
//import lk.trackme.client.api.PositionsApi;

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

<a name="historyPositionsGet"></a>
# **historyPositionsGet**
> Position historyPositionsGet(deviceId, from, to)



Get historical positions of device with specified identifier within specified period

### Example
```java
// Import classes:
//import lk.trackme.client.api.PositionsApi;

PositionsApi apiInstance = new PositionsApi();
Long deviceId = 789L; // Long | 
Date from = new Date(); // Date | 
Date to = new Date(); // Date | 
try {
    Position result = apiInstance.historyPositionsGet(deviceId, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PositionsApi#historyPositionsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **Long**|  |
 **from** | **Date**|  | [optional]
 **to** | **Date**|  | [optional]

### Return type

[**Position**](Position.md)

### Authorization

[TrackMe-Api-Key](../README.md#TrackMe-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="positionsGet"></a>
# **positionsGet**
> List&lt;Position&gt; positionsGet()



List latest positions of all available devices for user

### Example
```java
// Import classes:
//import lk.trackme.client.api.PositionsApi;

PositionsApi apiInstance = new PositionsApi();
try {
    List<Position> result = apiInstance.positionsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PositionsApi#positionsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Position&gt;**](Position.md)

### Authorization

[TrackMe-Api-Key](../README.md#TrackMe-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

