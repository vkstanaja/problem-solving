package org.practice.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnit4.class)
class FindInRotatedArrayWithDupesTest {

    FindInRotatedArrayWithDupes findInRotatedArrayWithDupes = new FindInRotatedArrayWithDupes();

    @Test
    void searchForValidElement1() {
        Assert.assertTrue(findInRotatedArrayWithDupes.search(new int[]{5,6,6,7,8,9,0,0,1,2,3,3,3,4,5,5}, 5));
    }

    @Test
    void searchForValidElement2() {
        Assert.assertTrue(findInRotatedArrayWithDupes.search(new int[]{5,6,6,7,8,9,0,0,1,2,3,3,3,4,5,5}, 0));
    }

    @Test
    void searchForValidElement3() {
        Assert.assertTrue(findInRotatedArrayWithDupes.search(new int[]{5,6,6,7,8,9,0,0,1,2,3,3,3,4,5,5}, 7));
    }

    @Test
    void searchForValidElement4() {
        Assert.assertTrue(findInRotatedArrayWithDupes.search(new int[]{5,6,6,7,8,9,0,0,1,2,3,3,3,4,5,5}, 3));
    }

    @Test
    void searchForValidElementWithArrayHavingTwoDistinctElement1() {
        Assert.assertTrue(findInRotatedArrayWithDupes.search(new int[]{1,0,1}, 0));
    }

    @Test
    void searchForValidElementWithArrayHavingTwoDistinctElement2() {
        Assert.assertTrue(findInRotatedArrayWithDupes.search(new int[]{1,0,1,1}, 0));
    }

    @Test
    void searchForValidElementWithArrayHavingTwoDistinctElement3() {
        Assert.assertTrue(findInRotatedArrayWithDupes.search(new int[]{1,1,1,1,1,1,1,0,1,1,1}, 0));
    }

}