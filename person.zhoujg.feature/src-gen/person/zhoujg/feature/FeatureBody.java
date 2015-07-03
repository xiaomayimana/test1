/**
 */
package person.zhoujg.feature;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link person.zhoujg.feature.FeatureBody#getAttrs <em>Attrs</em>}</li>
 *   <li>{@link person.zhoujg.feature.FeatureBody#getFeatures <em>Features</em>}</li>
 *   <li>{@link person.zhoujg.feature.FeatureBody#getRuleBody <em>Rule Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see person.zhoujg.feature.FeaturePackage#getFeatureBody()
 * @model
 * @generated
 */
public interface FeatureBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Attrs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attrs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrs</em>' containment reference.
   * @see #setAttrs(AttributePart)
   * @see person.zhoujg.feature.FeaturePackage#getFeatureBody_Attrs()
   * @model containment="true"
   * @generated
   */
  AttributePart getAttrs();

  /**
   * Sets the value of the '{@link person.zhoujg.feature.FeatureBody#getAttrs <em>Attrs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attrs</em>' containment reference.
   * @see #getAttrs()
   * @generated
   */
  void setAttrs(AttributePart value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link person.zhoujg.feature.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see person.zhoujg.feature.FeaturePackage#getFeatureBody_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

  /**
   * Returns the value of the '<em><b>Rule Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Body</em>' containment reference.
   * @see #setRuleBody(RuleBody)
   * @see person.zhoujg.feature.FeaturePackage#getFeatureBody_RuleBody()
   * @model containment="true"
   * @generated
   */
  RuleBody getRuleBody();

  /**
   * Sets the value of the '{@link person.zhoujg.feature.FeatureBody#getRuleBody <em>Rule Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule Body</em>' containment reference.
   * @see #getRuleBody()
   * @generated
   */
  void setRuleBody(RuleBody value);

} // FeatureBody
