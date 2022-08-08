# DefaultApi

All URIs are relative to *http://export.arxiv.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiQueryGet**](DefaultApi.md#apiQueryGet) | **GET** /api/query | Returns a list of users. |



## apiQueryGet

> Feed apiQueryGet(searchQuery, idList, start, maxResults, sortBy, sortOrder)

Returns a list of users.

Optional extended description in CommonMark or HTML.

### Example

```java
// Import classes:

import io.github.nicholasphair.arxiv.ApiClient;
import io.github.nicholasphair.arxiv.ApiException;
import io.github.nicholasphair.arxiv.Configuration;
import org.openapitools.client.models.*;
import api.io.github.nicholasphair.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://export.arxiv.org");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String searchQuery = "searchQuery_example"; // String | 
        List<String> idList = Arrays.asList(); // List<String> | 
        Integer start = 0; // Integer | 
        Integer maxResults = 10; // Integer | 
        String sortBy = "relevance"; // String | 
        String sortOrder = "ascending"; // String | 
        try {
            Feed result = apiInstance.apiQueryGet(searchQuery, idList, start, maxResults, sortBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#apiQueryGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **searchQuery** | **String**|  | [optional] |
| **idList** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **start** | **Integer**|  | [optional] [default to 0] |
| **maxResults** | **Integer**|  | [optional] [default to 10] |
| **sortBy** | **String**|  | [optional] [enum: relevance, lastUpdatedDate, submittedDate] |
| **sortOrder** | **String**|  | [optional] [enum: ascending, descending] |

### Return type

[**Feed**](Feed.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/atom+xml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | arXiv flavored Atom feed |  -  |

