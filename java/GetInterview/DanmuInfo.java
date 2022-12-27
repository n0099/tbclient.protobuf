package tbclient.GetInterview;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.User;
/* loaded from: classes9.dex */
public final class DanmuInfo extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final Long DEFAULT_POST_ID = 0L;
    @ProtoField(tag = 2)
    public final User author;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long post_id;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DanmuInfo> {
        public User author;
        public String content;
        public Long post_id;

        public Builder() {
        }

        public Builder(DanmuInfo danmuInfo) {
            super(danmuInfo);
            if (danmuInfo == null) {
                return;
            }
            this.content = danmuInfo.content;
            this.author = danmuInfo.author;
            this.post_id = danmuInfo.post_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DanmuInfo build(boolean z) {
            return new DanmuInfo(this, z);
        }
    }

    public DanmuInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.content;
            if (str == null) {
                this.content = "";
            } else {
                this.content = str;
            }
            this.author = builder.author;
            Long l = builder.post_id;
            if (l == null) {
                this.post_id = DEFAULT_POST_ID;
                return;
            } else {
                this.post_id = l;
                return;
            }
        }
        this.content = builder.content;
        this.author = builder.author;
        this.post_id = builder.post_id;
    }
}
