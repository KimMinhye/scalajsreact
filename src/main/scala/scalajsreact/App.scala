package scalajsreact

import japgolly.scalajs.react.ReactDOM
import org.scalajs.dom

import scala.scalajs.js.annotation.{JSExportTopLevel, JSExport}
import scalajsreact.components.MyComponent

@JSExportTopLevel("App")
object App {

  @JSExport
  def main(args: Array[String]): Unit = {
    MyComponent
      .NoArgs()
      .renderIntoDOM(dom.document.getElementById("template-app"))
  }

}
