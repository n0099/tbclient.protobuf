package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class GuessLikeThreadInfo extends Message {
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_RECOM_COVER = "";
    public static final String DEFAULT_RECOM_REASON = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String recom_cover;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String recom_reason;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long reply_num;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String title;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_REPLY_NUM = 0L;

    private GuessLikeThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.reply_num == null) {
                this.reply_num = DEFAULT_REPLY_NUM;
            } else {
                this.reply_num = builder.reply_num;
            }
            if (builder.recom_cover == null) {
                this.recom_cover = "";
            } else {
                this.recom_cover = builder.recom_cover;
            }
            if (builder.recom_reason == null) {
                this.recom_reason = "";
            } else {
                this.recom_reason = builder.recom_reason;
            }
            if (builder.title == null) {
                this.title = "";
                return;
            } else {
                this.title = builder.title;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.reply_num = builder.reply_num;
        this.recom_cover = builder.recom_cover;
        this.recom_reason = builder.recom_reason;
        this.title = builder.title;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<GuessLikeThreadInfo> {
        public Long forum_id;
        public String forum_name;
        public String recom_cover;
        public String recom_reason;
        public Long reply_num;
        public Long thread_id;
        public String title;

        public Builder() {
        }

        public Builder(GuessLikeThreadInfo guessLikeThreadInfo) {
            super(guessLikeThreadInfo);
            if (guessLikeThreadInfo != null) {
                this.thread_id = guessLikeThreadInfo.thread_id;
                this.forum_id = guessLikeThreadInfo.forum_id;
                this.forum_name = guessLikeThreadInfo.forum_name;
                this.reply_num = guessLikeThreadInfo.reply_num;
                this.recom_cover = guessLikeThreadInfo.recom_cover;
                this.recom_reason = guessLikeThreadInfo.recom_reason;
                this.title = guessLikeThreadInfo.title;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GuessLikeThreadInfo build(boolean z) {
            return new GuessLikeThreadInfo(this, z);
        }
    }
}
