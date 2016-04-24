package searchTree;

import java.util.ArrayList;

public class TreeNode<E extends SearchState, Action extends AbstractAction<E>> {

	private E state;
	private Action action;
	private TreeNode<E, Action> parentNode;
	private ArrayList<TreeNode<E, Action>> childNodeList = new ArrayList<>();// not needed???
	private int nodeDeapth;
	private double valueOfNode;

	public TreeNode(TreeNode<E, Action> parentNode) {
		this.parentNode = parentNode;
	}

	public void addChildNode(TreeNode<E, Action> aChild) {
		if(childNodeList == null)
		childNodeList.add(aChild);
	}

	public ArrayList<TreeNode<E, Action>> getChildNodeList() {
		return childNodeList;
	}

	public TreeNode<E, Action> getParent() {
		return parentNode;
	}

	public void setParent(TreeNode<E, Action> parentNode) {
		this.parentNode = parentNode;
	}

	public int getNodeDeapth() {
		return nodeDeapth;
	}

	public void setNodeDeapth(int deapth) {
		this.nodeDeapth = deapth;
	}

	public double getValueOfNode() {
		return valueOfNode;
	}

	public void setValueOfNode(double valueOfNode) {
		this.valueOfNode = valueOfNode;
	}

	public E getState() {
		return state;
	}

	public void setState(E state) {
		this.state = state;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

}