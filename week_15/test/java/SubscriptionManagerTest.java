package test.java;

import main.java.SubscriptionManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubscriptionManagerTest {

    private static SubscriptionManager manager;

    @BeforeAll
    static void setup(){
        manager = new SubscriptionManager();
    }

    @Test
    public void TC001FreeTierEmailNotificationsEnabledAutoRenewal() {
        String result =
                manager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,
                        SubscriptionManager.NotificationPreference.EMAIL, SubscriptionManager.AutoRenewal.ENABLED);
        assertEquals("Subscription Configured: Tier=FREE, " +
                "Notification=EMAIL, AutoRenewal=ENABLED", result);
    }
    @Test
    public void TC002StandardTierSmsNotificationsDisabledAutoRenewal() {
        String result =
                manager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,
                        SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        assertEquals("Subscription Configured: Tier=STANDARD, " +
                "Notification=SMS, AutoRenewal=DISABLED", result);
    }
    @Test
    public void TC003PremiumTierNoneNotificationsEnabledAutoRenewal() {
        String result =
                manager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,
                        SubscriptionManager.NotificationPreference.NONE, SubscriptionManager.AutoRenewal.ENABLED);
        assertEquals("Subscription Configured: Tier=PREMIUM, " +
                "Notification=NONE, AutoRenewal=ENABLED", result);
    }
    @Test
    public void TC004FreeTierSmsNotificationsDisabledAutoRenewal() {
        String result =
                manager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,
                        SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        assertEquals("Subscription Configured: Tier=FREE, " +
                "Notification=SMS, AutoRenewal=DISABLED", result);
    }
    @Test
    public void TC005StandardTierEmailNotificationsEnabledAutoRenewal() {
        String result =
                manager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,
                        SubscriptionManager.NotificationPreference.EMAIL, SubscriptionManager.AutoRenewal.ENABLED);
        assertEquals("Subscription Configured: Tier=STANDARD, " +
                "Notification=EMAIL, AutoRenewal=ENABLED", result);
    }
    @Test
    public void TC006PremiumTierSmsNotificationsDisabledAutoRenewal() {
        String result =
                manager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,
                        SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        assertEquals("Subscription Configured: Tier=PREMIUM, " +
                "Notification=SMS, AutoRenewal=DISABLED", result);
    }
}