/*
 * @(#)Test.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */
package org.jhotdraw.test.figures;

import org.jhotdraw.figures.LineConnection;
import junit.framework.TestCase;
// JUnitDoclet begin import
// JUnitDoclet end import

/*
 * Generated by JUnitDoclet, a tool provided by
 * ObjectFab GmbH under LGPL.
 * Please see www.junitdoclet.org, www.gnu.org
 * and www.objectfab.de for informations about
 * the tool, the licence and the authors.
 */

// JUnitDoclet begin javadoc_class
/**
 * TestCase LineConnectionTest is generated by
 * JUnitDoclet to hold the tests for LineConnection.
 * @see org.jhotdraw.figures.LineConnection
 */
// JUnitDoclet end javadoc_class
public class LineConnectionTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
	// JUnitDoclet begin class
	// instance variables, helper methods, ... put them in this marker
	private LineConnection lineconnection;
	// JUnitDoclet end class

	/**
	 * Constructor LineConnectionTest is
	 * basically calling the inherited constructor to
	 * initiate the TestCase for use by the Framework.
	 */
	public LineConnectionTest(String name) {
		// JUnitDoclet begin method LineConnectionTest
		super(name);
		// JUnitDoclet end method LineConnectionTest
	}

	/**
	 * Factory method for instances of the class to be tested.
	 */
	public LineConnection createInstance() throws Exception {
		// JUnitDoclet begin method testcase.createInstance
		return new LineConnection();
		// JUnitDoclet end method testcase.createInstance
	}

	/**
	 * Method setUp is overwriting the framework method to
	 * prepare an instance of this TestCase for a single test.
	 * It's called from the JUnit framework only.
	 */
	protected void setUp() throws Exception {
		// JUnitDoclet begin method testcase.setUp
		super.setUp();
		lineconnection = createInstance();
		// JUnitDoclet end method testcase.setUp
	}

	/**
	 * Method tearDown is overwriting the framework method to
	 * clean up after each single test of this TestCase.
	 * It's called from the JUnit framework only.
	 */
	protected void tearDown() throws Exception {
		// JUnitDoclet begin method testcase.tearDown
		lineconnection = null;
		super.tearDown();
		// JUnitDoclet end method testcase.tearDown
	}

	// JUnitDoclet begin javadoc_method canConnect()
	/**
	 * Method testCanConnect is testing canConnect
	 * @see org.jhotdraw.figures.LineConnection#canConnect()
	 */
	// JUnitDoclet end javadoc_method canConnect()
	public void testCanConnect() throws Exception {
		// JUnitDoclet begin method canConnect
		// JUnitDoclet end method canConnect
	}

	// JUnitDoclet begin javadoc_method connectStart()
	/**
	 * Method testConnectStart is testing connectStart
	 * @see org.jhotdraw.figures.LineConnection#connectStart(org.jhotdraw.framework.Connector)
	 */
	// JUnitDoclet end javadoc_method connectStart()
	public void testConnectStart() throws Exception {
		// JUnitDoclet begin method connectStart
		// JUnitDoclet end method connectStart
	}

	// JUnitDoclet begin javadoc_method connectEnd()
	/**
	 * Method testConnectEnd is testing connectEnd
	 * @see org.jhotdraw.figures.LineConnection#connectEnd(org.jhotdraw.framework.Connector)
	 */
	// JUnitDoclet end javadoc_method connectEnd()
	public void testConnectEnd() throws Exception {
		// JUnitDoclet begin method connectEnd
		// JUnitDoclet end method connectEnd
	}

	// JUnitDoclet begin javadoc_method disconnectStart()
	/**
	 * Method testDisconnectStart is testing disconnectStart
	 * @see org.jhotdraw.figures.LineConnection#disconnectStart()
	 */
	// JUnitDoclet end javadoc_method disconnectStart()
	public void testDisconnectStart() throws Exception {
		// JUnitDoclet begin method disconnectStart
		// JUnitDoclet end method disconnectStart
	}

	// JUnitDoclet begin javadoc_method disconnectEnd()
	/**
	 * Method testDisconnectEnd is testing disconnectEnd
	 * @see org.jhotdraw.figures.LineConnection#disconnectEnd()
	 */
	// JUnitDoclet end javadoc_method disconnectEnd()
	public void testDisconnectEnd() throws Exception {
		// JUnitDoclet begin method disconnectEnd
		// JUnitDoclet end method disconnectEnd
	}

	// JUnitDoclet begin javadoc_method connectsSame()
	/**
	 * Method testConnectsSame is testing connectsSame
	 * @see org.jhotdraw.figures.LineConnection#connectsSame(org.jhotdraw.framework.ConnectionFigure)
	 */
	// JUnitDoclet end javadoc_method connectsSame()
	public void testConnectsSame() throws Exception {
		// JUnitDoclet begin method connectsSame
		// JUnitDoclet end method connectsSame
	}

	// JUnitDoclet begin javadoc_method startFigure()
	/**
	 * Method testStartFigure is testing startFigure
	 * @see org.jhotdraw.figures.LineConnection#startFigure()
	 */
	// JUnitDoclet end javadoc_method startFigure()
	public void testStartFigure() throws Exception {
		// JUnitDoclet begin method startFigure
		// JUnitDoclet end method startFigure
	}

	// JUnitDoclet begin javadoc_method endFigure()
	/**
	 * Method testEndFigure is testing endFigure
	 * @see org.jhotdraw.figures.LineConnection#endFigure()
	 */
	// JUnitDoclet end javadoc_method endFigure()
	public void testEndFigure() throws Exception {
		// JUnitDoclet begin method endFigure
		// JUnitDoclet end method endFigure
	}

	// JUnitDoclet begin javadoc_method getStartConnector()
	/**
	 * Method testGetStartConnector is testing getStartConnector
	 * @see org.jhotdraw.figures.LineConnection#getStartConnector()
	 */
	// JUnitDoclet end javadoc_method getStartConnector()
	public void testGetStartConnector() throws Exception {
		// JUnitDoclet begin method getStartConnector
		// JUnitDoclet end method getStartConnector
	}

	// JUnitDoclet begin javadoc_method getEndConnector()
	/**
	 * Method testGetEndConnector is testing getEndConnector
	 * @see org.jhotdraw.figures.LineConnection#getEndConnector()
	 */
	// JUnitDoclet end javadoc_method getEndConnector()
	public void testGetEndConnector() throws Exception {
		// JUnitDoclet begin method getEndConnector
		// JUnitDoclet end method getEndConnector
	}

	// JUnitDoclet begin javadoc_method startPoint()
	/**
	 * Method testStartPoint is testing startPoint
	 * @see org.jhotdraw.figures.LineConnection#startPoint(int, int)
	 */
	// JUnitDoclet end javadoc_method startPoint()
	public void testStartPoint() throws Exception {
		// JUnitDoclet begin method startPoint
		// JUnitDoclet end method startPoint
	}

	// JUnitDoclet begin javadoc_method endPoint()
	/**
	 * Method testEndPoint is testing endPoint
	 * @see org.jhotdraw.figures.LineConnection#endPoint(int, int)
	 */
	// JUnitDoclet end javadoc_method endPoint()
	public void testEndPoint() throws Exception {
		// JUnitDoclet begin method endPoint
		// JUnitDoclet end method endPoint
	}

	// JUnitDoclet begin javadoc_method handles()
	/**
	 * Method testHandles is testing handles
	 * @see org.jhotdraw.figures.LineConnection#handles()
	 */
	// JUnitDoclet end javadoc_method handles()
	public void testHandles() throws Exception {
		// JUnitDoclet begin method handles
		// JUnitDoclet end method handles
	}

	// JUnitDoclet begin javadoc_method setPointAt()
	/**
	 * Method testSetPointAt is testing setPointAt
	 * @see org.jhotdraw.figures.LineConnection#setPointAt(java.awt.Point, int)
	 */
	// JUnitDoclet end javadoc_method setPointAt()
	public void testSetPointAt() throws Exception {
		// JUnitDoclet begin method setPointAt
		// JUnitDoclet end method setPointAt
	}

	// JUnitDoclet begin javadoc_method insertPointAt()
	/**
	 * Method testInsertPointAt is testing insertPointAt
	 * @see org.jhotdraw.figures.LineConnection#insertPointAt(java.awt.Point, int)
	 */
	// JUnitDoclet end javadoc_method insertPointAt()
	public void testInsertPointAt() throws Exception {
		// JUnitDoclet begin method insertPointAt
		// JUnitDoclet end method insertPointAt
	}

	// JUnitDoclet begin javadoc_method removePointAt()
	/**
	 * Method testRemovePointAt is testing removePointAt
	 * @see org.jhotdraw.figures.LineConnection#removePointAt(int)
	 */
	// JUnitDoclet end javadoc_method removePointAt()
	public void testRemovePointAt() throws Exception {
		// JUnitDoclet begin method removePointAt
		// JUnitDoclet end method removePointAt
	}

	// JUnitDoclet begin javadoc_method updateConnection()
	/**
	 * Method testUpdateConnection is testing updateConnection
	 * @see org.jhotdraw.figures.LineConnection#updateConnection()
	 */
	// JUnitDoclet end javadoc_method updateConnection()
	public void testUpdateConnection() throws Exception {
		// JUnitDoclet begin method updateConnection
		// JUnitDoclet end method updateConnection
	}

	// JUnitDoclet begin javadoc_method layoutConnection()
	/**
	 * Method testLayoutConnection is testing layoutConnection
	 * @see org.jhotdraw.figures.LineConnection#layoutConnection()
	 */
	// JUnitDoclet end javadoc_method layoutConnection()
	public void testLayoutConnection() throws Exception {
		// JUnitDoclet begin method layoutConnection
		// JUnitDoclet end method layoutConnection
	}

	// JUnitDoclet begin javadoc_method figureChanged()
	/**
	 * Method testFigureChanged is testing figureChanged
	 * @see org.jhotdraw.figures.LineConnection#figureChanged(org.jhotdraw.framework.FigureChangeEvent)
	 */
	// JUnitDoclet end javadoc_method figureChanged()
	public void testFigureChanged() throws Exception {
		// JUnitDoclet begin method figureChanged
		// JUnitDoclet end method figureChanged
	}

	// JUnitDoclet begin javadoc_method figureRemoved()
	/**
	 * Method testFigureRemoved is testing figureRemoved
	 * @see org.jhotdraw.figures.LineConnection#figureRemoved(org.jhotdraw.framework.FigureChangeEvent)
	 */
	// JUnitDoclet end javadoc_method figureRemoved()
	public void testFigureRemoved() throws Exception {
		// JUnitDoclet begin method figureRemoved
		// JUnitDoclet end method figureRemoved
	}

	// JUnitDoclet begin javadoc_method figureRequestRemove()
	/**
	 * Method testFigureRequestRemove is testing figureRequestRemove
	 * @see org.jhotdraw.figures.LineConnection#figureRequestRemove(org.jhotdraw.framework.FigureChangeEvent)
	 */
	// JUnitDoclet end javadoc_method figureRequestRemove()
	public void testFigureRequestRemove() throws Exception {
		// JUnitDoclet begin method figureRequestRemove
		// JUnitDoclet end method figureRequestRemove
	}

	// JUnitDoclet begin javadoc_method figureInvalidated()
	/**
	 * Method testFigureInvalidated is testing figureInvalidated
	 * @see org.jhotdraw.figures.LineConnection#figureInvalidated(org.jhotdraw.framework.FigureChangeEvent)
	 */
	// JUnitDoclet end javadoc_method figureInvalidated()
	public void testFigureInvalidated() throws Exception {
		// JUnitDoclet begin method figureInvalidated
		// JUnitDoclet end method figureInvalidated
	}

	// JUnitDoclet begin javadoc_method figureRequestUpdate()
	/**
	 * Method testFigureRequestUpdate is testing figureRequestUpdate
	 * @see org.jhotdraw.figures.LineConnection#figureRequestUpdate(org.jhotdraw.framework.FigureChangeEvent)
	 */
	// JUnitDoclet end javadoc_method figureRequestUpdate()
	public void testFigureRequestUpdate() throws Exception {
		// JUnitDoclet begin method figureRequestUpdate
		// JUnitDoclet end method figureRequestUpdate
	}

	// JUnitDoclet begin javadoc_method release()
	/**
	 * Method testRelease is testing release
	 * @see org.jhotdraw.figures.LineConnection#release()
	 */
	// JUnitDoclet end javadoc_method release()
	public void testRelease() throws Exception {
		// JUnitDoclet begin method release
		// JUnitDoclet end method release
	}

	// JUnitDoclet begin javadoc_method write()
	/**
	 * Method testWrite is testing write
	 * @see org.jhotdraw.figures.LineConnection#write(org.jhotdraw.util.StorableOutput)
	 */
	// JUnitDoclet end javadoc_method write()
	public void testWrite() throws Exception {
		// JUnitDoclet begin method write
		// JUnitDoclet end method write
	}

	// JUnitDoclet begin javadoc_method read()
	/**
	 * Method testRead is testing read
	 * @see org.jhotdraw.figures.LineConnection#read(org.jhotdraw.util.StorableInput)
	 */
	// JUnitDoclet end javadoc_method read()
	public void testRead() throws Exception {
		// JUnitDoclet begin method read
		// JUnitDoclet end method read
	}

	// JUnitDoclet begin javadoc_method visit()
	/**
	 * Method testVisit is testing visit
	 * @see org.jhotdraw.figures.LineConnection#visit(org.jhotdraw.framework.FigureVisitor)
	 */
	// JUnitDoclet end javadoc_method visit()
	public void testVisit() throws Exception {
		// JUnitDoclet begin method visit
		// JUnitDoclet end method visit
	}

	// JUnitDoclet begin javadoc_method testVault
	/**
	 * JUnitDoclet moves marker to this method, if there is not match
	 * for them in the regenerated code and if the marker is not empty.
	 * This way, no test gets lost when regenerating after renaming.
	 * <b>Method testVault is supposed to be empty.</b>
	 */
	// JUnitDoclet end javadoc_method testVault
	public void testVault() throws Exception {
		// JUnitDoclet begin method testcase.testVault
		// JUnitDoclet end method testcase.testVault
	}

}
