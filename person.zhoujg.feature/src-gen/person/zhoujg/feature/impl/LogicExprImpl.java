/**
 */
package person.zhoujg.feature.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import person.zhoujg.feature.BasicExpr;
import person.zhoujg.feature.FeaturePackage;
import person.zhoujg.feature.LogicExpr;
import person.zhoujg.feature.LogicOP;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link person.zhoujg.feature.impl.LogicExprImpl#getLeftLogicExpr <em>Left Logic Expr</em>}</li>
 *   <li>{@link person.zhoujg.feature.impl.LogicExprImpl#getLogicOP <em>Logic OP</em>}</li>
 *   <li>{@link person.zhoujg.feature.impl.LogicExprImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicExprImpl extends MinimalEObjectImpl.Container implements LogicExpr
{
  /**
   * The cached value of the '{@link #getLeftLogicExpr() <em>Left Logic Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftLogicExpr()
   * @generated
   * @ordered
   */
  protected EObject leftLogicExpr;

  /**
   * The default value of the '{@link #getLogicOP() <em>Logic OP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicOP()
   * @generated
   * @ordered
   */
  protected static final LogicOP LOGIC_OP_EDEFAULT = LogicOP.AND;

  /**
   * The cached value of the '{@link #getLogicOP() <em>Logic OP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicOP()
   * @generated
   * @ordered
   */
  protected LogicOP logicOP = LOGIC_OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected BasicExpr right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicExprImpl()
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
    return FeaturePackage.Literals.LOGIC_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getLeftLogicExpr()
  {
    return leftLogicExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftLogicExpr(EObject newLeftLogicExpr, NotificationChain msgs)
  {
    EObject oldLeftLogicExpr = leftLogicExpr;
    leftLogicExpr = newLeftLogicExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturePackage.LOGIC_EXPR__LEFT_LOGIC_EXPR, oldLeftLogicExpr, newLeftLogicExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftLogicExpr(EObject newLeftLogicExpr)
  {
    if (newLeftLogicExpr != leftLogicExpr)
    {
      NotificationChain msgs = null;
      if (leftLogicExpr != null)
        msgs = ((InternalEObject)leftLogicExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.LOGIC_EXPR__LEFT_LOGIC_EXPR, null, msgs);
      if (newLeftLogicExpr != null)
        msgs = ((InternalEObject)newLeftLogicExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.LOGIC_EXPR__LEFT_LOGIC_EXPR, null, msgs);
      msgs = basicSetLeftLogicExpr(newLeftLogicExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.LOGIC_EXPR__LEFT_LOGIC_EXPR, newLeftLogicExpr, newLeftLogicExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicOP getLogicOP()
  {
    return logicOP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLogicOP(LogicOP newLogicOP)
  {
    LogicOP oldLogicOP = logicOP;
    logicOP = newLogicOP == null ? LOGIC_OP_EDEFAULT : newLogicOP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.LOGIC_EXPR__LOGIC_OP, oldLogicOP, logicOP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicExpr getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(BasicExpr newRight, NotificationChain msgs)
  {
    BasicExpr oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturePackage.LOGIC_EXPR__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(BasicExpr newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.LOGIC_EXPR__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.LOGIC_EXPR__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.LOGIC_EXPR__RIGHT, newRight, newRight));
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
      case FeaturePackage.LOGIC_EXPR__LEFT_LOGIC_EXPR:
        return basicSetLeftLogicExpr(null, msgs);
      case FeaturePackage.LOGIC_EXPR__RIGHT:
        return basicSetRight(null, msgs);
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
      case FeaturePackage.LOGIC_EXPR__LEFT_LOGIC_EXPR:
        return getLeftLogicExpr();
      case FeaturePackage.LOGIC_EXPR__LOGIC_OP:
        return getLogicOP();
      case FeaturePackage.LOGIC_EXPR__RIGHT:
        return getRight();
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
      case FeaturePackage.LOGIC_EXPR__LEFT_LOGIC_EXPR:
        setLeftLogicExpr((EObject)newValue);
        return;
      case FeaturePackage.LOGIC_EXPR__LOGIC_OP:
        setLogicOP((LogicOP)newValue);
        return;
      case FeaturePackage.LOGIC_EXPR__RIGHT:
        setRight((BasicExpr)newValue);
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
      case FeaturePackage.LOGIC_EXPR__LEFT_LOGIC_EXPR:
        setLeftLogicExpr((EObject)null);
        return;
      case FeaturePackage.LOGIC_EXPR__LOGIC_OP:
        setLogicOP(LOGIC_OP_EDEFAULT);
        return;
      case FeaturePackage.LOGIC_EXPR__RIGHT:
        setRight((BasicExpr)null);
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
      case FeaturePackage.LOGIC_EXPR__LEFT_LOGIC_EXPR:
        return leftLogicExpr != null;
      case FeaturePackage.LOGIC_EXPR__LOGIC_OP:
        return logicOP != LOGIC_OP_EDEFAULT;
      case FeaturePackage.LOGIC_EXPR__RIGHT:
        return right != null;
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
    result.append(" (logicOP: ");
    result.append(logicOP);
    result.append(')');
    return result.toString();
  }

} //LogicExprImpl
