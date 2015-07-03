/**
 */
package person.zhoujg.feature.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import person.zhoujg.feature.AttributePart;
import person.zhoujg.feature.Feature;
import person.zhoujg.feature.FeatureBody;
import person.zhoujg.feature.FeaturePackage;
import person.zhoujg.feature.RuleBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link person.zhoujg.feature.impl.FeatureBodyImpl#getAttrs <em>Attrs</em>}</li>
 *   <li>{@link person.zhoujg.feature.impl.FeatureBodyImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link person.zhoujg.feature.impl.FeatureBodyImpl#getRuleBody <em>Rule Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureBodyImpl extends MinimalEObjectImpl.Container implements FeatureBody
{
  /**
   * The cached value of the '{@link #getAttrs() <em>Attrs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrs()
   * @generated
   * @ordered
   */
  protected AttributePart attrs;

  /**
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected EList<Feature> features;

  /**
   * The cached value of the '{@link #getRuleBody() <em>Rule Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleBody()
   * @generated
   * @ordered
   */
  protected RuleBody ruleBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureBodyImpl()
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
    return FeaturePackage.Literals.FEATURE_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributePart getAttrs()
  {
    return attrs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttrs(AttributePart newAttrs, NotificationChain msgs)
  {
    AttributePart oldAttrs = attrs;
    attrs = newAttrs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturePackage.FEATURE_BODY__ATTRS, oldAttrs, newAttrs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttrs(AttributePart newAttrs)
  {
    if (newAttrs != attrs)
    {
      NotificationChain msgs = null;
      if (attrs != null)
        msgs = ((InternalEObject)attrs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.FEATURE_BODY__ATTRS, null, msgs);
      if (newAttrs != null)
        msgs = ((InternalEObject)newAttrs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.FEATURE_BODY__ATTRS, null, msgs);
      msgs = basicSetAttrs(newAttrs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.FEATURE_BODY__ATTRS, newAttrs, newAttrs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature> getFeatures()
  {
    if (features == null)
    {
      features = new EObjectContainmentEList<Feature>(Feature.class, this, FeaturePackage.FEATURE_BODY__FEATURES);
    }
    return features;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleBody getRuleBody()
  {
    return ruleBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRuleBody(RuleBody newRuleBody, NotificationChain msgs)
  {
    RuleBody oldRuleBody = ruleBody;
    ruleBody = newRuleBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturePackage.FEATURE_BODY__RULE_BODY, oldRuleBody, newRuleBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRuleBody(RuleBody newRuleBody)
  {
    if (newRuleBody != ruleBody)
    {
      NotificationChain msgs = null;
      if (ruleBody != null)
        msgs = ((InternalEObject)ruleBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.FEATURE_BODY__RULE_BODY, null, msgs);
      if (newRuleBody != null)
        msgs = ((InternalEObject)newRuleBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeaturePackage.FEATURE_BODY__RULE_BODY, null, msgs);
      msgs = basicSetRuleBody(newRuleBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.FEATURE_BODY__RULE_BODY, newRuleBody, newRuleBody));
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
      case FeaturePackage.FEATURE_BODY__ATTRS:
        return basicSetAttrs(null, msgs);
      case FeaturePackage.FEATURE_BODY__FEATURES:
        return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
      case FeaturePackage.FEATURE_BODY__RULE_BODY:
        return basicSetRuleBody(null, msgs);
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
      case FeaturePackage.FEATURE_BODY__ATTRS:
        return getAttrs();
      case FeaturePackage.FEATURE_BODY__FEATURES:
        return getFeatures();
      case FeaturePackage.FEATURE_BODY__RULE_BODY:
        return getRuleBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FeaturePackage.FEATURE_BODY__ATTRS:
        setAttrs((AttributePart)newValue);
        return;
      case FeaturePackage.FEATURE_BODY__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends Feature>)newValue);
        return;
      case FeaturePackage.FEATURE_BODY__RULE_BODY:
        setRuleBody((RuleBody)newValue);
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
      case FeaturePackage.FEATURE_BODY__ATTRS:
        setAttrs((AttributePart)null);
        return;
      case FeaturePackage.FEATURE_BODY__FEATURES:
        getFeatures().clear();
        return;
      case FeaturePackage.FEATURE_BODY__RULE_BODY:
        setRuleBody((RuleBody)null);
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
      case FeaturePackage.FEATURE_BODY__ATTRS:
        return attrs != null;
      case FeaturePackage.FEATURE_BODY__FEATURES:
        return features != null && !features.isEmpty();
      case FeaturePackage.FEATURE_BODY__RULE_BODY:
        return ruleBody != null;
    }
    return super.eIsSet(featureID);
  }

} //FeatureBodyImpl
