package com.greatlearning.q2.BinarySearchTree.Functions;

import java.util.*;

public class FindingSumPair {

	public void checkPairPresent(TreeNode root, int sum) {
		Set<Integer> set = new HashSet<>();
		if (!isPairPresent(root, sum, set)) {
			System.out.println("nodes are not found");
		}
	}

	private boolean isPairPresent(TreeNode root, int sum, Set<Integer> set) {
		if (root == null) {
			return false;
		}
		if (isPairPresent(root.left, sum, set)) {
			return true;
		}

		if (set.contains(sum - root.data)) {
			System.out.println("Sum = " + sum);
			System.out.println("Pair is (" + (sum - root.data) + "," + root.data + ")");
			return true;
		} else {
			set.add(root.data);
		}
		return isPairPresent(root.right, sum, set);
	}
}
