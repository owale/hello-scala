package com.owale

import java.io.File;

object ff{

  def getLines(file: File) = scala.io.Source.fromFile(file).getLines().toList

  def grep(pattern: String) = {
    val filesHere = (new File(".")).listFiles
    for(file<- filesHere
      if file.isFile
      if file.getName.endsWith(".scala");
      line<- getLines(file);
      trimmed = line.trim
      if trimmed.matches(pattern)
    ) println(file +" @ "+ trimmed)
  }

}