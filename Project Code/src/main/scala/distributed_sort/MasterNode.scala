package main.scala.distributed_sort

import java.io.{BufferedReader, FileReader}

object MasterNode {
  private val CHUNK_SIZE = 5e8 //each worker machine should have 50GB

  def divideDataIntoChunks(filePath: String): List[List[String]] = {
    val chunks = scala.collection.mutable.ListBuffer[List[String]]()
    val bufferedReader = new BufferedReader(new FileReader(filePath))

    try {
      var chunk = scala.collection.mutable.ListBuffer[String]()
      var line = bufferedReader.readLine()

      while (line != null) {
        chunk += line
        if (chunk.size == CHUNK_SIZE) {
          chunks += chunk.toList
          chunk.clear()
        }
        line = bufferedReader.readLine()
      }

      if (chunk.nonEmpty) {
        chunks += chunk.toList
      }
    } finally {
      bufferedReader.close()
    }

    chunks.toList
  }
}

