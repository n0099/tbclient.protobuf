package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class DefaultInfo extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DefaultInfo> {
        public String icon;
        public String url;

        public Builder() {
        }

        public Builder(DefaultInfo defaultInfo) {
            super(defaultInfo);
            if (defaultInfo == null) {
                return;
            }
            this.url = defaultInfo.url;
            this.icon = defaultInfo.icon;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DefaultInfo build(boolean z) {
            return new DefaultInfo(this, z);
        }
    }

    public DefaultInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.icon;
            if (str2 == null) {
                this.icon = "";
                return;
            } else {
                this.icon = str2;
                return;
            }
        }
        this.url = builder.url;
        this.icon = builder.icon;
    }
}
