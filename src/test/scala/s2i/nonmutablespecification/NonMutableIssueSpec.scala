package s2i.nonmutablespecification

import org.specs2.SpecificationWithJUnit

class NonMutableIssueSpec extends SpecificationWithJUnit { def is = s2"""
        Explanation Text.

        First starting test line

          example no. one $ok
          example no. two $ok

        Second starting test line
          first set of fragments $fragments1
          second set of fragments $fragments2
          """

  private def fragments1 = fragments("first")
  private def fragments2 = fragments("second")

  private def fragments(description: String) = {
    p^
      s"example no. one from $description set"  ! success ^br^
      s"example no. two from $description set"  ! success ^br
  }
}
