/**
 */
package person.zhoujg.feature;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link person.zhoujg.feature.RuleBody#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see person.zhoujg.feature.FeaturePackage#getRuleBody()
 * @model
 * @generated
 */
public interface RuleBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link person.zhoujg.feature.FeatureExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see person.zhoujg.feature.FeaturePackage#getRuleBody_Rules()
   * @model containment="true"
   * @generated
   */
  EList<FeatureExpr> getRules();

} // RuleBody
