package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
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

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<AlaShareInfo> {
        public String content;
        public Long record_tid;
        public Integer share_count;
        public Integer share_user_count;

        public Builder() {
        }

        public Builder(AlaShareInfo alaShareInfo) {
            super(alaShareInfo);
            if (alaShareInfo == null) {
                return;
            }
            this.content = alaShareInfo.content;
            this.share_user_count = alaShareInfo.share_user_count;
            this.share_count = alaShareInfo.share_count;
            this.record_tid = alaShareInfo.record_tid;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaShareInfo build(boolean z) {
            return new AlaShareInfo(this, z);
        }
    }

    public AlaShareInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.content;
            if (str == null) {
                this.content = "";
            } else {
                this.content = str;
            }
            Integer num = builder.share_user_count;
            if (num == null) {
                this.share_user_count = DEFAULT_SHARE_USER_COUNT;
            } else {
                this.share_user_count = num;
            }
            Integer num2 = builder.share_count;
            if (num2 == null) {
                this.share_count = DEFAULT_SHARE_COUNT;
            } else {
                this.share_count = num2;
            }
            Long l = builder.record_tid;
            if (l == null) {
                this.record_tid = DEFAULT_RECORD_TID;
                return;
            } else {
                this.record_tid = l;
                return;
            }
        }
        this.content = builder.content;
        this.share_user_count = builder.share_user_count;
        this.share_count = builder.share_count;
        this.record_tid = builder.record_tid;
    }
}
