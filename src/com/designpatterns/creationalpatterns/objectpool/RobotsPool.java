package com.designpatterns.creationalpatterns.objectpool;

import com.designpatterns.creationalpatterns.prototype.Components;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RobotsPool extends ObjectPool {
    @Override
    public Object create() {
        int robotId = ThreadLocalRandom.current().nextInt();

        return new Robot(robotId, new ArrayList<>(), new Components());
    }
}

