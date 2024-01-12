package com.sportradar.mbs.sdk.entities.channel;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = TvAppChannel.class, name = "tv-app"),
        @JsonSubTypes.Type(value = AgentChannel.class, name = "agent"),
        @JsonSubTypes.Type(value = MobileAppChannel.class, name = "mobile-app"),
        @JsonSubTypes.Type(value = PhoneChannel.class, name = "phone"),
        @JsonSubTypes.Type(value = CallCentreChannel.class, name = "call-centre"),
        @JsonSubTypes.Type(value = SmsChannel.class, name = "sms"),
        @JsonSubTypes.Type(value = MobileChannel.class, name = "mobile"),
        @JsonSubTypes.Type(value = TerminalChannel.class, name = "terminal"),
        @JsonSubTypes.Type(value = RetailChannel.class, name = "retail"),
        @JsonSubTypes.Type(value = InternetChannel.class, name = "internet")
})
public class Channel {
}
