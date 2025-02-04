// SPDX-License-Identifier: Apache-2.0

package firrtl
package transforms

import firrtl.annotations._

/** Indicate that ConstantPropagation should not be run */
case object NoConstantPropagationAnnotation extends NoTargetAnnotation

/** A component that should be preserved
  *
  * DCE treats the component as a top-level sink of the circuit
  */
case class DontTouchAnnotation(target: ReferenceTarget) extends SingleTargetAnnotation[ReferenceTarget] {
  def targets = Seq(target)
  def duplicate(n: ReferenceTarget) = this.copy(n)
}
