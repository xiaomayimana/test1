/**
 */
package person.zhoujg.feature;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>OP</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see person.zhoujg.feature.FeaturePackage#getFeatureOP()
 * @model
 * @generated
 */
public enum FeatureOP implements Enumerator
{
  /**
   * The '<em><b>REC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REC_VALUE
   * @generated
   * @ordered
   */
  REC(0, "REC", "recommend"),

  /**
   * The '<em><b>REQ</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REQ_VALUE
   * @generated
   * @ordered
   */
  REQ(1, "REQ", "require"),

  /**
   * The '<em><b>EXC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXC_VALUE
   * @generated
   * @ordered
   */
  EXC(2, "EXC", "exclude"),

  /**
   * The '<em><b>HAR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HAR_VALUE
   * @generated
   * @ordered
   */
  HAR(3, "HAR", "harm");

  /**
   * The '<em><b>REC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>REC</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REC
   * @model literal="recommend"
   * @generated
   * @ordered
   */
  public static final int REC_VALUE = 0;

  /**
   * The '<em><b>REQ</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>REQ</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REQ
   * @model literal="require"
   * @generated
   * @ordered
   */
  public static final int REQ_VALUE = 1;

  /**
   * The '<em><b>EXC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EXC</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EXC
   * @model literal="exclude"
   * @generated
   * @ordered
   */
  public static final int EXC_VALUE = 2;

  /**
   * The '<em><b>HAR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HAR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HAR
   * @model literal="harm"
   * @generated
   * @ordered
   */
  public static final int HAR_VALUE = 3;

  /**
   * An array of all the '<em><b>OP</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final FeatureOP[] VALUES_ARRAY =
    new FeatureOP[]
    {
      REC,
      REQ,
      EXC,
      HAR,
    };

  /**
   * A public read-only list of all the '<em><b>OP</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<FeatureOP> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>OP</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FeatureOP get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FeatureOP result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>OP</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FeatureOP getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FeatureOP result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>OP</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FeatureOP get(int value)
  {
    switch (value)
    {
      case REC_VALUE: return REC;
      case REQ_VALUE: return REQ;
      case EXC_VALUE: return EXC;
      case HAR_VALUE: return HAR;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private FeatureOP(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //FeatureOP
