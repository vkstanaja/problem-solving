package org.practice.algorithms;
import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FindInRotatedSortedArrayTest {

    private FindInRotatedSortedArray findInRotatedSortedArray;
    int []nums;

    public FindInRotatedSortedArrayTest() {

    }

    @Before
    public void setUp() {
        findInRotatedSortedArray = new FindInRotatedSortedArray();
    }

    @After
    public void tearDown() {

    }

    @Test
    public void searchInRightValidIndexRotatedArray() {
        nums = new int[]{6, 7, 8, 9, 0, 1, 2, 3, 4, 5};
        int targetIndex = findInRotatedSortedArray.search(nums, 3);
        Assert.assertEquals(7, targetIndex);
    }


    @Test
    public void searchInLeftValidIndexRotatedArray() {
        nums = new int[]{6, 7, 8, 9, 0, 1, 2, 3, 4, 5};
        int targetIndex = findInRotatedSortedArray.search(nums, 8);
        Assert.assertEquals(2, targetIndex);
    }

    @Test
    public void searchElementNotPresentInRotatedArray() {
        nums = new int[]{6, 7, 8, 9, 0, 1, 2, 3, 4, 5};
        int targetIndex = findInRotatedSortedArray.search(nums, -1);
        Assert.assertEquals(-1, targetIndex);
    }

    @Test
    public void searchValidOnSingleElementArray() {
        nums = new int[]{6};
        int targetIndex = findInRotatedSortedArray.search(nums, 6);
        Assert.assertEquals(0, targetIndex);
    }

    @Test
    public void searchOnEmptyArray() {
        nums = new int[]{};
        int targetIndex = findInRotatedSortedArray.search(nums, 1);
        Assert.assertEquals(-1, targetIndex);
    }
}