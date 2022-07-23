package com.example.example_mod

import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer

object ExampleMod extends ModInitializer:
  override def onInitialize(mod: ModContainer): Unit = {
    ExampleModLogger.LOGGER.info("Hello Quilt world from {}!", mod.metadata.name)
  }

