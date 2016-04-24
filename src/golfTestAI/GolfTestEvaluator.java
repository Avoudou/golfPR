package golfTestAI;

import searchTree.TreeNode;

import com.badlogic.gdx.math.Vector2;

import evaluationPack.NodeEvaluator;

public class GolfTestEvaluator extends NodeEvaluator<GolfTestState> {

	@Override
	public double evaluateNode(TreeNode<GolfTestState, ?> aNode) {

		GolfTestState aState = aNode.getState();
		Vector2 difference = aState.getCourt().getHole().getPossition().cpy().sub(aState.getBall().getBallPosition());

		return difference.len();
	}

}
