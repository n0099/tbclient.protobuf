package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class GraffitiInfo extends Message {
    public static final Long DEFAULT_GID = 0L;
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long gid;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    private GraffitiInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.gid == null) {
                this.gid = DEFAULT_GID;
                return;
            } else {
                this.gid = builder.gid;
                return;
            }
        }
        this.url = builder.url;
        this.gid = builder.gid;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<GraffitiInfo> {
        public Long gid;
        public String url;

        public Builder() {
        }

        public Builder(GraffitiInfo graffitiInfo) {
            super(graffitiInfo);
            if (graffitiInfo != null) {
                this.url = graffitiInfo.url;
                this.gid = graffitiInfo.gid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GraffitiInfo build(boolean z) {
            return new GraffitiInfo(this, z);
        }
    }
}
