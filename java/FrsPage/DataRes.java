package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AdMixFloor;
import tbclient.AddBawuPopInfo;
import tbclient.AlaLiveNotify;
import tbclient.AnchorInfo;
import tbclient.Anti;
import tbclient.BannerUserStory;
import tbclient.BottomMenu;
import tbclient.CategoryInfo;
import tbclient.Esport;
import tbclient.ForumArIno;
import tbclient.ForumPresentInfo;
import tbclient.ForumRuleStatus;
import tbclient.FrsPage.ActivityConfig;
import tbclient.FrsPage.ActivityHead;
import tbclient.FrsPage.AgreeBanner;
import tbclient.FrsPage.AlaLiveInsert;
import tbclient.FrsPage.BannerThreadInfo;
import tbclient.FrsPage.Bottle;
import tbclient.FrsPage.BrandForumInfo;
import tbclient.FrsPage.BusinessPromot;
import tbclient.FrsPage.CarrierEnter;
import tbclient.FrsPage.ClientPlatform;
import tbclient.FrsPage.ColorEgg;
import tbclient.FrsPage.ForumActiveInfo;
import tbclient.FrsPage.ForumBookInfo;
import tbclient.FrsPage.ForumHeadIcon;
import tbclient.FrsPage.ForumHeadlineImgInfo;
import tbclient.FrsPage.ForumInfo;
import tbclient.FrsPage.GconAccount;
import tbclient.FrsPage.Group;
import tbclient.FrsPage.HeadSdk;
import tbclient.FrsPage.Info;
import tbclient.FrsPage.NavTabInfo;
import tbclient.FrsPage.NebulaHotThreads;
import tbclient.FrsPage.NtSpreadInfo;
import tbclient.FrsPage.PrivateForumTotalInfo;
import tbclient.FrsPage.PushThreadInfo;
import tbclient.FrsPage.RecomPostTopic;
import tbclient.FrsPage.RecommendBook;
import tbclient.FrsPage.StarEnter;
import tbclient.FrsPage.StarInfo;
import tbclient.FrsPage.StarRank;
import tbclient.FrsPage.ThreadIdListInfo;
import tbclient.FrsPage.WorldcupSkin;
import tbclient.FrsPageUserExtend;
import tbclient.FrsTabInfo;
import tbclient.FrsVideo;
import tbclient.HotUserRankEntry;
import tbclient.ItemInfo;
import tbclient.NaGuide;
import tbclient.Novel;
import tbclient.Page;
import tbclient.PopInfo;
import tbclient.RecommendInfo;
import tbclient.RedpacketRain;
import tbclient.SdkTopicThread;
import tbclient.ServiceArea;
import tbclient.SignActivityInfo;
import tbclient.SmartApp;
import tbclient.StarVoice;
import tbclient.ThreadInfo;
import tbclient.User;
import tbclient.VitalityInfo;
import tbclient.WindowToast;
import tbclient.ZhiBoInfoTW;

public final class DataRes extends Message {
  public static final List<AdMixFloor> DEFAULT_AD_MIX_LIST;
  
  public static final String DEFAULT_AD_SAMPLE_MAP_KEY = "";
  
  public static final Integer DEFAULT_AD_SHOW_SELECT;
  
  public static final Integer DEFAULT_ALA_INSERT_FLOOR;
  
  public static final List<ThreadInfo> DEFAULT_ALA_INSERT_THREAD;
  
  public static final Integer DEFAULT_ALA_LIVE_COUNT;
  
  public static final List<ThreadInfo> DEFAULT_ALA_STAGE_LIST;
  
  public static final String DEFAULT_ASP_SHOWN_INFO = "";
  
  public static final List<BannerThreadInfo> DEFAULT_BANNER_THREAD_LIST;
  
  public static final String DEFAULT_BAWU_ENTER_URL = "";
  
  public static final List<BottomMenu> DEFAULT_BOTTOM_MENU;
  
  public static final List<ThreadInfo> DEFAULT_CARD_SHIPIN_INFO;
  
  public static final List<ThreadInfo> DEFAULT_CARD_SHIPIN_NEW;
  
  public static final List<Integer> DEFAULT_CARD_SHIPIN_POS;
  
  public static final List<CategoryInfo> DEFAULT_CATEGORY_LIST;
  
  public static final List<ColorEgg> DEFAULT_COLOR_EGG;
  
  public static final Integer DEFAULT_CTIME;
  
  public static final Integer DEFAULT_FORTUNE_BAG;
  
  public static final String DEFAULT_FORTUNE_DESC = "";
  
  public static final List<AnchorInfo> DEFAULT_FORUM_LIVEGROUP_LIST;
  
  public static final List<FrsTabInfo> DEFAULT_FRS_GAME_TAB_INFO;
  
  public static final Integer DEFAULT_FRS_TAB_DEFAULT;
  
  public static final List<FrsTabInfo> DEFAULT_FRS_TAB_INFO;
  
  public static final Integer DEFAULT_GAME_DEFAULT_TAB_ID;
  
