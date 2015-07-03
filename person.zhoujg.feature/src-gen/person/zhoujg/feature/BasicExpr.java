/**
 */
package person.zhoujg.feature;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link person.zhoujg.feature.BasicExpr#getLExpr <em>LExpr</em>}</li>
 *   <li>{@link person.zhoujg.feature.BasicExpr#getCompOp <em>Comp Op</em>}</li>
 *   <li>{@link person.zhoujg.feature.BasicExpr#getRExpr <em>RExpr</em>}</li>
 * </ul>
 * </p>
 *
 * @see person.zhoujg.feature.FeaturePackage#getBasicExpr()
 * @model
 * @generated
 */
public interface BasicExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>LExpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>LExpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>LExpr</em>' containment reference.
   * @see #setLExpr(Atom)
   * @see person.zhoujg.feature.FeaturePackage#getBasicExpr_LExpr()
   * @model containment="true"
   * @generated
   */
  Atom getLExpr();

  /**
   * Sets the value of the '{@link person.zhoujg.feature.BasicExpr#getLExpr <em>LExpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>LExpr</em>' containment reference.
   * @see #getLExpr()
   * @generated
   */
  void setLExpr(Atom value);

  /**
   * Returns the value of the '<em><b>Comp Op</b></em>' attribute.
   * The literals are from the enumeration {@link person.zhoujg.feature.ComparationOP}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comp Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comp Op</em>' attribute.
   * @see person.zhoujg.feature.ComparationOP
   * @see #setCompOp(ComparationOP)
   * @see person.zhoujg.feature.FeaturePackage#getBasicExpr_CompOp()
   * @model
   * @generated
   */
  ComparationOP getCompOp();

  /**
   * Sets the value of the '{@link person.zhoujg.feature.BasicExpr#getCompOp <em>Comp Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comp Op</em>' attribute.
   * @see person.zhoujg.feature.ComparationOP
   * @see #getCompOp()
   * @generated
   */
  void setCompOp(ComparationOP value);

  /**
   * Returns the value of the '<em><b>RExpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>RExpr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>RExpr</em>' containment reference.
   * @see #setRExpr(Atom)
   * @see person.zhoujg.feature.FeaturePackage#getBasicExpr_RExpr()
   * @model containment="true"
   * @generated
   */
  Atom getRExpr();

  /**
   * Sets the value of the '{@link person.zhoujg.feature.BasicExpr#getRExpr <em>RExpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RExpr</em>' containment reference.
   * @see #getRExpr()
   * @generated
   */
  void setRExpr(Atom value);

} // BasicExpr
