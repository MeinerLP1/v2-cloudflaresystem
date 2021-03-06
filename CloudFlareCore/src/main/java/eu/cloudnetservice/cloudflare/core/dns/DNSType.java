/*
 * Copyright (c) Tarek Hosni El Alaoui 2017
 */

package eu.cloudnetservice.cloudflare.core.dns;

/**
 * An enumeration of all valid DNS record types
 */
public enum DNSType {

    A,
    AAAA,
    CNAME,
    MX,
    LOC,
    SRV,
    SPF,
    TXT,
    NS,
    CAA
}
