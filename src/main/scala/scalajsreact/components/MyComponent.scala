package scalajsreact.components

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._

object MyComponent {
  case class Props(name: String = "React", age: Int)
  case class State(count: Int)

  class Backend($ : BackendScope[Props, State]) {
    def onClick() = $.modState(s => State(s.count + 1))
    def render(props: Props, state: State) = {
      <.div(<.p(s"안녕하세요. 제 이름은 ${props.name}입니다."),
            <.p(s"저는 ${props.age}입니다."),
            <.p(s"숫자 : ${state.count}"),
            <.button(^.onClick --> onClick, "더하기"))
    }
  }

  val NoArgs =
    ScalaComponent
      .builder[Unit]("No args")
      .renderStatic(<.div("Hello!"))
      .build

  val Component = ScalaComponent
    .builder[Props]("Hello")
    .initialState(State(0))
    .renderBackend[Backend]
    .build
}
