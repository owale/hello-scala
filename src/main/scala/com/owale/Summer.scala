package com.owale

import java.io.File

import com.owale.utils._

object Summer extends App{
  grep(".*gcd*.")

  val file = new File("date.txt")
  withPrintWriter(file){
    writer => writer.println(new java.util.Date)
  }
}