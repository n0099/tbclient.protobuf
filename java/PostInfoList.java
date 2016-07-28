package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class PostInfoList extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_CONTENT_THREAD = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_IP = "";
    public static final String DEFAULT_POST_TYPE = "";
    public static final String DEFAULT_PTYPE = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_PORTRAIT = "";
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(label = Message.Label.REPEATED, tag = 15)
    public final List<Abstract> abstract_thread;
    @ProtoField(tag = 24)
    public final AnchorInfo anchor_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<PostInfoContent> content;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String content_thread;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 31)
    public final DealInfo deal_info;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 25, type = Message.Datatype.INT32)
    public final Integer hide_post;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String ip;
    @ProtoField(tag = 30, type = Message.Datatype.BOOL)
    public final Boolean is_deal;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer is_post_deleted;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_thread;
    @ProtoField(tag = 21)
    public final LbsInfo lbs_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 16)
    public final List<Media> media;
    @ProtoField(tag = 28)
    public final PollInfo poll_info;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long post_id;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String post_type;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String ptype;
    @ProtoField(tag = 22)
    public final Quote quote;
    @ProtoField(tag = 17, type = Message.Datatype.UINT32)
    public final Integer reply_num;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 26, type = Message.Datatype.UINT64)
    public final Long thread_type;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 27)
    public final ZhiBoInfoTW twzhibo_info;
    @ProtoField(tag = 18, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String user_portrait;
    @ProtoField(tag = 29)
    public final VideoInfo video_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 23)
    public final List<Voice> voice_info;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Integer DEFAULT_IS_THREAD = 0;
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final List<PostInfoContent> DEFAULT_CONTENT = Collections.emptyList();
    public static final Integer DEFAULT_IS_POST_DELETED = 0;
    public static final List<Abstract> DEFAULT_ABSTRACT_THREAD = Collections.emptyList();
    public static final List<Media> DEFAULT_MEDIA = Collections.emptyList();
    public static final Integer DEFAULT_REPLY_NUM = 0;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final List<Voice> DEFAULT_VOICE_INFO = Collections.emptyList();
    public static final Integer DEFAULT_HIDE_POST = 0;
    public static final Long DEFAULT_THREAD_TYPE = 0L;
    public static final Boolean DEFAULT_IS_DEAL = false;

    /* synthetic */ PostInfoList(Builder builder, boolean z, PostInfoList postInfoList) {
        this(builder, z);
    }

    private PostInfoList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
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
            if (builder.is_thread == null) {
                this.is_thread = DEFAULT_IS_THREAD;
            } else {
                this.is_thread = builder.is_thread;
            }
            if (builder.create_time == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = builder.create_time;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.content == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = immutableCopyOf(builder.content);
            }
            if (builder.content_thread == null) {
                this.content_thread = "";
            } else {
                this.content_thread = builder.content_thread;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.ip == null) {
                this.ip = "";
            } else {
                this.ip = builder.ip;
            }
            if (builder.is_post_deleted == null) {
                this.is_post_deleted = DEFAULT_IS_POST_DELETED;
            } else {
                this.is_post_deleted = builder.is_post_deleted;
            }
            if (builder.ptype == null) {
                this.ptype = "";
            } else {
                this.ptype = builder.ptype;
            }
            if (builder._abstract == null) {
                this._abstract = "";
            } else {
                this._abstract = builder._abstract;
            }
            if (builder.abstract_thread == null) {
                this.abstract_thread = DEFAULT_ABSTRACT_THREAD;
            } else {
                this.abstract_thread = immutableCopyOf(builder.abstract_thread);
            }
            if (builder.media == null) {
                this.media = DEFAULT_MEDIA;
            } else {
                this.media = immutableCopyOf(builder.media);
            }
            if (builder.reply_num == null) {
                this.reply_num = DEFAULT_REPLY_NUM;
            } else {
                this.reply_num = builder.reply_num;
            }
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.user_portrait == null) {
                this.user_portrait = "";
            } else {
                this.user_portrait = builder.user_portrait;
            }
            if (builder.post_type == null) {
                this.post_type = "";
            } else {
                this.post_type = builder.post_type;
            }
            this.lbs_info = builder.lbs_info;
            this.quote = builder.quote;
            if (builder.voice_info == null) {
                this.voice_info = DEFAULT_VOICE_INFO;
            } else {
                this.voice_info = immutableCopyOf(builder.voice_info);
            }
            this.anchor_info = builder.anchor_info;
            if (builder.hide_post == null) {
                this.hide_post = DEFAULT_HIDE_POST;
            } else {
                this.hide_post = builder.hide_post;
            }
            if (builder.thread_type == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = builder.thread_type;
            }
            this.twzhibo_info = builder.twzhibo_info;
            this.poll_info = builder.poll_info;
            this.video_info = builder.video_info;
            if (builder.is_deal == null) {
                this.is_deal = DEFAULT_IS_DEAL;
            } else {
                this.is_deal = builder.is_deal;
            }
            this.deal_info = builder.deal_info;
            return;
        }
        this.forum_id = builder.forum_id;
        this.thread_id = builder.thread_id;
        this.post_id = builder.post_id;
        this.is_thread = builder.is_thread;
        this.create_time = builder.create_time;
        this.forum_name = builder.forum_name;
        this.title = builder.title;
        this.content = immutableCopyOf(builder.content);
        this.content_thread = builder.content_thread;
        this.user_name = builder.user_name;
        this.ip = builder.ip;
        this.is_post_deleted = builder.is_post_deleted;
        this.ptype = builder.ptype;
        this._abstract = builder._abstract;
        this.abstract_thread = immutableCopyOf(builder.abstract_thread);
        this.media = immutableCopyOf(builder.media);
        this.reply_num = builder.reply_num;
        this.user_id = builder.user_id;
        this.user_portrait = builder.user_portrait;
        this.post_type = builder.post_type;
        this.lbs_info = builder.lbs_info;
        this.quote = builder.quote;
        this.voice_info = immutableCopyOf(builder.voice_info);
        this.anchor_info = builder.anchor_info;
        this.hide_post = builder.hide_post;
        this.thread_type = builder.thread_type;
        this.twzhibo_info = builder.twzhibo_info;
        this.poll_info = builder.poll_info;
        this.video_info = builder.video_info;
        this.is_deal = builder.is_deal;
        this.deal_info = builder.deal_info;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<PostInfoList> {
        public String _abstract;
        public List<Abstract> abstract_thread;
        public AnchorInfo anchor_info;
        public List<PostInfoContent> content;
        public String content_thread;
        public Integer create_time;
        public DealInfo deal_info;
        public Long forum_id;
        public String forum_name;
        public Integer hide_post;
        public String ip;
        public Boolean is_deal;
        public Integer is_post_deleted;
        public Integer is_thread;
        public LbsInfo lbs_info;
        public List<Media> media;
        public PollInfo poll_info;
        public Long post_id;
        public String post_type;
        public String ptype;
        public Quote quote;
        public Integer reply_num;
        public Long thread_id;
        public Long thread_type;
        public String title;
        public ZhiBoInfoTW twzhibo_info;
        public Long user_id;
        public String user_name;
        public String user_portrait;
        public VideoInfo video_info;
        public List<Voice> voice_info;

        public Builder() {
        }

        public Builder(PostInfoList postInfoList) {
            super(postInfoList);
            if (postInfoList != null) {
                this.forum_id = postInfoList.forum_id;
                this.thread_id = postInfoList.thread_id;
                this.post_id = postInfoList.post_id;
                this.is_thread = postInfoList.is_thread;
                this.create_time = postInfoList.create_time;
                this.forum_name = postInfoList.forum_name;
                this.title = postInfoList.title;
                this.content = PostInfoList.copyOf(postInfoList.content);
                this.content_thread = postInfoList.content_thread;
                this.user_name = postInfoList.user_name;
                this.ip = postInfoList.ip;
                this.is_post_deleted = postInfoList.is_post_deleted;
                this.ptype = postInfoList.ptype;
                this._abstract = postInfoList._abstract;
                this.abstract_thread = PostInfoList.copyOf(postInfoList.abstract_thread);
                this.media = PostInfoList.copyOf(postInfoList.media);
                this.reply_num = postInfoList.reply_num;
                this.user_id = postInfoList.user_id;
                this.user_portrait = postInfoList.user_portrait;
                this.post_type = postInfoList.post_type;
                this.lbs_info = postInfoList.lbs_info;
                this.quote = postInfoList.quote;
                this.voice_info = PostInfoList.copyOf(postInfoList.voice_info);
                this.anchor_info = postInfoList.anchor_info;
                this.hide_post = postInfoList.hide_post;
                this.thread_type = postInfoList.thread_type;
                this.twzhibo_info = postInfoList.twzhibo_info;
                this.poll_info = postInfoList.poll_info;
                this.video_info = postInfoList.video_info;
                this.is_deal = postInfoList.is_deal;
                this.deal_info = postInfoList.deal_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostInfoList build(boolean z) {
            return new PostInfoList(this, z, null);
        }
    }
}
