package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Quote;
import tbclient.Zan;
/* loaded from: classes8.dex */
public final class MagicPostList extends Message {
    public static final String DEFAULT_CONTENT_TEXT = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String content_text;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer is_comment;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long post_id;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer post_no;
    @ProtoField(tag = 10)
    public final Quote quote;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3)
    public final UserInfo user_info;
    @ProtoField(tag = 9)
    public final Zan zan;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final Integer DEFAULT_POST_NO = 0;
    public static final Integer DEFAULT_IS_COMMENT = 0;

    private MagicPostList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.post_id == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = builder.post_id;
            }
            this.user_info = builder.user_info;
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.content_text == null) {
                this.content_text = "";
            } else {
                this.content_text = builder.content_text;
            }
            if (builder.create_time == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = builder.create_time;
            }
            if (builder.post_no == null) {
                this.post_no = DEFAULT_POST_NO;
            } else {
                this.post_no = builder.post_no;
            }
            if (builder.is_comment == null) {
                this.is_comment = DEFAULT_IS_COMMENT;
            } else {
                this.is_comment = builder.is_comment;
            }
            this.zan = builder.zan;
            this.quote = builder.quote;
            return;
        }
        this.thread_id = builder.thread_id;
        this.post_id = builder.post_id;
        this.user_info = builder.user_info;
        this.title = builder.title;
        this.content_text = builder.content_text;
        this.create_time = builder.create_time;
        this.post_no = builder.post_no;
        this.is_comment = builder.is_comment;
        this.zan = builder.zan;
        this.quote = builder.quote;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<MagicPostList> {
        public String content_text;
        public Integer create_time;
        public Integer is_comment;
        public Long post_id;
        public Integer post_no;
        public Quote quote;
        public Long thread_id;
        public String title;
        public UserInfo user_info;
        public Zan zan;

        public Builder() {
        }

        public Builder(MagicPostList magicPostList) {
            super(magicPostList);
            if (magicPostList != null) {
                this.thread_id = magicPostList.thread_id;
                this.post_id = magicPostList.post_id;
                this.user_info = magicPostList.user_info;
                this.title = magicPostList.title;
                this.content_text = magicPostList.content_text;
                this.create_time = magicPostList.create_time;
                this.post_no = magicPostList.post_no;
                this.is_comment = magicPostList.is_comment;
                this.zan = magicPostList.zan;
                this.quote = magicPostList.quote;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MagicPostList build(boolean z) {
            return new MagicPostList(this, z);
        }
    }
}
