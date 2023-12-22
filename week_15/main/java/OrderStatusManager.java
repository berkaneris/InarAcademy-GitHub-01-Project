package main.java;

public class OrderStatusManager {
    public enum OrderState {
        NEW, PENDING, SHIPPED, DELIVERED, CANCELLED
    }
    private OrderState currentState;
   public OrderStatusManager(OrderState state){
        this.currentState = state;
   }
    /**
     * Transitions the order to the next state based on the current state.
     *
     * @param currentState The current state of the order.
     * @return The next state of the order.
     */
    public OrderState nextState(OrderState currentState) {
        switch (currentState) {
            case NEW:
                this.currentState = OrderState.PENDING; break;
            case PENDING:
                this.currentState = OrderState.SHIPPED; break;
            case SHIPPED:
                this.currentState = OrderState.DELIVERED; break;
// Delivered and Cancelled are final states and cannot be transitioned from.
            case DELIVERED:
            case CANCELLED:
            default:
                return currentState;
        }
        return  this.currentState;
    }

    public OrderState getCurrentState() {
        return currentState;
    }

    /**
     * Cancels the order if it is in a state that allows for cancellation.
     *
     * @param currentState The current state of the order.
     * @return The new state of the order after attempting cancellation.
     */
    public OrderState cancelOrder(OrderState currentState) {
// Orders can only be cancelled if they are NEW or PENDING.
        if (currentState == OrderState.NEW || currentState == OrderState.PENDING) {
            this.currentState =  OrderState.CANCELLED;
            return this.currentState;
        } else {
// If the order is SHIPPED or beyond, it cannot be cancelled.
            return this.currentState;
        }
    }
}
