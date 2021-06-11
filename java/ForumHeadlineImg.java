package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
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

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ForumHeadlineImg> {
        public String img_url;
        public Long img_user_id;
        public Long thread_id;
        public Long thread_user_id;

        public Builder() {
        }

        public Builder(ForumHeadlineImg forumHeadlineImg) {
            super(forumHeadlineImg);
            if (forumHeadlineImg == null) {
                return;
            }
            this.thread_id = forumHeadlineImg.thread_id;
            this.thread_user_id = forumHeadlineImg.thread_user_id;
            this.img_user_id = forumHeadlineImg.img_user_id;
            this.img_url = forumHeadlineImg.img_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumHeadlineImg build(boolean z) {
            return new ForumHeadlineImg(this, z);
        }
    }

    public ForumHeadlineImg(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.thread_id;
            if (l == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l;
            }
            Long l2 = builder.thread_user_id;
            if (l2 == null) {
                this.thread_user_id = DEFAULT_THREAD_USER_ID;
            } else {
                this.thread_user_id = l2;
            }
            Long l3 = builder.img_user_id;
            if (l3 == null) {
                this.img_user_id = DEFAULT_IMG_USER_ID;
            } else {
                this.img_user_id = l3;
            }
            String str = builder.img_url;
            if (str == null) {
                this.img_url = "";
                return;
            } else {
                this.img_url = str;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.thread_user_id = builder.thread_user_id;
        this.img_user_id = builder.img_user_id;
        this.img_url = builder.img_url;
    }
}
