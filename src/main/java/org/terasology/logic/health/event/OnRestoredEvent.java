/*
 * Copyright 2019 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.logic.health.event;

import org.terasology.entitySystem.entity.EntityRef;

/**
 * This event is sent after the entity is restored. Final event of restoration logic.
 */
public class OnRestoredEvent extends HealthChangedEvent {
    /**
     * The amount by which the entity is restored.
     */
    private int amount;

    /**
     * Constructor for creating the event.
     * @param amount        The amount of restoration.
     * @param instigator    EntityRef of cause of restoration.
     */
    public OnRestoredEvent(int amount, EntityRef instigator) {
        super(instigator, amount);
        this.amount = amount;
    }

    /**
     * Method to get the amount of restoration.
     * @return amount of restoration.
     */
    public int getRegenAmount() {
        return amount;
    }

}
