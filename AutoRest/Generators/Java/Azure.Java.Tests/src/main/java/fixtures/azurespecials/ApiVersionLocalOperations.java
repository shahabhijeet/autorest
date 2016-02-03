/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import fixtures.azurespecials.models.ErrorException;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.Query;

/**
 * An instance of this class provides access to all the operations defined
 * in ApiVersionLocalOperations.
 */
public interface ApiVersionLocalOperations {
    /**
     * The interface defining all the services for ApiVersionLocalOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ApiVersionLocalService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azurespecials/apiVersion/method/string/none/query/local/2.0")
        Call<ResponseBody> getMethodLocalValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azurespecials/apiVersion/method/string/none/query/local/null")
        Call<ResponseBody> getMethodLocalNull(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azurespecials/apiVersion/path/string/none/query/local/2.0")
        Call<ResponseBody> getPathLocalValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azurespecials/apiVersion/swagger/string/none/query/local/2.0")
        Call<ResponseBody> getSwaggerLocalValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> getMethodLocalValid(String apiVersion) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getMethodLocalValidAsync(String apiVersion, final ServiceCallback<Void> serviceCallback);

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @param apiVersion This should appear as a method parameter, use value null, this should result in no serialized parameter
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> getMethodLocalNull(String apiVersion) throws ErrorException, IOException;

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @param apiVersion This should appear as a method parameter, use value null, this should result in no serialized parameter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getMethodLocalNullAsync(String apiVersion, final ServiceCallback<Void> serviceCallback);

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> getPathLocalValid(String apiVersion) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getPathLocalValidAsync(String apiVersion, final ServiceCallback<Void> serviceCallback);

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param apiVersion The api version, which appears in the query, the value is always '2.0'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> getSwaggerLocalValid(String apiVersion) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param apiVersion The api version, which appears in the query, the value is always '2.0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getSwaggerLocalValidAsync(String apiVersion, final ServiceCallback<Void> serviceCallback);

}
