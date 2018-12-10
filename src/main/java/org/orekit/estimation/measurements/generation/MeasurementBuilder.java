/* Copyright 2002-2018 CS Systèmes d'Information
 * Licensed to CS Systèmes d'Information (CS) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * CS licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.orekit.estimation.measurements.generation;

import java.util.List;

import org.orekit.estimation.measurements.EstimationModifier;
import org.orekit.estimation.measurements.ObservedMeasurement;
import org.orekit.propagation.SpacecraftState;
import org.orekit.time.AbsoluteDate;


/** Interface for generating individual {@link ObservedMeasurements measurements}.
 * @param <T> the type of the measurement
 * @author Luc Maisonobe
 * @since 9.3
 */
public interface MeasurementBuilder<T extends ObservedMeasurement<T>> {

    /** Initialize builder at the start of a measurements generation.
     * <p>
     * This method is called once at the start of the measurements generation. It
     * may be used by the builder to initialize some internal data
     * if needed, typically setting up parameters reference dates.
     * </p>
     * @param start start of the measurements time span
     * @param end end of the measurements time span
     */
    void init(AbsoluteDate start, AbsoluteDate end);

    /** Add a modifier.
     * @param modifier modifier to add
     */
    void addModifier(EstimationModifier<T> modifier);

    /** Get the modifiers that apply to a measurement.
     * @return modifiers that apply to a measurement
     * @see #addModifier(EstimationModifier)
     */
    List<EstimationModifier<T>> getModifiers();

    /** Generate a single measurement.
     * @param states spacecraft states
     * @return generated measurement
     */
    T build(SpacecraftState[] states);

}
