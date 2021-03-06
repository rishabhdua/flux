/*
 * Copyright 2012-2016, the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flipkart.flux.examples.orderfulfilment;

import java.util.Random;

/**
 * Dummy class to represent a created order
 */
public class CreatedOrder {
    // Dummy method
    public boolean isCod() {
        return new Random().nextBoolean();
    }

    // Dummy method to pack the order - either done by machine/humans
    public void pack() {
        throw new UnsupportedOperationException("not implemented yet");
    }
}
