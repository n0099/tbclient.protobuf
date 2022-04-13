package PbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
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
import tbclient.PbPage.AddPost;
import tbclient.PbPage.AppealInfo;
import tbclient.PbPage.BusinessPromotInfo;
import tbclient.PbPage.FeedExtInfo;
import tbclient.PbPage.FloatingIcon;
import tbclient.PbPage.ForumHeadlineImgInfo;
import tbclient.PbPage.GodCard;
import tbclient.PbPage.GuessLikeStruct;
import tbclient.PbPage.NewsInfo;
import tbclient.PbPage.PbFollowTip;
import tbclient.PbPage.PbSortType;
import tbclient.PbPage.PostBanner;
import tbclient.PbPage.RecommendBook;
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

public final class DataRes extends Message {
  public static final String DEFAULT_ASP_SHOWN_INFO = "";
  
  public static final List<ThreadInfo> DEFAULT_BJH_RECOMMEND;
  
  public static final Integer DEFAULT_EXP_GUIDE_TODAY;
  
  public static final Integer DEFAULT_EXP_NEWS_TODAY;
  
  public static final List<ThreadInfo> DEFAULT_FEED_THREAD_LIST;
  
  public static final List<FineBannerPb> DEFAULT_FINE_BANNER;
  
  public static final Long DEFAULT_FOLD_COMMENT_NUM;
  
  public static final String DEFAULT_FOLD_TIP = "";
  
  public static final List<SimpleForum> DEFAULT_FROM_FORUM_LIST;
  
  public static final Integer DEFAULT_HAS_FLOOR;
  
  public static final Integer DEFAULT_HAS_FOLD_COMMENT;
  
  public static final Integer DEFAULT_IS_BLACK_WHITE;
  
  public static final Integer DEFAULT_IS_FOLLOW_CURRENT_CHANNEL;
  
  public static final Integer DEFAULT_IS_NEW_URL;
  
  public static final Integer DEFAULT_IS_OFFICIAL_FORUM;
  
  public static final Integer DEFAULT_IS_PURCHASE;
  
  public static final Integer DEFAULT_JUMPTOTAB1;
  
  public static final String DEFAULT_JUMPTOTAB2 = "";
  
  public static final String DEFAULT_MULTI_FORUM_TEXT = "";
  
  public static final List<SimpleUser> DEFAULT_NEW_AGREE_USER;
  
  public static final String DEFAULT_PARTIAL_VISIBLE_TOAST = "";
  
  public static final String DEFAULT_PB_NOTICE = "";
  
  public static final Integer DEFAULT_PB_NOTICE_TYPE;
  
  public static final List<PbSortType> DEFAULT_PB_SORT_INFO;
  
  public static final List<PsRankListItem> DEFAULT_PLAY_RANK_LIST;
  
  public static final List<PostBanner> DEFAULT_POST_BANNER;
  
  public static final List<Post> DEFAULT_POST_LIST = Collections.emptyList();
  
  public static final List<RecommendThread> DEFAULT_RECOMMEND_THREADS;
  
  public static final List<ThreadInfo> DEFAULT_RECOM_THREAD_INFO;
  
  public static final List<SimpleForum> DEFAULT_REPOST_RECOMMEND_FORUM_LIST;
  
  public static final Integer DEFAULT_SERVER_TIME;
  
  public static final Integer DEFAULT_SHOW_ADSENSE;
  
  public static final Integer DEFAULT_SORT_TYPE;
  
  public static final Integer DEFAULT_SWITCH_READ_OPEN;
  
  public static final Long DEFAULT_THREAD_FREQ_NUM;
  
  public static final List<RecomTopicList> DEFAULT_THREAD_TOPIC;
  
  public static final List<User> DEFAULT_USER_LIST;
  
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
  
  @ProtoField(tag = 64)
  public final FloatingIcon floating_icon;
  
  @ProtoField(tag = 70, type = Message.Datatype.INT64)
  public final Long fold_comment_num;
  
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
  
  @ProtoField(tag = 68, type = Message.Datatype.INT32)
  public final Integer has_fold_comment;
  
  @ProtoField(tag = 20)
  public final PbHotPost hot_post_list;
  
  @ProtoField(tag = 62, type = Message.Datatype.INT32)
  public final Integer is_black_white;
  
  @ProtoField(tag = 31, type = Message.Datatype.UINT32)
  public final Integer is_follow_current_channel;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer is_new_url;
  
