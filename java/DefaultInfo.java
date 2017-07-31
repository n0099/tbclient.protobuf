package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DefaultInfo extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    private DefaultInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.icon == null) {
                this.icon = "";
                return;
            } else {
                this.icon = builder.icon;
                return;
            }
        }
        this.url = builder.url;
        this.icon = builder.icon;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DefaultInfo> {
        public String icon;
        public String url;

        public Builder() {
        }

        public Builder(DefaultInfo defaultInfo) {
            super(defaultInfo);
            if (defaultInfo != null) {
                this.url = defaultInfo.url;
                this.icon = defaultInfo.icon;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DefaultInfo build(boolean z) {
            return new DefaultInfo(this, z);
        }
    }
}
