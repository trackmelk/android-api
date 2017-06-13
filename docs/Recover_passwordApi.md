# Recover_passwordApi

All URIs are relative to *https://trackme.lk/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**recoveryPassword**](Recover_passwordApi.md#recoveryPassword) | **POST** /recover_password | 
[**usersPut**](Recover_passwordApi.md#usersPut) | **PUT** /recover_password | 


<a name="recoveryPassword"></a>
# **recoveryPassword**
> recoveryPassword(email)



Recover 

### Example
```java
// Import classes:
//import lk.trackme.client.api.Recover_passwordApi;

Recover_passwordApi apiInstance = new Recover_passwordApi();
String email = "email_example"; // String | User email
try {
    apiInstance.recoveryPassword(email);
} catch (ApiException e) {
    System.err.println("Exception when calling Recover_passwordApi#recoveryPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| User email |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersPut"></a>
# **usersPut**
> usersPut(body)



Update password 

### Example
```java
// Import classes:
//import lk.trackme.client.api.Recover_passwordApi;

Recover_passwordApi apiInstance = new Recover_passwordApi();
String body = "body_example"; // String | New user password
try {
    apiInstance.usersPut(body);
} catch (ApiException e) {
    System.err.println("Exception when calling Recover_passwordApi#usersPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| New user password |

### Return type

null (empty response body)

### Authorization

[TrackMe-Api-Key](../README.md#TrackMe-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

