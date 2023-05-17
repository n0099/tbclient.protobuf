package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
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

    /* loaded from: classes10.dex */
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
            if (guessLikeThreadInfo == null) {
                return;
            }
            this.thread_id = guessLikeThreadInfo.thread_id;
            this.forum_id = guessLikeThreadInfo.forum_id;
            this.forum_name = guessLikeThreadInfo.forum_name;
            this.reply_num = guessLikeThreadInfo.reply_num;
            this.recom_cover = guessLikeThreadInfo.recom_cover;
            this.recom_reason = guessLikeThreadInfo.recom_reason;
            this.title = guessLikeThreadInfo.title;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GuessLikeThreadInfo build(boolean z) {
            return new GuessLikeThreadInfo(this, z);
        }
    }

    public GuessLikeThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.thread_id;
            if (l == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l;
            }
            Long l2 = builder.forum_id;
            if (l2 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l2;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            Long l3 = builder.reply_num;
            if (l3 == null) {
                this.reply_num = DEFAULT_REPLY_NUM;
            } else {
                this.reply_num = l3;
            }
            String str2 = builder.recom_cover;
            if (str2 == null) {
                this.recom_cover = "";
            } else {
                this.recom_cover = str2;
            }
            String str3 = builder.recom_reason;
            if (str3 == null) {
                this.recom_reason = "";
            } else {
                this.recom_reason = str3;
            }
            String str4 = builder.title;
            if (str4 == null) {
                this.title = "";
                return;
            } else {
                this.title = str4;
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
}
