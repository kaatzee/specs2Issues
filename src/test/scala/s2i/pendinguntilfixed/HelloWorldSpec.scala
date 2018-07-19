package s2i.pendinguntilfixed

import org.specs2.mutable.SpecificationWithJUnit
import s2i.HelloWorld

class HelloWorldSpec extends SpecificationWithJUnit  {

  "Hello " should {
    "say to Mickey" in {
      HelloWorld.sayHelloTo("Mickey") === "Hello Mickey!"
    }

    "say to Goofy" in {
      HelloWorld.sayHelloTo("Goofy") === "Hello Goofy!"
    }

    "add two to 6" in {
      HelloWorld.sayHelloTo("Donald") === "Hello Doland!"
    }.pendingUntilFixed
  }
}
