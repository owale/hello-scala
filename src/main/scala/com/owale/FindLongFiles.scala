package com.owale

import LongLines.processFile

/**
 * Created by waleed on 11/2/15.
 */
object FindLongFiles {
  /*To use LongLines from the command line, we’ll create an application
    that expects the line width as the first command-line argument, and interprets
    subsequent arguments as filenames: 1*/

  def main(args: Array[String]) {
    require(args(0).isInstanceOf[Int])
    val width = args(0).toInt
    for(arg <- args.drop(1)) processFile(arg,width)
  }
}
