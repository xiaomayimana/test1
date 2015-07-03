/**
 */
package person.zhoujg.feature;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see person.zhoujg.feature.FeatureFactory
 * @model kind="package"
 * @generated
 */
public interface FeaturePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "feature";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.zhoujg.person/Feature";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "feature";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FeaturePackage eINSTANCE = person.zhoujg.feature.impl.FeaturePackageImpl.init();

  /**
   * The meta object id for the '{@link person.zhoujg.feature.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see person.zhoujg.feature.impl.FeatureImpl
   * @see person.zhoujg.feature.impl.FeaturePackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>In Card</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__IN_CARD = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__BODY = 2;

  /**
   * The feature id for the '<em><b>Out Card</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__OUT_CARD = 3;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__REF = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__TYPE = 5;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link person.zhoujg.feature.impl.FeatureBodyImpl <em>Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see person.zhoujg.feature.impl.FeatureBodyImpl
   * @see person.zhoujg.feature.impl.FeaturePackageImpl#getFeatureBody()
   * @generated
   */
  int FEATURE_BODY = 1;

  /**
   * The feature id for the '<em><b>Attrs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_BODY__ATTRS = 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_BODY__FEATURES = 1;

  /**
   * The feature id for the '<em><b>Rule Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_BODY__RULE_BODY = 2;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_BODY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link person.zhoujg.feature.impl.AttributePartImpl <em>Attribute Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see person.zhoujg.feature.impl.AttributePartImpl
   * @see person.zhoujg.feature.impl.FeaturePackageImpl#getAttributePart()
   * @generated
   */
  int ATTRIBUTE_PART = 2;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PART__ATTR = 0;

  /**
   * The number of structural features of the '<em>Attribute Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link person.zhoujg.feature.impl.RuleBodyImpl <em>Rule Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see person.zhoujg.feature.impl.RuleBodyImpl
   * @see person.zhoujg.feature.impl.FeaturePackageImpl#getRuleBody()
   * @generated
   */
  int RULE_BODY = 3;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_BODY__RULES = 0;

  /**
   * The number of structural features of the '<em>Rule Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link person.zhoujg.feature.impl.FeatureExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see person.zhoujg.feature.impl.FeatureExprImpl
   * @see person.zhoujg.feature.impl.FeaturePackageImpl#getFeatureExpr()
   * @generated
   */
  int FEATURE_EXPR = 4;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_EXPR__LEFT = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_EXPR__OP = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_EXPR__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_EXPR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link person.zhoujg.feature.impl.LogicExprImpl <em>Logic Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see person.zhoujg.feature.impl.LogicExprImpl
   * @see person.zhoujg.feature.impl.FeaturePackageImpl#getLogicExpr()
   * @generated
   */
  int LOGIC_EXPR = 5;

  /**
   * The feature id for the '<em><b>Left Logic Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPR__LEFT_LOGIC_EXPR = 0;

  /**
   * The feature id for the '<em><b>Logic OP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPR__LOGIC_OP = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPR__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Logic Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link person.zhoujg.feature.impl.BasicExprImpl <em>Basic Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see person.zhoujg.feature.impl.BasicExprImpl
   * @see person.zhoujg.feature.impl.FeaturePackageImpl#getBasicExpr()
   * @generated
   */
  int BASIC_EXPR = 6;

  /**
   * The feature id for the '<em><b>LExpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_EXPR__LEXPR = 0;

  /**
   * The feature id for the '<em><b>Comp Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_EXPR__COMP_OP = 1;

  /**
   * The feature id for the '<em><b>RExpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_EXPR__REXPR = 2;

  /**
   * The number of structural features of the '<em>Basic Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_EXPR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link person.zhoujg.feature.impl.AtomImpl <em>Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see person.zhoujg.feature.impl.AtomImpl
   * @see person.zhoujg.feature.impl.FeaturePackageImpl#getAtom()
   * @generated
   */
  int ATOM = 7;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__LITERAL = 0;

  /**
   * The feature id for the '<em><b>Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__SUB = 1;

  /**
   * The number of structural features of the '<em>Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link person.zhoujg.feature.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see person.zhoujg.feature.impl.LiteralImpl
   * @see person.zhoujg.feature.impl.FeaturePackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 8;

  /**
   * The feature id for the '<em><b>Str</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__STR = 0;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__INT = 1;

  /**
   * The feature id for the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__BOOL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__NAME = 3;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link person.zhoujg.feature.AttributeType <em>Attribute Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see person.zhoujg.feature.AttributeType
   * @see person.zhoujg.feature.impl.FeaturePackageImpl#getAttributeType()
   * @generated
   */
  int ATTRIBUTE_TYPE = 9;

  /**
   * The meta object id for the '{@link person.zhoujg.feature.ComparationOP <em>Comparation OP</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see person.zhoujg.feature.ComparationOP
   * @see person.zhoujg.feature.impl.FeaturePackageImpl#getComparationOP()
   * @generated
   */
  int COMPARATION_OP = 10;

  /**
   * The meta object id for the '{@link person.zhoujg.feature.FeatureOP <em>OP</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see person.zhoujg.feature.FeatureOP
   * @see person.zhoujg.feature.impl.FeaturePackageImpl#getFeatureOP()
   * @generated
   */
  int FEATURE_OP = 11;

  /**
   * The meta object id for the '{@link person.zhoujg.feature.LogicOP <em>Logic OP</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see person.zhoujg.feature.LogicOP
   * @see person.zhoujg.feature.impl.FeaturePackageImpl#getLogicOP()
   * @generated
   */
  int LOGIC_OP = 12;


  /**
   * Returns the meta object for class '{@link person.zhoujg.feature.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see person.zhoujg.feature.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link person.zhoujg.feature.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see person.zhoujg.feature.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link person.zhoujg.feature.Feature#getInCard <em>In Card</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>In Card</em>'.
   * @see person.zhoujg.feature.Feature#getInCard()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_InCard();

  /**
   * Returns the meta object for the containment reference '{@link person.zhoujg.feature.Feature#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see person.zhoujg.feature.Feature#getBody()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Body();

  /**
   * Returns the meta object for the attribute '{@link person.zhoujg.feature.Feature#getOutCard <em>Out Card</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Out Card</em>'.
   * @see person.zhoujg.feature.Feature#getOutCard()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_OutCard();

  /**
   * Returns the meta object for the reference '{@link person.zhoujg.feature.Feature#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see person.zhoujg.feature.Feature#getRef()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Ref();

  /**
   * Returns the meta object for the attribute '{@link person.zhoujg.feature.Feature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see person.zhoujg.feature.Feature#getType()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Type();

  /**
   * Returns the meta object for class '{@link person.zhoujg.feature.FeatureBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body</em>'.
   * @see person.zhoujg.feature.FeatureBody
   * @generated
   */
  EClass getFeatureBody();

  /**
   * Returns the meta object for the containment reference '{@link person.zhoujg.feature.FeatureBody#getAttrs <em>Attrs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attrs</em>'.
   * @see person.zhoujg.feature.FeatureBody#getAttrs()
   * @see #getFeatureBody()
   * @generated
   */
  EReference getFeatureBody_Attrs();

  /**
   * Returns the meta object for the containment reference list '{@link person.zhoujg.feature.FeatureBody#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see person.zhoujg.feature.FeatureBody#getFeatures()
   * @see #getFeatureBody()
   * @generated
   */
  EReference getFeatureBody_Features();

  /**
   * Returns the meta object for the containment reference '{@link person.zhoujg.feature.FeatureBody#getRuleBody <em>Rule Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule Body</em>'.
   * @see person.zhoujg.feature.FeatureBody#getRuleBody()
   * @see #getFeatureBody()
   * @generated
   */
  EReference getFeatureBody_RuleBody();

  /**
   * Returns the meta object for class '{@link person.zhoujg.feature.AttributePart <em>Attribute Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Part</em>'.
   * @see person.zhoujg.feature.AttributePart
   * @generated
   */
  EClass getAttributePart();

  /**
   * Returns the meta object for the containment reference list '{@link person.zhoujg.feature.AttributePart#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attr</em>'.
   * @see person.zhoujg.feature.AttributePart#getAttr()
   * @see #getAttributePart()
   * @generated
   */
  EReference getAttributePart_Attr();

  /**
   * Returns the meta object for class '{@link person.zhoujg.feature.RuleBody <em>Rule Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Body</em>'.
   * @see person.zhoujg.feature.RuleBody
   * @generated
   */
  EClass getRuleBody();

  /**
   * Returns the meta object for the containment reference list '{@link person.zhoujg.feature.RuleBody#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see person.zhoujg.feature.RuleBody#getRules()
   * @see #getRuleBody()
   * @generated
   */
  EReference getRuleBody_Rules();

  /**
   * Returns the meta object for class '{@link person.zhoujg.feature.FeatureExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see person.zhoujg.feature.FeatureExpr
   * @generated
   */
  EClass getFeatureExpr();

  /**
   * Returns the meta object for the containment reference '{@link person.zhoujg.feature.FeatureExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see person.zhoujg.feature.FeatureExpr#getLeft()
   * @see #getFeatureExpr()
   * @generated
   */
  EReference getFeatureExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link person.zhoujg.feature.FeatureExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see person.zhoujg.feature.FeatureExpr#getOp()
   * @see #getFeatureExpr()
   * @generated
   */
  EAttribute getFeatureExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link person.zhoujg.feature.FeatureExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see person.zhoujg.feature.FeatureExpr#getRight()
   * @see #getFeatureExpr()
   * @generated
   */
  EReference getFeatureExpr_Right();

  /**
   * Returns the meta object for class '{@link person.zhoujg.feature.LogicExpr <em>Logic Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logic Expr</em>'.
   * @see person.zhoujg.feature.LogicExpr
   * @generated
   */
  EClass getLogicExpr();

  /**
   * Returns the meta object for the containment reference '{@link person.zhoujg.feature.LogicExpr#getLeftLogicExpr <em>Left Logic Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Logic Expr</em>'.
   * @see person.zhoujg.feature.LogicExpr#getLeftLogicExpr()
   * @see #getLogicExpr()
   * @generated
   */
  EReference getLogicExpr_LeftLogicExpr();

  /**
   * Returns the meta object for the attribute '{@link person.zhoujg.feature.LogicExpr#getLogicOP <em>Logic OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Logic OP</em>'.
   * @see person.zhoujg.feature.LogicExpr#getLogicOP()
   * @see #getLogicExpr()
   * @generated
   */
  EAttribute getLogicExpr_LogicOP();

  /**
   * Returns the meta object for the containment reference '{@link person.zhoujg.feature.LogicExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see person.zhoujg.feature.LogicExpr#getRight()
   * @see #getLogicExpr()
   * @generated
   */
  EReference getLogicExpr_Right();

  /**
   * Returns the meta object for class '{@link person.zhoujg.feature.BasicExpr <em>Basic Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Expr</em>'.
   * @see person.zhoujg.feature.BasicExpr
   * @generated
   */
  EClass getBasicExpr();

  /**
   * Returns the meta object for the containment reference '{@link person.zhoujg.feature.BasicExpr#getLExpr <em>LExpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>LExpr</em>'.
   * @see person.zhoujg.feature.BasicExpr#getLExpr()
   * @see #getBasicExpr()
   * @generated
   */
  EReference getBasicExpr_LExpr();

  /**
   * Returns the meta object for the attribute '{@link person.zhoujg.feature.BasicExpr#getCompOp <em>Comp Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comp Op</em>'.
   * @see person.zhoujg.feature.BasicExpr#getCompOp()
   * @see #getBasicExpr()
   * @generated
   */
  EAttribute getBasicExpr_CompOp();

  /**
   * Returns the meta object for the containment reference '{@link person.zhoujg.feature.BasicExpr#getRExpr <em>RExpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>RExpr</em>'.
   * @see person.zhoujg.feature.BasicExpr#getRExpr()
   * @see #getBasicExpr()
   * @generated
   */
  EReference getBasicExpr_RExpr();

  /**
   * Returns the meta object for class '{@link person.zhoujg.feature.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atom</em>'.
   * @see person.zhoujg.feature.Atom
   * @generated
   */
  EClass getAtom();

  /**
   * Returns the meta object for the containment reference '{@link person.zhoujg.feature.Atom#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see person.zhoujg.feature.Atom#getLiteral()
   * @see #getAtom()
   * @generated
   */
  EReference getAtom_Literal();

  /**
   * Returns the meta object for the containment reference '{@link person.zhoujg.feature.Atom#getSub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub</em>'.
   * @see person.zhoujg.feature.Atom#getSub()
   * @see #getAtom()
   * @generated
   */
  EReference getAtom_Sub();

  /**
   * Returns the meta object for class '{@link person.zhoujg.feature.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see person.zhoujg.feature.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the attribute '{@link person.zhoujg.feature.Literal#getStr <em>Str</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Str</em>'.
   * @see person.zhoujg.feature.Literal#getStr()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_Str();

  /**
   * Returns the meta object for the attribute '{@link person.zhoujg.feature.Literal#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int</em>'.
   * @see person.zhoujg.feature.Literal#getInt()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_Int();

  /**
   * Returns the meta object for the attribute '{@link person.zhoujg.feature.Literal#getBool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bool</em>'.
   * @see person.zhoujg.feature.Literal#getBool()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_Bool();

  /**
   * Returns the meta object for the reference '{@link person.zhoujg.feature.Literal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see person.zhoujg.feature.Literal#getName()
   * @see #getLiteral()
   * @generated
   */
  EReference getLiteral_Name();

  /**
   * Returns the meta object for enum '{@link person.zhoujg.feature.AttributeType <em>Attribute Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attribute Type</em>'.
   * @see person.zhoujg.feature.AttributeType
   * @generated
   */
  EEnum getAttributeType();

  /**
   * Returns the meta object for enum '{@link person.zhoujg.feature.ComparationOP <em>Comparation OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Comparation OP</em>'.
   * @see person.zhoujg.feature.ComparationOP
   * @generated
   */
  EEnum getComparationOP();

  /**
   * Returns the meta object for enum '{@link person.zhoujg.feature.FeatureOP <em>OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>OP</em>'.
   * @see person.zhoujg.feature.FeatureOP
   * @generated
   */
  EEnum getFeatureOP();

  /**
   * Returns the meta object for enum '{@link person.zhoujg.feature.LogicOP <em>Logic OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Logic OP</em>'.
   * @see person.zhoujg.feature.LogicOP
   * @generated
   */
  EEnum getLogicOP();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FeatureFactory getFeatureFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link person.zhoujg.feature.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see person.zhoujg.feature.impl.FeatureImpl
     * @see person.zhoujg.feature.impl.FeaturePackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '<em><b>In Card</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__IN_CARD = eINSTANCE.getFeature_InCard();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__BODY = eINSTANCE.getFeature_Body();

    /**
     * The meta object literal for the '<em><b>Out Card</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__OUT_CARD = eINSTANCE.getFeature_OutCard();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__REF = eINSTANCE.getFeature_Ref();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__TYPE = eINSTANCE.getFeature_Type();

    /**
     * The meta object literal for the '{@link person.zhoujg.feature.impl.FeatureBodyImpl <em>Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see person.zhoujg.feature.impl.FeatureBodyImpl
     * @see person.zhoujg.feature.impl.FeaturePackageImpl#getFeatureBody()
     * @generated
     */
    EClass FEATURE_BODY = eINSTANCE.getFeatureBody();

    /**
     * The meta object literal for the '<em><b>Attrs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_BODY__ATTRS = eINSTANCE.getFeatureBody_Attrs();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_BODY__FEATURES = eINSTANCE.getFeatureBody_Features();

    /**
     * The meta object literal for the '<em><b>Rule Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_BODY__RULE_BODY = eINSTANCE.getFeatureBody_RuleBody();

    /**
     * The meta object literal for the '{@link person.zhoujg.feature.impl.AttributePartImpl <em>Attribute Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see person.zhoujg.feature.impl.AttributePartImpl
     * @see person.zhoujg.feature.impl.FeaturePackageImpl#getAttributePart()
     * @generated
     */
    EClass ATTRIBUTE_PART = eINSTANCE.getAttributePart();

    /**
     * The meta object literal for the '<em><b>Attr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_PART__ATTR = eINSTANCE.getAttributePart_Attr();

    /**
     * The meta object literal for the '{@link person.zhoujg.feature.impl.RuleBodyImpl <em>Rule Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see person.zhoujg.feature.impl.RuleBodyImpl
     * @see person.zhoujg.feature.impl.FeaturePackageImpl#getRuleBody()
     * @generated
     */
    EClass RULE_BODY = eINSTANCE.getRuleBody();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_BODY__RULES = eINSTANCE.getRuleBody_Rules();

    /**
     * The meta object literal for the '{@link person.zhoujg.feature.impl.FeatureExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see person.zhoujg.feature.impl.FeatureExprImpl
     * @see person.zhoujg.feature.impl.FeaturePackageImpl#getFeatureExpr()
     * @generated
     */
    EClass FEATURE_EXPR = eINSTANCE.getFeatureExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_EXPR__LEFT = eINSTANCE.getFeatureExpr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_EXPR__OP = eINSTANCE.getFeatureExpr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_EXPR__RIGHT = eINSTANCE.getFeatureExpr_Right();

    /**
     * The meta object literal for the '{@link person.zhoujg.feature.impl.LogicExprImpl <em>Logic Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see person.zhoujg.feature.impl.LogicExprImpl
     * @see person.zhoujg.feature.impl.FeaturePackageImpl#getLogicExpr()
     * @generated
     */
    EClass LOGIC_EXPR = eINSTANCE.getLogicExpr();

    /**
     * The meta object literal for the '<em><b>Left Logic Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_EXPR__LEFT_LOGIC_EXPR = eINSTANCE.getLogicExpr_LeftLogicExpr();

    /**
     * The meta object literal for the '<em><b>Logic OP</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIC_EXPR__LOGIC_OP = eINSTANCE.getLogicExpr_LogicOP();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_EXPR__RIGHT = eINSTANCE.getLogicExpr_Right();

    /**
     * The meta object literal for the '{@link person.zhoujg.feature.impl.BasicExprImpl <em>Basic Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see person.zhoujg.feature.impl.BasicExprImpl
     * @see person.zhoujg.feature.impl.FeaturePackageImpl#getBasicExpr()
     * @generated
     */
    EClass BASIC_EXPR = eINSTANCE.getBasicExpr();

    /**
     * The meta object literal for the '<em><b>LExpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_EXPR__LEXPR = eINSTANCE.getBasicExpr_LExpr();

    /**
     * The meta object literal for the '<em><b>Comp Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_EXPR__COMP_OP = eINSTANCE.getBasicExpr_CompOp();

    /**
     * The meta object literal for the '<em><b>RExpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_EXPR__REXPR = eINSTANCE.getBasicExpr_RExpr();

    /**
     * The meta object literal for the '{@link person.zhoujg.feature.impl.AtomImpl <em>Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see person.zhoujg.feature.impl.AtomImpl
     * @see person.zhoujg.feature.impl.FeaturePackageImpl#getAtom()
     * @generated
     */
    EClass ATOM = eINSTANCE.getAtom();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOM__LITERAL = eINSTANCE.getAtom_Literal();

    /**
     * The meta object literal for the '<em><b>Sub</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOM__SUB = eINSTANCE.getAtom_Sub();

    /**
     * The meta object literal for the '{@link person.zhoujg.feature.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see person.zhoujg.feature.impl.LiteralImpl
     * @see person.zhoujg.feature.impl.FeaturePackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__STR = eINSTANCE.getLiteral_Str();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__INT = eINSTANCE.getLiteral_Int();

    /**
     * The meta object literal for the '<em><b>Bool</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__BOOL = eINSTANCE.getLiteral_Bool();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL__NAME = eINSTANCE.getLiteral_Name();

    /**
     * The meta object literal for the '{@link person.zhoujg.feature.AttributeType <em>Attribute Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see person.zhoujg.feature.AttributeType
     * @see person.zhoujg.feature.impl.FeaturePackageImpl#getAttributeType()
     * @generated
     */
    EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

    /**
     * The meta object literal for the '{@link person.zhoujg.feature.ComparationOP <em>Comparation OP</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see person.zhoujg.feature.ComparationOP
     * @see person.zhoujg.feature.impl.FeaturePackageImpl#getComparationOP()
     * @generated
     */
    EEnum COMPARATION_OP = eINSTANCE.getComparationOP();

    /**
     * The meta object literal for the '{@link person.zhoujg.feature.FeatureOP <em>OP</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see person.zhoujg.feature.FeatureOP
     * @see person.zhoujg.feature.impl.FeaturePackageImpl#getFeatureOP()
     * @generated
     */
    EEnum FEATURE_OP = eINSTANCE.getFeatureOP();

    /**
     * The meta object literal for the '{@link person.zhoujg.feature.LogicOP <em>Logic OP</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see person.zhoujg.feature.LogicOP
     * @see person.zhoujg.feature.impl.FeaturePackageImpl#getLogicOP()
     * @generated
     */
    EEnum LOGIC_OP = eINSTANCE.getLogicOP();

  }

} //FeaturePackage
