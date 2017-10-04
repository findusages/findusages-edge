package com.findusages.edge

import com.findusages.edge.simulation.MainSimulation
import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder

object MainApp extends App {
  val props = new GatlingPropertiesBuilder
  props.dataDirectory("jar")
  props.simulationClass(classOf[MainSimulation].getName)
  Gatling.fromMap(props.build)
  sys.exit()
}
