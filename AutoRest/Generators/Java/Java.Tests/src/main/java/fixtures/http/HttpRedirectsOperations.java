/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponseWithHeaders;
import com.squareup.okhttp.ResponseBody;
import fixtures.http.models.ErrorException;
import fixtures.http.models.HttpRedirectsDelete307Headers;
import fixtures.http.models.HttpRedirectsGet300Headers;
import fixtures.http.models.HttpRedirectsGet301Headers;
import fixtures.http.models.HttpRedirectsGet302Headers;
import fixtures.http.models.HttpRedirectsGet307Headers;
import fixtures.http.models.HttpRedirectsHead300Headers;
import fixtures.http.models.HttpRedirectsHead301Headers;
import fixtures.http.models.HttpRedirectsHead302Headers;
import fixtures.http.models.HttpRedirectsHead307Headers;
import fixtures.http.models.HttpRedirectsPatch302Headers;
import fixtures.http.models.HttpRedirectsPatch307Headers;
import fixtures.http.models.HttpRedirectsPost303Headers;
import fixtures.http.models.HttpRedirectsPost307Headers;
import fixtures.http.models.HttpRedirectsPut301Headers;
import fixtures.http.models.HttpRedirectsPut307Headers;
import java.io.IOException;
import java.util.List;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.HEAD;
import retrofit.http.Headers;
import retrofit.http.HTTP;
import retrofit.http.PATCH;
import retrofit.http.POST;
import retrofit.http.PUT;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpRedirectsOperations.
 */
public interface HttpRedirectsOperations {
    /**
     * The interface defining all the services for HttpRedirectsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HttpRedirectsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("http/redirect/300")
        Call<Void> head300();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("http/redirect/300")
        Call<ResponseBody> get300();

        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("http/redirect/301")
        Call<Void> head301();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("http/redirect/301")
        Call<ResponseBody> get301();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("http/redirect/301")
        Call<ResponseBody> put301(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("http/redirect/302")
        Call<Void> head302();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("http/redirect/302")
        Call<ResponseBody> get302();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("http/redirect/302")
        Call<ResponseBody> patch302(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("http/redirect/303")
        Call<ResponseBody> post303(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("http/redirect/307")
        Call<Void> head307();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("http/redirect/307")
        Call<ResponseBody> get307();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("http/redirect/307")
        Call<ResponseBody> put307(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("http/redirect/307")
        Call<ResponseBody> patch307(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("http/redirect/307")
        Call<ResponseBody> post307(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "http/redirect/307", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete307(@Body Boolean booleanValue);

    }
    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, HttpRedirectsHead300Headers> head300() throws ErrorException, IOException;

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<Void> head300Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;String&gt; object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    ServiceResponseWithHeaders<List<String>, HttpRedirectsGet300Headers> get300() throws ErrorException, IOException;

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> get300Async(final ServiceCallback<List<String>> serviceCallback);

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, HttpRedirectsHead301Headers> head301() throws ErrorException, IOException;

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<Void> head301Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, HttpRedirectsGet301Headers> get301() throws ErrorException, IOException;

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> get301Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, HttpRedirectsPut301Headers> put301(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> put301Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, HttpRedirectsHead302Headers> head302() throws ErrorException, IOException;

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<Void> head302Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, HttpRedirectsGet302Headers> get302() throws ErrorException, IOException;

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> get302Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, HttpRedirectsPatch302Headers> patch302(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> patch302Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, HttpRedirectsPost303Headers> post303(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> post303Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Redirect with 307, resulting in a 200 success.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, HttpRedirectsHead307Headers> head307() throws ErrorException, IOException;

    /**
     * Redirect with 307, resulting in a 200 success.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<Void> head307Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Redirect get with 307, resulting in a 200 success.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, HttpRedirectsGet307Headers> get307() throws ErrorException, IOException;

    /**
     * Redirect get with 307, resulting in a 200 success.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> get307Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, HttpRedirectsPut307Headers> put307(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> put307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, HttpRedirectsPatch307Headers> patch307(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> patch307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, HttpRedirectsPost307Headers> post307(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> post307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    ServiceResponseWithHeaders<Void, HttpRedirectsDelete307Headers> delete307(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> delete307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

}
