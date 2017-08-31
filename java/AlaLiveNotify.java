package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class AlaLiveNotify extends Message {
    public static final String DEFAULT_NOTI_CONTENT = "";
    public static final String DEFAULT_NOTI_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String noti_content;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String noti_url;

    private AlaLiveNotify(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.noti_content == null) {
                this.noti_content = "";
            } else {
                this.noti_content = builder.noti_content;
            }
            if (builder.noti_url == null) {
                this.noti_url = "";
                return;
            } else {
                this.noti_url = builder.noti_url;
                return;
            }
        }
        this.noti_content = builder.noti_content;
        this.noti_url = builder.noti_url;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<AlaLiveNotify> {
        public String noti_content;
        public String noti_url;

        public Builder() {
        }

        public Builder(AlaLiveNotify alaLiveNotify) {
            super(alaLiveNotify);
            if (alaLiveNotify != null) {
                this.noti_content = alaLiveNotify.noti_content;
                this.noti_url = alaLiveNotify.noti_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaLiveNotify build(boolean z) {
            return new AlaLiveNotify(this, z);
        }
    }
}