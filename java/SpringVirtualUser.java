package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class SpringVirtualUser extends Message {
    public static final Integer DEFAULT_IS_VIRTUAL = 0;
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer is_virtual;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    private SpringVirtualUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_virtual == null) {
                this.is_virtual = DEFAULT_IS_VIRTUAL;
            } else {
                this.is_virtual = builder.is_virtual;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.is_virtual = builder.is_virtual;
        this.url = builder.url;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<SpringVirtualUser> {
        public Integer is_virtual;
        public String url;

        public Builder() {
        }

        public Builder(SpringVirtualUser springVirtualUser) {
            super(springVirtualUser);
            if (springVirtualUser != null) {
                this.is_virtual = springVirtualUser.is_virtual;
                this.url = springVirtualUser.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SpringVirtualUser build(boolean z) {
            return new SpringVirtualUser(this, z);
        }
    }
}
