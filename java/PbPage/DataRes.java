package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaLiveInfo;
import tbclient.Anti;
import tbclient.BannerList;
import tbclient.BusinessAccountInfo;
import tbclient.FineBannerPb;
import tbclient.ForumRuleStatus;
import tbclient.GraffitiRankListInfo;
import tbclient.Lbs;
import tbclient.ManagerElection;
import tbclient.NaGuide;
import tbclient.Page;
import tbclient.PbHotPost;
import tbclient.PbTopAgreePost;
import tbclient.Post;
import tbclient.Promotion;
import tbclient.PsRankListItem;
import tbclient.RecomTopicList;
import tbclient.RecommendThread;
import tbclient.SdkTopicThread;
import tbclient.SimpleForum;
import tbclient.SimpleUser;
import tbclient.ThreadInfo;
import tbclient.TwZhiBoAnti;
import tbclient.User;
/* loaded from: classes22.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_ASP_SHOWN_INFO = "";
    public static final String DEFAULT_FOLD_TIP = "";
    public static final String DEFAULT_JUMPTOTAB2 = "";
    public static final String DEFAULT_MULTI_FORUM_TEXT = "";
    public static final String DEFAULT_PARTIAL_VISIBLE_TOAST = "";
    @ProtoField(tag = 5)
    public final AddPost add_post;
    @ProtoField(tag = 26)
    public final AlaLiveInfo ala_info;
    @ProtoField(tag = 4)
    public final Anti anti;
    @ProtoField(tag = 22)
    public final AppealInfo appeal_info;
    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String asp_shown_info;
    @ProtoField(tag = 12)
    public final BannerList banner_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 52)
    public final List<ThreadInfo> bjh_recommend;
    @ProtoField(tag = 58)
    public final BusinessAccountInfo business_account_info;
    @ProtoField(tag = 53)
    public final BusinessPromotInfo business_promot_info;
    @ProtoField(tag = 39)
    public final SimpleForum display_forum;
    @ProtoField(tag = 46, type = Message.Datatype.INT32)
    public final Integer exp_guide_today;
    @ProtoField(tag = 45, type = Message.Datatype.INT32)
    public final Integer exp_news_today;
    @ProtoField(tag = 33)
    public final FeedExtInfo feed_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 30)
    public final List<ThreadInfo> feed_thread_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 17)
    public final List<FineBannerPb> fine_banner;
    @ProtoField(tag = 38)
    public final Post first_floor_post;
    @ProtoField(tag = 44, type = Message.Datatype.STRING)
    public final String fold_tip;
    @ProtoField(tag = 43)
    public final PbFollowTip follow_tip;
    @ProtoField(tag = 2)
    public final SimpleForum forum;
    @ProtoField(tag = 27)
    public final ForumHeadlineImgInfo forum_headline_img_info;
    @ProtoField(tag = 60)
    public final ForumRuleStatus forum_rule;
    @ProtoField(label = Message.Label.REPEATED, tag = 36)
    public final List<SimpleForum> from_forum_list;
    @ProtoField(tag = 23)
    public final GodCard god_card;
    @ProtoField(tag = 21)
    public final GraffitiRankListInfo graffiti_rank_list_info;
    @ProtoField(tag = 29)
    public final GuessLikeStruct guess_like;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer has_floor;
    @ProtoField(tag = 20)
    public final PbHotPost hot_post_list;
    @ProtoField(tag = 31, type = Message.Datatype.UINT32)
    public final Integer is_follow_current_channel;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_new_url;
    @ProtoField(tag = 56, type = Message.Datatype.INT32)
    public final Integer jumptotab1;
    @ProtoField(tag = 57, type = Message.Datatype.STRING)
    public final String jumptotab2;
    @ProtoField(tag = 9)
    public final Lbs location;
    @ProtoField(tag = 51)
    public final ManagerElection manager_election;
    @ProtoField(tag = 47, type = Message.Datatype.STRING)
    public final String multi_forum_text;
    @ProtoField(tag = 42)
    public final NaGuide na_guide;
    @ProtoField(label = Message.Label.REPEATED, tag = 40)
    public final List<SimpleUser> new_agree_user;
    @ProtoField(tag = 15)
    public final NewsInfo news_info;
    @ProtoField(tag = 3)
    public final Page page;
    @ProtoField(tag = 41, type = Message.Datatype.STRING)
    public final String partial_visible_toast;
    @ProtoField(label = Message.Label.REPEATED, tag = 49)
    public final List<PbSortType> pb_sort_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 24)
    public final List<PsRankListItem> play_rank_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 11)
    public final List<PostBanner> post_banner;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<Post> post_list;
    @ProtoField(tag = 54)
    public final Promotion promotion;
    @ProtoField(tag = 55)
    public final AlaLiveInfo recom_ala_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 59)
    public final List<ThreadInfo> recom_thread_info;
    @ProtoField(tag = 25)
    public final RecommendBook recommend_book;
    @ProtoField(label = Message.Label.REPEATED, tag = 16)
    public final List<RecommendThread> recommend_threads;
    @ProtoField(label = Message.Label.REPEATED, tag = 35)
    public final List<SimpleForum> repost_recommend_forum_list;
    @ProtoField(tag = 19)
    public final SdkTopicThread sdk_topic_thread;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer server_time;
    @ProtoField(tag = 50, type = Message.Datatype.INT32)
    public final Integer sort_type;
    @ProtoField(tag = 32, type = Message.Datatype.INT32)
    public final Integer switch_read_open;
    @ProtoField(tag = 8)
    public final ThreadInfo thread;
    @ProtoField(tag = 37, type = Message.Datatype.INT64)
    public final Long thread_freq_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 48)
    public final List<RecomTopicList> thread_topic;
    @ProtoField(tag = 34)
    public final PbTopAgreePost top_agree_post_list;
    @ProtoField(tag = 18)
    public final TwZhiBoAnti twzhibo_anti;
    @ProtoField(tag = 1)
    public final User user;
    @ProtoField(label = Message.Label.REPEATED, tag = 13)
    public final List<User> user_list;
    public static final List<Post> DEFAULT_POST_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_FLOOR = 0;
    public static final Integer DEFAULT_IS_NEW_URL = 0;
    public static final List<PostBanner> DEFAULT_POST_BANNER = Collections.emptyList();
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    public static final Integer DEFAULT_SERVER_TIME = 0;
    public static final List<RecommendThread> DEFAULT_RECOMMEND_THREADS = Collections.emptyList();
    public static final List<FineBannerPb> DEFAULT_FINE_BANNER = Collections.emptyList();
    public static final List<PsRankListItem> DEFAULT_PLAY_RANK_LIST = Collections.emptyList();
    public static final List<ThreadInfo> DEFAULT_FEED_THREAD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_IS_FOLLOW_CURRENT_CHANNEL = 0;
    public static final Integer DEFAULT_SWITCH_READ_OPEN = 0;
    public static final List<SimpleForum> DEFAULT_REPOST_RECOMMEND_FORUM_LIST = Collections.emptyList();
    public static final List<SimpleForum> DEFAULT_FROM_FORUM_LIST = Collections.emptyList();
    public static final Long DEFAULT_THREAD_FREQ_NUM = 0L;
    public static final List<SimpleUser> DEFAULT_NEW_AGREE_USER = Collections.emptyList();
    public static final Integer DEFAULT_EXP_NEWS_TODAY = 0;
    public static final Integer DEFAULT_EXP_GUIDE_TODAY = 0;
    public static final List<RecomTopicList> DEFAULT_THREAD_TOPIC = Collections.emptyList();
    public static final List<PbSortType> DEFAULT_PB_SORT_INFO = Collections.emptyList();
    public static final Integer DEFAULT_SORT_TYPE = 0;
    public static final List<ThreadInfo> DEFAULT_BJH_RECOMMEND = Collections.emptyList();
    public static final Integer DEFAULT_JUMPTOTAB1 = 0;
    public static final List<ThreadInfo> DEFAULT_RECOM_THREAD_INFO = Collections.emptyList();

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user = builder.user;
            this.forum = builder.forum;
            this.page = builder.page;
            this.anti = builder.anti;
            this.add_post = builder.add_post;
            if (builder.post_list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = immutableCopyOf(builder.post_list);
            }
            if (builder.has_floor == null) {
                this.has_floor = DEFAULT_HAS_FLOOR;
            } else {
                this.has_floor = builder.has_floor;
            }
            this.thread = builder.thread;
            this.location = builder.location;
            if (builder.is_new_url == null) {
                this.is_new_url = DEFAULT_IS_NEW_URL;
            } else {
                this.is_new_url = builder.is_new_url;
            }
            if (builder.post_banner == null) {
                this.post_banner = DEFAULT_POST_BANNER;
            } else {
                this.post_banner = immutableCopyOf(builder.post_banner);
            }
            this.banner_list = builder.banner_list;
            if (builder.user_list == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = immutableCopyOf(builder.user_list);
            }
            if (builder.server_time == null) {
                this.server_time = DEFAULT_SERVER_TIME;
            } else {
                this.server_time = builder.server_time;
            }
            this.news_info = builder.news_info;
            if (builder.recommend_threads == null) {
                this.recommend_threads = DEFAULT_RECOMMEND_THREADS;
            } else {
                this.recommend_threads = immutableCopyOf(builder.recommend_threads);
            }
            if (builder.fine_banner == null) {
                this.fine_banner = DEFAULT_FINE_BANNER;
            } else {
                this.fine_banner = immutableCopyOf(builder.fine_banner);
            }
            this.twzhibo_anti = builder.twzhibo_anti;
            this.sdk_topic_thread = builder.sdk_topic_thread;
            this.hot_post_list = builder.hot_post_list;
            this.graffiti_rank_list_info = builder.graffiti_rank_list_info;
            this.appeal_info = builder.appeal_info;
            this.god_card = builder.god_card;
            if (builder.play_rank_list == null) {
                this.play_rank_list = DEFAULT_PLAY_RANK_LIST;
            } else {
                this.play_rank_list = immutableCopyOf(builder.play_rank_list);
            }
            this.recommend_book = builder.recommend_book;
            this.ala_info = builder.ala_info;
            this.forum_headline_img_info = builder.forum_headline_img_info;
            if (builder.asp_shown_info == null) {
                this.asp_shown_info = "";
            } else {
                this.asp_shown_info = builder.asp_shown_info;
            }
            this.guess_like = builder.guess_like;
            if (builder.feed_thread_list == null) {
                this.feed_thread_list = DEFAULT_FEED_THREAD_LIST;
            } else {
                this.feed_thread_list = immutableCopyOf(builder.feed_thread_list);
            }
            if (builder.is_follow_current_channel == null) {
                this.is_follow_current_channel = DEFAULT_IS_FOLLOW_CURRENT_CHANNEL;
            } else {
                this.is_follow_current_channel = builder.is_follow_current_channel;
            }
            if (builder.switch_read_open == null) {
                this.switch_read_open = DEFAULT_SWITCH_READ_OPEN;
            } else {
                this.switch_read_open = builder.switch_read_open;
            }
            this.feed_info = builder.feed_info;
            this.top_agree_post_list = builder.top_agree_post_list;
            if (builder.repost_recommend_forum_list == null) {
                this.repost_recommend_forum_list = DEFAULT_REPOST_RECOMMEND_FORUM_LIST;
            } else {
                this.repost_recommend_forum_list = immutableCopyOf(builder.repost_recommend_forum_list);
            }
            if (builder.from_forum_list == null) {
                this.from_forum_list = DEFAULT_FROM_FORUM_LIST;
            } else {
                this.from_forum_list = immutableCopyOf(builder.from_forum_list);
            }
            if (builder.thread_freq_num == null) {
                this.thread_freq_num = DEFAULT_THREAD_FREQ_NUM;
            } else {
                this.thread_freq_num = builder.thread_freq_num;
            }
            this.first_floor_post = builder.first_floor_post;
            this.display_forum = builder.display_forum;
            if (builder.new_agree_user == null) {
                this.new_agree_user = DEFAULT_NEW_AGREE_USER;
            } else {
                this.new_agree_user = immutableCopyOf(builder.new_agree_user);
            }
            if (builder.partial_visible_toast == null) {
                this.partial_visible_toast = "";
            } else {
                this.partial_visible_toast = builder.partial_visible_toast;
            }
            this.na_guide = builder.na_guide;
            this.follow_tip = builder.follow_tip;
            if (builder.fold_tip == null) {
                this.fold_tip = "";
            } else {
                this.fold_tip = builder.fold_tip;
            }
            if (builder.exp_news_today == null) {
                this.exp_news_today = DEFAULT_EXP_NEWS_TODAY;
            } else {
                this.exp_news_today = builder.exp_news_today;
            }
            if (builder.exp_guide_today == null) {
                this.exp_guide_today = DEFAULT_EXP_GUIDE_TODAY;
            } else {
                this.exp_guide_today = builder.exp_guide_today;
            }
            if (builder.multi_forum_text == null) {
                this.multi_forum_text = "";
            } else {
                this.multi_forum_text = builder.multi_forum_text;
            }
            if (builder.thread_topic == null) {
                this.thread_topic = DEFAULT_THREAD_TOPIC;
            } else {
                this.thread_topic = immutableCopyOf(builder.thread_topic);
            }
            if (builder.pb_sort_info == null) {
                this.pb_sort_info = DEFAULT_PB_SORT_INFO;
            } else {
                this.pb_sort_info = immutableCopyOf(builder.pb_sort_info);
            }
            if (builder.sort_type == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
            } else {
                this.sort_type = builder.sort_type;
            }
            this.manager_election = builder.manager_election;
            if (builder.bjh_recommend == null) {
                this.bjh_recommend = DEFAULT_BJH_RECOMMEND;
            } else {
                this.bjh_recommend = immutableCopyOf(builder.bjh_recommend);
            }
            this.business_promot_info = builder.business_promot_info;
            this.promotion = builder.promotion;
            this.recom_ala_info = builder.recom_ala_info;
            if (builder.jumptotab1 == null) {
                this.jumptotab1 = DEFAULT_JUMPTOTAB1;
            } else {
                this.jumptotab1 = builder.jumptotab1;
            }
            if (builder.jumptotab2 == null) {
                this.jumptotab2 = "";
            } else {
                this.jumptotab2 = builder.jumptotab2;
            }
            this.business_account_info = builder.business_account_info;
            if (builder.recom_thread_info == null) {
                this.recom_thread_info = DEFAULT_RECOM_THREAD_INFO;
            } else {
                this.recom_thread_info = immutableCopyOf(builder.recom_thread_info);
            }
            this.forum_rule = builder.forum_rule;
            return;
        }
        this.user = builder.user;
        this.forum = builder.forum;
        this.page = builder.page;
        this.anti = builder.anti;
        this.add_post = builder.add_post;
        this.post_list = immutableCopyOf(builder.post_list);
        this.has_floor = builder.has_floor;
        this.thread = builder.thread;
        this.location = builder.location;
        this.is_new_url = builder.is_new_url;
        this.post_banner = immutableCopyOf(builder.post_banner);
        this.banner_list = builder.banner_list;
        this.user_list = immutableCopyOf(builder.user_list);
        this.server_time = builder.server_time;
        this.news_info = builder.news_info;
        this.recommend_threads = immutableCopyOf(builder.recommend_threads);
        this.fine_banner = immutableCopyOf(builder.fine_banner);
        this.twzhibo_anti = builder.twzhibo_anti;
        this.sdk_topic_thread = builder.sdk_topic_thread;
        this.hot_post_list = builder.hot_post_list;
        this.graffiti_rank_list_info = builder.graffiti_rank_list_info;
        this.appeal_info = builder.appeal_info;
        this.god_card = builder.god_card;
        this.play_rank_list = immutableCopyOf(builder.play_rank_list);
        this.recommend_book = builder.recommend_book;
        this.ala_info = builder.ala_info;
        this.forum_headline_img_info = builder.forum_headline_img_info;
        this.asp_shown_info = builder.asp_shown_info;
        this.guess_like = builder.guess_like;
        this.feed_thread_list = immutableCopyOf(builder.feed_thread_list);
        this.is_follow_current_channel = builder.is_follow_current_channel;
        this.switch_read_open = builder.switch_read_open;
        this.feed_info = builder.feed_info;
        this.top_agree_post_list = builder.top_agree_post_list;
        this.repost_recommend_forum_list = immutableCopyOf(builder.repost_recommend_forum_list);
        this.from_forum_list = immutableCopyOf(builder.from_forum_list);
        this.thread_freq_num = builder.thread_freq_num;
        this.first_floor_post = builder.first_floor_post;
        this.display_forum = builder.display_forum;
        this.new_agree_user = immutableCopyOf(builder.new_agree_user);
        this.partial_visible_toast = builder.partial_visible_toast;
        this.na_guide = builder.na_guide;
        this.follow_tip = builder.follow_tip;
        this.fold_tip = builder.fold_tip;
        this.exp_news_today = builder.exp_news_today;
        this.exp_guide_today = builder.exp_guide_today;
        this.multi_forum_text = builder.multi_forum_text;
        this.thread_topic = immutableCopyOf(builder.thread_topic);
        this.pb_sort_info = immutableCopyOf(builder.pb_sort_info);
        this.sort_type = builder.sort_type;
        this.manager_election = builder.manager_election;
        this.bjh_recommend = immutableCopyOf(builder.bjh_recommend);
        this.business_promot_info = builder.business_promot_info;
        this.promotion = builder.promotion;
        this.recom_ala_info = builder.recom_ala_info;
        this.jumptotab1 = builder.jumptotab1;
        this.jumptotab2 = builder.jumptotab2;
        this.business_account_info = builder.business_account_info;
        this.recom_thread_info = immutableCopyOf(builder.recom_thread_info);
        this.forum_rule = builder.forum_rule;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public AddPost add_post;
        public AlaLiveInfo ala_info;
        public Anti anti;
        public AppealInfo appeal_info;
        public String asp_shown_info;
        public BannerList banner_list;
        public List<ThreadInfo> bjh_recommend;
        public BusinessAccountInfo business_account_info;
        public BusinessPromotInfo business_promot_info;
        public SimpleForum display_forum;
        public Integer exp_guide_today;
        public Integer exp_news_today;
        public FeedExtInfo feed_info;
        public List<ThreadInfo> feed_thread_list;
        public List<FineBannerPb> fine_banner;
        public Post first_floor_post;
        public String fold_tip;
        public PbFollowTip follow_tip;
        public SimpleForum forum;
        public ForumHeadlineImgInfo forum_headline_img_info;
        public ForumRuleStatus forum_rule;
        public List<SimpleForum> from_forum_list;
        public GodCard god_card;
        public GraffitiRankListInfo graffiti_rank_list_info;
        public GuessLikeStruct guess_like;
        public Integer has_floor;
        public PbHotPost hot_post_list;
        public Integer is_follow_current_channel;
        public Integer is_new_url;
        public Integer jumptotab1;
        public String jumptotab2;
        public Lbs location;
        public ManagerElection manager_election;
        public String multi_forum_text;
        public NaGuide na_guide;
        public List<SimpleUser> new_agree_user;
        public NewsInfo news_info;
        public Page page;
        public String partial_visible_toast;
        public List<PbSortType> pb_sort_info;
        public List<PsRankListItem> play_rank_list;
        public List<PostBanner> post_banner;
        public List<Post> post_list;
        public Promotion promotion;
        public AlaLiveInfo recom_ala_info;
        public List<ThreadInfo> recom_thread_info;
        public RecommendBook recommend_book;
        public List<RecommendThread> recommend_threads;
        public List<SimpleForum> repost_recommend_forum_list;
        public SdkTopicThread sdk_topic_thread;
        public Integer server_time;
        public Integer sort_type;
        public Integer switch_read_open;
        public ThreadInfo thread;
        public Long thread_freq_num;
        public List<RecomTopicList> thread_topic;
        public PbTopAgreePost top_agree_post_list;
        public TwZhiBoAnti twzhibo_anti;
        public User user;
        public List<User> user_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.user = dataRes.user;
                this.forum = dataRes.forum;
                this.page = dataRes.page;
                this.anti = dataRes.anti;
                this.add_post = dataRes.add_post;
                this.post_list = DataRes.copyOf(dataRes.post_list);
                this.has_floor = dataRes.has_floor;
                this.thread = dataRes.thread;
                this.location = dataRes.location;
                this.is_new_url = dataRes.is_new_url;
                this.post_banner = DataRes.copyOf(dataRes.post_banner);
                this.banner_list = dataRes.banner_list;
                this.user_list = DataRes.copyOf(dataRes.user_list);
                this.server_time = dataRes.server_time;
                this.news_info = dataRes.news_info;
                this.recommend_threads = DataRes.copyOf(dataRes.recommend_threads);
                this.fine_banner = DataRes.copyOf(dataRes.fine_banner);
                this.twzhibo_anti = dataRes.twzhibo_anti;
                this.sdk_topic_thread = dataRes.sdk_topic_thread;
                this.hot_post_list = dataRes.hot_post_list;
                this.graffiti_rank_list_info = dataRes.graffiti_rank_list_info;
                this.appeal_info = dataRes.appeal_info;
                this.god_card = dataRes.god_card;
                this.play_rank_list = DataRes.copyOf(dataRes.play_rank_list);
                this.recommend_book = dataRes.recommend_book;
                this.ala_info = dataRes.ala_info;
                this.forum_headline_img_info = dataRes.forum_headline_img_info;
                this.asp_shown_info = dataRes.asp_shown_info;
                this.guess_like = dataRes.guess_like;
                this.feed_thread_list = DataRes.copyOf(dataRes.feed_thread_list);
                this.is_follow_current_channel = dataRes.is_follow_current_channel;
                this.switch_read_open = dataRes.switch_read_open;
                this.feed_info = dataRes.feed_info;
                this.top_agree_post_list = dataRes.top_agree_post_list;
                this.repost_recommend_forum_list = DataRes.copyOf(dataRes.repost_recommend_forum_list);
                this.from_forum_list = DataRes.copyOf(dataRes.from_forum_list);
                this.thread_freq_num = dataRes.thread_freq_num;
                this.first_floor_post = dataRes.first_floor_post;
                this.display_forum = dataRes.display_forum;
                this.new_agree_user = DataRes.copyOf(dataRes.new_agree_user);
                this.partial_visible_toast = dataRes.partial_visible_toast;
                this.na_guide = dataRes.na_guide;
                this.follow_tip = dataRes.follow_tip;
                this.fold_tip = dataRes.fold_tip;
                this.exp_news_today = dataRes.exp_news_today;
                this.exp_guide_today = dataRes.exp_guide_today;
                this.multi_forum_text = dataRes.multi_forum_text;
                this.thread_topic = DataRes.copyOf(dataRes.thread_topic);
                this.pb_sort_info = DataRes.copyOf(dataRes.pb_sort_info);
                this.sort_type = dataRes.sort_type;
                this.manager_election = dataRes.manager_election;
                this.bjh_recommend = DataRes.copyOf(dataRes.bjh_recommend);
                this.business_promot_info = dataRes.business_promot_info;
                this.promotion = dataRes.promotion;
                this.recom_ala_info = dataRes.recom_ala_info;
                this.jumptotab1 = dataRes.jumptotab1;
                this.jumptotab2 = dataRes.jumptotab2;
                this.business_account_info = dataRes.business_account_info;
                this.recom_thread_info = DataRes.copyOf(dataRes.recom_thread_info);
                this.forum_rule = dataRes.forum_rule;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
