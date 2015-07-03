/**
 */
package person.zhoujg.feature.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import person.zhoujg.feature.Atom;
import person.zhoujg.feature.BasicExpr;
import person.zhoujg.feature.ComparationOP;
import person.zhoujg.feature.FeaturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link person.zhoujg.feature.impl.BasicExprImpl#getLExpr <em>LExpr</em>}</li>
 *   <li>{@link person.zhoujg.feature.impl.BasicExprImpl#getCompOp <em>Comp Op</em>}</li>
 *   <li>{@link person.zhoujg.feature.impl.BasicExprImpl#getRExpr <em>RExpr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicExprImpl extends MinimalEObjectImpl.Container implements BasicExpr
{
  /**
   * The cached value of the '{@link #getLExpr() <em>LExpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLExpr()
   * @generated
   * @ordered
   */
  protected Atom lExpr;

  /**
   * The default value of the '{@link #getCompOp() <em>Comp Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompOp()
   * @generated
   * @ordered
   */
  protected static final ComparationOP COMP_OP_EDEFAULT = ComparationOP.GT;

  /**
   * The cached value of the '{@link #getCompOp() <em>Comp Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompOp()
   * @generated
   * @ordered
   */
  protected ComparationOP compOp = COMP_OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getRExpr() <em>RExpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRExpr()
   * @generated
   * @ordered
   */
  protected Atom rExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BasicExprImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FeaturePackage.Literals.BASIC_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom getLExpr()
  {
    return lExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLExpr(Atom newLExpr, NotificationChain msgs)
  {
    Atom oldLExpr = lExpr;
    lExpr = newLExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturePackage.BASIC_EXPR__LEXPR, oldLExpr, newLExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLExpr(Atom newLExpr)
  {
    if (newLExpr != lExpr)
    {
      NotificationChain msgs = null;
      if (lExpr != null)
        msgs = ((InternalEObject)lExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.BASIC_EXPR__LEXPR, null, msgs);
      if (newLExpr != null)
        msgs = ((InternalEObject)newLExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.BASIC_EXPR__LEXPR, null, msgs);
      msgs = basicSetLExpr(newLExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.BASIC_EXPR__LEXPR, newLExpr, newLExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComparationOP getCompOp()
  {
    return compOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompOp(ComparationOP newCompOp)
  {
    ComparationOP oldCompOp = compOp;
    compOp = newCompOp == null ? COMP_OP_EDEFAULT : newCompOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.BASIC_EXPR__COMP_OP, oldCompOp, compOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom getRExpr()
  {
    return rExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRExpr(Atom newRExpr, NotificationChain msgs)
  {
    Atom oldRExpr = rExpr;
    rExpr = newRExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturePackage.BASIC_EXPR__REXPR, oldRExpr, newRExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRExpr(Atom newRExpr)
  {
    if (newRExpr != rExpr)
    {
      NotificationChain msgs = null;
      if (rExpr != null)
        msgs = ((InternalEObject)rExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.BASIC_EXPR__REXPR, null, msgs);
      if (newRExpr != null)
        msgs = ((InternalEObject)newRExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.BASIC_EXPR__REXPR, null, msgs);
      msgs = basicSetRExpr(newRExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.BASIC_EXPR__REXPR, newRExpr, newRExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FeaturePackage.BASIC_EXPR__LEXPR:
        return basicSetLExpr(null, msgs);
      case FeaturePackage.BASIC_EXPR__REXPR:
        return basicSetRExpr(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FeaturePackage.BASIC_EXPR__LEXPR:
        return getLExpr();
      case FeaturePackage.BASIC_EXPR__COMP_OP:
        return getCompOp();
      case FeaturePackage.BASIC_EXPR__REXPR:
        return getRExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FeaturePackage.BASIC_EXPR__LEXPR:
        setLExpr((Atom)newValue);
        return;
      case FeaturePackage.BASIC_EXPR__COMP_OP:
        setCompOp((ComparationOP)newValue);
        return;
      case FeaturePackage.BASIC_EXPR__REXPR:
        setRExpr((Atom)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FeaturePackage.BASIC_EXPR__LEXPR:
        setLExpr((Atom)null);
        return;
      case FeaturePackage.BASIC_EXPR__COMP_OP:
        setCompOp(COMP_OP_EDEFAULT);
        return;
      case FeaturePackage.BASIC_EXPR__REXPR:
        setRExpr((Atom)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FeaturePackage.BASIC_EXPR__LEXPR:
        return lExpr != null;
      case FeaturePackage.BASIC_EXPR__COMP_OP:
        return compOp != COMP_OP_EDEFAULT;
      case FeaturePackage.BASIC_EXPR__REXPR:
        return rExpr != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (compOp: ");
    result.append(compOp);
    result.append(')');
    return result.toString();
  }

} //BasicExprImpl
