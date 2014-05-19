package tbclient.UserPost;

import com.baidu.sapi2.SapiAccountManager;
import com.baidu.tbadk.TbConfig;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Abstract;
import tbclient.AnchorInfo;
import tbclient.Media;
import tbclient.Voice;
/* loaded from: classes.dex */
public final class PostList extends Message {
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
    @ProtoField(tag = SapiAccountManager.VERSION_CODE)
    public final AnchorInfo anchor_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<Content> content;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String content_thread;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String ip;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer is_post_deleted;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_thread;
    @ProtoField(tag = TbConfig.NOTIFY_LIVE_NOTIFY)
    public final LbsInfo lbs_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 16)
    public final List<Media> media;
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
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 18, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String user_portrait;
    @ProtoField(label = Message.Label.REPEATED, tag = 23)
    public final List<Voice> voice_info;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Integer DEFAULT_IS_THREAD = 0;
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final List<Content> DEFAULT_CONTENT = Collections.emptyList();
    public static final Integer DEFAULT_IS_POST_DELETED = 0;
    public static final List<Abstract> DEFAULT_ABSTRACT_THREAD = Collections.emptyList();
    public static final List<Media> DEFAULT_MEDIA = Collections.emptyList();
    public static final Integer DEFAULT_REPLY_NUM = 0;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final List<Voice> DEFAULT_VOICE_INFO = Collections.emptyList();

    /* synthetic */ PostList(Builder builder, boolean z, PostList postList) {
        this(builder, z);
    }

    private PostList(Builder builder, boolean z) {
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
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<PostList> {
        public String _abstract;
        public List<Abstract> abstract_thread;
        public AnchorInfo anchor_info;
        public List<Content> content;
        public String content_thread;
        public Integer create_time;
        public Long forum_id;
        public String forum_name;
        public String ip;
        public Integer is_post_deleted;
        public Integer is_thread;
        public LbsInfo lbs_info;
        public List<Media> media;
        public Long post_id;
        public String post_type;
        public String ptype;
        public Quote quote;
        public Integer reply_num;
        public Long thread_id;
        public String title;
        public Long user_id;
        public String user_name;
        public String user_portrait;
        public List<Voice> voice_info;

        public Builder(PostList postList) {
            super(postList);
            if (postList != null) {
                this.forum_id = postList.forum_id;
                this.thread_id = postList.thread_id;
                this.post_id = postList.post_id;
                this.is_thread = postList.is_thread;
                this.create_time = postList.create_time;
                this.forum_name = postList.forum_name;
                this.title = postList.title;
                this.content = PostList.copyOf(postList.content);
                this.content_thread = postList.content_thread;
                this.user_name = postList.user_name;
                this.ip = postList.ip;
                this.is_post_deleted = postList.is_post_deleted;
                this.ptype = postList.ptype;
                this._abstract = postList._abstract;
                this.abstract_thread = PostList.copyOf(postList.abstract_thread);
                this.media = PostList.copyOf(postList.media);
                this.reply_num = postList.reply_num;
                this.user_id = postList.user_id;
                this.user_portrait = postList.user_portrait;
                this.post_type = postList.post_type;
                this.lbs_info = postList.lbs_info;
                this.quote = postList.quote;
                this.voice_info = PostList.copyOf(postList.voice_info);
                this.anchor_info = postList.anchor_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostList build(boolean z) {
            return new PostList(this, z, null);
        }
    }
}
