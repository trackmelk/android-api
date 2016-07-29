# LoginApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersPost**](LoginApi.md#usersPost) | **POST** /login | 


<a name="usersPost"></a>
# **usersPost**
> User usersPost(body)



Login 

### Example
```java
// Import classes:
//import lk.trackme.android.api.LoginApi;

LoginApi apiInstance = new LoginApi();
LoginInfo body = new LoginInfo(); // LoginInfo | Authorized user profile
try {
    User result = apiInstance.usersPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#usersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginInfo**](LoginInfo.md)| Authorized user profile |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

