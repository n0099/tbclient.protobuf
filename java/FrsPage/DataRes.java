package tbclient.FrsPage;

import com.baidu.tbadk.TbConfig;
import com.baidu.tieba.u;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AnchorInfo;
import tbclient.Anti;
import tbclient.CategoryInfo;
import tbclient.FrsTabInfo;
import tbclient.Novel;
import tbclient.Page;
import tbclient.RecommendInfo;
import tbclient.SdkTopicThread;
import tbclient.ThreadInfo;
import tbclient.User;
import tbclient.VitalityInfo;
import tbclient.ZhiBoInfoTW;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_BAWU_ENTER_URL = "";
    public static final String DEFAULT_FORTUNE_DESC = "";
    @ProtoField(tag = 23)
    public final ActivityHead activityhead;
    @ProtoField(tag = 5)
    public final Anti anti;
    @ProtoField(label = Message.Label.REPEATED, tag = TbConfig.VIEW_IMAGE_QUALITY_LOW_VALUE)
    public final List<BannerThreadInfo> banner_thread_list;
    @ProtoField(tag = 32, type = Message.Datatype.STRING)
    public final String bawu_enter_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 35)
    public final List<ThreadInfo> card_shipin_info;
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
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer fortune_bag;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String fortune_desc;
    @ProtoField(tag = 2)
    public final ForumInfo forum;
    @ProtoField(label = Message.Label.REPEATED, tag = 16)
    public final List<AnchorInfo> forum_livegroup_list;
    @ProtoField(tag = 3)
    public final StarInfo frs_star;
    @ProtoField(tag = u.l.PullToRefresh_adapterViewBackground, type = Message.Datatype.INT32)
    public final Integer frs_tab_default;
    @ProtoField(label = Message.Label.REPEATED, tag = 22)
    public final List<FrsTabInfo> frs_tab_info;
    @ProtoField(tag = 18)
    public final GconAccount gcon_account;
    @ProtoField(tag = 6)
    public final Group group;
    @ProtoField(tag = u.l.PullToRefresh_tb_ptrRotateDrawableWhilePulling)
    public final HeadSdk head_sdk;
    @ProtoField(tag = 26)
    public final ZhiBoInfoTW hot_twzhibo_info;
    @ProtoField(tag = 15)
    public final Info info;
    @ProtoField(tag = 49, type = Message.Datatype.INT32)
    public final Integer is_auto_play_forumheadvideo;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_new_url;
    @ProtoField(tag = 13, type = Message.Datatype.INT64)
    public final Long logid;
    @ProtoField(tag = u.l.PullToRefresh_tb_ptrDrawableBottom)
    public final NavTabInfo nav_tab_info;
    @ProtoField(tag = 48, type = Message.Datatype.INT32)
    public final Integer need_log;
    @ProtoField(tag = 25)
    public final Novel novel;
    @ProtoField(tag = 4)
    public final Page page;
    @ProtoField(tag = 29)
    public final PushThreadInfo push_thread_info;
    @ProtoField(tag = 46)
    public final RecommendBook recommend_book;
    @ProtoField(tag = u.l.PullToRefresh_headerTextColor)
    public final RecommendInfo school_recom_info;
    @ProtoField(tag = u.l.PullToRefresh_mode, type = Message.Datatype.UINT32)
    public final Integer school_recom_pos;
    @ProtoField(tag = 31)
    public final SdkTopicThread sdk_topic_thread;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer server_time;
    @ProtoField(tag = 47, type = Message.Datatype.INT32)
    public final Integer smart_frs_type;
    @ProtoField(tag = u.l.PullToRefresh_headerBackground, type = Message.Datatype.INT32)
    public final Integer sort_type;
    @ProtoField(label = Message.Label.REPEATED, tag = 20)
    public final List<StarEnter> star_enter;
    @ProtoField(tag = 30)
    public final ThreadInfo store_card;
    @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.INT64)
    public final List<Long> thread_id_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<ThreadInfo> thread_list;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer time;
    @ProtoField(label = Message.Label.REPEATED, tag = 24)
    public final List<ZhiBoInfoTW> twzhibo_info;
    @ProtoField(tag = 27, type = Message.Datatype.INT32)
    public final Integer twzhibo_pos;
    @ProtoField(tag = 1)
    public final User user;
    @ProtoField(label = Message.Label.REPEATED, tag = 17)
    public final List<User> user_list;
    @ProtoField(tag = 42)
    public final VitalityInfo vitality_info;
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

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

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
                return;
            } else {
                this.is_auto_play_forumheadvideo = builder.is_auto_play_forumheadvideo;
                return;
            }
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
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public ActivityHead activityhead;
        public Anti anti;
        public List<BannerThreadInfo> banner_thread_list;
        public String bawu_enter_url;
        public List<ThreadInfo> card_shipin_info;
        public CarrierEnter carrier_enter;
        public List<CategoryInfo> category_list;
        public ClientPlatform client_platform;
        public List<ColorEgg> color_egg;
        public Integer ctime;
        public Integer fortune_bag;
        public String fortune_desc;
        public ForumInfo forum;
        public List<AnchorInfo> forum_livegroup_list;
        public StarInfo frs_star;
        public Integer frs_tab_default;
        public List<FrsTabInfo> frs_tab_info;
        public GconAccount gcon_account;
        public Group group;
        public HeadSdk head_sdk;
        public ZhiBoInfoTW hot_twzhibo_info;
        public Info info;
        public Integer is_auto_play_forumheadvideo;
        public Integer is_new_url;
        public Long logid;
        public NavTabInfo nav_tab_info;
        public Integer need_log;
        public Novel novel;
        public Page page;
        public PushThreadInfo push_thread_info;
        public RecommendBook recommend_book;
        public RecommendInfo school_recom_info;
        public Integer school_recom_pos;
        public SdkTopicThread sdk_topic_thread;
        public Integer server_time;
        public Integer smart_frs_type;
        public Integer sort_type;
        public List<StarEnter> star_enter;
        public ThreadInfo store_card;
        public List<Long> thread_id_list;
        public List<ThreadInfo> thread_list;
        public Integer time;
        public List<ZhiBoInfoTW> twzhibo_info;
        public Integer twzhibo_pos;
        public User user;
        public List<User> user_list;
        public VitalityInfo vitality_info;

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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
