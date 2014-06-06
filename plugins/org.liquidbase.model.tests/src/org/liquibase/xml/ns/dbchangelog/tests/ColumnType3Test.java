/**
 */
package org.liquibase.xml.ns.dbchangelog.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.liquibase.xml.ns.dbchangelog.ColumnType3;
import org.liquibase.xml.ns.dbchangelog.DbchangelogFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Column Type3</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColumnType3Test extends TestCase {

	/**
	 * The fixture for this Column Type3 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnType3 fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ColumnType3Test.class);
	}

	/**
	 * Constructs a new Column Type3 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnType3Test(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Column Type3 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ColumnType3 fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Column Type3 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnType3 getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DbchangelogFactory.eINSTANCE.createColumnType3());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ColumnType3Test
