import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {
    private ExerciseManagement mgmt;

    @Before 
    public void initialize() {
        mgmt = new ExerciseManagement();
    }

    @Test 
    public void exerciseListEmptyAtBegining() {
        assertEquals(0, mgmt.exerciseList().size());
    }

    @Test 
    public void addingExercciseGrowsListByOne() {
        mgmt.add("Test Exercise1");
        assertEquals(1, mgmt.exerciseList().size());
    }

    @Test 
    public void addedExerciseIsInList() {
        mgmt.add("Test Exercise2");
        assertTrue(mgmt.exerciseList().contains("Test Exercise2"));
    }

    @Test 
    public void exerciseCanBeMarkedAsComplete() {
        mgmt.add("Test Exercise3");
        mgmt.markAsCompleted("Test Exercise3");
        assertTrue(mgmt.isCompleted("Test Exercise3"));
    }

    @Test 
    public void ifNotMarkedCompletedIsNotCompleted() {
        mgmt.add("Test Exercise4");
        mgmt.markAsCompleted("Test Exercise4");
        assertFalse(mgmt.isCompleted("Test Exercise5"));
    }
}
