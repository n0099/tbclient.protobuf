package tbclient.StoryReply;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.User;
/* loaded from: classes2.dex */
public final class StoryReplyInfo extends Message {
    public static final String DEFAULT_CONTENT_TEXT = "";
    @ProtoField(tag = 5)
    public final User author;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String content_text;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long post_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_id;
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<StoryReplyInfo> {
        public User author;
        public String content_text;
        public Long post_id;
        public Long thread_id;
        public Long user_id;

        public Builder() {
        }

        public Builder(StoryReplyInfo storyReplyInfo) {
            super(storyReplyInfo);
            if (storyReplyInfo == null) {
                return;
            }
            this.post_id = storyReplyInfo.post_id;
            this.user_id = storyReplyInfo.user_id;
            this.content_text = storyReplyInfo.content_text;
            this.thread_id = storyReplyInfo.thread_id;
            this.author = storyReplyInfo.author;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StoryReplyInfo build(boolean z) {
            return new StoryReplyInfo(this, z);
        }
    }

    public StoryReplyInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.post_id;
            if (l == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l;
            }
            Long l2 = builder.user_id;
            if (l2 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l2;
            }
            String str = builder.content_text;
            if (str == null) {
                this.content_text = "";
            } else {
                this.content_text = str;
            }
            Long l3 = builder.thread_id;
            if (l3 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l3;
            }
            this.author = builder.author;
            return;
        }
        this.post_id = builder.post_id;
        this.user_id = builder.user_id;
        this.content_text = builder.content_text;
        this.thread_id = builder.thread_id;
        this.author = builder.author;
    }
}
