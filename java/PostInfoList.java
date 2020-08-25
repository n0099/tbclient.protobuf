package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes16.dex */
public final class PostInfoList extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_ARTICLE_COVER = "";
    public static final String DEFAULT_CONTENT_THREAD = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_IP = "";
    public static final String DEFAULT_NAME_SHOW = "";
    public static final String DEFAULT_POST_TYPE = "";
    public static final String DEFAULT_PTYPE = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_PORTRAIT = "";
    public static final String DEFAULT_WONDERFUL_POST_INFO = "";
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(label = Message.Label.REPEATED, tag = 15)
    public final List<Abstract> abstract_thread;
    @ProtoField(tag = 40)
    public final Agree agree;
    @ProtoField(tag = 37, type = Message.Datatype.INT32)
    public final Integer agree_num;
    @ProtoField(tag = 36)
    public final AlaLiveInfo ala_info;
    @ProtoField(tag = 24)
    public final AnchorInfo anchor_info;
    @ProtoField(tag = 48, type = Message.Datatype.STRING)
    public final String article_cover;
    @ProtoField(tag = 50)
    public final BaijiahaoInfo baijiahao_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<PostInfoContent> content;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String content_thread;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 31)
    public final DealInfo deal_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 49)
    public final List<PbContent> first_post_content;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 33, type = Message.Datatype.INT32)
    public final Integer freq_num;
    @ProtoField(tag = 25, type = Message.Datatype.INT32)
    public final Integer hide_post;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String ip;
    @ProtoField(tag = 30, type = Message.Datatype.BOOL)
    public final Boolean is_deal;
    @ProtoField(tag = 47, type = Message.Datatype.INT32)
    public final Integer is_ntitle;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer is_post_deleted;
    @ProtoField(tag = 41, type = Message.Datatype.INT32)
    public final Integer is_remain;
    @ProtoField(tag = 44, type = Message.Datatype.INT32)
    public final Integer is_share_thread;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_thread;
    @ProtoField(tag = 43, type = Message.Datatype.INT32)
    public final Integer is_view_year;
    @ProtoField(tag = 52)
    public final Item item;
    @ProtoField(label = Message.Label.REPEATED, tag = 53)
    public final List<HeadItem> item_star;
    @ProtoField(tag = 21)
    public final LbsInfo lbs_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 16)
    public final List<Media> media;
    @ProtoField(label = Message.Label.REPEATED, tag = 32)
    public final List<MultipleForum> multiple_forum_list;
    @ProtoField(tag = 35, type = Message.Datatype.STRING)
    public final String name_show;
    @ProtoField(tag = 42)
    public final OriginThreadInfo origin_thread_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 55)
    public final List<PbGoodsInfo> pb_goods_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 54)
    public final List<PbLinkInfo> pb_link_info;
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
    @ProtoField(label = Message.Label.REPEATED, tag = 46)
    public final List<PbContent> rich_abstract;
    @ProtoField(label = Message.Label.REPEATED, tag = 45)
    public final List<PbContent> rich_title;
    @ProtoField(tag = 39, type = Message.Datatype.INT32)
    public final Integer share_num;
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
    @ProtoField(tag = 34, type = Message.Datatype.UINT64)
    public final Long v_forum_id;
    @ProtoField(tag = 29)
    public final VideoInfo video_info;
    @ProtoField(tag = 38, type = Message.Datatype.INT32)
    public final Integer view_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 23)
    public final List<Voice> voice_info;
    @ProtoField(tag = 51, type = Message.Datatype.STRING)
    public final String wonderful_post_info;
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
    public static final List<MultipleForum> DEFAULT_MULTIPLE_FORUM_LIST = Collections.emptyList();
    public static final Integer DEFAULT_FREQ_NUM = 0;
    public static final Long DEFAULT_V_FORUM_ID = 0L;
    public static final Integer DEFAULT_AGREE_NUM = 0;
    public static final Integer DEFAULT_VIEW_NUM = 0;
    public static final Integer DEFAULT_SHARE_NUM = 0;
    public static final Integer DEFAULT_IS_REMAIN = 0;
    public static final Integer DEFAULT_IS_VIEW_YEAR = 0;
    public static final Integer DEFAULT_IS_SHARE_THREAD = 0;
    public static final List<PbContent> DEFAULT_RICH_TITLE = Collections.emptyList();
    public static final List<PbContent> DEFAULT_RICH_ABSTRACT = Collections.emptyList();
    public static final Integer DEFAULT_IS_NTITLE = 0;
    public static final List<PbContent> DEFAULT_FIRST_POST_CONTENT = Collections.emptyList();
    public static final List<HeadItem> DEFAULT_ITEM_STAR = Collections.emptyList();
    public static final List<PbLinkInfo> DEFAULT_PB_LINK_INFO = Collections.emptyList();
    public static final List<PbGoodsInfo> DEFAULT_PB_GOODS_INFO = Collections.emptyList();

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
            if (builder.multiple_forum_list == null) {
                this.multiple_forum_list = DEFAULT_MULTIPLE_FORUM_LIST;
            } else {
                this.multiple_forum_list = immutableCopyOf(builder.multiple_forum_list);
            }
            if (builder.freq_num == null) {
                this.freq_num = DEFAULT_FREQ_NUM;
            } else {
                this.freq_num = builder.freq_num;
            }
            if (builder.v_forum_id == null) {
                this.v_forum_id = DEFAULT_V_FORUM_ID;
            } else {
                this.v_forum_id = builder.v_forum_id;
            }
            if (builder.name_show == null) {
                this.name_show = "";
            } else {
                this.name_show = builder.name_show;
            }
            this.ala_info = builder.ala_info;
            if (builder.agree_num == null) {
                this.agree_num = DEFAULT_AGREE_NUM;
            } else {
                this.agree_num = builder.agree_num;
            }
            if (builder.view_num == null) {
                this.view_num = DEFAULT_VIEW_NUM;
            } else {
                this.view_num = builder.view_num;
            }
            if (builder.share_num == null) {
                this.share_num = DEFAULT_SHARE_NUM;
            } else {
                this.share_num = builder.share_num;
            }
            this.agree = builder.agree;
            if (builder.is_remain == null) {
                this.is_remain = DEFAULT_IS_REMAIN;
            } else {
                this.is_remain = builder.is_remain;
            }
            this.origin_thread_info = builder.origin_thread_info;
            if (builder.is_view_year == null) {
                this.is_view_year = DEFAULT_IS_VIEW_YEAR;
            } else {
                this.is_view_year = builder.is_view_year;
            }
            if (builder.is_share_thread == null) {
                this.is_share_thread = DEFAULT_IS_SHARE_THREAD;
            } else {
                this.is_share_thread = builder.is_share_thread;
            }
            if (builder.rich_title == null) {
                this.rich_title = DEFAULT_RICH_TITLE;
            } else {
                this.rich_title = immutableCopyOf(builder.rich_title);
            }
            if (builder.rich_abstract == null) {
                this.rich_abstract = DEFAULT_RICH_ABSTRACT;
            } else {
                this.rich_abstract = immutableCopyOf(builder.rich_abstract);
            }
            if (builder.is_ntitle == null) {
                this.is_ntitle = DEFAULT_IS_NTITLE;
            } else {
                this.is_ntitle = builder.is_ntitle;
            }
            if (builder.article_cover == null) {
                this.article_cover = "";
            } else {
                this.article_cover = builder.article_cover;
            }
            if (builder.first_post_content == null) {
                this.first_post_content = DEFAULT_FIRST_POST_CONTENT;
            } else {
                this.first_post_content = immutableCopyOf(builder.first_post_content);
            }
            this.baijiahao_info = builder.baijiahao_info;
            if (builder.wonderful_post_info == null) {
                this.wonderful_post_info = "";
            } else {
                this.wonderful_post_info = builder.wonderful_post_info;
            }
            this.item = builder.item;
            if (builder.item_star == null) {
                this.item_star = DEFAULT_ITEM_STAR;
            } else {
                this.item_star = immutableCopyOf(builder.item_star);
            }
            if (builder.pb_link_info == null) {
                this.pb_link_info = DEFAULT_PB_LINK_INFO;
            } else {
                this.pb_link_info = immutableCopyOf(builder.pb_link_info);
            }
            if (builder.pb_goods_info == null) {
                this.pb_goods_info = DEFAULT_PB_GOODS_INFO;
                return;
            } else {
                this.pb_goods_info = immutableCopyOf(builder.pb_goods_info);
                return;
            }
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
        this.multiple_forum_list = immutableCopyOf(builder.multiple_forum_list);
        this.freq_num = builder.freq_num;
        this.v_forum_id = builder.v_forum_id;
        this.name_show = builder.name_show;
        this.ala_info = builder.ala_info;
        this.agree_num = builder.agree_num;
        this.view_num = builder.view_num;
        this.share_num = builder.share_num;
        this.agree = builder.agree;
        this.is_remain = builder.is_remain;
        this.origin_thread_info = builder.origin_thread_info;
        this.is_view_year = builder.is_view_year;
        this.is_share_thread = builder.is_share_thread;
        this.rich_title = immutableCopyOf(builder.rich_title);
        this.rich_abstract = immutableCopyOf(builder.rich_abstract);
        this.is_ntitle = builder.is_ntitle;
        this.article_cover = builder.article_cover;
        this.first_post_content = immutableCopyOf(builder.first_post_content);
        this.baijiahao_info = builder.baijiahao_info;
        this.wonderful_post_info = builder.wonderful_post_info;
        this.item = builder.item;
        this.item_star = immutableCopyOf(builder.item_star);
        this.pb_link_info = immutableCopyOf(builder.pb_link_info);
        this.pb_goods_info = immutableCopyOf(builder.pb_goods_info);
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<PostInfoList> {
        public String _abstract;
        public List<Abstract> abstract_thread;
        public Agree agree;
        public Integer agree_num;
        public AlaLiveInfo ala_info;
        public AnchorInfo anchor_info;
        public String article_cover;
        public BaijiahaoInfo baijiahao_info;
        public List<PostInfoContent> content;
        public String content_thread;
        public Integer create_time;
        public DealInfo deal_info;
        public List<PbContent> first_post_content;
        public Long forum_id;
        public String forum_name;
        public Integer freq_num;
        public Integer hide_post;
        public String ip;
        public Boolean is_deal;
        public Integer is_ntitle;
        public Integer is_post_deleted;
        public Integer is_remain;
        public Integer is_share_thread;
        public Integer is_thread;
        public Integer is_view_year;
        public Item item;
        public List<HeadItem> item_star;
        public LbsInfo lbs_info;
        public List<Media> media;
        public List<MultipleForum> multiple_forum_list;
        public String name_show;
        public OriginThreadInfo origin_thread_info;
        public List<PbGoodsInfo> pb_goods_info;
        public List<PbLinkInfo> pb_link_info;
        public PollInfo poll_info;
        public Long post_id;
        public String post_type;
        public String ptype;
        public Quote quote;
        public Integer reply_num;
        public List<PbContent> rich_abstract;
        public List<PbContent> rich_title;
        public Integer share_num;
        public Long thread_id;
        public Long thread_type;
        public String title;
        public ZhiBoInfoTW twzhibo_info;
        public Long user_id;
        public String user_name;
        public String user_portrait;
        public Long v_forum_id;
        public VideoInfo video_info;
        public Integer view_num;
        public List<Voice> voice_info;
        public String wonderful_post_info;

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
                this.multiple_forum_list = PostInfoList.copyOf(postInfoList.multiple_forum_list);
                this.freq_num = postInfoList.freq_num;
                this.v_forum_id = postInfoList.v_forum_id;
                this.name_show = postInfoList.name_show;
                this.ala_info = postInfoList.ala_info;
                this.agree_num = postInfoList.agree_num;
                this.view_num = postInfoList.view_num;
                this.share_num = postInfoList.share_num;
                this.agree = postInfoList.agree;
                this.is_remain = postInfoList.is_remain;
                this.origin_thread_info = postInfoList.origin_thread_info;
                this.is_view_year = postInfoList.is_view_year;
                this.is_share_thread = postInfoList.is_share_thread;
                this.rich_title = PostInfoList.copyOf(postInfoList.rich_title);
                this.rich_abstract = PostInfoList.copyOf(postInfoList.rich_abstract);
                this.is_ntitle = postInfoList.is_ntitle;
                this.article_cover = postInfoList.article_cover;
                this.first_post_content = PostInfoList.copyOf(postInfoList.first_post_content);
                this.baijiahao_info = postInfoList.baijiahao_info;
                this.wonderful_post_info = postInfoList.wonderful_post_info;
                this.item = postInfoList.item;
                this.item_star = PostInfoList.copyOf(postInfoList.item_star);
                this.pb_link_info = PostInfoList.copyOf(postInfoList.pb_link_info);
                this.pb_goods_info = PostInfoList.copyOf(postInfoList.pb_goods_info);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostInfoList build(boolean z) {
            return new PostInfoList(this, z);
        }
    }
}
