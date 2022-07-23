package com.language_adapter


import org.quiltmc.loader.api.{LanguageAdapter, ModContainer}
import scala.language.postfixOps

class ScalaAdapter extends LanguageAdapter {
  override def create[T](mod: ModContainer, value: String, aClass: Class[T]): T = {
    try {
      Class.forName(value + "$").getField("MODULE$").get(null).asInstanceOf[T]
    } catch {
      case e: Exception =>
        throw Exception("Adapter error...\n" + e)
    }
  }
}
