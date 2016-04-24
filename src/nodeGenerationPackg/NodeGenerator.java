package nodeGenerationPackg;

import searchTree.AbstractAction;
import searchTree.SearchState;
import searchTree.TreeNode;


public abstract class NodeGenerator<E extends SearchState, Action extends AbstractAction<E>> {

	public abstract TreeNode<E, Action> generateChildNode(TreeNode<E, Action> aNode);
}
