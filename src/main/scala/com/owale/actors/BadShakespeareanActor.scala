package com.owale.actors
// All that's needed for now are three components from Akka
import akka.actor.{Actor, Props, ActorSystem}
// Our Actor

case class Gamma(g: String)
case class Beta(b: String, g: Gamma)
case class Alpha(b1: Beta, b2: Beta)

class BadShakespeareanActor extends Actor {
  // The 'Business Logic'
  def receive = {
    case "Hello" =>
      println("Hi")
    // Literal Int match
    case 42 =>
      println("I don't know the question. Go ask the Earth Mark II.")
    // Matches any string at all
    case s: String =>
      println("you sent me a string " + s)
    case Alpha(Beta(beta1, Gamma(gamma1)), Beta(beta2, Gamma(gamma2))) =>
      println("beta1: % s, beta2: % s, gamma1: % s, gamma2: % s".format(
        beta1, beta2, gamma1, gamma2))
    // Catch all. Matches any message type
    case _ =>
      println("Huh?")


  }
}