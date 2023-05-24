package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class LiveSessionInfo extends Message {
    public static final String DEFAULT_HLS_URL = "";
    public static final String DEFAULT_RTMP_URL = "";
    public static final String DEFAULT_SESSION_ID = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String hls_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String rtmp_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String session_id;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<LiveSessionInfo> {
        public String hls_url;
        public String rtmp_url;
        public String session_id;

        public Builder() {
        }

        public Builder(LiveSessionInfo liveSessionInfo) {
            super(liveSessionInfo);
            if (liveSessionInfo == null) {
                return;
            }
            this.session_id = liveSessionInfo.session_id;
            this.rtmp_url = liveSessionInfo.rtmp_url;
            this.hls_url = liveSessionInfo.hls_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveSessionInfo build(boolean z) {
            return new LiveSessionInfo(this, z);
        }
    }

    public LiveSessionInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.session_id;
            if (str == null) {
                this.session_id = "";
            } else {
                this.session_id = str;
            }
            String str2 = builder.rtmp_url;
            if (str2 == null) {
                this.rtmp_url = "";
            } else {
                this.rtmp_url = str2;
            }
            String str3 = builder.hls_url;
            if (str3 == null) {
                this.hls_url = "";
                return;
            } else {
                this.hls_url = str3;
                return;
            }
        }
        this.session_id = builder.session_id;
        this.rtmp_url = builder.rtmp_url;
        this.hls_url = builder.hls_url;
    }
}
