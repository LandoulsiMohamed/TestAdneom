package com.list.partition;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PartitionTest {

	@Test
	public void testPartition() {
		List<Integer> listIntegers = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 });
		List<List<Integer>> resPatitions = new Partition().partition(2,listIntegers);
		for (List<Integer> lst : resPatitions) {
			System.out.println(lst.toString());
		}
		assertNotNull(resPatitions);
		List<List<Integer>> expectedResult = Arrays.asList(
				Arrays.asList(new Integer[] { 1, 2 }),
				Arrays.asList(new Integer[] { 3, 4 }),
				Arrays.asList(new Integer[] { 5 })
		);
		assertThat(resPatitions, hasSize(3));
		assertThat(resPatitions, is(expectedResult));
	}

	//test avec liste vide
	@Test
	public void deuxiemeTestPartition() {
		List<Integer> listIntegers = Arrays.asList(new Integer[] { });
		List<List<Integer>> resPatitions = new Partition().partition(2,listIntegers);
		for (List<Integer> lst : resPatitions) {
			System.out.println(lst.toString());
		}
		assertNotNull(resPatitions);
		List<List<Integer>> expectedResult = Arrays.asList();
		assertThat(resPatitions, hasSize(0));
		assertThat(resPatitions, is(expectedResult));
	}

//test avec le parametre est supérieur à la taille de la liste
	@Test
	public void TroixiemeTestPartition() {
		List<Integer> listIntegers = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 });
		List<List<Integer>> resPatitions = new Partition().partition(9,listIntegers);
		for (List<Integer> lst : resPatitions) {
			System.out.println(lst.toString());
		}
		assertNotNull(resPatitions);
		List<List<Integer>> expectedResult = Arrays.asList(
				Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 })
		);
		assertThat(resPatitions, hasSize(1));
		assertThat(resPatitions, is(expectedResult));
	}

}
