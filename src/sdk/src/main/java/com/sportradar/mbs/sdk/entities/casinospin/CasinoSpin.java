package com.sportradar.mbs.sdk.entities.casinospin;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = BonusCasinoSpin.class, name = "bonus"),
        @JsonSubTypes.Type(value = OrdinaryCasinoSpin.class, name = "ordinary"),
        @JsonSubTypes.Type(value = FreeCasinoSpin.class, name = "free")
})
public class CasinoSpin {
}
