package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ForumMessageInfo extends Message {
    public static final Integer DEFAULT_CONTENT_TYPE = 0;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer content_type;
    @ProtoField(tag = 1)
    public final OriginThreadInfo origin_thread_info;
    @ProtoField(tag = 3)
    public final User replyer;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ForumMessageInfo> {
        public Integer content_type;
        public OriginThreadInfo origin_thread_info;
        public User replyer;

        public Builder() {
        }

        public Builder(ForumMessageInfo forumMessageInfo) {
            super(forumMessageInfo);
            if (forumMessageInfo == null) {
                return;
            }
            this.origin_thread_info = forumMessageInfo.origin_thread_info;
            this.content_type = forumMessageInfo.content_type;
            this.replyer = forumMessageInfo.replyer;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumMessageInfo build(boolean z) {
            return new ForumMessageInfo(this, z);
        }
    }

    public ForumMessageInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.origin_thread_info = builder.origin_thread_info;
            Integer num = builder.content_type;
            if (num == null) {
                this.content_type = DEFAULT_CONTENT_TYPE;
            } else {
                this.content_type = num;
            }
            this.replyer = builder.replyer;
            return;
        }
        this.origin_thread_info = builder.origin_thread_info;
        this.content_type = builder.content_type;
        this.replyer = builder.replyer;
    }
}
