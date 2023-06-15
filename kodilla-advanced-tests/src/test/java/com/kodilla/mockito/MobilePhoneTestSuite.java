package com.kodilla.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MobilePhoneTestSuite {
    MobilePhone myPhone = Mockito.mock(MobilePhone.class);

    @Test
    public void testExpectation() {
        Assertions.assertFalse(myPhone.needsCharging());
        //sterujemy zapisem metody narzucając jest wynik true
        Mockito.when(myPhone.needsCharging()).thenReturn(true);
        Assertions.assertTrue(myPhone.needsCharging());
    }
    @Test
    public void shouldCallLaunchApplication() {
        myPhone.launchApplication("Tetris4D");
        //sprawdzamy czy metoda void zadziałała prawidłowo, czy wywołała prawidłową metodę
        Mockito.verify(myPhone).launchApplication("Tetris4D");
    }

}