package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ForumHeadlineImgInfo extends Message {
    public static final String DEFAULT_HEADLINE_URL = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_IMG_USER_NAME = "";
    public static final String DEFAULT_THREAD_USER_NAME = "";
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String headline_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long img_user_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String img_user_name;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long thread_user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String thread_user_name;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_THREAD_USER_ID = 0L;
    public static final Long DEFAULT_IMG_USER_ID = 0L;

    private ForumHeadlineImgInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.thread_user_name == null) {
                this.thread_user_name = "";
            } else {
                this.thread_user_name = builder.thread_user_name;
            }
            if (builder.img_user_name == null) {
                this.img_user_name = "";
            } else {
                this.img_user_name = builder.img_user_name;
            }
            if (builder.img_url == null) {
                this.img_url = "";
            } else {
                this.img_url = builder.img_url;
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
            if (builder.headline_url == null) {
                this.headline_url = "";
                return;
            } else {
                this.headline_url = builder.headline_url;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.thread_user_name = builder.thread_user_name;
        this.img_user_name = builder.img_user_name;
        this.img_url = builder.img_url;
        this.thread_user_id = builder.thread_user_id;
        this.img_user_id = builder.img_user_id;
        this.headline_url = builder.headline_url;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ForumHeadlineImgInfo> {
        public String headline_url;
        public String img_url;
        public Long img_user_id;
        public String img_user_name;
        public Long thread_id;
        public Long thread_user_id;
        public String thread_user_name;

        public Builder() {
        }

        public Builder(ForumHeadlineImgInfo forumHeadlineImgInfo) {
            super(forumHeadlineImgInfo);
            if (forumHeadlineImgInfo != null) {
                this.thread_id = forumHeadlineImgInfo.thread_id;
                this.thread_user_name = forumHeadlineImgInfo.thread_user_name;
                this.img_user_name = forumHeadlineImgInfo.img_user_name;
                this.img_url = forumHeadlineImgInfo.img_url;
                this.thread_user_id = forumHeadlineImgInfo.thread_user_id;
                this.img_user_id = forumHeadlineImgInfo.img_user_id;
                this.headline_url = forumHeadlineImgInfo.headline_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumHeadlineImgInfo build(boolean z) {
            return new ForumHeadlineImgInfo(this, z);
        }
    }
}
