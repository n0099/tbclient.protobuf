package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class AlaShareInfo extends Message {
    public static final String DEFAULT_CONTENT = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long record_tid;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer share_count;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer share_user_count;
    public static final Integer DEFAULT_SHARE_USER_COUNT = 0;
    public static final Integer DEFAULT_SHARE_COUNT = 0;
    public static final Long DEFAULT_RECORD_TID = 0L;

    private AlaShareInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.content == null) {
                this.content = "";
            } else {
                this.content = builder.content;
            }
            if (builder.share_user_count == null) {
                this.share_user_count = DEFAULT_SHARE_USER_COUNT;
            } else {
                this.share_user_count = builder.share_user_count;
            }
            if (builder.share_count == null) {
                this.share_count = DEFAULT_SHARE_COUNT;
            } else {
                this.share_count = builder.share_count;
            }
            if (builder.record_tid == null) {
                this.record_tid = DEFAULT_RECORD_TID;
                return;
            } else {
                this.record_tid = builder.record_tid;
                return;
            }
        }
        this.content = builder.content;
        this.share_user_count = builder.share_user_count;
        this.share_count = builder.share_count;
        this.record_tid = builder.record_tid;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AlaShareInfo> {
        public String content;
        public Long record_tid;
        public Integer share_count;
        public Integer share_user_count;

        public Builder() {
        }

        public Builder(AlaShareInfo alaShareInfo) {
            super(alaShareInfo);
            if (alaShareInfo != null) {
                this.content = alaShareInfo.content;
                this.share_user_count = alaShareInfo.share_user_count;
                this.share_count = alaShareInfo.share_count;
                this.record_tid = alaShareInfo.record_tid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaShareInfo build(boolean z) {
            return new AlaShareInfo(this, z);
        }
    }
}
