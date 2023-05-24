package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class LiveVideoInfo extends Message {
    public static final Integer DEFAULT_DURATION = 0;
    public static final String DEFAULT_ID = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer duration;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<LiveVideoInfo> {
        public Integer duration;
        public String id;
        public String url;

        public Builder() {
        }

        public Builder(LiveVideoInfo liveVideoInfo) {
            super(liveVideoInfo);
            if (liveVideoInfo == null) {
                return;
            }
            this.id = liveVideoInfo.id;
            this.duration = liveVideoInfo.duration;
            this.url = liveVideoInfo.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveVideoInfo build(boolean z) {
            return new LiveVideoInfo(this, z);
        }
    }

    public LiveVideoInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.id;
            if (str == null) {
                this.id = "";
            } else {
                this.id = str;
            }
            Integer num = builder.duration;
            if (num == null) {
                this.duration = DEFAULT_DURATION;
            } else {
                this.duration = num;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
                return;
            } else {
                this.url = str2;
                return;
            }
        }
        this.id = builder.id;
        this.duration = builder.duration;
        this.url = builder.url;
    }
}
