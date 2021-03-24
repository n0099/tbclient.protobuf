package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class SpringVirtualUser extends Message {
    public static final Integer DEFAULT_IS_VIRTUAL = 0;
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer is_virtual;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<SpringVirtualUser> {
        public Integer is_virtual;
        public String url;

        public Builder() {
        }

        public Builder(SpringVirtualUser springVirtualUser) {
            super(springVirtualUser);
            if (springVirtualUser == null) {
                return;
            }
            this.is_virtual = springVirtualUser.is_virtual;
            this.url = springVirtualUser.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SpringVirtualUser build(boolean z) {
            return new SpringVirtualUser(this, z);
        }
    }

    public SpringVirtualUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_virtual;
            if (num == null) {
                this.is_virtual = DEFAULT_IS_VIRTUAL;
            } else {
                this.is_virtual = num;
            }
            String str = builder.url;
            if (str == null) {
                this.url = "";
                return;
            } else {
                this.url = str;
                return;
            }
        }
        this.is_virtual = builder.is_virtual;
        this.url = builder.url;
    }
}
