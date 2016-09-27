

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryTreeTest {
    
    public BinaryTreeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addNode method, of class BinaryTree.
     */
    @Test
    public void testAddNode() {
        System.out.println("addNode");
        Object key = null;
        Object name = null;
        BinaryTree instance = new BinaryTree();
        instance.addNode(key, name);
    }

    /**
     * Test of inOrderTraverseTree method, of class BinaryTree.
     */
    @Test
    public void testInOrderTraverseTree() {
        System.out.println("inOrderTraverseTree");
        Node focusNode = null;
        BinaryTree instance = new BinaryTree();
        instance.inOrderTraverseTree(focusNode);
    }

    /**
     * Test of findNode method, of class BinaryTree.
     */
    @Test
    public void testFindNode() {
        System.out.println("findNode");
        Object key = null;
        BinaryTree instance = new BinaryTree();
        Node expResult = null;
        Node result = instance.findNode(key);
        assertEquals(expResult, result);
    }

    /**
     * Test of findName method, of class BinaryTree.
     */
    @Test
    public void testFindName() {
        System.out.println("findName");
        String key = "";
        BinaryTree instance = new BinaryTree();
        String expResult = "";
        String result = instance.findName(key);
        assertEquals(expResult, result);
    }
    
}
