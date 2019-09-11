/* Copyright 2002-2019 CS Systèmes d'Information
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
package org.orekit.gnss;

/**
 * Enumerate for satellite signal code.
 *
 * @author Bryan Cazabonne
 * @since 10.1
 */
public enum SignalCode {

    /** Galileo A PRS / IRNSS A SPS codes. */
    A,

    /** Galileo B I/NAV and B C/NAV / IRNSS B RS codes. */
    B,

    /** GPS C/A / GLONASS C/A / Galileo C / SBAS C/A / QZSS C/A / IRNSS C RS(P) codes. */
    C,

    /** GPS L1(C/A) + (P2-P1) code. */
    D,

    /** GPS I / GLONASS I / Galileo I F/NAV, I I/NAV and I / SBAS I/  Beidou I codes. */
    I,

    /** GPS L1C (P) and L2C (L) / QZSS L1C (P), L2C (L) and L code. */
    L,

    /** GPS M code. */
    M,

    /** GPS P (AS off) / GLONASS P codes. */
    P,

    /** GPS Q / GLONASS Q / Galileo Q / SBAS Q / QZSS Q / Beidou Q codes. */
    Q,

    /** GPS L1C (D), L2C (M) / QZSS L1C (D), L2C (M) and S codes. */
    S,

    /** GPS Z - tracking and similar (AS off) /  code. */
    W,

    /** GPS L1C (D+P), L2C (M+L) and I+Q / GLONASS I+Q / Galileo B+C and I+Q / SBAS I+Q / QZSS L1C (D+P), L2C (M+L), I+Q and S+L / Beidou I+Q / IRNSS B+C codes. */
    X,

    /** GPS Y code. */
    Y,

    /** Galileo A+B+C / QZSS L1-SAIF codes. */
    Z,

    /** Codeless. */
    CODELESS;

}
