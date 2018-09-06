package scalajsreact

import japgolly.scalajs.react.ReactDOM
import org.scalajs.dom

import scala.scalajs.js.annotation.{JSExportTopLevel, JSExport}
import scalajsreact.components.MyComponent
import scalajsreact.components.MyComponent._

@JSExportTopLevel("App")
object App {

  @JSExport
  def main(args: Array[String]): Unit = {
    MyComponent
      .Component(Props(name = "react", age = 4))
      .renderIntoDOM(dom.document.getElementById("template-app"))
  }

}