  public static final Integer DEFAULT_IS_AUTO_PLAY_FORUMHEADVIDEO;
  
  public static final Integer DEFAULT_IS_GET_HORSE_RACE_LAMP;
  
  public static final Integer DEFAULT_IS_NEW_URL;
  
  public static final Long DEFAULT_LOGID;
  
  public static final Integer DEFAULT_NEED_LOG;
  
  public static final String DEFAULT_PARTIAL_VISIBLE_TOAST = "";
  
  public static final Integer DEFAULT_SCHOOL_RECOM_POS;
  
  public static final Integer DEFAULT_SERVER_TIME;
  
  public static final List<ServiceArea> DEFAULT_SERVICE_AREA;
  
  public static final Integer DEFAULT_SHOW_ADSENSE;
  
  public static final List<String> DEFAULT_SMART_APP_AVATAR;
  
  public static final Integer DEFAULT_SMART_FRS_TYPE;
  
  public static final Integer DEFAULT_SORT_TYPE;
  
  public static final List<StarEnter> DEFAULT_STAR_ENTER;
  
  public static final List<Long> DEFAULT_THREAD_ID_LIST;
  
  public static final List<ThreadIdListInfo> DEFAULT_THREAD_ID_LIST_INFO;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_TIME;
  
  public static final Integer DEFAULT_TRENDS_REDPOINT;
  
  public static final List<ZhiBoInfoTW> DEFAULT_TWZHIBO_INFO;
  
  public static final Integer DEFAULT_TWZHIBO_POS;
  
  public static final List<User> DEFAULT_USER_LIST;
  
  public static final Integer DEFAULT_VIDEO_AUTO_PLAY;
  
  public static final Integer DEFAULT_VOICE_ROOM_CONFIG;
  
  public static final List<ThreadInfo> DEFAULT_VOICE_ROOM_LIST;
  
  public static final List<WindowToast> DEFAULT_WINDOW_TOAST;
  
  @ProtoField(tag = 87)
  public final ActivityConfig activity_config;
  
