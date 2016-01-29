package tbclient.GetInterview;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.User;
/* loaded from: classes.dex */
public final class DanmuInfo extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final Long DEFAULT_POST_ID = 0L;
    @ProtoField(tag = 2)
    public final User author;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long post_id;

    /* synthetic */ DanmuInfo(Builder builder, boolean z, DanmuInfo danmuInfo) {
        this(builder, z);
    }

    private DanmuInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.content == null) {
                this.content = "";
            } else {
                this.content = builder.content;
            }
            this.author = builder.author;
            if (builder.post_id == null) {
                this.post_id = DEFAULT_POST_ID;
                return;
            } else {
                this.post_id = builder.post_id;
                return;
            }
        }
        this.content = builder.content;
        this.author = builder.author;
        this.post_id = builder.post_id;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DanmuInfo> {
        public User author;
        public String content;
        public Long post_id;

        public Builder() {
        }

        public Builder(DanmuInfo danmuInfo) {
            super(danmuInfo);
            if (danmuInfo != null) {
                this.content = danmuInfo.content;
                this.author = danmuInfo.author;
                this.post_id = danmuInfo.post_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DanmuInfo build(boolean z) {
            return new DanmuInfo(this, z, null);
        }
    }
}