  @ProtoField(tag = 63, type = Message.Datatype.INT32)
  public final Integer is_official_forum;
  
  @ProtoField(tag = 65, type = Message.Datatype.INT32)
  public final Integer is_purchase;
  
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
  
  @ProtoField(tag = 67, type = Message.Datatype.STRING)
  public final String pb_notice;
  
  @ProtoField(tag = 66, type = Message.Datatype.INT32)
  public final Integer pb_notice_type;
  
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
  
  @ProtoField(tag = 61, type = Message.Datatype.INT32)
  public final Integer show_adsense;
  
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
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_HAS_FLOOR = integer;
    DEFAULT_IS_NEW_URL = integer;
    DEFAULT_POST_BANNER = Collections.emptyList();
    DEFAULT_USER_LIST = Collections.emptyList();
    DEFAULT_SERVER_TIME = integer;
    DEFAULT_RECOMMEND_THREADS = Collections.emptyList();
    DEFAULT_FINE_BANNER = Collections.emptyList();
    DEFAULT_PLAY_RANK_LIST = Collections.emptyList();
    DEFAULT_FEED_THREAD_LIST = Collections.emptyList();
    DEFAULT_IS_FOLLOW_CURRENT_CHANNEL = integer;
    DEFAULT_SWITCH_READ_OPEN = integer;
    DEFAULT_REPOST_RECOMMEND_FORUM_LIST = Collections.emptyList();
    DEFAULT_FROM_FORUM_LIST = Collections.emptyList();
    Long long_ = Long.valueOf(0L);
    DEFAULT_THREAD_FREQ_NUM = long_;
    DEFAULT_NEW_AGREE_USER = Collections.emptyList();
    DEFAULT_EXP_NEWS_TODAY = integer;
    DEFAULT_EXP_GUIDE_TODAY = integer;
    DEFAULT_THREAD_TOPIC = Collections.emptyList();
    DEFAULT_PB_SORT_INFO = Collections.emptyList();
    DEFAULT_SORT_TYPE = integer;
    DEFAULT_BJH_RECOMMEND = Collections.emptyList();
    DEFAULT_JUMPTOTAB1 = integer;
    DEFAULT_RECOM_THREAD_INFO = Collections.emptyList();
    DEFAULT_SHOW_ADSENSE = integer;
    DEFAULT_IS_BLACK_WHITE = integer;
    DEFAULT_IS_OFFICIAL_FORUM = integer;
    DEFAULT_IS_PURCHASE = integer;
    DEFAULT_PB_NOTICE_TYPE = integer;
    DEFAULT_HAS_FOLD_COMMENT = integer;
    DEFAULT_FOLD_COMMENT_NUM = long_;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      this.user = paramBuilder.user;
      this.forum = paramBuilder.forum;
      this.page = paramBuilder.page;
      this.anti = paramBuilder.anti;
      this.add_post = paramBuilder.add_post;
      List list9 = paramBuilder.post_list;
      if (list9 == null) {
        this.post_list = DEFAULT_POST_LIST;
      } else {
        this.post_list = Message.immutableCopyOf(list9);
      } 
      Integer integer8 = paramBuilder.has_floor;
      if (integer8 == null) {
        this.has_floor = DEFAULT_HAS_FLOOR;
      } else {
        this.has_floor = integer8;
      } 
      this.thread = paramBuilder.thread;
      this.location = paramBuilder.location;
      integer8 = paramBuilder.is_new_url;
      if (integer8 == null) {
        this.is_new_url = DEFAULT_IS_NEW_URL;
      } else {
        this.is_new_url = integer8;
      } 
      List list8 = paramBuilder.post_banner;
      if (list8 == null) {
        this.post_banner = DEFAULT_POST_BANNER;
      } else {
        this.post_banner = Message.immutableCopyOf(list8);
      } 
      this.banner_list = paramBuilder.banner_list;
      list8 = paramBuilder.user_list;
      if (list8 == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list8);
      } 
      Integer integer7 = paramBuilder.server_time;
      if (integer7 == null) {
        this.server_time = DEFAULT_SERVER_TIME;
      } else {
        this.server_time = integer7;
      } 
      this.news_info = paramBuilder.news_info;
      List list7 = paramBuilder.recommend_threads;
      if (list7 == null) {
        this.recommend_threads = DEFAULT_RECOMMEND_THREADS;
      } else {
        this.recommend_threads = Message.immutableCopyOf(list7);
      } 
      list7 = paramBuilder.fine_banner;
      if (list7 == null) {
        this.fine_banner = DEFAULT_FINE_BANNER;
      } else {
        this.fine_banner = Message.immutableCopyOf(list7);
      } 
      this.twzhibo_anti = paramBuilder.twzhibo_anti;
      this.sdk_topic_thread = paramBuilder.sdk_topic_thread;
      this.hot_post_list = paramBuilder.hot_post_list;
      this.graffiti_rank_list_info = paramBuilder.graffiti_rank_list_info;
      this.appeal_info = paramBuilder.appeal_info;
      this.god_card = paramBuilder.god_card;
      list7 = paramBuilder.play_rank_list;
      if (list7 == null) {
        this.play_rank_list = DEFAULT_PLAY_RANK_LIST;
      } else {
        this.play_rank_list = Message.immutableCopyOf(list7);
      } 
      this.recommend_book = paramBuilder.recommend_book;
      this.ala_info = paramBuilder.ala_info;
      this.forum_headline_img_info = paramBuilder.forum_headline_img_info;
      String str5 = paramBuilder.asp_shown_info;
      if (str5 == null) {
        this.asp_shown_info = "";
      } else {
        this.asp_shown_info = str5;
      } 
      this.guess_like = paramBuilder.guess_like;
      List list6 = paramBuilder.feed_thread_list;
      if (list6 == null) {
        this.feed_thread_list = DEFAULT_FEED_THREAD_LIST;
      } else {
        this.feed_thread_list = Message.immutableCopyOf(list6);
      } 
      Integer integer6 = paramBuilder.is_follow_current_channel;
      if (integer6 == null) {
        this.is_follow_current_channel = DEFAULT_IS_FOLLOW_CURRENT_CHANNEL;
      } else {
        this.is_follow_current_channel = integer6;
      } 
      integer6 = paramBuilder.switch_read_open;
      if (integer6 == null) {
        this.switch_read_open = DEFAULT_SWITCH_READ_OPEN;
      } else {
        this.switch_read_open = integer6;
      } 
      this.feed_info = paramBuilder.feed_info;
      this.top_agree_post_list = paramBuilder.top_agree_post_list;
      List list5 = paramBuilder.repost_recommend_forum_list;
      if (list5 == null) {
        this.repost_recommend_forum_list = DEFAULT_REPOST_RECOMMEND_FORUM_LIST;
      } else {
        this.repost_recommend_forum_list = Message.immutableCopyOf(list5);
      } 
      list5 = paramBuilder.from_forum_list;
      if (list5 == null) {
        this.from_forum_list = DEFAULT_FROM_FORUM_LIST;
      } else {
        this.from_forum_list = Message.immutableCopyOf(list5);
      } 
      Long long_1 = paramBuilder.thread_freq_num;
      if (long_1 == null) {
        this.thread_freq_num = DEFAULT_THREAD_FREQ_NUM;
      } else {
        this.thread_freq_num = long_1;
      } 
      this.first_floor_post = paramBuilder.first_floor_post;
      this.display_forum = paramBuilder.display_forum;
      List list4 = paramBuilder.new_agree_user;
      if (list4 == null) {
        this.new_agree_user = DEFAULT_NEW_AGREE_USER;
      } else {
        this.new_agree_user = Message.immutableCopyOf(list4);
      } 
      String str4 = paramBuilder.partial_visible_toast;
      if (str4 == null) {
        this.partial_visible_toast = "";
      } else {
        this.partial_visible_toast = str4;
      } 
      this.na_guide = paramBuilder.na_guide;
      this.follow_tip = paramBuilder.follow_tip;
      str4 = paramBuilder.fold_tip;
      if (str4 == null) {
        this.fold_tip = "";
      } else {
        this.fold_tip = str4;
      } 
      Integer integer5 = paramBuilder.exp_news_today;
      if (integer5 == null) {
        this.exp_news_today = DEFAULT_EXP_NEWS_TODAY;
      } else {
        this.exp_news_today = integer5;
      } 
      integer5 = paramBuilder.exp_guide_today;
      if (integer5 == null) {
        this.exp_guide_today = DEFAULT_EXP_GUIDE_TODAY;
      } else {
        this.exp_guide_today = integer5;
      } 
      String str3 = paramBuilder.multi_forum_text;
      if (str3 == null) {
        this.multi_forum_text = "";
      } else {
        this.multi_forum_text = str3;
      } 
      List list3 = paramBuilder.thread_topic;
      if (list3 == null) {
        this.thread_topic = DEFAULT_THREAD_TOPIC;
      } else {
        this.thread_topic = Message.immutableCopyOf(list3);
      } 
      list3 = paramBuilder.pb_sort_info;
      if (list3 == null) {
        this.pb_sort_info = DEFAULT_PB_SORT_INFO;
      } else {
        this.pb_sort_info = Message.immutableCopyOf(list3);
      } 
      Integer integer4 = paramBuilder.sort_type;
      if (integer4 == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer4;
      } 
      this.manager_election = paramBuilder.manager_election;
      List list2 = paramBuilder.bjh_recommend;
      if (list2 == null) {
        this.bjh_recommend = DEFAULT_BJH_RECOMMEND;
      } else {
        this.bjh_recommend = Message.immutableCopyOf(list2);
      } 
      this.business_promot_info = paramBuilder.business_promot_info;
      this.promotion = paramBuilder.promotion;
      this.recom_ala_info = paramBuilder.recom_ala_info;
      Integer integer3 = paramBuilder.jumptotab1;
      if (integer3 == null) {
        this.jumptotab1 = DEFAULT_JUMPTOTAB1;
      } else {
        this.jumptotab1 = integer3;
      } 
      String str2 = paramBuilder.jumptotab2;
      if (str2 == null) {
        this.jumptotab2 = "";
      } else {
        this.jumptotab2 = str2;
      } 
      this.business_account_info = paramBuilder.business_account_info;
      List list1 = paramBuilder.recom_thread_info;
      if (list1 == null) {
        this.recom_thread_info = DEFAULT_RECOM_THREAD_INFO;
      } else {
        this.recom_thread_info = Message.immutableCopyOf(list1);
      } 
      this.forum_rule = paramBuilder.forum_rule;
      Integer integer2 = paramBuilder.show_adsense;
      if (integer2 == null) {
        this.show_adsense = DEFAULT_SHOW_ADSENSE;
      } else {
        this.show_adsense = integer2;
      } 
      integer2 = paramBuilder.is_black_white;
      if (integer2 == null) {
        this.is_black_white = DEFAULT_IS_BLACK_WHITE;
      } else {
        this.is_black_white = integer2;
      } 
      integer2 = paramBuilder.is_official_forum;
      if (integer2 == null) {
        this.is_official_forum = DEFAULT_IS_OFFICIAL_FORUM;
      } else {
        this.is_official_forum = integer2;
      } 
      this.floating_icon = paramBuilder.floating_icon;
      integer2 = paramBuilder.is_purchase;
      if (integer2 == null) {
        this.is_purchase = DEFAULT_IS_PURCHASE;
      } else {
        this.is_purchase = integer2;
      } 
      integer2 = paramBuilder.pb_notice_type;
      if (integer2 == null) {
        this.pb_notice_type = DEFAULT_PB_NOTICE_TYPE;
      } else {
        this.pb_notice_type = integer2;
      } 
      String str1 = paramBuilder.pb_notice;
      if (str1 == null) {
        this.pb_notice = "";
      } else {
        this.pb_notice = str1;
      } 
      Integer integer1 = paramBuilder.has_fold_comment;
      if (integer1 == null) {
        this.has_fold_comment = DEFAULT_HAS_FOLD_COMMENT;
      } else {
        this.has_fold_comment = integer1;
      } 
      long_ = paramBuilder.fold_comment_num;
      if (long_ == null) {
        this.fold_comment_num = DEFAULT_FOLD_COMMENT_NUM;
      } else {
        this.fold_comment_num = long_;
      } 
    } else {
      this.user = ((Builder)long_).user;
      this.forum = ((Builder)long_).forum;
      this.page = ((Builder)long_).page;
      this.anti = ((Builder)long_).anti;
      this.add_post = ((Builder)long_).add_post;
      this.post_list = Message.immutableCopyOf(((Builder)long_).post_list);
      this.has_floor = ((Builder)long_).has_floor;
      this.thread = ((Builder)long_).thread;
      this.location = ((Builder)long_).location;
      this.is_new_url = ((Builder)long_).is_new_url;
      this.post_banner = Message.immutableCopyOf(((Builder)long_).post_banner);
      this.banner_list = ((Builder)long_).banner_list;
      this.user_list = Message.immutableCopyOf(((Builder)long_).user_list);
      this.server_time = ((Builder)long_).server_time;
      this.news_info = ((Builder)long_).news_info;
      this.recommend_threads = Message.immutableCopyOf(((Builder)long_).recommend_threads);
      this.fine_banner = Message.immutableCopyOf(((Builder)long_).fine_banner);
      this.twzhibo_anti = ((Builder)long_).twzhibo_anti;
      this.sdk_topic_thread = ((Builder)long_).sdk_topic_thread;
      this.hot_post_list = ((Builder)long_).hot_post_list;
      this.graffiti_rank_list_info = ((Builder)long_).graffiti_rank_list_info;
      this.appeal_info = ((Builder)long_).appeal_info;
      this.god_card = ((Builder)long_).god_card;
      this.play_rank_list = Message.immutableCopyOf(((Builder)long_).play_rank_list);
      this.recommend_book = ((Builder)long_).recommend_book;
      this.ala_info = ((Builder)long_).ala_info;
      this.forum_headline_img_info = ((Builder)long_).forum_headline_img_info;
      this.asp_shown_info = ((Builder)long_).asp_shown_info;
      this.guess_like = ((Builder)long_).guess_like;
      this.feed_thread_list = Message.immutableCopyOf(((Builder)long_).feed_thread_list);
      this.is_follow_current_channel = ((Builder)long_).is_follow_current_channel;
      this.switch_read_open = ((Builder)long_).switch_read_open;
      this.feed_info = ((Builder)long_).feed_info;
      this.top_agree_post_list = ((Builder)long_).top_agree_post_list;
      this.repost_recommend_forum_list = Message.immutableCopyOf(((Builder)long_).repost_recommend_forum_list);
      this.from_forum_list = Message.immutableCopyOf(((Builder)long_).from_forum_list);
      this.thread_freq_num = ((Builder)long_).thread_freq_num;
      this.first_floor_post = ((Builder)long_).first_floor_post;
      this.display_forum = ((Builder)long_).display_forum;
      this.new_agree_user = Message.immutableCopyOf(((Builder)long_).new_agree_user);
      this.partial_visible_toast = ((Builder)long_).partial_visible_toast;
      this.na_guide = ((Builder)long_).na_guide;
      this.follow_tip = ((Builder)long_).follow_tip;
      this.fold_tip = ((Builder)long_).fold_tip;
      this.exp_news_today = ((Builder)long_).exp_news_today;
      this.exp_guide_today = ((Builder)long_).exp_guide_today;
      this.multi_forum_text = ((Builder)long_).multi_forum_text;
      this.thread_topic = Message.immutableCopyOf(((Builder)long_).thread_topic);
      this.pb_sort_info = Message.immutableCopyOf(((Builder)long_).pb_sort_info);
      this.sort_type = ((Builder)long_).sort_type;
      this.manager_election = ((Builder)long_).manager_election;
      this.bjh_recommend = Message.immutableCopyOf(((Builder)long_).bjh_recommend);
      this.business_promot_info = ((Builder)long_).business_promot_info;
      this.promotion = ((Builder)long_).promotion;
      this.recom_ala_info = ((Builder)long_).recom_ala_info;
      this.jumptotab1 = ((Builder)long_).jumptotab1;
      this.jumptotab2 = ((Builder)long_).jumptotab2;
      this.business_account_info = ((Builder)long_).business_account_info;
      this.recom_thread_info = Message.immutableCopyOf(((Builder)long_).recom_thread_info);
      this.forum_rule = ((Builder)long_).forum_rule;
      this.show_adsense = ((Builder)long_).show_adsense;
      this.is_black_white = ((Builder)long_).is_black_white;
      this.is_official_forum = ((Builder)long_).is_official_forum;
      this.floating_icon = ((Builder)long_).floating_icon;
      this.is_purchase = ((Builder)long_).is_purchase;
      this.pb_notice_type = ((Builder)long_).pb_notice_type;
      this.pb_notice = ((Builder)long_).pb_notice;
      this.has_fold_comment = ((Builder)long_).has_fold_comment;
      this.fold_comment_num = ((Builder)long_).fold_comment_num;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1374404855, "Ltbclient/PbPage/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1374404855, "Ltbclient/PbPage/DataRes;");
          return;
        } 
      } 
    } 
  }
}
