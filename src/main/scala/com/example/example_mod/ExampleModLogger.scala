package com.example.example_mod

import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer
import org.slf4j.{Logger, LoggerFactory}

object ExampleModLogger {
  // This logger is used to write text to the console and the log file.
  // It is considered best practice to use your mod name as the logger's name.
  // That way, it's clear which mod wrote info, warnings, and errors.
  val LOGGER: Logger = LoggerFactory.getLogger("Example Mod")
}


