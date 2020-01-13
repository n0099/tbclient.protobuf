package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaLiveNotify;
import tbclient.AnchorInfo;
import tbclient.Anti;
import tbclient.BannerUserStory;
import tbclient.BottomMenu;
import tbclient.CategoryInfo;
import tbclient.Esport;
import tbclient.ForumArIno;
import tbclient.ForumPresentInfo;
import tbclient.FrsTabInfo;
import tbclient.FrsVideo;
import tbclient.NaGuide;
import tbclient.Novel;
import tbclient.Page;
import tbclient.PopInfo;
import tbclient.RecommendInfo;
import tbclient.RedpacketRain;
import tbclient.SdkTopicThread;
import tbclient.SmartApp;
import tbclient.ThreadInfo;
import tbclient.User;
import tbclient.VitalityInfo;
import tbclient.WindowToast;
import tbclient.ZhiBoInfoTW;
/* loaded from: classes7.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_ASP_SHOWN_INFO = "";
    public static final String DEFAULT_BAWU_ENTER_URL = "";
    public static final String DEFAULT_FORTUNE_DESC = "";
    public static final String DEFAULT_PARTIAL_VISIBLE_TOAST = "";
    @ProtoField(tag = 87)
    public final ActivityConfig activity_config;
    @ProtoField(tag = 23)
    public final ActivityHead activityhead;
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
    @ProtoField(label = Message.Label.REPEATED, tag = 68)
    public final List<FrsTabInfo> frs_game_tab_info;
    @ProtoField(tag = 3)
    public final StarInfo frs_star;
    @ProtoField(tag = 38, type = Message.Datatype.INT32)
    public final Integer frs_tab_default;
    @ProtoField(label = Message.Label.REPEATED, tag = 22)
    public final List<FrsTabInfo> frs_tab_info;
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
    @ProtoField(tag = 15)
    public final Info info;
    @ProtoField(tag = 49, type = Message.Datatype.INT32)
    public final Integer is_auto_play_forumheadvideo;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_new_url;
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
    public final tbclient.StarVoice star_voice;
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
    public final tbclient.FrsPageUserExtend user_extend;
    @ProtoField(label = Message.Label.REPEATED, tag = 17)
    public final List<User> user_list;
    @ProtoField(tag = 73)
    public final FrsVideo video;
    @ProtoField(tag = 93, type = Message.Datatype.INT32)
    public final Integer video_auto_play;
    @ProtoField(tag = 42)
    public final VitalityInfo vitality_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 85)
    public final List<WindowToast> window_toast;
    @ProtoField(tag = 89)
    public final WorldcupSkin worldcup_skin;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final List<Long> DEFAULT_THREAD_ID_LIST = Collections.emptyList();
    public static final Integer DEFAULT_IS_NEW_URL = 0;
    public static final Integer DEFAULT_FORTUNE_BAG = 0;
    public static final Integer DEFAULT_TIME = 0;
    public static final Integer DEFAULT_CTIME = 0;
    public static final Long DEFAULT_LOGID = 0L;
    public static final Integer DEFAULT_SERVER_TIME = 0;
    public static final List<AnchorInfo> DEFAULT_FORUM_LIVEGROUP_LIST = Collections.emptyList();
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    public static final List<StarEnter> DEFAULT_STAR_ENTER = Collections.emptyList();
    public static final List<ColorEgg> DEFAULT_COLOR_EGG = Collections.emptyList();
    public static final List<FrsTabInfo> DEFAULT_FRS_TAB_INFO = Collections.emptyList();
    public static final List<ZhiBoInfoTW> DEFAULT_TWZHIBO_INFO = Collections.emptyList();
    public static final Integer DEFAULT_TWZHIBO_POS = 0;
    public static final List<CategoryInfo> DEFAULT_CATEGORY_LIST = Collections.emptyList();
    public static final List<ThreadInfo> DEFAULT_CARD_SHIPIN_INFO = Collections.emptyList();
    public static final Integer DEFAULT_FRS_TAB_DEFAULT = 0;
    public static final Integer DEFAULT_SORT_TYPE = 0;
    public static final Integer DEFAULT_SCHOOL_RECOM_POS = 0;
    public static final List<BannerThreadInfo> DEFAULT_BANNER_THREAD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_SMART_FRS_TYPE = 0;
    public static final Integer DEFAULT_NEED_LOG = 0;
    public static final Integer DEFAULT_IS_AUTO_PLAY_FORUMHEADVIDEO = 0;
    public static final List<Integer> DEFAULT_CARD_SHIPIN_POS = Collections.emptyList();
    public static final List<ThreadInfo> DEFAULT_CARD_SHIPIN_NEW = Collections.emptyList();
    public static final Integer DEFAULT_ALA_LIVE_COUNT = 0;
    public static final List<ThreadIdListInfo> DEFAULT_THREAD_ID_LIST_INFO = Collections.emptyList();
    public static final List<FrsTabInfo> DEFAULT_FRS_GAME_TAB_INFO = Collections.emptyList();
    public static final Integer DEFAULT_GAME_DEFAULT_TAB_ID = 0;
    public static final List<ThreadInfo> DEFAULT_ALA_INSERT_THREAD = Collections.emptyList();
    public static final Integer DEFAULT_ALA_INSERT_FLOOR = 0;
    public static final List<ThreadInfo> DEFAULT_ALA_STAGE_LIST = Collections.emptyList();
    public static final Integer DEFAULT_TRENDS_REDPOINT = 0;
    public static final List<WindowToast> DEFAULT_WINDOW_TOAST = Collections.emptyList();
    public static final List<BottomMenu> DEFAULT_BOTTOM_MENU = Collections.emptyList();
    public static final Integer DEFAULT_VIDEO_AUTO_PLAY = 0;
    public static final List<String> DEFAULT_SMART_APP_AVATAR = Collections.emptyList();

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user = builder.user;
            this.forum = builder.forum;
            this.frs_star = builder.frs_star;
            this.page = builder.page;
            this.anti = builder.anti;
            this.group = builder.group;
            if (builder.thread_list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = immutableCopyOf(builder.thread_list);
            }
            if (builder.thread_id_list == null) {
                this.thread_id_list = DEFAULT_THREAD_ID_LIST;
            } else {
                this.thread_id_list = immutableCopyOf(builder.thread_id_list);
            }
            if (builder.is_new_url == null) {
                this.is_new_url = DEFAULT_IS_NEW_URL;
            } else {
                this.is_new_url = builder.is_new_url;
            }
            if (builder.fortune_bag == null) {
                this.fortune_bag = DEFAULT_FORTUNE_BAG;
            } else {
                this.fortune_bag = builder.fortune_bag;
            }
            if (builder.time == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = builder.time;
            }
            if (builder.ctime == null) {
                this.ctime = DEFAULT_CTIME;
            } else {
                this.ctime = builder.ctime;
            }
            if (builder.logid == null) {
                this.logid = DEFAULT_LOGID;
            } else {
                this.logid = builder.logid;
            }
            if (builder.server_time == null) {
                this.server_time = DEFAULT_SERVER_TIME;
            } else {
                this.server_time = builder.server_time;
            }
            this.info = builder.info;
            if (builder.forum_livegroup_list == null) {
                this.forum_livegroup_list = DEFAULT_FORUM_LIVEGROUP_LIST;
            } else {
                this.forum_livegroup_list = immutableCopyOf(builder.forum_livegroup_list);
            }
            if (builder.user_list == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = immutableCopyOf(builder.user_list);
            }
            this.gcon_account = builder.gcon_account;
            if (builder.fortune_desc == null) {
                this.fortune_desc = "";
            } else {
                this.fortune_desc = builder.fortune_desc;
            }
            if (builder.star_enter == null) {
                this.star_enter = DEFAULT_STAR_ENTER;
            } else {
                this.star_enter = immutableCopyOf(builder.star_enter);
            }
            if (builder.color_egg == null) {
                this.color_egg = DEFAULT_COLOR_EGG;
            } else {
                this.color_egg = immutableCopyOf(builder.color_egg);
            }
            if (builder.frs_tab_info == null) {
                this.frs_tab_info = DEFAULT_FRS_TAB_INFO;
            } else {
                this.frs_tab_info = immutableCopyOf(builder.frs_tab_info);
            }
            this.activityhead = builder.activityhead;
            if (builder.twzhibo_info == null) {
                this.twzhibo_info = DEFAULT_TWZHIBO_INFO;
            } else {
                this.twzhibo_info = immutableCopyOf(builder.twzhibo_info);
            }
            this.novel = builder.novel;
            this.hot_twzhibo_info = builder.hot_twzhibo_info;
            if (builder.twzhibo_pos == null) {
                this.twzhibo_pos = DEFAULT_TWZHIBO_POS;
            } else {
                this.twzhibo_pos = builder.twzhibo_pos;
            }
            if (builder.category_list == null) {
                this.category_list = DEFAULT_CATEGORY_LIST;
            } else {
                this.category_list = immutableCopyOf(builder.category_list);
            }
            this.push_thread_info = builder.push_thread_info;
            this.store_card = builder.store_card;
            this.sdk_topic_thread = builder.sdk_topic_thread;
            if (builder.bawu_enter_url == null) {
                this.bawu_enter_url = "";
            } else {
                this.bawu_enter_url = builder.bawu_enter_url;
            }
            this.client_platform = builder.client_platform;
            this.head_sdk = builder.head_sdk;
            if (builder.card_shipin_info == null) {
                this.card_shipin_info = DEFAULT_CARD_SHIPIN_INFO;
            } else {
                this.card_shipin_info = immutableCopyOf(builder.card_shipin_info);
            }
            this.nav_tab_info = builder.nav_tab_info;
            if (builder.frs_tab_default == null) {
                this.frs_tab_default = DEFAULT_FRS_TAB_DEFAULT;
            } else {
                this.frs_tab_default = builder.frs_tab_default;
            }
            if (builder.sort_type == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
            } else {
                this.sort_type = builder.sort_type;
            }
            this.school_recom_info = builder.school_recom_info;
            if (builder.school_recom_pos == null) {
                this.school_recom_pos = DEFAULT_SCHOOL_RECOM_POS;
            } else {
                this.school_recom_pos = builder.school_recom_pos;
            }
            this.vitality_info = builder.vitality_info;
            this.carrier_enter = builder.carrier_enter;
            if (builder.banner_thread_list == null) {
                this.banner_thread_list = DEFAULT_BANNER_THREAD_LIST;
            } else {
                this.banner_thread_list = immutableCopyOf(builder.banner_thread_list);
            }
            this.recommend_book = builder.recommend_book;
            if (builder.smart_frs_type == null) {
                this.smart_frs_type = DEFAULT_SMART_FRS_TYPE;
            } else {
                this.smart_frs_type = builder.smart_frs_type;
            }
            if (builder.need_log == null) {
                this.need_log = DEFAULT_NEED_LOG;
            } else {
                this.need_log = builder.need_log;
            }
            if (builder.is_auto_play_forumheadvideo == null) {
                this.is_auto_play_forumheadvideo = DEFAULT_IS_AUTO_PLAY_FORUMHEADVIDEO;
            } else {
                this.is_auto_play_forumheadvideo = builder.is_auto_play_forumheadvideo;
            }
            this.book_info = builder.book_info;
            this.forum_present_info = builder.forum_present_info;
            this.forum_headline_img_info = builder.forum_headline_img_info;
            this.ntspread = builder.ntspread;
            if (builder.card_shipin_pos == null) {
                this.card_shipin_pos = DEFAULT_CARD_SHIPIN_POS;
            } else {
                this.card_shipin_pos = immutableCopyOf(builder.card_shipin_pos);
            }
            if (builder.card_shipin_new == null) {
                this.card_shipin_new = DEFAULT_CARD_SHIPIN_NEW;
            } else {
                this.card_shipin_new = immutableCopyOf(builder.card_shipin_new);
            }
            if (builder.asp_shown_info == null) {
                this.asp_shown_info = "";
            } else {
                this.asp_shown_info = builder.asp_shown_info;
            }
            if (builder.ala_live_count == null) {
                this.ala_live_count = DEFAULT_ALA_LIVE_COUNT;
            } else {
                this.ala_live_count = builder.ala_live_count;
            }
            this.bottle = builder.bottle;
            this.enter_pop_info = builder.enter_pop_info;
            if (builder.partial_visible_toast == null) {
                this.partial_visible_toast = "";
            } else {
                this.partial_visible_toast = builder.partial_visible_toast;
            }
            this.esport = builder.esport;
            if (builder.thread_id_list_info == null) {
                this.thread_id_list_info = DEFAULT_THREAD_ID_LIST_INFO;
            } else {
                this.thread_id_list_info = immutableCopyOf(builder.thread_id_list_info);
            }
            this.agree_banner = builder.agree_banner;
            this.na_guide = builder.na_guide;
            if (builder.frs_game_tab_info == null) {
                this.frs_game_tab_info = DEFAULT_FRS_GAME_TAB_INFO;
            } else {
                this.frs_game_tab_info = immutableCopyOf(builder.frs_game_tab_info);
            }
            this.live_frs_notify = builder.live_frs_notify;
            this.banner_user_story = builder.banner_user_story;
            this.user_extend = builder.user_extend;
            this.forum_head_icon = builder.forum_head_icon;
            this.video = builder.video;
            if (builder.game_default_tab_id == null) {
                this.game_default_tab_id = DEFAULT_GAME_DEFAULT_TAB_ID;
            } else {
                this.game_default_tab_id = builder.game_default_tab_id;
            }
            if (builder.ala_insert_thread == null) {
                this.ala_insert_thread = DEFAULT_ALA_INSERT_THREAD;
            } else {
                this.ala_insert_thread = immutableCopyOf(builder.ala_insert_thread);
            }
            this.ala_live_insert = builder.ala_live_insert;
            if (builder.ala_insert_floor == null) {
                this.ala_insert_floor = DEFAULT_ALA_INSERT_FLOOR;
            } else {
                this.ala_insert_floor = builder.ala_insert_floor;
            }
            this.forum_ar_info = builder.forum_ar_info;
            if (builder.ala_stage_list == null) {
                this.ala_stage_list = DEFAULT_ALA_STAGE_LIST;
            } else {
                this.ala_stage_list = immutableCopyOf(builder.ala_stage_list);
            }
            this.star_rank_info = builder.star_rank_info;
            if (builder.trends_redpoint == null) {
                this.trends_redpoint = DEFAULT_TRENDS_REDPOINT;
            } else {
                this.trends_redpoint = builder.trends_redpoint;
            }
            if (builder.window_toast == null) {
                this.window_toast = DEFAULT_WINDOW_TOAST;
            } else {
                this.window_toast = immutableCopyOf(builder.window_toast);
            }
            this.recom_post_topic = builder.recom_post_topic;
            this.activity_config = builder.activity_config;
            this.star_voice = builder.star_voice;
            this.worldcup_skin = builder.worldcup_skin;
            this.redpacketrain = builder.redpacketrain;
            this.brand_forum_info = builder.brand_forum_info;
            if (builder.bottom_menu == null) {
                this.bottom_menu = DEFAULT_BOTTOM_MENU;
            } else {
                this.bottom_menu = immutableCopyOf(builder.bottom_menu);
            }
            if (builder.video_auto_play == null) {
                this.video_auto_play = DEFAULT_VIDEO_AUTO_PLAY;
            } else {
                this.video_auto_play = builder.video_auto_play;
            }
            if (builder.smart_app_avatar == null) {
                this.smart_app_avatar = DEFAULT_SMART_APP_AVATAR;
            } else {
                this.smart_app_avatar = immutableCopyOf(builder.smart_app_avatar);
            }
            this.smart_app = builder.smart_app;
            this.nebula_hot_threads = builder.nebula_hot_threads;
            this.private_forum_info = builder.private_forum_info;
            this.private_forum_active_info = builder.private_forum_active_info;
            this.business_promot = builder.business_promot;
            return;
        }
        this.user = builder.user;
        this.forum = builder.forum;
        this.frs_star = builder.frs_star;
        this.page = builder.page;
        this.anti = builder.anti;
        this.group = builder.group;
        this.thread_list = immutableCopyOf(builder.thread_list);
        this.thread_id_list = immutableCopyOf(builder.thread_id_list);
        this.is_new_url = builder.is_new_url;
        this.fortune_bag = builder.fortune_bag;
        this.time = builder.time;
        this.ctime = builder.ctime;
        this.logid = builder.logid;
        this.server_time = builder.server_time;
        this.info = builder.info;
        this.forum_livegroup_list = immutableCopyOf(builder.forum_livegroup_list);
        this.user_list = immutableCopyOf(builder.user_list);
        this.gcon_account = builder.gcon_account;
        this.fortune_desc = builder.fortune_desc;
        this.star_enter = immutableCopyOf(builder.star_enter);
        this.color_egg = immutableCopyOf(builder.color_egg);
        this.frs_tab_info = immutableCopyOf(builder.frs_tab_info);
        this.activityhead = builder.activityhead;
        this.twzhibo_info = immutableCopyOf(builder.twzhibo_info);
        this.novel = builder.novel;
        this.hot_twzhibo_info = builder.hot_twzhibo_info;
        this.twzhibo_pos = builder.twzhibo_pos;
        this.category_list = immutableCopyOf(builder.category_list);
        this.push_thread_info = builder.push_thread_info;
        this.store_card = builder.store_card;
        this.sdk_topic_thread = builder.sdk_topic_thread;
        this.bawu_enter_url = builder.bawu_enter_url;
        this.client_platform = builder.client_platform;
        this.head_sdk = builder.head_sdk;
        this.card_shipin_info = immutableCopyOf(builder.card_shipin_info);
        this.nav_tab_info = builder.nav_tab_info;
        this.frs_tab_default = builder.frs_tab_default;
        this.sort_type = builder.sort_type;
        this.school_recom_info = builder.school_recom_info;
        this.school_recom_pos = builder.school_recom_pos;
        this.vitality_info = builder.vitality_info;
        this.carrier_enter = builder.carrier_enter;
        this.banner_thread_list = immutableCopyOf(builder.banner_thread_list);
        this.recommend_book = builder.recommend_book;
        this.smart_frs_type = builder.smart_frs_type;
        this.need_log = builder.need_log;
        this.is_auto_play_forumheadvideo = builder.is_auto_play_forumheadvideo;
        this.book_info = builder.book_info;
        this.forum_present_info = builder.forum_present_info;
        this.forum_headline_img_info = builder.forum_headline_img_info;
        this.ntspread = builder.ntspread;
        this.card_shipin_pos = immutableCopyOf(builder.card_shipin_pos);
        this.card_shipin_new = immutableCopyOf(builder.card_shipin_new);
        this.asp_shown_info = builder.asp_shown_info;
        this.ala_live_count = builder.ala_live_count;
        this.bottle = builder.bottle;
        this.enter_pop_info = builder.enter_pop_info;
        this.partial_visible_toast = builder.partial_visible_toast;
        this.esport = builder.esport;
        this.thread_id_list_info = immutableCopyOf(builder.thread_id_list_info);
        this.agree_banner = builder.agree_banner;
        this.na_guide = builder.na_guide;
        this.frs_game_tab_info = immutableCopyOf(builder.frs_game_tab_info);
        this.live_frs_notify = builder.live_frs_notify;
        this.banner_user_story = builder.banner_user_story;
        this.user_extend = builder.user_extend;
        this.forum_head_icon = builder.forum_head_icon;
        this.video = builder.video;
        this.game_default_tab_id = builder.game_default_tab_id;
        this.ala_insert_thread = immutableCopyOf(builder.ala_insert_thread);
        this.ala_live_insert = builder.ala_live_insert;
        this.ala_insert_floor = builder.ala_insert_floor;
        this.forum_ar_info = builder.forum_ar_info;
        this.ala_stage_list = immutableCopyOf(builder.ala_stage_list);
        this.star_rank_info = builder.star_rank_info;
        this.trends_redpoint = builder.trends_redpoint;
        this.window_toast = immutableCopyOf(builder.window_toast);
        this.recom_post_topic = builder.recom_post_topic;
        this.activity_config = builder.activity_config;
        this.star_voice = builder.star_voice;
        this.worldcup_skin = builder.worldcup_skin;
        this.redpacketrain = builder.redpacketrain;
        this.brand_forum_info = builder.brand_forum_info;
        this.bottom_menu = immutableCopyOf(builder.bottom_menu);
        this.video_auto_play = builder.video_auto_play;
        this.smart_app_avatar = immutableCopyOf(builder.smart_app_avatar);
        this.smart_app = builder.smart_app;
        this.nebula_hot_threads = builder.nebula_hot_threads;
        this.private_forum_info = builder.private_forum_info;
        this.private_forum_active_info = builder.private_forum_active_info;
        this.business_promot = builder.business_promot;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public ActivityConfig activity_config;
        public ActivityHead activityhead;
        public AgreeBanner agree_banner;
        public Integer ala_insert_floor;
        public List<ThreadInfo> ala_insert_thread;
        public Integer ala_live_count;
        public AlaLiveInsert ala_live_insert;
        public List<ThreadInfo> ala_stage_list;
        public Anti anti;
        public String asp_shown_info;
        public List<BannerThreadInfo> banner_thread_list;
        public BannerUserStory banner_user_story;
        public String bawu_enter_url;
        public ForumBookInfo book_info;
        public Bottle bottle;
        public List<BottomMenu> bottom_menu;
        public BrandForumInfo brand_forum_info;
        public BusinessPromot business_promot;
        public List<ThreadInfo> card_shipin_info;
        public List<ThreadInfo> card_shipin_new;
        public List<Integer> card_shipin_pos;
        public CarrierEnter carrier_enter;
        public List<CategoryInfo> category_list;
        public ClientPlatform client_platform;
        public List<ColorEgg> color_egg;
        public Integer ctime;
        public PopInfo enter_pop_info;
        public Esport esport;
        public Integer fortune_bag;
        public String fortune_desc;
        public ForumInfo forum;
        public ForumArIno forum_ar_info;
        public ForumHeadIcon forum_head_icon;
        public ForumHeadlineImgInfo forum_headline_img_info;
        public List<AnchorInfo> forum_livegroup_list;
        public ForumPresentInfo forum_present_info;
        public List<FrsTabInfo> frs_game_tab_info;
        public StarInfo frs_star;
        public Integer frs_tab_default;
        public List<FrsTabInfo> frs_tab_info;
        public Integer game_default_tab_id;
        public GconAccount gcon_account;
        public Group group;
        public HeadSdk head_sdk;
        public ZhiBoInfoTW hot_twzhibo_info;
        public Info info;
        public Integer is_auto_play_forumheadvideo;
        public Integer is_new_url;
        public AlaLiveNotify live_frs_notify;
        public Long logid;
        public NaGuide na_guide;
        public NavTabInfo nav_tab_info;
        public NebulaHotThreads nebula_hot_threads;
        public Integer need_log;
        public Novel novel;
        public NtSpreadInfo ntspread;
        public Page page;
        public String partial_visible_toast;
        public ForumActiveInfo private_forum_active_info;
        public PrivateForumTotalInfo private_forum_info;
        public PushThreadInfo push_thread_info;
        public RecomPostTopic recom_post_topic;
        public RecommendBook recommend_book;
        public RedpacketRain redpacketrain;
        public RecommendInfo school_recom_info;
        public Integer school_recom_pos;
        public SdkTopicThread sdk_topic_thread;
        public Integer server_time;
        public SmartApp smart_app;
        public List<String> smart_app_avatar;
        public Integer smart_frs_type;
        public Integer sort_type;
        public List<StarEnter> star_enter;
        public StarRank star_rank_info;
        public tbclient.StarVoice star_voice;
        public ThreadInfo store_card;
        public List<Long> thread_id_list;
        public List<ThreadIdListInfo> thread_id_list_info;
        public List<ThreadInfo> thread_list;
        public Integer time;
        public Integer trends_redpoint;
        public List<ZhiBoInfoTW> twzhibo_info;
        public Integer twzhibo_pos;
        public User user;
        public tbclient.FrsPageUserExtend user_extend;
        public List<User> user_list;
        public FrsVideo video;
        public Integer video_auto_play;
        public VitalityInfo vitality_info;
        public List<WindowToast> window_toast;
        public WorldcupSkin worldcup_skin;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.user = dataRes.user;
                this.forum = dataRes.forum;
                this.frs_star = dataRes.frs_star;
                this.page = dataRes.page;
                this.anti = dataRes.anti;
                this.group = dataRes.group;
                this.thread_list = DataRes.copyOf(dataRes.thread_list);
                this.thread_id_list = DataRes.copyOf(dataRes.thread_id_list);
                this.is_new_url = dataRes.is_new_url;
                this.fortune_bag = dataRes.fortune_bag;
                this.time = dataRes.time;
                this.ctime = dataRes.ctime;
                this.logid = dataRes.logid;
                this.server_time = dataRes.server_time;
                this.info = dataRes.info;
                this.forum_livegroup_list = DataRes.copyOf(dataRes.forum_livegroup_list);
                this.user_list = DataRes.copyOf(dataRes.user_list);
                this.gcon_account = dataRes.gcon_account;
                this.fortune_desc = dataRes.fortune_desc;
                this.star_enter = DataRes.copyOf(dataRes.star_enter);
                this.color_egg = DataRes.copyOf(dataRes.color_egg);
                this.frs_tab_info = DataRes.copyOf(dataRes.frs_tab_info);
                this.activityhead = dataRes.activityhead;
                this.twzhibo_info = DataRes.copyOf(dataRes.twzhibo_info);
                this.novel = dataRes.novel;
                this.hot_twzhibo_info = dataRes.hot_twzhibo_info;
                this.twzhibo_pos = dataRes.twzhibo_pos;
                this.category_list = DataRes.copyOf(dataRes.category_list);
                this.push_thread_info = dataRes.push_thread_info;
                this.store_card = dataRes.store_card;
                this.sdk_topic_thread = dataRes.sdk_topic_thread;
                this.bawu_enter_url = dataRes.bawu_enter_url;
                this.client_platform = dataRes.client_platform;
                this.head_sdk = dataRes.head_sdk;
                this.card_shipin_info = DataRes.copyOf(dataRes.card_shipin_info);
                this.nav_tab_info = dataRes.nav_tab_info;
                this.frs_tab_default = dataRes.frs_tab_default;
                this.sort_type = dataRes.sort_type;
                this.school_recom_info = dataRes.school_recom_info;
                this.school_recom_pos = dataRes.school_recom_pos;
                this.vitality_info = dataRes.vitality_info;
                this.carrier_enter = dataRes.carrier_enter;
                this.banner_thread_list = DataRes.copyOf(dataRes.banner_thread_list);
                this.recommend_book = dataRes.recommend_book;
                this.smart_frs_type = dataRes.smart_frs_type;
                this.need_log = dataRes.need_log;
                this.is_auto_play_forumheadvideo = dataRes.is_auto_play_forumheadvideo;
                this.book_info = dataRes.book_info;
                this.forum_present_info = dataRes.forum_present_info;
                this.forum_headline_img_info = dataRes.forum_headline_img_info;
                this.ntspread = dataRes.ntspread;
                this.card_shipin_pos = DataRes.copyOf(dataRes.card_shipin_pos);
                this.card_shipin_new = DataRes.copyOf(dataRes.card_shipin_new);
                this.asp_shown_info = dataRes.asp_shown_info;
                this.ala_live_count = dataRes.ala_live_count;
                this.bottle = dataRes.bottle;
                this.enter_pop_info = dataRes.enter_pop_info;
                this.partial_visible_toast = dataRes.partial_visible_toast;
                this.esport = dataRes.esport;
                this.thread_id_list_info = DataRes.copyOf(dataRes.thread_id_list_info);
                this.agree_banner = dataRes.agree_banner;
                this.na_guide = dataRes.na_guide;
                this.frs_game_tab_info = DataRes.copyOf(dataRes.frs_game_tab_info);
                this.live_frs_notify = dataRes.live_frs_notify;
                this.banner_user_story = dataRes.banner_user_story;
                this.user_extend = dataRes.user_extend;
                this.forum_head_icon = dataRes.forum_head_icon;
                this.video = dataRes.video;
                this.game_default_tab_id = dataRes.game_default_tab_id;
                this.ala_insert_thread = DataRes.copyOf(dataRes.ala_insert_thread);
                this.ala_live_insert = dataRes.ala_live_insert;
                this.ala_insert_floor = dataRes.ala_insert_floor;
                this.forum_ar_info = dataRes.forum_ar_info;
                this.ala_stage_list = DataRes.copyOf(dataRes.ala_stage_list);
                this.star_rank_info = dataRes.star_rank_info;
                this.trends_redpoint = dataRes.trends_redpoint;
                this.window_toast = DataRes.copyOf(dataRes.window_toast);
                this.recom_post_topic = dataRes.recom_post_topic;
                this.activity_config = dataRes.activity_config;
                this.star_voice = dataRes.star_voice;
                this.worldcup_skin = dataRes.worldcup_skin;
                this.redpacketrain = dataRes.redpacketrain;
                this.brand_forum_info = dataRes.brand_forum_info;
                this.bottom_menu = DataRes.copyOf(dataRes.bottom_menu);
                this.video_auto_play = dataRes.video_auto_play;
                this.smart_app_avatar = DataRes.copyOf(dataRes.smart_app_avatar);
                this.smart_app = dataRes.smart_app;
                this.nebula_hot_threads = dataRes.nebula_hot_threads;
                this.private_forum_info = dataRes.private_forum_info;
                this.private_forum_active_info = dataRes.private_forum_active_info;
                this.business_promot = dataRes.business_promot;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
