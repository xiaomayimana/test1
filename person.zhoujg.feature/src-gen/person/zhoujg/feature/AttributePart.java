/**
 */
package person.zhoujg.feature;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link person.zhoujg.feature.AttributePart#getAttr <em>Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @see person.zhoujg.feature.FeaturePackage#getAttributePart()
 * @model
 * @generated
 */
public interface AttributePart extends EObject
{
  /**
   * Returns the value of the '<em><b>Attr</b></em>' containment reference list.
   * The list contents are of type {@link person.zhoujg.feature.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' containment reference list.
   * @see person.zhoujg.feature.FeaturePackage#getAttributePart_Attr()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getAttr();

} // AttributePart
