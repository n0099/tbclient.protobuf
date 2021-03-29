package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class GraffitiInfo extends Message {
    public static final Long DEFAULT_GID = 0L;
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long gid;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GraffitiInfo> {
        public Long gid;
        public String url;

        public Builder() {
        }

        public Builder(GraffitiInfo graffitiInfo) {
            super(graffitiInfo);
            if (graffitiInfo == null) {
                return;
            }
            this.url = graffitiInfo.url;
            this.gid = graffitiInfo.gid;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GraffitiInfo build(boolean z) {
            return new GraffitiInfo(this, z);
        }
    }

    public GraffitiInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            Long l = builder.gid;
            if (l == null) {
                this.gid = DEFAULT_GID;
                return;
            } else {
                this.gid = l;
                return;
            }
        }
        this.url = builder.url;
        this.gid = builder.gid;
    }
}
