package test.java;

import main.java.OrderStatusManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderStatusManagerTest {

    private OrderStatusManager manager;
    /**
     * TC001 - TC005 methods test the nextState method.
     */
    @Test
    public void TC001TransitionFromNewToPending(){
        manager = new OrderStatusManager(OrderStatusManager.OrderState.NEW);
        manager.nextState(manager.getCurrentState());
        assertEquals(OrderStatusManager.OrderState.PENDING, manager.getCurrentState(), "State"
                + "should transition from NEW to PENDING");
    }

    @Test
    public void TC002TransitionFromPendingToShipped(){
        manager = new OrderStatusManager(OrderStatusManager.OrderState.PENDING);
        manager.nextState(manager.getCurrentState());
        assertEquals(OrderStatusManager.OrderState.SHIPPED, manager.getCurrentState(), "State"
                + "should transition from PENDING to SHIPPED");
    }
    @Test
    public void TC003TransitionFromShippedToDelivered(){
        manager = new OrderStatusManager(OrderStatusManager.OrderState.SHIPPED);
        manager.nextState(manager.getCurrentState());
        assertEquals(OrderStatusManager.OrderState.DELIVERED, manager.getCurrentState(), "State"
                + "should transition from SHIPPED to DELIVERED");
    }
    @Test
    public void TC004NoTransitionFromDelivered(){
        manager = new OrderStatusManager(OrderStatusManager.OrderState.DELIVERED);
        manager.nextState(manager.getCurrentState());
        assertEquals(OrderStatusManager.OrderState.DELIVERED, manager.getCurrentState(), "State"
                + "should not transition from DELIVERED");
    }
    @Test
    public void TC005NoTransitionFromCancelled(){
        manager = new OrderStatusManager(OrderStatusManager.OrderState.CANCELLED);
        manager.nextState(manager.getCurrentState());
        assertEquals(OrderStatusManager.OrderState.CANCELLED, manager.getCurrentState(), "State"
                + "should not transition from CANCELLED");
    }

    /**
     * TC006 - TC010 methods test the cancelOrder method.
     */
    @Test
    public void TC006CancelFromNewState(){
        manager = new OrderStatusManager(OrderStatusManager.OrderState.NEW);
        manager.cancelOrder(manager.getCurrentState());
        assertEquals(OrderStatusManager.OrderState.CANCELLED, manager.getCurrentState(), "State"
                + "should cancel from NEW state");
    }
    @Test
    public void TC007CancelFromPendingState(){
        manager = new OrderStatusManager(OrderStatusManager.OrderState.PENDING);
        manager.cancelOrder(manager.getCurrentState());
        assertEquals(OrderStatusManager.OrderState.CANCELLED, manager.getCurrentState(), "State"
                + "should cancel from PENDING state");
    }
    @Test
    public void TC008NoCancellationFromShippedState(){
        manager = new OrderStatusManager(OrderStatusManager.OrderState.SHIPPED);
        manager.cancelOrder(manager.getCurrentState());
        assertEquals(OrderStatusManager.OrderState.SHIPPED, manager.getCurrentState(), "State"
                + "should not cancel from SHIPPED state");
    }
    @Test
    public void TC009NoCancellationFromDeliveredState(){
        manager = new OrderStatusManager(OrderStatusManager.OrderState.DELIVERED);
        manager.cancelOrder(manager.getCurrentState());
        assertEquals(OrderStatusManager.OrderState.DELIVERED, manager.getCurrentState(), "State"
                + "should not cancel from DELIVERED state");
    }
    @Test
    public void TC010NoCancellationFromCancelledState(){
        manager = new OrderStatusManager(OrderStatusManager.OrderState.CANCELLED);
        manager.cancelOrder(manager.getCurrentState());
        assertEquals(OrderStatusManager.OrderState.CANCELLED, manager.getCurrentState(), "State"
                + "should not cancel from CANCELLED state");
    }
}