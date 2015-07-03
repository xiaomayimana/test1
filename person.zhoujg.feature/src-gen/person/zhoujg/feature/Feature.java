/**
 */
package person.zhoujg.feature;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link person.zhoujg.feature.Feature#getName <em>Name</em>}</li>
 *   <li>{@link person.zhoujg.feature.Feature#getInCard <em>In Card</em>}</li>
 *   <li>{@link person.zhoujg.feature.Feature#getBody <em>Body</em>}</li>
 *   <li>{@link person.zhoujg.feature.Feature#getOutCard <em>Out Card</em>}</li>
 *   <li>{@link person.zhoujg.feature.Feature#getRef <em>Ref</em>}</li>
 *   <li>{@link person.zhoujg.feature.Feature#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see person.zhoujg.feature.FeaturePackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see person.zhoujg.feature.FeaturePackage#getFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link person.zhoujg.feature.Feature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>In Card</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Card</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Card</em>' attribute.
   * @see #setInCard(String)
   * @see person.zhoujg.feature.FeaturePackage#getFeature_InCard()
   * @model
   * @generated
   */
  String getInCard();

  /**
   * Sets the value of the '{@link person.zhoujg.feature.Feature#getInCard <em>In Card</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In Card</em>' attribute.
   * @see #getInCard()
   * @generated
   */
  void setInCard(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(FeatureBody)
   * @see person.zhoujg.feature.FeaturePackage#getFeature_Body()
   * @model containment="true"
   * @generated
   */
  FeatureBody getBody();

  /**
   * Sets the value of the '{@link person.zhoujg.feature.Feature#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(FeatureBody value);

  /**
   * Returns the value of the '<em><b>Out Card</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Card</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Card</em>' attribute.
   * @see #setOutCard(String)
   * @see person.zhoujg.feature.FeaturePackage#getFeature_OutCard()
   * @model
   * @generated
   */
  String getOutCard();

  /**
   * Sets the value of the '{@link person.zhoujg.feature.Feature#getOutCard <em>Out Card</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out Card</em>' attribute.
   * @see #getOutCard()
   * @generated
   */
  void setOutCard(String value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Feature)
   * @see person.zhoujg.feature.FeaturePackage#getFeature_Ref()
   * @model
   * @generated
   */
  Feature getRef();

  /**
   * Sets the value of the '{@link person.zhoujg.feature.Feature#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Feature value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link person.zhoujg.feature.AttributeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see person.zhoujg.feature.AttributeType
   * @see #setType(AttributeType)
   * @see person.zhoujg.feature.FeaturePackage#getFeature_Type()
   * @model
   * @generated
   */
  AttributeType getType();

  /**
   * Sets the value of the '{@link person.zhoujg.feature.Feature#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see person.zhoujg.feature.AttributeType
   * @see #getType()
   * @generated
   */
  void setType(AttributeType value);

} // Feature
