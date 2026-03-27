package com.rms.api.util;

import java.util.UUID;

public class PnrGenerator {
    public static String generatePNR() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
}