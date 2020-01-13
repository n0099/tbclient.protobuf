package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class TshowInfo extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;

    private TshowInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.icon == null) {
                this.icon = "";
            } else {
                this.icon = builder.icon;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.icon = builder.icon;
        this.name = builder.name;
        this.url = builder.url;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<TshowInfo> {
        public String icon;
        public String name;
        public String url;

        public Builder() {
        }

        public Builder(TshowInfo tshowInfo) {
            super(tshowInfo);
            if (tshowInfo != null) {
                this.icon = tshowInfo.icon;
                this.name = tshowInfo.name;
                this.url = tshowInfo.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TshowInfo build(boolean z) {
            return new TshowInfo(this, z);
        }
    }
}
