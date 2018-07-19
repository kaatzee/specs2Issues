package s2i.beforeandafterallastest

import org.specs2.mutable.SpecificationWithJUnit
import org.specs2.specification.BeforeAfterAll
import s2i.HelloWorld

class HelloWorldSpec extends SpecificationWithJUnit with BeforeAfterAll {

  "Hello " should {
    "say to Mickey" in {
      HelloWorld.sayHelloTo("Mickey") === "Hello Mickey!"
    }

    "say to Goofy" in {
      HelloWorld.sayHelloTo("Goofy") === "Hello Goofy!"
    }

    "add two to 6" in {
      HelloWorld.sayHelloTo("Donald") === "Hello Donald!"
    }
  }

  override def beforeAll(): Unit = {}

  override def afterAll(): Unit = {}
}
