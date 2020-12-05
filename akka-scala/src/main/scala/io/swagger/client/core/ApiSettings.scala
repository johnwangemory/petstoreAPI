/**
 * Swagger Petstore
 * This is a sample Petstore server from SwaggerHub 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.core

import java.util.concurrent.TimeUnit

import akka.actor.{ExtendedActorSystem, Extension, ExtensionKey}
import com.typesafe.config.Config
import io.swagger.client.core.ApiInvoker.CustomStatusCode
import spray.http.HttpHeaders.RawHeader

import scala.collection.JavaConversions._
import scala.concurrent.duration.FiniteDuration

class ApiSettings(config: Config) extends Extension {
  def this(system: ExtendedActorSystem) = this(system.settings.config)

  private def cfg = config.getConfig("io.swagger.client.apiRequest")

  val alwaysTrustCertificates: Boolean = cfg.getBoolean("trust-certificates")
  val defaultHeaders: List[RawHeader] = cfg.getConfig("default-headers").entrySet.toList.map(c => RawHeader(c.getKey, c.getValue.render))
  val connectionTimeout = FiniteDuration(cfg.getDuration("connection-timeout", TimeUnit.MILLISECONDS), TimeUnit.MILLISECONDS)
  val compressionEnabled: Boolean = cfg.getBoolean("compression.enabled")
  val compressionSizeThreshold: Int = cfg.getBytes("compression.size-threshold").toInt
  val customCodes: List[CustomStatusCode] = cfg.getConfigList("custom-codes").toList.map { c =>
    CustomStatusCode(
      c.getInt("code"),
      c.getString("reason"),
      c.getBoolean("success"))
  }
}

object ApiSettings extends ExtensionKey[ApiSettings]
