/**
 */
package person.zhoujg.feature;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link person.zhoujg.feature.LogicExpr#getLeftLogicExpr <em>Left Logic Expr</em>}</li>
 *   <li>{@link person.zhoujg.feature.LogicExpr#getLogicOP <em>Logic OP</em>}</li>
 *   <li>{@link person.zhoujg.feature.LogicExpr#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see person.zhoujg.feature.FeaturePackage#getLogicExpr()
 * @model
 * @generated
 */
public interface LogicExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Left Logic Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Logic Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Logic Expr</em>' containment reference.
   * @see #setLeftLogicExpr(EObject)
   * @see person.zhoujg.feature.FeaturePackage#getLogicExpr_LeftLogicExpr()
   * @model containment="true"
   * @generated
   */
  EObject getLeftLogicExpr();

  /**
   * Sets the value of the '{@link person.zhoujg.feature.LogicExpr#getLeftLogicExpr <em>Left Logic Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Logic Expr</em>' containment reference.
   * @see #getLeftLogicExpr()
   * @generated
   */
  void setLeftLogicExpr(EObject value);

  /**
   * Returns the value of the '<em><b>Logic OP</b></em>' attribute.
   * The literals are from the enumeration {@link person.zhoujg.feature.LogicOP}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logic OP</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logic OP</em>' attribute.
   * @see person.zhoujg.feature.LogicOP
   * @see #setLogicOP(LogicOP)
   * @see person.zhoujg.feature.FeaturePackage#getLogicExpr_LogicOP()
   * @model
   * @generated
   */
  LogicOP getLogicOP();

  /**
   * Sets the value of the '{@link person.zhoujg.feature.LogicExpr#getLogicOP <em>Logic OP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logic OP</em>' attribute.
   * @see person.zhoujg.feature.LogicOP
   * @see #getLogicOP()
   * @generated
   */
  void setLogicOP(LogicOP value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(BasicExpr)
   * @see person.zhoujg.feature.FeaturePackage#getLogicExpr_Right()
   * @model containment="true"
   * @generated
   */
  BasicExpr getRight();

  /**
   * Sets the value of the '{@link person.zhoujg.feature.LogicExpr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(BasicExpr value);

} // LogicExpr
