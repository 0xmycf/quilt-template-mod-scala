package com.language_adapter

import org.quiltmc.loader.api.{LanguageAdapter, ModContainer}

class ScalaAdapter extends LanguageAdapter {
  override def create[T](mod: ModContainer, value: String, aClass: Class[T]): T = {
    try {
      Class.forName(value + "$").getField("MODULE$").get(null).asInstanceOf[T]
    } catch {
      case _: Exception =>
        println(s"Unable to find ${aClass.getName}$$MODULE$$")
        aClass.getConstructor().newInstance()
    }
  }
}
