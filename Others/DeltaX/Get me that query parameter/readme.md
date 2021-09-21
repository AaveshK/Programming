Given a valid url and the names of one or more query parameters as key, determine the value for those keys in the URL without using regex or built-in url parsers.  
Note: Query parameters are a defined set of parameters attached to the end of a url. To append query params to the end of a url. To append query params to the end of a URL, a '?' is added followed immediately by a query parameter. To add multiple parameters, an '&' is added in between each.  

INPUT  
The first line of input contains a valid url. The next line contains a positive integer N. The next N lines contain different keys (name of a query parameter).  

OUTPUT  
In separate lines, print the value of the corresponding query parame4ter if it exists in the URL. Print -1 otherwise  

Constraints  
i <= N <= 1000  

Sample Input:  
http://www.deltax.com/career?test_param=google&param_1=india  
2  
test_param  
param_15  

Sample Output  
google  
-1  

Explanation
In this example, test_param is present as a query parameter in the given url, and the value is google. bnut param_15 is not present in the url.

[Solution Link] (https://github.com/AaveshK/Programming/blob/master/Others/DeltaX/Get%20me%20that%20query%20parameter/QueryParameter.java)