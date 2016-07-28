package tbclient;

import com.baidu.tieba.u;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class Post extends Message {
    public static final String DEFAULT_BIMG_URL = "";
    public static final String DEFAULT_IOS_BIMG_FORMAT = "";
    public static final String DEFAULT_LEGO_CARD = "";
    public static final String DEFAULT_TIME_EX = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_VOTE_CRYPT = "";
    @ProtoField(tag = 27)
    public final ActPost act_post;
    @ProtoField(tag = 16)
    public final AddPostList add_post_list;
    @ProtoField(tag = 20, type = Message.Datatype.UINT32)
    public final Integer add_post_number;
    @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.STRING)
    public final List<String> arr_video;
    @ProtoField(tag = 23)
    public final User author;
    @ProtoField(tag = 19, type = Message.Datatype.INT64)
    public final Long author_id;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String bimg_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<PbContent> content;
    @ProtoField(label = Message.Label.REPEATED, tag = 32)
    public final List<TailInfo> ext_tails;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer floor;
    @ProtoField(tag = 33)
    public final TogetherHi high_together;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long id;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String ios_bimg_format;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer is_bub;
    @ProtoField(tag = 31, type = Message.Datatype.INT32)
    public final Integer is_hot_post;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer is_ntitle;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer is_voice;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer is_vote;
    @ProtoField(tag = 7)
    public final Lbs lbs_info;
    @ProtoField(tag = u.l.PullToRefresh_tb_ptrDrawableTop, type = Message.Datatype.STRING)
    public final String lego_card;
    @ProtoField(tag = 35)
    public final DealInfo pb_deal_info;
    @ProtoField(tag = 30)
    public final PbPostZan post_zan;
    @ProtoField(tag = 28)
    public final PbPresent present;
    @ProtoField(tag = 21)
    public final SignatureData signature;
    @ProtoField(tag = u.l.PullToRefresh_tb_ptrRotateDrawableWhilePulling)
    public final SkinInfo skin_info;
    @ProtoField(tag = 25, type = Message.Datatype.INT32)
    public final Integer storecount;
    @ProtoField(tag = 15)
    public final SubPost sub_post_list;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer sub_post_number;
    @ProtoField(tag = 22)
    public final TailInfo tail_info;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer time;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String time_ex;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 26)
    public final TPointPost tpoint_post;
    @ProtoField(tag = 29)
    public final VideoInfo video_info;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String vote_crypt;
    @ProtoField(tag = 24)
    public final Zan zan;
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
    public static final Long DEFAULT_AUTHOR_ID = 0L;
    public static final Integer DEFAULT_ADD_POST_NUMBER = 0;
    public static final Integer DEFAULT_STORECOUNT = 0;
    public static final Integer DEFAULT_IS_HOT_POST = 0;
    public static final List<TailInfo> DEFAULT_EXT_TAILS = Collections.emptyList();

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
            this.add_post_list = builder.add_post_list;
            if (builder.bimg_url == null) {
                this.bimg_url = "";
            } else {
                this.bimg_url = builder.bimg_url;
            }
            if (builder.ios_bimg_format == null) {
                this.ios_bimg_format = "";
            } else {
                this.ios_bimg_format = builder.ios_bimg_format;
            }
            if (builder.author_id == null) {
                this.author_id = DEFAULT_AUTHOR_ID;
            } else {
                this.author_id = builder.author_id;
            }
            if (builder.add_post_number == null) {
                this.add_post_number = DEFAULT_ADD_POST_NUMBER;
            } else {
                this.add_post_number = builder.add_post_number;
            }
            this.signature = builder.signature;
            this.tail_info = builder.tail_info;
            this.author = builder.author;
            this.zan = builder.zan;
            if (builder.storecount == null) {
                this.storecount = DEFAULT_STORECOUNT;
            } else {
                this.storecount = builder.storecount;
            }
            this.tpoint_post = builder.tpoint_post;
            this.act_post = builder.act_post;
            this.present = builder.present;
            this.video_info = builder.video_info;
            this.post_zan = builder.post_zan;
            if (builder.is_hot_post == null) {
                this.is_hot_post = DEFAULT_IS_HOT_POST;
            } else {
                this.is_hot_post = builder.is_hot_post;
            }
            if (builder.ext_tails == null) {
                this.ext_tails = DEFAULT_EXT_TAILS;
            } else {
                this.ext_tails = immutableCopyOf(builder.ext_tails);
            }
            this.high_together = builder.high_together;
            this.skin_info = builder.skin_info;
            this.pb_deal_info = builder.pb_deal_info;
            if (builder.lego_card == null) {
                this.lego_card = "";
                return;
            } else {
                this.lego_card = builder.lego_card;
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
        this.add_post_list = builder.add_post_list;
        this.bimg_url = builder.bimg_url;
        this.ios_bimg_format = builder.ios_bimg_format;
        this.author_id = builder.author_id;
        this.add_post_number = builder.add_post_number;
        this.signature = builder.signature;
        this.tail_info = builder.tail_info;
        this.author = builder.author;
        this.zan = builder.zan;
        this.storecount = builder.storecount;
        this.tpoint_post = builder.tpoint_post;
        this.act_post = builder.act_post;
        this.present = builder.present;
        this.video_info = builder.video_info;
        this.post_zan = builder.post_zan;
        this.is_hot_post = builder.is_hot_post;
        this.ext_tails = immutableCopyOf(builder.ext_tails);
        this.high_together = builder.high_together;
        this.skin_info = builder.skin_info;
        this.pb_deal_info = builder.pb_deal_info;
        this.lego_card = builder.lego_card;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Post> {
        public ActPost act_post;
        public AddPostList add_post_list;
        public Integer add_post_number;
        public List<String> arr_video;
        public User author;
        public Long author_id;
        public String bimg_url;
        public List<PbContent> content;
        public List<TailInfo> ext_tails;
        public Integer floor;
        public TogetherHi high_together;
        public Long id;
        public String ios_bimg_format;
        public Integer is_bub;
        public Integer is_hot_post;
        public Integer is_ntitle;
        public Integer is_voice;
        public Integer is_vote;
        public Lbs lbs_info;
        public String lego_card;
        public DealInfo pb_deal_info;
        public PbPostZan post_zan;
        public PbPresent present;
        public SignatureData signature;
        public SkinInfo skin_info;
        public Integer storecount;
        public SubPost sub_post_list;
        public Integer sub_post_number;
        public TailInfo tail_info;
        public Integer time;
        public String time_ex;
        public String title;
        public TPointPost tpoint_post;
        public VideoInfo video_info;
        public String vote_crypt;
        public Zan zan;

        public Builder() {
        }

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
                this.add_post_list = post.add_post_list;
                this.bimg_url = post.bimg_url;
                this.ios_bimg_format = post.ios_bimg_format;
                this.author_id = post.author_id;
                this.add_post_number = post.add_post_number;
                this.signature = post.signature;
                this.tail_info = post.tail_info;
                this.author = post.author;
                this.zan = post.zan;
                this.storecount = post.storecount;
                this.tpoint_post = post.tpoint_post;
                this.act_post = post.act_post;
                this.present = post.present;
                this.video_info = post.video_info;
                this.post_zan = post.post_zan;
                this.is_hot_post = post.is_hot_post;
                this.ext_tails = Post.copyOf(post.ext_tails);
                this.high_together = post.high_together;
                this.skin_info = post.skin_info;
                this.pb_deal_info = post.pb_deal_info;
                this.lego_card = post.lego_card;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Post build(boolean z) {
            return new Post(this, z, null);
        }
    }
}
