package darthorimar.intellijcbt.runner

import com.intellij.openapi.util.Key

trait CbtOutputFilter {
  def filter(text: String, outputType: Key[_]): Boolean
}
