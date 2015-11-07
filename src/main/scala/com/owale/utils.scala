package com.owale

import java.io.{PrintWriter, File}

object utils {

  def grep(pattern: String, where: String = ".") = {
    val filesHere = (new File(where)).listFiles
    for (file <- filesHere
         if file.isFile
         if file.getName.endsWith(".scala");
         line <- getLines(file);
         trimmed = line.trim
         if trimmed.matches(pattern)
    ) println(file + " @ " + trimmed)
  }

  def getLines(file: File) = scala.io.Source.fromFile(file).getLines().toList

  def withPrintWriter(file: File)(op: PrintWriter => Unit) {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

}

