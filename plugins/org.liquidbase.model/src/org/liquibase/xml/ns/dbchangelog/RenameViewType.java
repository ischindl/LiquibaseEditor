/**
 */
package org.liquibase.xml.ns.dbchangelog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rename View Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RenameViewType#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RenameViewType#getNewViewName <em>New View Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RenameViewType#getOldViewName <em>Old View Name</em>}</li>
 *   <li>{@link org.liquibase.xml.ns.dbchangelog.RenameViewType#getSchemaName <em>Schema Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRenameViewType()
 * @model extendedMetaData="name='renameView_._type' kind='empty'"
 * @generated
 */
public interface RenameViewType extends EObject {
	/**
	 * Returns the value of the '<em><b>Catalog Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog Name</em>' attribute.
	 * @see #setCatalogName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRenameViewType_CatalogName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='catalogName'"
	 * @generated
	 */
	String getCatalogName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.RenameViewType#getCatalogName <em>Catalog Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog Name</em>' attribute.
	 * @see #getCatalogName()
	 * @generated
	 */
	void setCatalogName(String value);

	/**
	 * Returns the value of the '<em><b>New View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New View Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New View Name</em>' attribute.
	 * @see #setNewViewName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRenameViewType_NewViewName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='newViewName'"
	 * @generated
	 */
	String getNewViewName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.RenameViewType#getNewViewName <em>New View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New View Name</em>' attribute.
	 * @see #getNewViewName()
	 * @generated
	 */
	void setNewViewName(String value);

	/**
	 * Returns the value of the '<em><b>Old View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old View Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old View Name</em>' attribute.
	 * @see #setOldViewName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRenameViewType_OldViewName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='oldViewName'"
	 * @generated
	 */
	String getOldViewName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.RenameViewType#getOldViewName <em>Old View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old View Name</em>' attribute.
	 * @see #getOldViewName()
	 * @generated
	 */
	void setOldViewName(String value);

	/**
	 * Returns the value of the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Name</em>' attribute.
	 * @see #setSchemaName(String)
	 * @see org.liquibase.xml.ns.dbchangelog.DbchangelogPackage#getRenameViewType_SchemaName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schemaName'"
	 * @generated
	 */
	String getSchemaName();

	/**
	 * Sets the value of the '{@link org.liquibase.xml.ns.dbchangelog.RenameViewType#getSchemaName <em>Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Name</em>' attribute.
	 * @see #getSchemaName()
	 * @generated
	 */
	void setSchemaName(String value);

} // RenameViewType
