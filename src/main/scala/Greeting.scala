package hello

import scala.beans.BeanProperty

case class Greeting(@BeanProperty id:Int, @BeanProperty content: String)
