package tbclient;

import com.baidu.tbadk.coreExtra.service.DealIntentService;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class Post extends Message {
    public static final String DEFAULT_BIMG_URL = "";
    public static final String DEFAULT_IOS_BIMG_FORMAT = "";
    public static final String DEFAULT_TIME_EX = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_VOTE_CRYPT = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 16)
    public final List<AddPostList> add_post_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.STRING)
    public final List<String> arr_video;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String bimg_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<PbContent> content;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer floor;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long id;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String ios_bimg_format;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer is_bub;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer is_ntitle;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer is_voice;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer is_vote;
    @ProtoField(tag = 7)
    public final Lbs lbs_info;
    @ProtoField(tag = 15)
    public final SubPost sub_post_list;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer sub_post_number;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer time;
    @ProtoField(tag = DealIntentService.CLASS_TYPE_GROUP_EVENT, type = Message.Datatype.STRING)
    public final String time_ex;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String vote_crypt;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_FLOOR = 0;
    public static final Integer DEFAULT_TIME = 0;
    public static final List<PbContent> DEFAULT_CONTENT = Collections.emptyList();
    public static final List<String> DEFAULT_ARR_VIDEO = Collections.emptyList();
    public static final Integer DEFAULT_IS_VOTE = 0;
    public static final Integer DEFAULT_IS_VOICE = 0;
    public static final Integer DEFAULT_IS_NTITLE = 0;
    public static final Integer DEFAULT_IS_BUB = 0;
    public static final Integer DEFAULT_SUB_POST_NUMBER = 0;
    public static final List<AddPostList> DEFAULT_ADD_POST_LIST = Collections.emptyList();

    /* synthetic */ Post(Builder builder, boolean z, Post post) {
        this(builder, z);
    }

    private Post(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.floor == null) {
                this.floor = DEFAULT_FLOOR;
            } else {
                this.floor = builder.floor;
            }
            if (builder.time == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = builder.time;
            }
            if (builder.content == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = immutableCopyOf(builder.content);
            }
            if (builder.arr_video == null) {
                this.arr_video = DEFAULT_ARR_VIDEO;
            } else {
                this.arr_video = immutableCopyOf(builder.arr_video);
            }
            this.lbs_info = builder.lbs_info;
            if (builder.is_vote == null) {
                this.is_vote = DEFAULT_IS_VOTE;
            } else {
                this.is_vote = builder.is_vote;
            }
            if (builder.is_voice == null) {
                this.is_voice = DEFAULT_IS_VOICE;
            } else {
                this.is_voice = builder.is_voice;
            }
            if (builder.is_ntitle == null) {
                this.is_ntitle = DEFAULT_IS_NTITLE;
            } else {
                this.is_ntitle = builder.is_ntitle;
            }
            if (builder.is_bub == null) {
                this.is_bub = DEFAULT_IS_BUB;
            } else {
                this.is_bub = builder.is_bub;
            }
            if (builder.vote_crypt == null) {
                this.vote_crypt = "";
            } else {
                this.vote_crypt = builder.vote_crypt;
            }
            if (builder.sub_post_number == null) {
                this.sub_post_number = DEFAULT_SUB_POST_NUMBER;
            } else {
                this.sub_post_number = builder.sub_post_number;
            }
            if (builder.time_ex == null) {
                this.time_ex = "";
            } else {
                this.time_ex = builder.time_ex;
            }
            this.sub_post_list = builder.sub_post_list;
            if (builder.add_post_list == null) {
                this.add_post_list = DEFAULT_ADD_POST_LIST;
            } else {
                this.add_post_list = immutableCopyOf(builder.add_post_list);
            }
            if (builder.bimg_url == null) {
                this.bimg_url = "";
            } else {
                this.bimg_url = builder.bimg_url;
            }
            if (builder.ios_bimg_format == null) {
                this.ios_bimg_format = "";
                return;
            } else {
                this.ios_bimg_format = builder.ios_bimg_format;
                return;
            }
        }
        this.id = builder.id;
        this.title = builder.title;
        this.floor = builder.floor;
        this.time = builder.time;
        this.content = immutableCopyOf(builder.content);
        this.arr_video = immutableCopyOf(builder.arr_video);
        this.lbs_info = builder.lbs_info;
        this.is_vote = builder.is_vote;
        this.is_voice = builder.is_voice;
        this.is_ntitle = builder.is_ntitle;
        this.is_bub = builder.is_bub;
        this.vote_crypt = builder.vote_crypt;
        this.sub_post_number = builder.sub_post_number;
        this.time_ex = builder.time_ex;
        this.sub_post_list = builder.sub_post_list;
        this.add_post_list = immutableCopyOf(builder.add_post_list);
        this.bimg_url = builder.bimg_url;
        this.ios_bimg_format = builder.ios_bimg_format;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<Post> {
        public List<AddPostList> add_post_list;
        public List<String> arr_video;
        public String bimg_url;
        public List<PbContent> content;
        public Integer floor;
        public Long id;
        public String ios_bimg_format;
        public Integer is_bub;
        public Integer is_ntitle;
        public Integer is_voice;
        public Integer is_vote;
        public Lbs lbs_info;
        public SubPost sub_post_list;
        public Integer sub_post_number;
        public Integer time;
        public String time_ex;
        public String title;
        public String vote_crypt;

        public Builder(Post post) {
            super(post);
            if (post != null) {
                this.id = post.id;
                this.title = post.title;
                this.floor = post.floor;
                this.time = post.time;
                this.content = Post.copyOf(post.content);
                this.arr_video = Post.copyOf(post.arr_video);
                this.lbs_info = post.lbs_info;
                this.is_vote = post.is_vote;
                this.is_voice = post.is_voice;
                this.is_ntitle = post.is_ntitle;
                this.is_bub = post.is_bub;
                this.vote_crypt = post.vote_crypt;
                this.sub_post_number = post.sub_post_number;
                this.time_ex = post.time_ex;
                this.sub_post_list = post.sub_post_list;
                this.add_post_list = Post.copyOf(post.add_post_list);
                this.bimg_url = post.bimg_url;
                this.ios_bimg_format = post.ios_bimg_format;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Post build(boolean z) {
            return new Post(this, z, null);
        }
    }
}
