package com.list.partition;

import java.util.ArrayList;
import java.util.List;

public class Partition {

	public static List<List<Integer>> partition( int partitionSize,List<Integer> list) {
		List<List<Integer>> partitions = new ArrayList<>();
		for (int i = 0; i < list.size(); i += partitionSize) {
			partitions.add(list.subList(i, Math.min(i + partitionSize, list.size())));
		}
		return partitions;
	}
}
