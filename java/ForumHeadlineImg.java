package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class ForumHeadlineImg extends Message {
    public static final String DEFAULT_IMG_URL = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long img_user_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long thread_user_id;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_THREAD_USER_ID = 0L;
    public static final Long DEFAULT_IMG_USER_ID = 0L;

    private ForumHeadlineImg(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.thread_user_id == null) {
                this.thread_user_id = DEFAULT_THREAD_USER_ID;
            } else {
                this.thread_user_id = builder.thread_user_id;
            }
            if (builder.img_user_id == null) {
                this.img_user_id = DEFAULT_IMG_USER_ID;
            } else {
                this.img_user_id = builder.img_user_id;
            }
            if (builder.img_url == null) {
                this.img_url = "";
                return;
            } else {
                this.img_url = builder.img_url;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.thread_user_id = builder.thread_user_id;
        this.img_user_id = builder.img_user_id;
        this.img_url = builder.img_url;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<ForumHeadlineImg> {
        public String img_url;
        public Long img_user_id;
        public Long thread_id;
        public Long thread_user_id;

        public Builder() {
        }

        public Builder(ForumHeadlineImg forumHeadlineImg) {
            super(forumHeadlineImg);
            if (forumHeadlineImg != null) {
                this.thread_id = forumHeadlineImg.thread_id;
                this.thread_user_id = forumHeadlineImg.thread_user_id;
                this.img_user_id = forumHeadlineImg.img_user_id;
                this.img_url = forumHeadlineImg.img_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumHeadlineImg build(boolean z) {
            return new ForumHeadlineImg(this, z);
        }
    }
}
