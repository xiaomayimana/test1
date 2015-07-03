/**
 */
package person.zhoujg.feature;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link person.zhoujg.feature.Atom#getLiteral <em>Literal</em>}</li>
 *   <li>{@link person.zhoujg.feature.Atom#getSub <em>Sub</em>}</li>
 * </ul>
 * </p>
 *
 * @see person.zhoujg.feature.FeaturePackage#getAtom()
 * @model
 * @generated
 */
public interface Atom extends EObject
{
  /**
   * Returns the value of the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' containment reference.
   * @see #setLiteral(Literal)
   * @see person.zhoujg.feature.FeaturePackage#getAtom_Literal()
   * @model containment="true"
   * @generated
   */
  Literal getLiteral();

  /**
   * Sets the value of the '{@link person.zhoujg.feature.Atom#getLiteral <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' containment reference.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(Literal value);

  /**
   * Returns the value of the '<em><b>Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub</em>' containment reference.
   * @see #setSub(LogicExpr)
   * @see person.zhoujg.feature.FeaturePackage#getAtom_Sub()
   * @model containment="true"
   * @generated
   */
  LogicExpr getSub();

  /**
   * Sets the value of the '{@link person.zhoujg.feature.Atom#getSub <em>Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub</em>' containment reference.
   * @see #getSub()
   * @generated
   */
  void setSub(LogicExpr value);

} // Atom
