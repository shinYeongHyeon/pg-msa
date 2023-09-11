package com.msapay.membership.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Membership {
    @Getter private final String membershipId;
    @Getter private final String name;
    @Getter private final String email;
    @Getter private final String address;
    @Getter private final boolean isValid;
    @Getter private final boolean isCrop;

    public static Membership generateMember(
            MembershipId membershipId,
            MembershipName name,
            MembershipEmail email,
            MembershipAddress address,
            MembershipIsValid isValid,
            MembershipIsCorp isCorp
    ) {
        return new Membership(
                membershipId.value,
                name.value,
                email.value,
                address.value,
                isValid.value,
                isCorp.value
        );
    }

    @Value
    public static class MembershipId {
        String value;
        public MembershipId(String value) {
            this.value = value;
        }
    }

    @Value
    public static class MembershipName {
        String value;
        public MembershipName(String value) {
            this.value = value;
        }
    }

    @Value
    public static class MembershipEmail {
        String value;
        public MembershipEmail(String value) {
            this.value = value;
        }
    }

    @Value
    public static class MembershipAddress {
        String value;
        public MembershipAddress(String value) {
            this.value = value;
        }
    }

    @Value
    public static class MembershipIsValid {
        boolean value;
        public MembershipIsValid(boolean value) {
            this.value = value;
        }
    }

    @Value
    public static class MembershipIsCorp {
        boolean value;
        public MembershipIsCorp(boolean value) {
            this.value = value;
        }
    }
}
