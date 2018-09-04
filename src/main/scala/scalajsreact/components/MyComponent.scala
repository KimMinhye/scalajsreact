package scalajsreact.components

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._

object MyComponent {

val NoArgs =
  ScalaComponent.builder[Unit]("No args")
    .renderStatic(<.div("Hello!"))
    .build
}
