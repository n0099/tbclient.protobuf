package tbclient.FrsPage;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
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
import tbclient.FrsPageUserExtend;
import tbclient.FrsTabInfo;
import tbclient.FrsVideo;
import tbclient.HotUserRankEntry;
import tbclient.ItemInfo;
import tbclient.NaGuide;
import tbclient.Novel;
import tbclient.Page;
import tbclient.PopInfo;
import tbclient.PrivatePopInfo;
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
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
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
    public static final Integer DEFAULT_BAWU_UNREAD_NOTICE_NUM;
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
    public static final Integer DEFAULT_IS_MEMBER_BROADCAST_FORUM;
    public static final Integer DEFAULT_IS_NEW_URL;
    public static final List<LiveFuseForumData> DEFAULT_LIVE_FUSE_FORUM;
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
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST;
    public static final Integer DEFAULT_TIME;
    public static final Integer DEFAULT_TRENDS_REDPOINT;
    public static final List<ZhiBoInfoTW> DEFAULT_TWZHIBO_INFO;
    public static final Integer DEFAULT_TWZHIBO_POS;
    public static final List<User> DEFAULT_USER_LIST;
    public static final Integer DEFAULT_VIDEO_AUTO_PLAY;
    public static final Integer DEFAULT_VOICE_ROOM_CONFIG;
    public static final List<ThreadInfo> DEFAULT_VOICE_ROOM_LIST;
    public static final List<WindowToast> DEFAULT_WINDOW_TOAST;
    public transient /* synthetic */ FieldHolder $fh;
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
    @ProtoField(tag = 117, type = Message.Datatype.INT32)
    public final Integer bawu_unread_notice_num;
    @ProtoField(tag = 115)
    public final PrivatePopInfo bawutask_pop;
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
    @ProtoField(tag = 119, type = Message.Datatype.INT32)
    public final Integer is_member_broadcast_forum;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_new_url;
    @ProtoField(tag = 103)
    public final ItemInfo item_info;
    @ProtoField(tag = 69)
    public final AlaLiveNotify live_frs_notify;
    @ProtoField(label = Message.Label.REPEATED, tag = 116)
    public final List<LiveFuseForumData> live_fuse_forum;
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
    @ProtoField(tag = 118)
    public final RecreationRankInfo recreation_rank_info;
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

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public ActivityConfig activity_config;
        public ActivityHead activityhead;
        public List<AdMixFloor> ad_mix_list;
        public String ad_sample_map_key;
        public Integer ad_show_select;
        public AddBawuPopInfo add_bawu_pop;
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
        public Integer bawu_unread_notice_num;
        public PrivatePopInfo bawutask_pop;
        public WindowToast bazhu_exam_fail;
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
        public ForumRuleStatus forum_rule;
        public List<FrsTabInfo> frs_game_tab_info;
        public StarInfo frs_star;
        public Integer frs_tab_default;
        public List<FrsTabInfo> frs_tab_info;
        public PopInfo frsmask_pop_info;
        public Integer game_default_tab_id;
        public GconAccount gcon_account;
        public Group group;
        public HeadSdk head_sdk;
        public ZhiBoInfoTW hot_twzhibo_info;
        public HotUserRankEntry hot_user_entry;
        public Info info;
        public Integer is_auto_play_forumheadvideo;
        public Integer is_get_horse_race_lamp;
        public Integer is_member_broadcast_forum;
        public Integer is_new_url;
        public ItemInfo item_info;
        public AlaLiveNotify live_frs_notify;
        public List<LiveFuseForumData> live_fuse_forum;
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
        public RecreationRankInfo recreation_rank_info;
        public RedpacketRain redpacketrain;
        public RecommendInfo school_recom_info;
        public Integer school_recom_pos;
        public SdkTopicThread sdk_topic_thread;
        public Integer server_time;
        public List<ServiceArea> service_area;
        public Integer show_adsense;
        public SignActivityInfo sign_activity_info;
        public SmartApp smart_app;
        public List<String> smart_app_avatar;
        public Integer smart_frs_type;
        public Integer sort_type;
        public List<StarEnter> star_enter;
        public StarRank star_rank_info;
        public StarVoice star_voice;
        public ThreadInfo store_card;
        public List<Long> thread_id_list;
        public List<ThreadIdListInfo> thread_id_list_info;
        public List<ThreadInfo> thread_list;
        public Integer time;
        public Integer trends_redpoint;
        public List<ZhiBoInfoTW> twzhibo_info;
        public Integer twzhibo_pos;
        public User user;
        public FrsPageUserExtend user_extend;
        public List<User> user_list;
        public FrsVideo video;
        public Integer video_auto_play;
        public VitalityInfo vitality_info;
        public Integer voice_room_config;
        public List<ThreadInfo> voice_room_list;
        public List<WindowToast> window_toast;
        public WorldcupSkin worldcup_skin;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (dataRes == null) {
                return;
            }
            this.user = dataRes.user;
            this.forum = dataRes.forum;
            this.frs_star = dataRes.frs_star;
            this.page = dataRes.page;
            this.anti = dataRes.anti;
            this.group = dataRes.group;
            this.thread_list = Message.copyOf(dataRes.thread_list);
            this.thread_id_list = Message.copyOf(dataRes.thread_id_list);
            this.is_new_url = dataRes.is_new_url;
            this.fortune_bag = dataRes.fortune_bag;
            this.time = dataRes.time;
            this.ctime = dataRes.ctime;
            this.logid = dataRes.logid;
            this.server_time = dataRes.server_time;
            this.info = dataRes.info;
            this.forum_livegroup_list = Message.copyOf(dataRes.forum_livegroup_list);
            this.user_list = Message.copyOf(dataRes.user_list);
            this.gcon_account = dataRes.gcon_account;
            this.fortune_desc = dataRes.fortune_desc;
            this.star_enter = Message.copyOf(dataRes.star_enter);
            this.color_egg = Message.copyOf(dataRes.color_egg);
            this.frs_tab_info = Message.copyOf(dataRes.frs_tab_info);
            this.activityhead = dataRes.activityhead;
            this.twzhibo_info = Message.copyOf(dataRes.twzhibo_info);
            this.novel = dataRes.novel;
            this.hot_twzhibo_info = dataRes.hot_twzhibo_info;
            this.twzhibo_pos = dataRes.twzhibo_pos;
            this.category_list = Message.copyOf(dataRes.category_list);
            this.push_thread_info = dataRes.push_thread_info;
            this.store_card = dataRes.store_card;
            this.sdk_topic_thread = dataRes.sdk_topic_thread;
            this.bawu_enter_url = dataRes.bawu_enter_url;
            this.client_platform = dataRes.client_platform;
            this.head_sdk = dataRes.head_sdk;
            this.card_shipin_info = Message.copyOf(dataRes.card_shipin_info);
            this.nav_tab_info = dataRes.nav_tab_info;
            this.frs_tab_default = dataRes.frs_tab_default;
            this.sort_type = dataRes.sort_type;
            this.school_recom_info = dataRes.school_recom_info;
            this.school_recom_pos = dataRes.school_recom_pos;
            this.vitality_info = dataRes.vitality_info;
            this.carrier_enter = dataRes.carrier_enter;
            this.banner_thread_list = Message.copyOf(dataRes.banner_thread_list);
            this.recommend_book = dataRes.recommend_book;
            this.smart_frs_type = dataRes.smart_frs_type;
            this.need_log = dataRes.need_log;
            this.is_auto_play_forumheadvideo = dataRes.is_auto_play_forumheadvideo;
            this.book_info = dataRes.book_info;
            this.forum_present_info = dataRes.forum_present_info;
            this.forum_headline_img_info = dataRes.forum_headline_img_info;
            this.ntspread = dataRes.ntspread;
            this.card_shipin_pos = Message.copyOf(dataRes.card_shipin_pos);
            this.card_shipin_new = Message.copyOf(dataRes.card_shipin_new);
            this.asp_shown_info = dataRes.asp_shown_info;
            this.ala_live_count = dataRes.ala_live_count;
            this.bottle = dataRes.bottle;
            this.enter_pop_info = dataRes.enter_pop_info;
            this.partial_visible_toast = dataRes.partial_visible_toast;
            this.esport = dataRes.esport;
            this.thread_id_list_info = Message.copyOf(dataRes.thread_id_list_info);
            this.agree_banner = dataRes.agree_banner;
            this.na_guide = dataRes.na_guide;
            this.frs_game_tab_info = Message.copyOf(dataRes.frs_game_tab_info);
            this.live_frs_notify = dataRes.live_frs_notify;
            this.banner_user_story = dataRes.banner_user_story;
            this.user_extend = dataRes.user_extend;
            this.forum_head_icon = dataRes.forum_head_icon;
            this.video = dataRes.video;
            this.game_default_tab_id = dataRes.game_default_tab_id;
            this.ala_insert_thread = Message.copyOf(dataRes.ala_insert_thread);
            this.ala_live_insert = dataRes.ala_live_insert;
            this.ala_insert_floor = dataRes.ala_insert_floor;
            this.forum_ar_info = dataRes.forum_ar_info;
            this.ala_stage_list = Message.copyOf(dataRes.ala_stage_list);
            this.star_rank_info = dataRes.star_rank_info;
            this.trends_redpoint = dataRes.trends_redpoint;
            this.window_toast = Message.copyOf(dataRes.window_toast);
            this.recom_post_topic = dataRes.recom_post_topic;
            this.activity_config = dataRes.activity_config;
            this.star_voice = dataRes.star_voice;
            this.worldcup_skin = dataRes.worldcup_skin;
            this.redpacketrain = dataRes.redpacketrain;
            this.brand_forum_info = dataRes.brand_forum_info;
            this.bottom_menu = Message.copyOf(dataRes.bottom_menu);
            this.video_auto_play = dataRes.video_auto_play;
            this.smart_app_avatar = Message.copyOf(dataRes.smart_app_avatar);
            this.smart_app = dataRes.smart_app;
            this.nebula_hot_threads = dataRes.nebula_hot_threads;
            this.private_forum_info = dataRes.private_forum_info;
            this.private_forum_active_info = dataRes.private_forum_active_info;
            this.business_promot = dataRes.business_promot;
            this.service_area = Message.copyOf(dataRes.service_area);
            this.bazhu_exam_fail = dataRes.bazhu_exam_fail;
            this.hot_user_entry = dataRes.hot_user_entry;
            this.item_info = dataRes.item_info;
            this.is_get_horse_race_lamp = dataRes.is_get_horse_race_lamp;
            this.forum_rule = dataRes.forum_rule;
            this.sign_activity_info = dataRes.sign_activity_info;
            this.add_bawu_pop = dataRes.add_bawu_pop;
            this.show_adsense = dataRes.show_adsense;
            this.frsmask_pop_info = dataRes.frsmask_pop_info;
            this.voice_room_list = Message.copyOf(dataRes.voice_room_list);
            this.voice_room_config = dataRes.voice_room_config;
            this.ad_show_select = dataRes.ad_show_select;
            this.ad_mix_list = Message.copyOf(dataRes.ad_mix_list);
            this.ad_sample_map_key = dataRes.ad_sample_map_key;
            this.bawutask_pop = dataRes.bawutask_pop;
            this.live_fuse_forum = Message.copyOf(dataRes.live_fuse_forum);
            this.bawu_unread_notice_num = dataRes.bawu_unread_notice_num;
            this.recreation_rank_info = dataRes.recreation_rank_info;
            this.is_member_broadcast_forum = dataRes.is_member_broadcast_forum;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new DataRes(this, z, null);
            }
            return (DataRes) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1238029048, "Ltbclient/FrsPage/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1238029048, "Ltbclient/FrsPage/DataRes;");
                return;
            }
        }
        DEFAULT_THREAD_LIST = Collections.emptyList();
        DEFAULT_THREAD_ID_LIST = Collections.emptyList();
        DEFAULT_IS_NEW_URL = 0;
        DEFAULT_FORTUNE_BAG = 0;
        DEFAULT_TIME = 0;
        DEFAULT_CTIME = 0;
        DEFAULT_LOGID = 0L;
        DEFAULT_SERVER_TIME = 0;
        DEFAULT_FORUM_LIVEGROUP_LIST = Collections.emptyList();
        DEFAULT_USER_LIST = Collections.emptyList();
        DEFAULT_STAR_ENTER = Collections.emptyList();
        DEFAULT_COLOR_EGG = Collections.emptyList();
        DEFAULT_FRS_TAB_INFO = Collections.emptyList();
        DEFAULT_TWZHIBO_INFO = Collections.emptyList();
        DEFAULT_TWZHIBO_POS = 0;
        DEFAULT_CATEGORY_LIST = Collections.emptyList();
        DEFAULT_CARD_SHIPIN_INFO = Collections.emptyList();
        DEFAULT_FRS_TAB_DEFAULT = 0;
        DEFAULT_SORT_TYPE = 0;
        DEFAULT_SCHOOL_RECOM_POS = 0;
        DEFAULT_BANNER_THREAD_LIST = Collections.emptyList();
        DEFAULT_SMART_FRS_TYPE = 0;
        DEFAULT_NEED_LOG = 0;
        DEFAULT_IS_AUTO_PLAY_FORUMHEADVIDEO = 0;
        DEFAULT_CARD_SHIPIN_POS = Collections.emptyList();
        DEFAULT_CARD_SHIPIN_NEW = Collections.emptyList();
        DEFAULT_ALA_LIVE_COUNT = 0;
        DEFAULT_THREAD_ID_LIST_INFO = Collections.emptyList();
        DEFAULT_FRS_GAME_TAB_INFO = Collections.emptyList();
        DEFAULT_GAME_DEFAULT_TAB_ID = 0;
        DEFAULT_ALA_INSERT_THREAD = Collections.emptyList();
        DEFAULT_ALA_INSERT_FLOOR = 0;
        DEFAULT_ALA_STAGE_LIST = Collections.emptyList();
        DEFAULT_TRENDS_REDPOINT = 0;
        DEFAULT_WINDOW_TOAST = Collections.emptyList();
        DEFAULT_BOTTOM_MENU = Collections.emptyList();
        DEFAULT_VIDEO_AUTO_PLAY = 0;
        DEFAULT_SMART_APP_AVATAR = Collections.emptyList();
        DEFAULT_SERVICE_AREA = Collections.emptyList();
        DEFAULT_IS_GET_HORSE_RACE_LAMP = 0;
        DEFAULT_SHOW_ADSENSE = 0;
        DEFAULT_VOICE_ROOM_LIST = Collections.emptyList();
        DEFAULT_VOICE_ROOM_CONFIG = 0;
        DEFAULT_AD_SHOW_SELECT = 0;
        DEFAULT_AD_MIX_LIST = Collections.emptyList();
        DEFAULT_LIVE_FUSE_FORUM = Collections.emptyList();
        DEFAULT_BAWU_UNREAD_NOTICE_NUM = 0;
        DEFAULT_IS_MEMBER_BROADCAST_FORUM = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRes(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            this.user = builder.user;
            this.forum = builder.forum;
            this.frs_star = builder.frs_star;
            this.page = builder.page;
            this.anti = builder.anti;
            this.group = builder.group;
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            List<Long> list2 = builder.thread_id_list;
            if (list2 == null) {
                this.thread_id_list = DEFAULT_THREAD_ID_LIST;
            } else {
                this.thread_id_list = Message.immutableCopyOf(list2);
            }
            Integer num = builder.is_new_url;
            if (num == null) {
                this.is_new_url = DEFAULT_IS_NEW_URL;
            } else {
                this.is_new_url = num;
            }
            Integer num2 = builder.fortune_bag;
            if (num2 == null) {
                this.fortune_bag = DEFAULT_FORTUNE_BAG;
            } else {
                this.fortune_bag = num2;
            }
            Integer num3 = builder.time;
            if (num3 == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = num3;
            }
            Integer num4 = builder.ctime;
            if (num4 == null) {
                this.ctime = DEFAULT_CTIME;
            } else {
                this.ctime = num4;
            }
            Long l = builder.logid;
            if (l == null) {
                this.logid = DEFAULT_LOGID;
            } else {
                this.logid = l;
            }
            Integer num5 = builder.server_time;
            if (num5 == null) {
                this.server_time = DEFAULT_SERVER_TIME;
            } else {
                this.server_time = num5;
            }
            this.info = builder.info;
            List<AnchorInfo> list3 = builder.forum_livegroup_list;
            if (list3 == null) {
                this.forum_livegroup_list = DEFAULT_FORUM_LIVEGROUP_LIST;
            } else {
                this.forum_livegroup_list = Message.immutableCopyOf(list3);
            }
            List<User> list4 = builder.user_list;
            if (list4 == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = Message.immutableCopyOf(list4);
            }
            this.gcon_account = builder.gcon_account;
            String str = builder.fortune_desc;
            if (str == null) {
                this.fortune_desc = "";
            } else {
                this.fortune_desc = str;
            }
            List<StarEnter> list5 = builder.star_enter;
            if (list5 == null) {
                this.star_enter = DEFAULT_STAR_ENTER;
            } else {
                this.star_enter = Message.immutableCopyOf(list5);
            }
            List<ColorEgg> list6 = builder.color_egg;
            if (list6 == null) {
                this.color_egg = DEFAULT_COLOR_EGG;
            } else {
                this.color_egg = Message.immutableCopyOf(list6);
            }
            List<FrsTabInfo> list7 = builder.frs_tab_info;
            if (list7 == null) {
                this.frs_tab_info = DEFAULT_FRS_TAB_INFO;
            } else {
                this.frs_tab_info = Message.immutableCopyOf(list7);
            }
            this.activityhead = builder.activityhead;
            List<ZhiBoInfoTW> list8 = builder.twzhibo_info;
            if (list8 == null) {
                this.twzhibo_info = DEFAULT_TWZHIBO_INFO;
            } else {
                this.twzhibo_info = Message.immutableCopyOf(list8);
            }
            this.novel = builder.novel;
            this.hot_twzhibo_info = builder.hot_twzhibo_info;
            Integer num6 = builder.twzhibo_pos;
            if (num6 == null) {
                this.twzhibo_pos = DEFAULT_TWZHIBO_POS;
            } else {
                this.twzhibo_pos = num6;
            }
            List<CategoryInfo> list9 = builder.category_list;
            if (list9 == null) {
                this.category_list = DEFAULT_CATEGORY_LIST;
            } else {
                this.category_list = Message.immutableCopyOf(list9);
            }
            this.push_thread_info = builder.push_thread_info;
            this.store_card = builder.store_card;
            this.sdk_topic_thread = builder.sdk_topic_thread;
            String str2 = builder.bawu_enter_url;
            if (str2 == null) {
                this.bawu_enter_url = "";
            } else {
                this.bawu_enter_url = str2;
            }
            this.client_platform = builder.client_platform;
            this.head_sdk = builder.head_sdk;
            List<ThreadInfo> list10 = builder.card_shipin_info;
            if (list10 == null) {
                this.card_shipin_info = DEFAULT_CARD_SHIPIN_INFO;
            } else {
                this.card_shipin_info = Message.immutableCopyOf(list10);
            }
            this.nav_tab_info = builder.nav_tab_info;
            Integer num7 = builder.frs_tab_default;
            if (num7 == null) {
                this.frs_tab_default = DEFAULT_FRS_TAB_DEFAULT;
            } else {
                this.frs_tab_default = num7;
            }
            Integer num8 = builder.sort_type;
            if (num8 == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
            } else {
                this.sort_type = num8;
            }
            this.school_recom_info = builder.school_recom_info;
            Integer num9 = builder.school_recom_pos;
            if (num9 == null) {
                this.school_recom_pos = DEFAULT_SCHOOL_RECOM_POS;
            } else {
                this.school_recom_pos = num9;
            }
            this.vitality_info = builder.vitality_info;
            this.carrier_enter = builder.carrier_enter;
            List<BannerThreadInfo> list11 = builder.banner_thread_list;
            if (list11 == null) {
                this.banner_thread_list = DEFAULT_BANNER_THREAD_LIST;
            } else {
                this.banner_thread_list = Message.immutableCopyOf(list11);
            }
            this.recommend_book = builder.recommend_book;
            Integer num10 = builder.smart_frs_type;
            if (num10 == null) {
                this.smart_frs_type = DEFAULT_SMART_FRS_TYPE;
            } else {
                this.smart_frs_type = num10;
            }
            Integer num11 = builder.need_log;
            if (num11 == null) {
                this.need_log = DEFAULT_NEED_LOG;
            } else {
                this.need_log = num11;
            }
            Integer num12 = builder.is_auto_play_forumheadvideo;
            if (num12 == null) {
                this.is_auto_play_forumheadvideo = DEFAULT_IS_AUTO_PLAY_FORUMHEADVIDEO;
            } else {
                this.is_auto_play_forumheadvideo = num12;
            }
            this.book_info = builder.book_info;
            this.forum_present_info = builder.forum_present_info;
            this.forum_headline_img_info = builder.forum_headline_img_info;
            this.ntspread = builder.ntspread;
            List<Integer> list12 = builder.card_shipin_pos;
            if (list12 == null) {
                this.card_shipin_pos = DEFAULT_CARD_SHIPIN_POS;
            } else {
                this.card_shipin_pos = Message.immutableCopyOf(list12);
            }
            List<ThreadInfo> list13 = builder.card_shipin_new;
            if (list13 == null) {
                this.card_shipin_new = DEFAULT_CARD_SHIPIN_NEW;
            } else {
                this.card_shipin_new = Message.immutableCopyOf(list13);
            }
            String str3 = builder.asp_shown_info;
            if (str3 == null) {
                this.asp_shown_info = "";
            } else {
                this.asp_shown_info = str3;
            }
            Integer num13 = builder.ala_live_count;
            if (num13 == null) {
                this.ala_live_count = DEFAULT_ALA_LIVE_COUNT;
            } else {
                this.ala_live_count = num13;
            }
            this.bottle = builder.bottle;
            this.enter_pop_info = builder.enter_pop_info;
            String str4 = builder.partial_visible_toast;
            if (str4 == null) {
                this.partial_visible_toast = "";
            } else {
                this.partial_visible_toast = str4;
            }
            this.esport = builder.esport;
            List<ThreadIdListInfo> list14 = builder.thread_id_list_info;
            if (list14 == null) {
                this.thread_id_list_info = DEFAULT_THREAD_ID_LIST_INFO;
            } else {
                this.thread_id_list_info = Message.immutableCopyOf(list14);
            }
            this.agree_banner = builder.agree_banner;
            this.na_guide = builder.na_guide;
            List<FrsTabInfo> list15 = builder.frs_game_tab_info;
            if (list15 == null) {
                this.frs_game_tab_info = DEFAULT_FRS_GAME_TAB_INFO;
            } else {
                this.frs_game_tab_info = Message.immutableCopyOf(list15);
            }
            this.live_frs_notify = builder.live_frs_notify;
            this.banner_user_story = builder.banner_user_story;
            this.user_extend = builder.user_extend;
            this.forum_head_icon = builder.forum_head_icon;
            this.video = builder.video;
            Integer num14 = builder.game_default_tab_id;
            if (num14 == null) {
                this.game_default_tab_id = DEFAULT_GAME_DEFAULT_TAB_ID;
            } else {
                this.game_default_tab_id = num14;
            }
            List<ThreadInfo> list16 = builder.ala_insert_thread;
            if (list16 == null) {
                this.ala_insert_thread = DEFAULT_ALA_INSERT_THREAD;
            } else {
                this.ala_insert_thread = Message.immutableCopyOf(list16);
            }
            this.ala_live_insert = builder.ala_live_insert;
            Integer num15 = builder.ala_insert_floor;
            if (num15 == null) {
                this.ala_insert_floor = DEFAULT_ALA_INSERT_FLOOR;
            } else {
                this.ala_insert_floor = num15;
            }
            this.forum_ar_info = builder.forum_ar_info;
            List<ThreadInfo> list17 = builder.ala_stage_list;
            if (list17 == null) {
                this.ala_stage_list = DEFAULT_ALA_STAGE_LIST;
            } else {
                this.ala_stage_list = Message.immutableCopyOf(list17);
            }
            this.star_rank_info = builder.star_rank_info;
            Integer num16 = builder.trends_redpoint;
            if (num16 == null) {
                this.trends_redpoint = DEFAULT_TRENDS_REDPOINT;
            } else {
                this.trends_redpoint = num16;
            }
            List<WindowToast> list18 = builder.window_toast;
            if (list18 == null) {
                this.window_toast = DEFAULT_WINDOW_TOAST;
            } else {
                this.window_toast = Message.immutableCopyOf(list18);
            }
            this.recom_post_topic = builder.recom_post_topic;
            this.activity_config = builder.activity_config;
            this.star_voice = builder.star_voice;
            this.worldcup_skin = builder.worldcup_skin;
            this.redpacketrain = builder.redpacketrain;
            this.brand_forum_info = builder.brand_forum_info;
            List<BottomMenu> list19 = builder.bottom_menu;
            if (list19 == null) {
                this.bottom_menu = DEFAULT_BOTTOM_MENU;
            } else {
                this.bottom_menu = Message.immutableCopyOf(list19);
            }
            Integer num17 = builder.video_auto_play;
            if (num17 == null) {
                this.video_auto_play = DEFAULT_VIDEO_AUTO_PLAY;
            } else {
                this.video_auto_play = num17;
            }
            List<String> list20 = builder.smart_app_avatar;
            if (list20 == null) {
                this.smart_app_avatar = DEFAULT_SMART_APP_AVATAR;
            } else {
                this.smart_app_avatar = Message.immutableCopyOf(list20);
            }
            this.smart_app = builder.smart_app;
            this.nebula_hot_threads = builder.nebula_hot_threads;
            this.private_forum_info = builder.private_forum_info;
            this.private_forum_active_info = builder.private_forum_active_info;
            this.business_promot = builder.business_promot;
            List<ServiceArea> list21 = builder.service_area;
            if (list21 == null) {
                this.service_area = DEFAULT_SERVICE_AREA;
            } else {
                this.service_area = Message.immutableCopyOf(list21);
            }
            this.bazhu_exam_fail = builder.bazhu_exam_fail;
            this.hot_user_entry = builder.hot_user_entry;
            this.item_info = builder.item_info;
            Integer num18 = builder.is_get_horse_race_lamp;
            if (num18 == null) {
                this.is_get_horse_race_lamp = DEFAULT_IS_GET_HORSE_RACE_LAMP;
            } else {
                this.is_get_horse_race_lamp = num18;
            }
            this.forum_rule = builder.forum_rule;
            this.sign_activity_info = builder.sign_activity_info;
            this.add_bawu_pop = builder.add_bawu_pop;
            Integer num19 = builder.show_adsense;
            if (num19 == null) {
                this.show_adsense = DEFAULT_SHOW_ADSENSE;
            } else {
                this.show_adsense = num19;
            }
            this.frsmask_pop_info = builder.frsmask_pop_info;
            List<ThreadInfo> list22 = builder.voice_room_list;
            if (list22 == null) {
                this.voice_room_list = DEFAULT_VOICE_ROOM_LIST;
            } else {
                this.voice_room_list = Message.immutableCopyOf(list22);
            }
            Integer num20 = builder.voice_room_config;
            if (num20 == null) {
                this.voice_room_config = DEFAULT_VOICE_ROOM_CONFIG;
            } else {
                this.voice_room_config = num20;
            }
            Integer num21 = builder.ad_show_select;
            if (num21 == null) {
                this.ad_show_select = DEFAULT_AD_SHOW_SELECT;
            } else {
                this.ad_show_select = num21;
            }
            List<AdMixFloor> list23 = builder.ad_mix_list;
            if (list23 == null) {
                this.ad_mix_list = DEFAULT_AD_MIX_LIST;
            } else {
                this.ad_mix_list = Message.immutableCopyOf(list23);
            }
            String str5 = builder.ad_sample_map_key;
            if (str5 == null) {
                this.ad_sample_map_key = "";
            } else {
                this.ad_sample_map_key = str5;
            }
            this.bawutask_pop = builder.bawutask_pop;
            List<LiveFuseForumData> list24 = builder.live_fuse_forum;
            if (list24 == null) {
                this.live_fuse_forum = DEFAULT_LIVE_FUSE_FORUM;
            } else {
                this.live_fuse_forum = Message.immutableCopyOf(list24);
            }
            Integer num22 = builder.bawu_unread_notice_num;
            if (num22 == null) {
                this.bawu_unread_notice_num = DEFAULT_BAWU_UNREAD_NOTICE_NUM;
            } else {
                this.bawu_unread_notice_num = num22;
            }
            this.recreation_rank_info = builder.recreation_rank_info;
            Integer num23 = builder.is_member_broadcast_forum;
            if (num23 == null) {
                this.is_member_broadcast_forum = DEFAULT_IS_MEMBER_BROADCAST_FORUM;
                return;
            } else {
                this.is_member_broadcast_forum = num23;
                return;
            }
        }
        this.user = builder.user;
        this.forum = builder.forum;
        this.frs_star = builder.frs_star;
        this.page = builder.page;
        this.anti = builder.anti;
        this.group = builder.group;
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.thread_id_list = Message.immutableCopyOf(builder.thread_id_list);
        this.is_new_url = builder.is_new_url;
        this.fortune_bag = builder.fortune_bag;
        this.time = builder.time;
        this.ctime = builder.ctime;
        this.logid = builder.logid;
        this.server_time = builder.server_time;
        this.info = builder.info;
        this.forum_livegroup_list = Message.immutableCopyOf(builder.forum_livegroup_list);
        this.user_list = Message.immutableCopyOf(builder.user_list);
        this.gcon_account = builder.gcon_account;
        this.fortune_desc = builder.fortune_desc;
        this.star_enter = Message.immutableCopyOf(builder.star_enter);
        this.color_egg = Message.immutableCopyOf(builder.color_egg);
        this.frs_tab_info = Message.immutableCopyOf(builder.frs_tab_info);
        this.activityhead = builder.activityhead;
        this.twzhibo_info = Message.immutableCopyOf(builder.twzhibo_info);
        this.novel = builder.novel;
        this.hot_twzhibo_info = builder.hot_twzhibo_info;
        this.twzhibo_pos = builder.twzhibo_pos;
        this.category_list = Message.immutableCopyOf(builder.category_list);
        this.push_thread_info = builder.push_thread_info;
        this.store_card = builder.store_card;
        this.sdk_topic_thread = builder.sdk_topic_thread;
        this.bawu_enter_url = builder.bawu_enter_url;
        this.client_platform = builder.client_platform;
        this.head_sdk = builder.head_sdk;
        this.card_shipin_info = Message.immutableCopyOf(builder.card_shipin_info);
        this.nav_tab_info = builder.nav_tab_info;
        this.frs_tab_default = builder.frs_tab_default;
        this.sort_type = builder.sort_type;
        this.school_recom_info = builder.school_recom_info;
        this.school_recom_pos = builder.school_recom_pos;
        this.vitality_info = builder.vitality_info;
        this.carrier_enter = builder.carrier_enter;
        this.banner_thread_list = Message.immutableCopyOf(builder.banner_thread_list);
        this.recommend_book = builder.recommend_book;
        this.smart_frs_type = builder.smart_frs_type;
        this.need_log = builder.need_log;
        this.is_auto_play_forumheadvideo = builder.is_auto_play_forumheadvideo;
        this.book_info = builder.book_info;
        this.forum_present_info = builder.forum_present_info;
        this.forum_headline_img_info = builder.forum_headline_img_info;
        this.ntspread = builder.ntspread;
        this.card_shipin_pos = Message.immutableCopyOf(builder.card_shipin_pos);
        this.card_shipin_new = Message.immutableCopyOf(builder.card_shipin_new);
        this.asp_shown_info = builder.asp_shown_info;
        this.ala_live_count = builder.ala_live_count;
        this.bottle = builder.bottle;
        this.enter_pop_info = builder.enter_pop_info;
        this.partial_visible_toast = builder.partial_visible_toast;
        this.esport = builder.esport;
        this.thread_id_list_info = Message.immutableCopyOf(builder.thread_id_list_info);
        this.agree_banner = builder.agree_banner;
        this.na_guide = builder.na_guide;
        this.frs_game_tab_info = Message.immutableCopyOf(builder.frs_game_tab_info);
        this.live_frs_notify = builder.live_frs_notify;
        this.banner_user_story = builder.banner_user_story;
        this.user_extend = builder.user_extend;
        this.forum_head_icon = builder.forum_head_icon;
        this.video = builder.video;
        this.game_default_tab_id = builder.game_default_tab_id;
        this.ala_insert_thread = Message.immutableCopyOf(builder.ala_insert_thread);
        this.ala_live_insert = builder.ala_live_insert;
        this.ala_insert_floor = builder.ala_insert_floor;
        this.forum_ar_info = builder.forum_ar_info;
        this.ala_stage_list = Message.immutableCopyOf(builder.ala_stage_list);
        this.star_rank_info = builder.star_rank_info;
        this.trends_redpoint = builder.trends_redpoint;
        this.window_toast = Message.immutableCopyOf(builder.window_toast);
        this.recom_post_topic = builder.recom_post_topic;
        this.activity_config = builder.activity_config;
        this.star_voice = builder.star_voice;
        this.worldcup_skin = builder.worldcup_skin;
        this.redpacketrain = builder.redpacketrain;
        this.brand_forum_info = builder.brand_forum_info;
        this.bottom_menu = Message.immutableCopyOf(builder.bottom_menu);
        this.video_auto_play = builder.video_auto_play;
        this.smart_app_avatar = Message.immutableCopyOf(builder.smart_app_avatar);
        this.smart_app = builder.smart_app;
        this.nebula_hot_threads = builder.nebula_hot_threads;
        this.private_forum_info = builder.private_forum_info;
        this.private_forum_active_info = builder.private_forum_active_info;
        this.business_promot = builder.business_promot;
        this.service_area = Message.immutableCopyOf(builder.service_area);
        this.bazhu_exam_fail = builder.bazhu_exam_fail;
        this.hot_user_entry = builder.hot_user_entry;
        this.item_info = builder.item_info;
        this.is_get_horse_race_lamp = builder.is_get_horse_race_lamp;
        this.forum_rule = builder.forum_rule;
        this.sign_activity_info = builder.sign_activity_info;
        this.add_bawu_pop = builder.add_bawu_pop;
        this.show_adsense = builder.show_adsense;
        this.frsmask_pop_info = builder.frsmask_pop_info;
        this.voice_room_list = Message.immutableCopyOf(builder.voice_room_list);
        this.voice_room_config = builder.voice_room_config;
        this.ad_show_select = builder.ad_show_select;
        this.ad_mix_list = Message.immutableCopyOf(builder.ad_mix_list);
        this.ad_sample_map_key = builder.ad_sample_map_key;
        this.bawutask_pop = builder.bawutask_pop;
        this.live_fuse_forum = Message.immutableCopyOf(builder.live_fuse_forum);
        this.bawu_unread_notice_num = builder.bawu_unread_notice_num;
        this.recreation_rank_info = builder.recreation_rank_info;
        this.is_member_broadcast_forum = builder.is_member_broadcast_forum;
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
