# RecoverpasswordApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**recoverPassword**](RecoverpasswordApi.md#recoverPassword) | **POST** /recover_password | 
[**usersPut**](RecoverpasswordApi.md#usersPut) | **PUT** /recover_password | 


<a name="recoverPassword"></a>
# **recoverPassword**
> recoverPassword(email)



Recover Password

### Example
```java
// Import classes:
//import lk.trackme.android.api.RecoverpasswordApi;

RecoverpasswordApi apiInstance = new RecoverpasswordApi();
String email = "email_example"; // String | User email
try {
    apiInstance.recoverPassword(email);
} catch (ApiException e) {
    System.err.println("Exception when calling RecoverpasswordApi#recoverPassword");
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
//import lk.trackme.android.api.RecoverpasswordApi;

RecoverpasswordApi apiInstance = new RecoverpasswordApi();
String body = "body_example"; // String | New user password
try {
    apiInstance.usersPut(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RecoverpasswordApi#usersPut");
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

