# UsersApi

All URIs are relative to *https://trackme.lk/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentUser**](UsersApi.md#getCurrentUser) | **GET** /users/me | 
[**registerNewUser**](UsersApi.md#registerNewUser) | **POST** /users | 
[**updateCurrentUser**](UsersApi.md#updateCurrentUser) | **PUT** /users/me | 


<a name="getCurrentUser"></a>
# **getCurrentUser**
> User getCurrentUser()



Get information about currently logged in user

### Example
```java
// Import classes:
//import lk.trackme.client.api.UsersApi;

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

<a name="registerNewUser"></a>
# **registerNewUser**
> User registerNewUser(body)



Register new user 

### Example
```java
// Import classes:
//import lk.trackme.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
User body = new User(); // User | user to add to the system
try {
    User result = apiInstance.registerNewUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#registerNewUser");
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

<a name="updateCurrentUser"></a>
# **updateCurrentUser**
> User updateCurrentUser(body)



Updates information about currently logged in user

### Example
```java
// Import classes:
//import lk.trackme.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
User body = new User(); // User | user profile to update
try {
    User result = apiInstance.updateCurrentUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateCurrentUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| user profile to update |

### Return type

[**User**](User.md)

### Authorization

[TrackMe-Api-Key](../README.md#TrackMe-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

