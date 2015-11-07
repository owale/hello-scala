package com.owale

import java.io.File


object FileMatcher {
  private def filesHere = (new File(".")).listFiles

  private def fileMatching(matched: String => Boolean) = {
    for (file <- filesHere if matched(file.getName))
      yield file
  }

  def fileEndWith(end: String) = fileMatching(_.endsWith(end))

  def fileContain(sub: String) = fileMatching(_.contains(sub))

  def fileMatch(regex: String) = fileMatching(_.matches(regex))

}
