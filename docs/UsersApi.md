# UsersApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentUser**](UsersApi.md#getCurrentUser) | **GET** /users/me | 
[**registerUsers**](UsersApi.md#registerUsers) | **POST** /users | 


<a name="getCurrentUser"></a>
# **getCurrentUser**
> User getCurrentUser()



Get information about currently logged in user

### Example
```java
// Import classes:
//import lk.trackme.android.api.UsersApi;

UsersApi apiInstance = new UsersApi();
try {
    User result = apiInstance.getCurrentUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getCurrentUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[TrackMe-Api-Key](../README.md#TrackMe-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registerUsers"></a>
# **registerUsers**
> User registerUsers(body)



Register new user 

### Example
```java
// Import classes:
//import lk.trackme.android.api.UsersApi;

UsersApi apiInstance = new UsersApi();
User body = new User(); // User | user to add to the system
try {
    User result = apiInstance.registerUsers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#registerUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| user to add to the system |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

