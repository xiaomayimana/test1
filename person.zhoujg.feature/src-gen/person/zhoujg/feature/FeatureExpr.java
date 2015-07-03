/**
 */
package person.zhoujg.feature;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link person.zhoujg.feature.FeatureExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link person.zhoujg.feature.FeatureExpr#getOp <em>Op</em>}</li>
 *   <li>{@link person.zhoujg.feature.FeatureExpr#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see person.zhoujg.feature.FeaturePackage#getFeatureExpr()
 * @model
 * @generated
 */
public interface FeatureExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(LogicExpr)
   * @see person.zhoujg.feature.FeaturePackage#getFeatureExpr_Left()
   * @model containment="true"
   * @generated
   */
  LogicExpr getLeft();

  /**
   * Sets the value of the '{@link person.zhoujg.feature.FeatureExpr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(LogicExpr value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link person.zhoujg.feature.FeatureOP}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see person.zhoujg.feature.FeatureOP
   * @see #setOp(FeatureOP)
   * @see person.zhoujg.feature.FeaturePackage#getFeatureExpr_Op()
   * @model
   * @generated
   */
  FeatureOP getOp();

  /**
   * Sets the value of the '{@link person.zhoujg.feature.FeatureExpr#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see person.zhoujg.feature.FeatureOP
   * @see #getOp()
   * @generated
   */
  void setOp(FeatureOP value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(LogicExpr)
   * @see person.zhoujg.feature.FeaturePackage#getFeatureExpr_Right()
   * @model containment="true"
   * @generated
   */
  LogicExpr getRight();

  /**
   * Sets the value of the '{@link person.zhoujg.feature.FeatureExpr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(LogicExpr value);

} // FeatureExpr
