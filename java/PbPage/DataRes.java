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
import tbclient.JumpLinkInfo;
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
  
  @ProtoField(tag = 74)
  public final JumpLinkInfo jump_link_info;
  
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
  
  @ProtoField(tag = 73)
  public final Post top_answer;
  
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
    super(paramBuilder);
    if (paramBoolean == true) {
      this.user = paramBuilder.user;
      this.forum = paramBuilder.forum;
      this.page = paramBuilder.page;
      this.anti = paramBuilder.anti;
      this.add_post = paramBuilder.add_post;
      List<Post> list12 = paramBuilder.post_list;
      if (list12 == null) {
        this.post_list = DEFAULT_POST_LIST;
      } else {
        this.post_list = Message.immutableCopyOf(list12);
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
      List<PostBanner> list11 = paramBuilder.post_banner;
      if (list11 == null) {
        this.post_banner = DEFAULT_POST_BANNER;
      } else {
        this.post_banner = Message.immutableCopyOf(list11);
      } 
      this.banner_list = paramBuilder.banner_list;
      List<User> list10 = paramBuilder.user_list;
      if (list10 == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list10);
      } 
      Integer integer7 = paramBuilder.server_time;
      if (integer7 == null) {
        this.server_time = DEFAULT_SERVER_TIME;
      } else {
        this.server_time = integer7;
      } 
      this.news_info = paramBuilder.news_info;
      List<RecommendThread> list9 = paramBuilder.recommend_threads;
      if (list9 == null) {
        this.recommend_threads = DEFAULT_RECOMMEND_THREADS;
      } else {
        this.recommend_threads = Message.immutableCopyOf(list9);
      } 
      List<FineBannerPb> list8 = paramBuilder.fine_banner;
      if (list8 == null) {
        this.fine_banner = DEFAULT_FINE_BANNER;
      } else {
        this.fine_banner = Message.immutableCopyOf(list8);
      } 
      this.twzhibo_anti = paramBuilder.twzhibo_anti;
      this.sdk_topic_thread = paramBuilder.sdk_topic_thread;
      this.hot_post_list = paramBuilder.hot_post_list;
      this.graffiti_rank_list_info = paramBuilder.graffiti_rank_list_info;
      this.appeal_info = paramBuilder.appeal_info;
      this.god_card = paramBuilder.god_card;
      List<PsRankListItem> list7 = paramBuilder.play_rank_list;
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
      List<ThreadInfo> list6 = paramBuilder.feed_thread_list;
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
      List<SimpleForum> list5 = paramBuilder.repost_recommend_forum_list;
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
      Long long_2 = paramBuilder.thread_freq_num;
      if (long_2 == null) {
        this.thread_freq_num = DEFAULT_THREAD_FREQ_NUM;
      } else {
        this.thread_freq_num = long_2;
      } 
      this.first_floor_post = paramBuilder.first_floor_post;
      this.display_forum = paramBuilder.display_forum;
      List<SimpleUser> list4 = paramBuilder.new_agree_user;
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
      List<RecomTopicList> list3 = paramBuilder.thread_topic;
      if (list3 == null) {
        this.thread_topic = DEFAULT_THREAD_TOPIC;
      } else {
        this.thread_topic = Message.immutableCopyOf(list3);
      } 
      List<PbSortType> list = paramBuilder.pb_sort_info;
      if (list == null) {
        this.pb_sort_info = DEFAULT_PB_SORT_INFO;
      } else {
        this.pb_sort_info = Message.immutableCopyOf(list);
      } 
      Integer integer4 = paramBuilder.sort_type;
      if (integer4 == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer4;
      } 
      this.manager_election = paramBuilder.manager_election;
      List<ThreadInfo> list2 = paramBuilder.bjh_recommend;
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
      List<ThreadInfo> list1 = paramBuilder.recom_thread_info;
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
      Long long_1 = paramBuilder.fold_comment_num;
      if (long_1 == null) {
        this.fold_comment_num = DEFAULT_FOLD_COMMENT_NUM;
      } else {
        this.fold_comment_num = long_1;
      } 
      this.top_answer = paramBuilder.top_answer;
      this.jump_link_info = paramBuilder.jump_link_info;
    } else {
      this.user = paramBuilder.user;
      this.forum = paramBuilder.forum;
      this.page = paramBuilder.page;
      this.anti = paramBuilder.anti;
      this.add_post = paramBuilder.add_post;
      this.post_list = Message.immutableCopyOf(paramBuilder.post_list);
      this.has_floor = paramBuilder.has_floor;
      this.thread = paramBuilder.thread;
      this.location = paramBuilder.location;
      this.is_new_url = paramBuilder.is_new_url;
      this.post_banner = Message.immutableCopyOf(paramBuilder.post_banner);
      this.banner_list = paramBuilder.banner_list;
      this.user_list = Message.immutableCopyOf(paramBuilder.user_list);
      this.server_time = paramBuilder.server_time;
      this.news_info = paramBuilder.news_info;
      this.recommend_threads = Message.immutableCopyOf(paramBuilder.recommend_threads);
      this.fine_banner = Message.immutableCopyOf(paramBuilder.fine_banner);
      this.twzhibo_anti = paramBuilder.twzhibo_anti;
      this.sdk_topic_thread = paramBuilder.sdk_topic_thread;
      this.hot_post_list = paramBuilder.hot_post_list;
      this.graffiti_rank_list_info = paramBuilder.graffiti_rank_list_info;
      this.appeal_info = paramBuilder.appeal_info;
      this.god_card = paramBuilder.god_card;
      this.play_rank_list = Message.immutableCopyOf(paramBuilder.play_rank_list);
      this.recommend_book = paramBuilder.recommend_book;
      this.ala_info = paramBuilder.ala_info;
      this.forum_headline_img_info = paramBuilder.forum_headline_img_info;
      this.asp_shown_info = paramBuilder.asp_shown_info;
      this.guess_like = paramBuilder.guess_like;
      this.feed_thread_list = Message.immutableCopyOf(paramBuilder.feed_thread_list);
      this.is_follow_current_channel = paramBuilder.is_follow_current_channel;
      this.switch_read_open = paramBuilder.switch_read_open;
      this.feed_info = paramBuilder.feed_info;
      this.top_agree_post_list = paramBuilder.top_agree_post_list;
      this.repost_recommend_forum_list = Message.immutableCopyOf(paramBuilder.repost_recommend_forum_list);
      this.from_forum_list = Message.immutableCopyOf(paramBuilder.from_forum_list);
      this.thread_freq_num = paramBuilder.thread_freq_num;
      this.first_floor_post = paramBuilder.first_floor_post;
      this.display_forum = paramBuilder.display_forum;
      this.new_agree_user = Message.immutableCopyOf(paramBuilder.new_agree_user);
      this.partial_visible_toast = paramBuilder.partial_visible_toast;
      this.na_guide = paramBuilder.na_guide;
      this.follow_tip = paramBuilder.follow_tip;
      this.fold_tip = paramBuilder.fold_tip;
      this.exp_news_today = paramBuilder.exp_news_today;
      this.exp_guide_today = paramBuilder.exp_guide_today;
      this.multi_forum_text = paramBuilder.multi_forum_text;
      this.thread_topic = Message.immutableCopyOf(paramBuilder.thread_topic);
      this.pb_sort_info = Message.immutableCopyOf(paramBuilder.pb_sort_info);
      this.sort_type = paramBuilder.sort_type;
      this.manager_election = paramBuilder.manager_election;
      this.bjh_recommend = Message.immutableCopyOf(paramBuilder.bjh_recommend);
      this.business_promot_info = paramBuilder.business_promot_info;
      this.promotion = paramBuilder.promotion;
      this.recom_ala_info = paramBuilder.recom_ala_info;
      this.jumptotab1 = paramBuilder.jumptotab1;
      this.jumptotab2 = paramBuilder.jumptotab2;
      this.business_account_info = paramBuilder.business_account_info;
      this.recom_thread_info = Message.immutableCopyOf(paramBuilder.recom_thread_info);
      this.forum_rule = paramBuilder.forum_rule;
      this.show_adsense = paramBuilder.show_adsense;
      this.is_black_white = paramBuilder.is_black_white;
      this.is_official_forum = paramBuilder.is_official_forum;
      this.floating_icon = paramBuilder.floating_icon;
      this.is_purchase = paramBuilder.is_purchase;
      this.pb_notice_type = paramBuilder.pb_notice_type;
      this.pb_notice = paramBuilder.pb_notice;
      this.has_fold_comment = paramBuilder.has_fold_comment;
      this.fold_comment_num = paramBuilder.fold_comment_num;
      this.top_answer = paramBuilder.top_answer;
      this.jump_link_info = paramBuilder.jump_link_info;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
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
    
    public FloatingIcon floating_icon;
    
    public Long fold_comment_num;
    
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
    
    public Integer has_fold_comment;
    
    public PbHotPost hot_post_list;
    
    public Integer is_black_white;
    
    public Integer is_follow_current_channel;
    
    public Integer is_new_url;
    
    public Integer is_official_forum;
    
    public Integer is_purchase;
    
    public JumpLinkInfo jump_link_info;
    
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
    
    public String pb_notice;
    
    public Integer pb_notice_type;
    
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
    
    public Integer show_adsense;
    
    public Integer sort_type;
    
    public Integer switch_read_open;
    
    public ThreadInfo thread;
    
    public Long thread_freq_num;
    
    public List<RecomTopicList> thread_topic;
    
    public PbTopAgreePost top_agree_post_list;
    
    public Post top_answer;
    
    public TwZhiBoAnti twzhibo_anti;
    
    public User user;
    
    public List<User> user_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.user = param1DataRes.user;
      this.forum = param1DataRes.forum;
      this.page = param1DataRes.page;
      this.anti = param1DataRes.anti;
      this.add_post = param1DataRes.add_post;
      this.post_list = Message.copyOf(param1DataRes.post_list);
      this.has_floor = param1DataRes.has_floor;
      this.thread = param1DataRes.thread;
      this.location = param1DataRes.location;
      this.is_new_url = param1DataRes.is_new_url;
      this.post_banner = Message.copyOf(param1DataRes.post_banner);
      this.banner_list = param1DataRes.banner_list;
      this.user_list = Message.copyOf(param1DataRes.user_list);
      this.server_time = param1DataRes.server_time;
      this.news_info = param1DataRes.news_info;
      this.recommend_threads = Message.copyOf(param1DataRes.recommend_threads);
      this.fine_banner = Message.copyOf(param1DataRes.fine_banner);
      this.twzhibo_anti = param1DataRes.twzhibo_anti;
      this.sdk_topic_thread = param1DataRes.sdk_topic_thread;
      this.hot_post_list = param1DataRes.hot_post_list;
      this.graffiti_rank_list_info = param1DataRes.graffiti_rank_list_info;
      this.appeal_info = param1DataRes.appeal_info;
      this.god_card = param1DataRes.god_card;
      this.play_rank_list = Message.copyOf(param1DataRes.play_rank_list);
      this.recommend_book = param1DataRes.recommend_book;
      this.ala_info = param1DataRes.ala_info;
      this.forum_headline_img_info = param1DataRes.forum_headline_img_info;
      this.asp_shown_info = param1DataRes.asp_shown_info;
      this.guess_like = param1DataRes.guess_like;
      this.feed_thread_list = Message.copyOf(param1DataRes.feed_thread_list);
      this.is_follow_current_channel = param1DataRes.is_follow_current_channel;
      this.switch_read_open = param1DataRes.switch_read_open;
      this.feed_info = param1DataRes.feed_info;
      this.top_agree_post_list = param1DataRes.top_agree_post_list;
      this.repost_recommend_forum_list = Message.copyOf(param1DataRes.repost_recommend_forum_list);
      this.from_forum_list = Message.copyOf(param1DataRes.from_forum_list);
      this.thread_freq_num = param1DataRes.thread_freq_num;
      this.first_floor_post = param1DataRes.first_floor_post;
      this.display_forum = param1DataRes.display_forum;
      this.new_agree_user = Message.copyOf(param1DataRes.new_agree_user);
      this.partial_visible_toast = param1DataRes.partial_visible_toast;
      this.na_guide = param1DataRes.na_guide;
      this.follow_tip = param1DataRes.follow_tip;
      this.fold_tip = param1DataRes.fold_tip;
      this.exp_news_today = param1DataRes.exp_news_today;
      this.exp_guide_today = param1DataRes.exp_guide_today;
      this.multi_forum_text = param1DataRes.multi_forum_text;
      this.thread_topic = Message.copyOf(param1DataRes.thread_topic);
      this.pb_sort_info = Message.copyOf(param1DataRes.pb_sort_info);
      this.sort_type = param1DataRes.sort_type;
      this.manager_election = param1DataRes.manager_election;
      this.bjh_recommend = Message.copyOf(param1DataRes.bjh_recommend);
      this.business_promot_info = param1DataRes.business_promot_info;
      this.promotion = param1DataRes.promotion;
      this.recom_ala_info = param1DataRes.recom_ala_info;
      this.jumptotab1 = param1DataRes.jumptotab1;
      this.jumptotab2 = param1DataRes.jumptotab2;
      this.business_account_info = param1DataRes.business_account_info;
      this.recom_thread_info = Message.copyOf(param1DataRes.recom_thread_info);
      this.forum_rule = param1DataRes.forum_rule;
      this.show_adsense = param1DataRes.show_adsense;
      this.is_black_white = param1DataRes.is_black_white;
      this.is_official_forum = param1DataRes.is_official_forum;
      this.floating_icon = param1DataRes.floating_icon;
      this.is_purchase = param1DataRes.is_purchase;
      this.pb_notice_type = param1DataRes.pb_notice_type;
      this.pb_notice = param1DataRes.pb_notice;
      this.has_fold_comment = param1DataRes.has_fold_comment;
      this.fold_comment_num = param1DataRes.fold_comment_num;
      this.top_answer = param1DataRes.top_answer;
      this.jump_link_info = param1DataRes.jump_link_info;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
