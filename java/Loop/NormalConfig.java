package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class NormalConfig extends Message {
    public static final String DEFAULT_ICON_SCHEME = "";
    public static final String DEFAULT_ICON_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon_scheme;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon_url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<NormalConfig> {
        public String icon_scheme;
        public String icon_url;

        public Builder() {
        }

        public Builder(NormalConfig normalConfig) {
            super(normalConfig);
            if (normalConfig == null) {
                return;
            }
            this.icon_url = normalConfig.icon_url;
            this.icon_scheme = normalConfig.icon_scheme;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NormalConfig build(boolean z) {
            return new NormalConfig(this, z);
        }
    }

    public NormalConfig(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon_url;
            if (str == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str;
            }
            String str2 = builder.icon_scheme;
            if (str2 == null) {
                this.icon_scheme = "";
                return;
            } else {
                this.icon_scheme = str2;
                return;
            }
        }
        this.icon_url = builder.icon_url;
        this.icon_scheme = builder.icon_scheme;
    }
}
