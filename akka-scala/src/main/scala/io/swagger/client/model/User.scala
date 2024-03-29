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
package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class User (
  id: Option[Long] = None,
  username: Option[String] = None,
  firstName: Option[String] = None,
  lastName: Option[String] = None,
  email: Option[String] = None,
  password: Option[String] = None,
  phone: Option[String] = None,
  /* User Status */
  userStatus: Option[Int] = None
) extends ApiModel