  @ProtoField(tag = 23)
  public final ActivityHead activityhead;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 113)
  public final List<AdMixFloor> ad_mix_list;
  
  @ProtoField(tag = 114, type = Message.Datatype.STRING)
  public final String ad_sample_map_key;
  
  @ProtoField(tag = 112, type = Message.Datatype.INT32)
  public final Integer ad_show_select;
  
  @ProtoField(tag = 107)
  public final AddBawuPopInfo add_bawu_pop;
  
  @ProtoField(tag = 65)
  public final AgreeBanner agree_banner;
  
  @ProtoField(tag = 77, type = Message.Datatype.INT32)
  public final Integer ala_insert_floor;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 75)
  public final List<ThreadInfo> ala_insert_thread;
  
  @ProtoField(tag = 57, type = Message.Datatype.UINT32)
  public final Integer ala_live_count;
  
  @ProtoField(tag = 76)
  public final AlaLiveInsert ala_live_insert;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 80)
  public final List<ThreadInfo> ala_stage_list;
  
  @ProtoField(tag = 5)
  public final Anti anti;
  
  @ProtoField(tag = 56, type = Message.Datatype.STRING)
  public final String asp_shown_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 45)
  public final List<BannerThreadInfo> banner_thread_list;
  
  @ProtoField(tag = 70)
  public final BannerUserStory banner_user_story;
  
  @ProtoField(tag = 32, type = Message.Datatype.STRING)
  public final String bawu_enter_url;
  
  @ProtoField(tag = 101)
  public final WindowToast bazhu_exam_fail;
  
  @ProtoField(tag = 50)
  public final ForumBookInfo book_info;
  
  @ProtoField(tag = 58)
  public final Bottle bottle;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 92)
  public final List<BottomMenu> bottom_menu;
  
  @ProtoField(tag = 91)
  public final BrandForumInfo brand_forum_info;
  
  @ProtoField(tag = 99)
  public final BusinessPromot business_promot;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 35)
  public final List<ThreadInfo> card_shipin_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 55)
  public final List<ThreadInfo> card_shipin_new;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 54, type = Message.Datatype.INT32)
  public final List<Integer> card_shipin_pos;
  
  @ProtoField(tag = 43)
  public final CarrierEnter carrier_enter;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 28)
  public final List<CategoryInfo> category_list;
  
  @ProtoField(tag = 33)
  public final ClientPlatform client_platform;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 21)
  public final List<ColorEgg> color_egg;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer ctime;
  
  @ProtoField(tag = 61)
  public final PopInfo enter_pop_info;
  
  @ProtoField(tag = 63)
  public final Esport esport;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer fortune_bag;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String fortune_desc;
  
  @ProtoField(tag = 2)
  public final ForumInfo forum;
  
  @ProtoField(tag = 78)
  public final ForumArIno forum_ar_info;
  
  @ProtoField(tag = 72)
  public final ForumHeadIcon forum_head_icon;
  
  @ProtoField(tag = 52)
  public final ForumHeadlineImgInfo forum_headline_img_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 16)
  public final List<AnchorInfo> forum_livegroup_list;
  
  @ProtoField(tag = 51)
  public final ForumPresentInfo forum_present_info;
  
  @ProtoField(tag = 105)
  public final ForumRuleStatus forum_rule;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 68)
  public final List<FrsTabInfo> frs_game_tab_info;
  
  @ProtoField(tag = 3)
  public final StarInfo frs_star;
  
  @ProtoField(tag = 38, type = Message.Datatype.INT32)
  public final Integer frs_tab_default;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 22)
  public final List<FrsTabInfo> frs_tab_info;
  
  @ProtoField(tag = 109)
  public final PopInfo frsmask_pop_info;
  
  @ProtoField(tag = 74, type = Message.Datatype.INT32)
  public final Integer game_default_tab_id;
  
  @ProtoField(tag = 18)
  public final GconAccount gcon_account;
  
  @ProtoField(tag = 6)
  public final Group group;
  
  @ProtoField(tag = 34)
  public final HeadSdk head_sdk;
  
  @ProtoField(tag = 26)
  public final ZhiBoInfoTW hot_twzhibo_info;
  
  @ProtoField(tag = 102)
  public final HotUserRankEntry hot_user_entry;
  
  @ProtoField(tag = 15)
  public final Info info;
  
  @ProtoField(tag = 49, type = Message.Datatype.INT32)
  public final Integer is_auto_play_forumheadvideo;
  
  @ProtoField(tag = 104, type = Message.Datatype.INT32)
  public final Integer is_get_horse_race_lamp;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer is_new_url;
  
  @ProtoField(tag = 103)
  public final ItemInfo item_info;
  
  @ProtoField(tag = 69)
  public final AlaLiveNotify live_frs_notify;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT64)
  public final Long logid;
  
  @ProtoField(tag = 67)
  public final NaGuide na_guide;
  
  @ProtoField(tag = 37)
  public final NavTabInfo nav_tab_info;
  
  @ProtoField(tag = 96)
  public final NebulaHotThreads nebula_hot_threads;
  
  @ProtoField(tag = 48, type = Message.Datatype.INT32)
  public final Integer need_log;
  
  @ProtoField(tag = 25)
  public final Novel novel;
  
  @ProtoField(tag = 53)
  public final NtSpreadInfo ntspread;
  
  @ProtoField(tag = 4)
  public final Page page;
  
  @ProtoField(tag = 62, type = Message.Datatype.STRING)
  public final String partial_visible_toast;
  
  @ProtoField(tag = 98)
  public final ForumActiveInfo private_forum_active_info;
  
  @ProtoField(tag = 97)
  public final PrivateForumTotalInfo private_forum_info;
  
  @ProtoField(tag = 29)
  public final PushThreadInfo push_thread_info;
  
  @ProtoField(tag = 86)
  public final RecomPostTopic recom_post_topic;
  
  @ProtoField(tag = 46)
  public final RecommendBook recommend_book;
  
  @ProtoField(tag = 90)
  public final RedpacketRain redpacketrain;
  
  @ProtoField(tag = 40)
  public final RecommendInfo school_recom_info;
  
  @ProtoField(tag = 41, type = Message.Datatype.UINT32)
  public final Integer school_recom_pos;
  
  @ProtoField(tag = 31)
  public final SdkTopicThread sdk_topic_thread;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer server_time;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 100)
  public final List<ServiceArea> service_area;
  
  @ProtoField(tag = 108, type = Message.Datatype.INT32)
  public final Integer show_adsense;
  
  @ProtoField(tag = 106)
  public final SignActivityInfo sign_activity_info;
  
  @ProtoField(tag = 95)
  public final SmartApp smart_app;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 94, type = Message.Datatype.STRING)
  public final List<String> smart_app_avatar;
  
  @ProtoField(tag = 47, type = Message.Datatype.INT32)
  public final Integer smart_frs_type;
  
  @ProtoField(tag = 39, type = Message.Datatype.INT32)
  public final Integer sort_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 20)
  public final List<StarEnter> star_enter;
  
  @ProtoField(tag = 81)
  public final StarRank star_rank_info;
  
  @ProtoField(tag = 88)
  public final StarVoice star_voice;
  
  @ProtoField(tag = 30)
  public final ThreadInfo store_card;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.INT64)
  public final List<Long> thread_id_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 64)
  public final List<ThreadIdListInfo> thread_id_list_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<ThreadInfo> thread_list;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer time;
  
  @ProtoField(tag = 82, type = Message.Datatype.INT32)
  public final Integer trends_redpoint;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 24)
  public final List<ZhiBoInfoTW> twzhibo_info;
  
  @ProtoField(tag = 27, type = Message.Datatype.INT32)
  public final Integer twzhibo_pos;
  
  @ProtoField(tag = 1)
  public final User user;
  
  @ProtoField(tag = 71)
  public final FrsPageUserExtend user_extend;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 17)
  public final List<User> user_list;
  
  @ProtoField(tag = 73)
  public final FrsVideo video;
  
  @ProtoField(tag = 93, type = Message.Datatype.INT32)
  public final Integer video_auto_play;
  
  @ProtoField(tag = 42)
  public final VitalityInfo vitality_info;
  
  @ProtoField(tag = 111, type = Message.Datatype.INT32)
  public final Integer voice_room_config;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 110)
  public final List<ThreadInfo> voice_room_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 85)
  public final List<WindowToast> window_toast;
  
  @ProtoField(tag = 89)
  public final WorldcupSkin worldcup_skin;
  
  static {
    DEFAULT_THREAD_ID_LIST = Collections.emptyList();
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_NEW_URL = integer;
    DEFAULT_FORTUNE_BAG = integer;
    DEFAULT_TIME = integer;
    DEFAULT_CTIME = integer;
    DEFAULT_LOGID = Long.valueOf(0L);
    DEFAULT_SERVER_TIME = integer;
    DEFAULT_FORUM_LIVEGROUP_LIST = Collections.emptyList();
    DEFAULT_USER_LIST = Collections.emptyList();
    DEFAULT_STAR_ENTER = Collections.emptyList();
    DEFAULT_COLOR_EGG = Collections.emptyList();
    DEFAULT_FRS_TAB_INFO = Collections.emptyList();
    DEFAULT_TWZHIBO_INFO = Collections.emptyList();
    DEFAULT_TWZHIBO_POS = integer;
    DEFAULT_CATEGORY_LIST = Collections.emptyList();
    DEFAULT_CARD_SHIPIN_INFO = Collections.emptyList();
    DEFAULT_FRS_TAB_DEFAULT = integer;
    DEFAULT_SORT_TYPE = integer;
    DEFAULT_SCHOOL_RECOM_POS = integer;
    DEFAULT_BANNER_THREAD_LIST = Collections.emptyList();
    DEFAULT_SMART_FRS_TYPE = integer;
    DEFAULT_NEED_LOG = integer;
    DEFAULT_IS_AUTO_PLAY_FORUMHEADVIDEO = integer;
    DEFAULT_CARD_SHIPIN_POS = Collections.emptyList();
    DEFAULT_CARD_SHIPIN_NEW = Collections.emptyList();
    DEFAULT_ALA_LIVE_COUNT = integer;
    DEFAULT_THREAD_ID_LIST_INFO = Collections.emptyList();
    DEFAULT_FRS_GAME_TAB_INFO = Collections.emptyList();
    DEFAULT_GAME_DEFAULT_TAB_ID = integer;
    DEFAULT_ALA_INSERT_THREAD = Collections.emptyList();
    DEFAULT_ALA_INSERT_FLOOR = integer;
    DEFAULT_ALA_STAGE_LIST = Collections.emptyList();
    DEFAULT_TRENDS_REDPOINT = integer;
    DEFAULT_WINDOW_TOAST = Collections.emptyList();
    DEFAULT_BOTTOM_MENU = Collections.emptyList();
    DEFAULT_VIDEO_AUTO_PLAY = integer;
    DEFAULT_SMART_APP_AVATAR = Collections.emptyList();
    DEFAULT_SERVICE_AREA = Collections.emptyList();
    DEFAULT_IS_GET_HORSE_RACE_LAMP = integer;
    DEFAULT_SHOW_ADSENSE = integer;
    DEFAULT_VOICE_ROOM_LIST = Collections.emptyList();
    DEFAULT_VOICE_ROOM_CONFIG = integer;
    DEFAULT_AD_SHOW_SELECT = integer;
    DEFAULT_AD_MIX_LIST = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.user = paramBuilder.user;
      this.forum = paramBuilder.forum;
      this.frs_star = paramBuilder.frs_star;
      this.page = paramBuilder.page;
      this.anti = paramBuilder.anti;
      this.group = paramBuilder.group;
      List list14 = paramBuilder.thread_list;
      if (list14 == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list14);
      } 
      list14 = paramBuilder.thread_id_list;
      if (list14 == null) {
        this.thread_id_list = DEFAULT_THREAD_ID_LIST;
      } else {
        this.thread_id_list = Message.immutableCopyOf(list14);
      } 
      Integer integer12 = paramBuilder.is_new_url;
      if (integer12 == null) {
        this.is_new_url = DEFAULT_IS_NEW_URL;
      } else {
        this.is_new_url = integer12;
      } 
      integer12 = paramBuilder.fortune_bag;
      if (integer12 == null) {
        this.fortune_bag = DEFAULT_FORTUNE_BAG;
      } else {
        this.fortune_bag = integer12;
      } 
      integer12 = paramBuilder.time;
      if (integer12 == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer12;
      } 
      integer12 = paramBuilder.ctime;
      if (integer12 == null) {
        this.ctime = DEFAULT_CTIME;
      } else {
        this.ctime = integer12;
      } 
      Long long_ = paramBuilder.logid;
      if (long_ == null) {
        this.logid = DEFAULT_LOGID;
      } else {
        this.logid = long_;
      } 
      Integer integer11 = paramBuilder.server_time;
      if (integer11 == null) {
        this.server_time = DEFAULT_SERVER_TIME;
      } else {
        this.server_time = integer11;
      } 
      this.info = paramBuilder.info;
      List list13 = paramBuilder.forum_livegroup_list;
      if (list13 == null) {
        this.forum_livegroup_list = DEFAULT_FORUM_LIVEGROUP_LIST;
      } else {
        this.forum_livegroup_list = Message.immutableCopyOf(list13);
      } 
      list13 = paramBuilder.user_list;
      if (list13 == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list13);
      } 
      this.gcon_account = paramBuilder.gcon_account;
      String str4 = paramBuilder.fortune_desc;
      if (str4 == null) {
        this.fortune_desc = "";
      } else {
        this.fortune_desc = str4;
      } 
      List list12 = paramBuilder.star_enter;
      if (list12 == null) {
        this.star_enter = DEFAULT_STAR_ENTER;
      } else {
        this.star_enter = Message.immutableCopyOf(list12);
      } 
      list12 = paramBuilder.color_egg;
      if (list12 == null) {
        this.color_egg = DEFAULT_COLOR_EGG;
      } else {
        this.color_egg = Message.immutableCopyOf(list12);
      } 
      list12 = paramBuilder.frs_tab_info;
      if (list12 == null) {
        this.frs_tab_info = DEFAULT_FRS_TAB_INFO;
      } else {
        this.frs_tab_info = Message.immutableCopyOf(list12);
      } 
      this.activityhead = paramBuilder.activityhead;
      list12 = paramBuilder.twzhibo_info;
      if (list12 == null) {
        this.twzhibo_info = DEFAULT_TWZHIBO_INFO;
      } else {
        this.twzhibo_info = Message.immutableCopyOf(list12);
      } 
      this.novel = paramBuilder.novel;
      this.hot_twzhibo_info = paramBuilder.hot_twzhibo_info;
      Integer integer10 = paramBuilder.twzhibo_pos;
      if (integer10 == null) {
        this.twzhibo_pos = DEFAULT_TWZHIBO_POS;
      } else {
        this.twzhibo_pos = integer10;
      } 
      List list11 = paramBuilder.category_list;
      if (list11 == null) {
        this.category_list = DEFAULT_CATEGORY_LIST;
      } else {
        this.category_list = Message.immutableCopyOf(list11);
      } 
      this.push_thread_info = paramBuilder.push_thread_info;
      this.store_card = paramBuilder.store_card;
      this.sdk_topic_thread = paramBuilder.sdk_topic_thread;
      String str3 = paramBuilder.bawu_enter_url;
      if (str3 == null) {
        this.bawu_enter_url = "";
      } else {
        this.bawu_enter_url = str3;
      } 
      this.client_platform = paramBuilder.client_platform;
      this.head_sdk = paramBuilder.head_sdk;
      List list10 = paramBuilder.card_shipin_info;
      if (list10 == null) {
        this.card_shipin_info = DEFAULT_CARD_SHIPIN_INFO;
      } else {
        this.card_shipin_info = Message.immutableCopyOf(list10);
      } 
      this.nav_tab_info = paramBuilder.nav_tab_info;
      Integer integer9 = paramBuilder.frs_tab_default;
      if (integer9 == null) {
        this.frs_tab_default = DEFAULT_FRS_TAB_DEFAULT;
      } else {
        this.frs_tab_default = integer9;
      } 
      integer9 = paramBuilder.sort_type;
      if (integer9 == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer9;
      } 
      this.school_recom_info = paramBuilder.school_recom_info;
      integer9 = paramBuilder.school_recom_pos;
      if (integer9 == null) {
        this.school_recom_pos = DEFAULT_SCHOOL_RECOM_POS;
      } else {
        this.school_recom_pos = integer9;
      } 
      this.vitality_info = paramBuilder.vitality_info;
      this.carrier_enter = paramBuilder.carrier_enter;
      List list9 = paramBuilder.banner_thread_list;
      if (list9 == null) {
        this.banner_thread_list = DEFAULT_BANNER_THREAD_LIST;
      } else {
        this.banner_thread_list = Message.immutableCopyOf(list9);
      } 
      this.recommend_book = paramBuilder.recommend_book;
      Integer integer8 = paramBuilder.smart_frs_type;
      if (integer8 == null) {
        this.smart_frs_type = DEFAULT_SMART_FRS_TYPE;
      } else {
        this.smart_frs_type = integer8;
      } 
      integer8 = paramBuilder.need_log;
      if (integer8 == null) {
        this.need_log = DEFAULT_NEED_LOG;
      } else {
        this.need_log = integer8;
      } 
      integer8 = paramBuilder.is_auto_play_forumheadvideo;
      if (integer8 == null) {
        this.is_auto_play_forumheadvideo = DEFAULT_IS_AUTO_PLAY_FORUMHEADVIDEO;
      } else {
        this.is_auto_play_forumheadvideo = integer8;
      } 
      this.book_info = paramBuilder.book_info;
      this.forum_present_info = paramBuilder.forum_present_info;
      this.forum_headline_img_info = paramBuilder.forum_headline_img_info;
      this.ntspread = paramBuilder.ntspread;
      List list8 = paramBuilder.card_shipin_pos;
      if (list8 == null) {
        this.card_shipin_pos = DEFAULT_CARD_SHIPIN_POS;
      } else {
        this.card_shipin_pos = Message.immutableCopyOf(list8);
      } 
      list8 = paramBuilder.card_shipin_new;
      if (list8 == null) {
        this.card_shipin_new = DEFAULT_CARD_SHIPIN_NEW;
      } else {
        this.card_shipin_new = Message.immutableCopyOf(list8);
      } 
      String str2 = paramBuilder.asp_shown_info;
      if (str2 == null) {
        this.asp_shown_info = "";
      } else {
        this.asp_shown_info = str2;
      } 
      Integer integer7 = paramBuilder.ala_live_count;
      if (integer7 == null) {
        this.ala_live_count = DEFAULT_ALA_LIVE_COUNT;
      } else {
        this.ala_live_count = integer7;
      } 
      this.bottle = paramBuilder.bottle;
      this.enter_pop_info = paramBuilder.enter_pop_info;
      String str1 = paramBuilder.partial_visible_toast;
      if (str1 == null) {
        this.partial_visible_toast = "";
      } else {
        this.partial_visible_toast = str1;
      } 
      this.esport = paramBuilder.esport;
      List list7 = paramBuilder.thread_id_list_info;
      if (list7 == null) {
        this.thread_id_list_info = DEFAULT_THREAD_ID_LIST_INFO;
      } else {
        this.thread_id_list_info = Message.immutableCopyOf(list7);
      } 
      this.agree_banner = paramBuilder.agree_banner;
      this.na_guide = paramBuilder.na_guide;
      list7 = paramBuilder.frs_game_tab_info;
      if (list7 == null) {
        this.frs_game_tab_info = DEFAULT_FRS_GAME_TAB_INFO;
      } else {
        this.frs_game_tab_info = Message.immutableCopyOf(list7);
      } 
      this.live_frs_notify = paramBuilder.live_frs_notify;
      this.banner_user_story = paramBuilder.banner_user_story;
      this.user_extend = paramBuilder.user_extend;
      this.forum_head_icon = paramBuilder.forum_head_icon;
      this.video = paramBuilder.video;
      Integer integer6 = paramBuilder.game_default_tab_id;
      if (integer6 == null) {
        this.game_default_tab_id = DEFAULT_GAME_DEFAULT_TAB_ID;
      } else {
        this.game_default_tab_id = integer6;
      } 
      List list6 = paramBuilder.ala_insert_thread;
      if (list6 == null) {
        this.ala_insert_thread = DEFAULT_ALA_INSERT_THREAD;
      } else {
        this.ala_insert_thread = Message.immutableCopyOf(list6);
      } 
      this.ala_live_insert = paramBuilder.ala_live_insert;
      Integer integer5 = paramBuilder.ala_insert_floor;
      if (integer5 == null) {
        this.ala_insert_floor = DEFAULT_ALA_INSERT_FLOOR;
      } else {
        this.ala_insert_floor = integer5;
      } 
      this.forum_ar_info = paramBuilder.forum_ar_info;
      List list5 = paramBuilder.ala_stage_list;
      if (list5 == null) {
        this.ala_stage_list = DEFAULT_ALA_STAGE_LIST;
      } else {
        this.ala_stage_list = Message.immutableCopyOf(list5);
      } 
      this.star_rank_info = paramBuilder.star_rank_info;
      Integer integer4 = paramBuilder.trends_redpoint;
      if (integer4 == null) {
        this.trends_redpoint = DEFAULT_TRENDS_REDPOINT;
      } else {
        this.trends_redpoint = integer4;
      } 
      List list4 = paramBuilder.window_toast;
      if (list4 == null) {
        this.window_toast = DEFAULT_WINDOW_TOAST;
      } else {
        this.window_toast = Message.immutableCopyOf(list4);
      } 
      this.recom_post_topic = paramBuilder.recom_post_topic;
      this.activity_config = paramBuilder.activity_config;
      this.star_voice = paramBuilder.star_voice;
      this.worldcup_skin = paramBuilder.worldcup_skin;
      this.redpacketrain = paramBuilder.redpacketrain;
      this.brand_forum_info = paramBuilder.brand_forum_info;
      list4 = paramBuilder.bottom_menu;
      if (list4 == null) {
        this.bottom_menu = DEFAULT_BOTTOM_MENU;
      } else {
        this.bottom_menu = Message.immutableCopyOf(list4);
      } 
      Integer integer3 = paramBuilder.video_auto_play;
      if (integer3 == null) {
        this.video_auto_play = DEFAULT_VIDEO_AUTO_PLAY;
      } else {
        this.video_auto_play = integer3;
      } 
      List list3 = paramBuilder.smart_app_avatar;
      if (list3 == null) {
        this.smart_app_avatar = DEFAULT_SMART_APP_AVATAR;
      } else {
        this.smart_app_avatar = Message.immutableCopyOf(list3);
      } 
      this.smart_app = paramBuilder.smart_app;
      this.nebula_hot_threads = paramBuilder.nebula_hot_threads;
      this.private_forum_info = paramBuilder.private_forum_info;
      this.private_forum_active_info = paramBuilder.private_forum_active_info;
      this.business_promot = paramBuilder.business_promot;
      list3 = paramBuilder.service_area;
      if (list3 == null) {
        this.service_area = DEFAULT_SERVICE_AREA;
      } else {
        this.service_area = Message.immutableCopyOf(list3);
      } 
      this.bazhu_exam_fail = paramBuilder.bazhu_exam_fail;
      this.hot_user_entry = paramBuilder.hot_user_entry;
      this.item_info = paramBuilder.item_info;
      Integer integer2 = paramBuilder.is_get_horse_race_lamp;
      if (integer2 == null) {
        this.is_get_horse_race_lamp = DEFAULT_IS_GET_HORSE_RACE_LAMP;
      } else {
        this.is_get_horse_race_lamp = integer2;
      } 
      this.forum_rule = paramBuilder.forum_rule;
      this.sign_activity_info = paramBuilder.sign_activity_info;
      this.add_bawu_pop = paramBuilder.add_bawu_pop;
      integer2 = paramBuilder.show_adsense;
      if (integer2 == null) {
        this.show_adsense = DEFAULT_SHOW_ADSENSE;
      } else {
        this.show_adsense = integer2;
      } 
      this.frsmask_pop_info = paramBuilder.frsmask_pop_info;
      List list2 = paramBuilder.voice_room_list;
      if (list2 == null) {
        this.voice_room_list = DEFAULT_VOICE_ROOM_LIST;
      } else {
        this.voice_room_list = Message.immutableCopyOf(list2);
      } 
      Integer integer1 = paramBuilder.voice_room_config;
      if (integer1 == null) {
        this.voice_room_config = DEFAULT_VOICE_ROOM_CONFIG;
      } else {
        this.voice_room_config = integer1;
      } 
      integer1 = paramBuilder.ad_show_select;
      if (integer1 == null) {
        this.ad_show_select = DEFAULT_AD_SHOW_SELECT;
      } else {
        this.ad_show_select = integer1;
      } 
      List list1 = paramBuilder.ad_mix_list;
      if (list1 == null) {
        this.ad_mix_list = DEFAULT_AD_MIX_LIST;
      } else {
        this.ad_mix_list = Message.immutableCopyOf(list1);
      } 
      str = paramBuilder.ad_sample_map_key;
      if (str == null) {
        this.ad_sample_map_key = "";
      } else {
        this.ad_sample_map_key = str;
      } 
    } else {
      this.user = ((Builder)str).user;
      this.forum = ((Builder)str).forum;
      this.frs_star = ((Builder)str).frs_star;
      this.page = ((Builder)str).page;
      this.anti = ((Builder)str).anti;
      this.group = ((Builder)str).group;
      this.thread_list = Message.immutableCopyOf(((Builder)str).thread_list);
      this.thread_id_list = Message.immutableCopyOf(((Builder)str).thread_id_list);
      this.is_new_url = ((Builder)str).is_new_url;
      this.fortune_bag = ((Builder)str).fortune_bag;
      this.time = ((Builder)str).time;
      this.ctime = ((Builder)str).ctime;
      this.logid = ((Builder)str).logid;
      this.server_time = ((Builder)str).server_time;
      this.info = ((Builder)str).info;
      this.forum_livegroup_list = Message.immutableCopyOf(((Builder)str).forum_livegroup_list);
      this.user_list = Message.immutableCopyOf(((Builder)str).user_list);
      this.gcon_account = ((Builder)str).gcon_account;
      this.fortune_desc = ((Builder)str).fortune_desc;
      this.star_enter = Message.immutableCopyOf(((Builder)str).star_enter);
      this.color_egg = Message.immutableCopyOf(((Builder)str).color_egg);
      this.frs_tab_info = Message.immutableCopyOf(((Builder)str).frs_tab_info);
      this.activityhead = ((Builder)str).activityhead;
      this.twzhibo_info = Message.immutableCopyOf(((Builder)str).twzhibo_info);
      this.novel = ((Builder)str).novel;
      this.hot_twzhibo_info = ((Builder)str).hot_twzhibo_info;
      this.twzhibo_pos = ((Builder)str).twzhibo_pos;
      this.category_list = Message.immutableCopyOf(((Builder)str).category_list);
      this.push_thread_info = ((Builder)str).push_thread_info;
      this.store_card = ((Builder)str).store_card;
      this.sdk_topic_thread = ((Builder)str).sdk_topic_thread;
      this.bawu_enter_url = ((Builder)str).bawu_enter_url;
      this.client_platform = ((Builder)str).client_platform;
      this.head_sdk = ((Builder)str).head_sdk;
      this.card_shipin_info = Message.immutableCopyOf(((Builder)str).card_shipin_info);
      this.nav_tab_info = ((Builder)str).nav_tab_info;
      this.frs_tab_default = ((Builder)str).frs_tab_default;
      this.sort_type = ((Builder)str).sort_type;
      this.school_recom_info = ((Builder)str).school_recom_info;
      this.school_recom_pos = ((Builder)str).school_recom_pos;
      this.vitality_info = ((Builder)str).vitality_info;
      this.carrier_enter = ((Builder)str).carrier_enter;
      this.banner_thread_list = Message.immutableCopyOf(((Builder)str).banner_thread_list);
      this.recommend_book = ((Builder)str).recommend_book;
      this.smart_frs_type = ((Builder)str).smart_frs_type;
      this.need_log = ((Builder)str).need_log;
      this.is_auto_play_forumheadvideo = ((Builder)str).is_auto_play_forumheadvideo;
      this.book_info = ((Builder)str).book_info;
      this.forum_present_info = ((Builder)str).forum_present_info;
      this.forum_headline_img_info = ((Builder)str).forum_headline_img_info;
      this.ntspread = ((Builder)str).ntspread;
      this.card_shipin_pos = Message.immutableCopyOf(((Builder)str).card_shipin_pos);
      this.card_shipin_new = Message.immutableCopyOf(((Builder)str).card_shipin_new);
      this.asp_shown_info = ((Builder)str).asp_shown_info;
      this.ala_live_count = ((Builder)str).ala_live_count;
      this.bottle = ((Builder)str).bottle;
      this.enter_pop_info = ((Builder)str).enter_pop_info;
      this.partial_visible_toast = ((Builder)str).partial_visible_toast;
      this.esport = ((Builder)str).esport;
      this.thread_id_list_info = Message.immutableCopyOf(((Builder)str).thread_id_list_info);
      this.agree_banner = ((Builder)str).agree_banner;
      this.na_guide = ((Builder)str).na_guide;
      this.frs_game_tab_info = Message.immutableCopyOf(((Builder)str).frs_game_tab_info);
      this.live_frs_notify = ((Builder)str).live_frs_notify;
      this.banner_user_story = ((Builder)str).banner_user_story;
      this.user_extend = ((Builder)str).user_extend;
      this.forum_head_icon = ((Builder)str).forum_head_icon;
      this.video = ((Builder)str).video;
      this.game_default_tab_id = ((Builder)str).game_default_tab_id;
      this.ala_insert_thread = Message.immutableCopyOf(((Builder)str).ala_insert_thread);
      this.ala_live_insert = ((Builder)str).ala_live_insert;
      this.ala_insert_floor = ((Builder)str).ala_insert_floor;
      this.forum_ar_info = ((Builder)str).forum_ar_info;
      this.ala_stage_list = Message.immutableCopyOf(((Builder)str).ala_stage_list);
      this.star_rank_info = ((Builder)str).star_rank_info;
      this.trends_redpoint = ((Builder)str).trends_redpoint;
      this.window_toast = Message.immutableCopyOf(((Builder)str).window_toast);
      this.recom_post_topic = ((Builder)str).recom_post_topic;
      this.activity_config = ((Builder)str).activity_config;
      this.star_voice = ((Builder)str).star_voice;
      this.worldcup_skin = ((Builder)str).worldcup_skin;
      this.redpacketrain = ((Builder)str).redpacketrain;
      this.brand_forum_info = ((Builder)str).brand_forum_info;
      this.bottom_menu = Message.immutableCopyOf(((Builder)str).bottom_menu);
      this.video_auto_play = ((Builder)str).video_auto_play;
      this.smart_app_avatar = Message.immutableCopyOf(((Builder)str).smart_app_avatar);
      this.smart_app = ((Builder)str).smart_app;
      this.nebula_hot_threads = ((Builder)str).nebula_hot_threads;
      this.private_forum_info = ((Builder)str).private_forum_info;
      this.private_forum_active_info = ((Builder)str).private_forum_active_info;
      this.business_promot = ((Builder)str).business_promot;
      this.service_area = Message.immutableCopyOf(((Builder)str).service_area);
      this.bazhu_exam_fail = ((Builder)str).bazhu_exam_fail;
      this.hot_user_entry = ((Builder)str).hot_user_entry;
      this.item_info = ((Builder)str).item_info;
      this.is_get_horse_race_lamp = ((Builder)str).is_get_horse_race_lamp;
      this.forum_rule = ((Builder)str).forum_rule;
      this.sign_activity_info = ((Builder)str).sign_activity_info;
      this.add_bawu_pop = ((Builder)str).add_bawu_pop;
      this.show_adsense = ((Builder)str).show_adsense;
      this.frsmask_pop_info = ((Builder)str).frsmask_pop_info;
      this.voice_room_list = Message.immutableCopyOf(((Builder)str).voice_room_list);
      this.voice_room_config = ((Builder)str).voice_room_config;
      this.ad_show_select = ((Builder)str).ad_show_select;
      this.ad_mix_list = Message.immutableCopyOf(((Builder)str).ad_mix_list);
      this.ad_sample_map_key = ((Builder)str).ad_sample_map_key;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1238029048, "Ltbclient/FrsPage/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1238029048, "Ltbclient/FrsPage/DataRes;");
          return;
        } 
      } 
    } 
  }
}
