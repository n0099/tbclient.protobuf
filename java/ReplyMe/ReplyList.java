package tbclient.ReplyMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.User;
import tbclient.Zan;
/* loaded from: classes.dex */
public final class ReplyList extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_FNAME = "";
    public static final String DEFAULT_ITEM_TYPE = "";
    public static final String DEFAULT_QUOTE_CONTENT = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String fname;
    @ProtoField(tag = 19, type = Message.Datatype.UINT32)
    public final Integer hide_fname;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer is_floor;
    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer is_story;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String item_type;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long post_id;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String quote_content;
    @ProtoField(tag = 14, type = Message.Datatype.UINT64)
    public final Long quote_pid;
    @ProtoField(tag = 15)
    public final User quote_user;
    @ProtoField(tag = 9)
    public final User replyer;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer server_time;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 17, type = Message.Datatype.UINT32)
    public final Integer thread_type;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer unread;
    @ProtoField(tag = 18, type = Message.Datatype.UINT64)
    public final Long v_forum_id;
    @ProtoField(tag = 13)
    public final Zan zan;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Integer DEFAULT_TIME = 0;
    public static final Integer DEFAULT_IS_FLOOR = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_UNREAD = 0;
    public static final Long DEFAULT_QUOTE_PID = 0L;
    public static final Integer DEFAULT_SERVER_TIME = 0;
    public static final Integer DEFAULT_THREAD_TYPE = 0;
    public static final Long DEFAULT_V_FORUM_ID = 0L;
    public static final Integer DEFAULT_HIDE_FNAME = 0;
    public static final Integer DEFAULT_IS_STORY = 0;

    private ReplyList(Builder builder, boolean z) {
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
            if (builder.time == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = builder.time;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.fname == null) {
                this.fname = "";
            } else {
                this.fname = builder.fname;
            }
            if (builder.content == null) {
                this.content = "";
            } else {
                this.content = builder.content;
            }
            if (builder.is_floor == null) {
                this.is_floor = DEFAULT_IS_FLOOR;
            } else {
                this.is_floor = builder.is_floor;
            }
            if (builder.quote_content == null) {
                this.quote_content = "";
            } else {
                this.quote_content = builder.quote_content;
            }
            this.replyer = builder.replyer;
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.unread == null) {
                this.unread = DEFAULT_UNREAD;
            } else {
                this.unread = builder.unread;
            }
            if (builder.item_type == null) {
                this.item_type = "";
            } else {
                this.item_type = builder.item_type;
            }
            this.zan = builder.zan;
            if (builder.quote_pid == null) {
                this.quote_pid = DEFAULT_QUOTE_PID;
            } else {
                this.quote_pid = builder.quote_pid;
            }
            this.quote_user = builder.quote_user;
            if (builder.server_time == null) {
                this.server_time = DEFAULT_SERVER_TIME;
            } else {
                this.server_time = builder.server_time;
            }
            if (builder.thread_type == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = builder.thread_type;
            }
            if (builder.v_forum_id == null) {
                this.v_forum_id = DEFAULT_V_FORUM_ID;
            } else {
                this.v_forum_id = builder.v_forum_id;
            }
            if (builder.hide_fname == null) {
                this.hide_fname = DEFAULT_HIDE_FNAME;
            } else {
                this.hide_fname = builder.hide_fname;
            }
            if (builder.is_story == null) {
                this.is_story = DEFAULT_IS_STORY;
                return;
            } else {
                this.is_story = builder.is_story;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.post_id = builder.post_id;
        this.time = builder.time;
        this.title = builder.title;
        this.fname = builder.fname;
        this.content = builder.content;
        this.is_floor = builder.is_floor;
        this.quote_content = builder.quote_content;
        this.replyer = builder.replyer;
        this.type = builder.type;
        this.unread = builder.unread;
        this.item_type = builder.item_type;
        this.zan = builder.zan;
        this.quote_pid = builder.quote_pid;
        this.quote_user = builder.quote_user;
        this.server_time = builder.server_time;
        this.thread_type = builder.thread_type;
        this.v_forum_id = builder.v_forum_id;
        this.hide_fname = builder.hide_fname;
        this.is_story = builder.is_story;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ReplyList> {
        public String content;
        public String fname;
        public Integer hide_fname;
        public Integer is_floor;
        public Integer is_story;
        public String item_type;
        public Long post_id;
        public String quote_content;
        public Long quote_pid;
        public User quote_user;
        public User replyer;
        public Integer server_time;
        public Long thread_id;
        public Integer thread_type;
        public Integer time;
        public String title;
        public Integer type;
        public Integer unread;
        public Long v_forum_id;
        public Zan zan;

        public Builder() {
        }

        public Builder(ReplyList replyList) {
            super(replyList);
            if (replyList != null) {
                this.thread_id = replyList.thread_id;
                this.post_id = replyList.post_id;
                this.time = replyList.time;
                this.title = replyList.title;
                this.fname = replyList.fname;
                this.content = replyList.content;
                this.is_floor = replyList.is_floor;
                this.quote_content = replyList.quote_content;
                this.replyer = replyList.replyer;
                this.type = replyList.type;
                this.unread = replyList.unread;
                this.item_type = replyList.item_type;
                this.zan = replyList.zan;
                this.quote_pid = replyList.quote_pid;
                this.quote_user = replyList.quote_user;
                this.server_time = replyList.server_time;
                this.thread_type = replyList.thread_type;
                this.v_forum_id = replyList.v_forum_id;
                this.hide_fname = replyList.hide_fname;
                this.is_story = replyList.is_story;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReplyList build(boolean z) {
            return new ReplyList(this, z);
        }
    }
}
