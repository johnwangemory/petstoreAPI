/**
 * Swagger Petstore
 * This is a sample Petstore server from SwaggerHub updated on July 21, 2021 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.api

import io.swagger.client.model.User
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object UserApi {

  /**
   * This can only be done by the logged in user.
   * 
   * Expected answers:
   *   code 0 :  (successful operation)
   * 
   * @param body Created user object
   */
  def createUser(body: User): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/johnwang/petstore/1.0.0", "/user", "application/json")
      .withBody(body)
      .withDefaultSuccessResponse[Unit]
        /**
   * 
   * 
   * Expected answers:
   *   code 0 :  (successful operation)
   * 
   * @param body List of user object
   */
  def createUsersWithArrayInput(body: Seq[User]): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/johnwang/petstore/1.0.0", "/user/createWithArray", "application/json")
      .withBody(body)
      .withDefaultSuccessResponse[Unit]
        /**
   * 
   * 
   * Expected answers:
   *   code 0 :  (successful operation)
   * 
   * @param body List of user object
   */
  def createUsersWithListInput(body: Seq[User]): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/johnwang/petstore/1.0.0", "/user/createWithList", "application/json")
      .withBody(body)
      .withDefaultSuccessResponse[Unit]
        /**
   * This can only be done by the logged in user.
   * 
   * Expected answers:
   *   code 400 :  (Invalid username supplied)
   *   code 404 :  (User not found)
   * 
   * @param username The name that needs to be deleted
   */
  def deleteUser(username: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, "https://virtserver.swaggerhub.com/johnwang/petstore/1.0.0", "/user/{username}", "application/json")
      .withPathParam("username", username)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](404)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : User (successful operation)
   *   code 400 :  (Invalid username supplied)
   *   code 404 :  (User not found)
   * 
   * @param username The name that needs to be fetched. Use user1 for testing.
   */
  def getUserByName(username: String): ApiRequest[User] =
    ApiRequest[User](ApiMethods.GET, "https://virtserver.swaggerhub.com/johnwang/petstore/1.0.0", "/user/{username}", "application/json")
      .withPathParam("username", username)
      .withSuccessResponse[User](200)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](404)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : String (successful operation)
   *              Headers :
   *                X-Rate-Limit - calls per hour allowed by the user
   *                X-Expires-After - date in UTC when token expires
   *   code 400 :  (Invalid username/password supplied)
   * 
   * @param username The user name for login
   * @param password The password for login in clear text
   */
  def loginUser(username: String, password: String): ApiRequest[String] =
    ApiRequest[String](ApiMethods.GET, "https://virtserver.swaggerhub.com/johnwang/petstore/1.0.0", "/user/login", "application/json")
      .withQueryParam("username", username)
      .withQueryParam("password", password)
      .withSuccessResponse[String](200)
      .withErrorResponse[Unit](400)
      
  object LoginUserHeaders { 
    def xRateLimit(r: ApiReturnWithHeaders) = r.getIntHeader("X-Rate-Limit")
    def xExpiresAfter(r: ApiReturnWithHeaders) = r.getDateTimeHeader("X-Expires-After")
  }
  /**
   * 
   * 
   * Expected answers:
   *   code 0 :  (successful operation)
   */
  def logoutUser(): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://virtserver.swaggerhub.com/johnwang/petstore/1.0.0", "/user/logout", "application/json")
      .withDefaultSuccessResponse[Unit]
        /**
   * This can only be done by the logged in user.
   * 
   * Expected answers:
   *   code 400 :  (Invalid user supplied)
   *   code 404 :  (User not found)
   * 
   * @param username name that need to be updated
   * @param body Updated user object
   */
  def updateUser(username: String, body: User): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.PUT, "https://virtserver.swaggerhub.com/johnwang/petstore/1.0.0", "/user/{username}", "application/json")
      .withBody(body)
      .withPathParam("username", username)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](404)
      

}

