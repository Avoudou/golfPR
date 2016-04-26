package golfTestAI;

import searchTree.TreeNode;

import com.badlogic.gdx.math.Vector2;

import evaluationPack.NodeEvaluator;

public class GolfTestEvaluator extends NodeEvaluator<GolfTestState> {

	@Override
	public double evaluateNode(TreeNode<GolfTestState, ?> aNode) {

		GolfTestState aState = aNode.getState();


		Vector2 difference = aState.getCourt().getHole().getPossition().cpy().sub(aState.getBall().getBallPosition());

		if (aState.getCourt().getToxicAreasList().get(0).getToxicArea()
				.contains(aState.getBall().getBallPosition().x, aState.getBall().getBallPosition().y)) {
			return Integer.MAX_VALUE;
		}

		return difference.len();
	}

}
