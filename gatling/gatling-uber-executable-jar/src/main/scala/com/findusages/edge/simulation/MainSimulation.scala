package com.findusages.edge.simulation

import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef.http

class MainSimulation extends Simulation {

  val httpConf = http
    .baseURL("https://httpbin.org")
    .header("Content-type", "application/json")

  setUp(
    scenario("Main Test")
      .forever() {
        exec(
          http("GET").get("/get")
        )
      }
      .inject(atOnceUsers(1)))
    .protocols(httpConf)
    .maxDuration(30)
}
