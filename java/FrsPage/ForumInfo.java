package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BannerList;
import tbclient.GameInfo;
/* loaded from: classes4.dex */
public final class ForumInfo extends Message {
    public static final String DEFAULT_ACCELERATE_COTENT = "";
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FIRST_CLASS = "";
    public static final String DEFAULT_FORUM_GAME_LABEL = "";
    public static final String DEFAULT_GAME_NAME = "";
    public static final String DEFAULT_GAME_URL = "";
    public static final String DEFAULT_IS_READONLY = "";
    public static final String DEFAULT_LEVEL_NAME = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_SECOND_CLASS = "";
    public static final String DEFAULT_SLOGAN = "";
    public static final String DEFAULT_SPECIAL_FORUM_TYPE = "";
    public static final String DEFAULT_SUPERBOY = "";
    public static final String DEFAULT_TIDS = "";
    public static final String DEFAULT_TOPIC_SPECIAL_ICON = "";
    public static final String DEFAULT_TOPIC_SPECIAL_ICON_RIGHT = "";
    public static final String DEFAULT_WARNING_MSG = "";
    @ProtoField(tag = 50, type = Message.Datatype.STRING)
    public final String accelerate_cotent;
    @ProtoField(tag = 62)
    public final AcrossForumIcon across_forum_hide;
    @ProtoField(tag = 60)
    public final AcrossForumIcon across_forum_show;
    @ProtoField(tag = 56)
    public final Adkiller adkiller_data;
    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer album_open_photo_frs;
    @ProtoField(tag = 44)
    public final AnchorPower anchor_power;
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(label = Message.Label.REPEATED, tag = 34)
    public final List<Badges> badges;
    @ProtoField(tag = 32)
    public final Banner banner;
    @ProtoField(tag = 33)
    public final BannerList banner_list;
    @ProtoField(tag = 49, type = Message.Datatype.INT32)
    public final Integer can_use_accelerate;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer cur_score;
    @ProtoField(tag = 37, type = Message.Datatype.INT32)
    public final Integer favo_type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String first_class;
    @ProtoField(tag = 27)
    public final ForumButton forum_button;
    @ProtoField(tag = 66, type = Message.Datatype.STRING)
    public final String forum_game_label;
    @ProtoField(label = Message.Label.REPEATED, tag = 18)
    public final List<Calendar> forum_sign_calendar;
    @ProtoField(tag = 55)
    public final MemberShowIcon forumvip_show_icon;
    @ProtoField(label = Message.Label.REPEATED, tag = 53)
    public final List<GameInfo> game_card;
    @ProtoField(tag = 54, type = Message.Datatype.STRING)
    public final String game_name;
    @ProtoField(tag = 47, type = Message.Datatype.STRING)
    public final String game_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 21)
    public final List<Classify> good_classify;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer has_frs_star;
    @ProtoField(tag = 46, type = Message.Datatype.INT32)
    public final Integer has_game;
    @ProtoField(tag = 29, type = Message.Datatype.INT32)
    public final Integer has_paper;
    @ProtoField(tag = 26, type = Message.Datatype.INT32)
    public final Integer has_postpre;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 71, type = Message.Datatype.INT32)
    public final Integer is_brand_forum;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_exists;
    @ProtoField(tag = 36, type = Message.Datatype.INT32)
    public final Integer is_forbidden;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer is_like;
    @ProtoField(tag = 64, type = Message.Datatype.INT32)
    public final Integer is_live_game;
    @ProtoField(tag = 63, type = Message.Datatype.INT32)
    public final Integer is_live_game_forum;
    @ProtoField(tag = 42, type = Message.Datatype.INT32)
    public final Integer is_local_effect;
    @ProtoField(tag = 65, type = Message.Datatype.INT32)
    public final Integer is_new_game_forum;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String is_readonly;
    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer is_search_people;
    @ProtoField(tag = 72, type = Message.Datatype.INT32)
    public final Integer is_show_all_top_thread;
    @ProtoField(tag = 30, type = Message.Datatype.INT32)
    public final Integer is_stage_forum;
    @ProtoField(tag = 41, type = Message.Datatype.INT32)
    public final Integer is_support_local;
    @ProtoField(tag = 35, type = Message.Datatype.INT32)
    public final Integer level_id;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String level_name;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer levelup_score;
    @ProtoField(label = Message.Label.REPEATED, tag = 17)
    public final List<Manager> managers;
    @ProtoField(tag = 31, type = Message.Datatype.INT32)
    public final Integer meizhi_tag;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer member_num;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 52)
    public final TopNews news_info;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer post_num;
    @ProtoField(tag = 39)
    public final PostPrefix post_prefix;
    @ProtoField(tag = 61)
    public final PostTopic post_topic;
    @ProtoField(tag = 58)
    public final RealTime realtime_data;
    @ProtoField(label = Message.Label.REPEATED, tag = 43)
    public final List<RecommendForum> recommend_forum;
    @ProtoField(tag = 48)
    public final RecomUserInfo recommend_user_info;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String second_class;
    @ProtoField(tag = 15)
    public final SignInfo sign_in_info;
    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public final String slogan;
    @ProtoField(tag = 68, type = Message.Datatype.STRING)
    public final String special_forum_type;
    @ProtoField(tag = 40, type = Message.Datatype.STRING)
    public final String superboy;
    @ProtoField(tag = 38)
    public final TagInfo tag_info;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer thread_num;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String tids;
    @ProtoField(tag = 51)
    public final TopCode top_code;
    @ProtoField(tag = 28)
    public final TopNotice top_notice;
    @ProtoField(tag = 69, type = Message.Datatype.STRING)
    public final String topic_special_icon;
    @ProtoField(tag = 70, type = Message.Datatype.STRING)
    public final String topic_special_icon_right;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer user_level;
    @ProtoField(tag = 67, type = Message.Datatype.STRING)
    public final String warning_msg;
    @ProtoField(tag = 45)
    public final WorldCup worldcupinfo;
    @ProtoField(tag = 57)
    public final Yule yule;
    @ProtoField(tag = 16)
    public final Zhibo zhibo;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_IS_EXISTS = 0;
    public static final Integer DEFAULT_IS_LIKE = 0;
    public static final Integer DEFAULT_USER_LEVEL = 0;
    public static final Integer DEFAULT_MEMBER_NUM = 0;
    public static final Integer DEFAULT_THREAD_NUM = 0;
    public static final Integer DEFAULT_POST_NUM = 0;
    public static final Integer DEFAULT_HAS_FRS_STAR = 0;
    public static final Integer DEFAULT_CUR_SCORE = 0;
    public static final Integer DEFAULT_LEVELUP_SCORE = 0;
    public static final List<Manager> DEFAULT_MANAGERS = Collections.emptyList();
    public static final List<Calendar> DEFAULT_FORUM_SIGN_CALENDAR = Collections.emptyList();
    public static final Integer DEFAULT_IS_SEARCH_PEOPLE = 0;
    public static final List<Classify> DEFAULT_GOOD_CLASSIFY = Collections.emptyList();
    public static final Integer DEFAULT_ALBUM_OPEN_PHOTO_FRS = 0;
    public static final Integer DEFAULT_HAS_POSTPRE = 0;
    public static final Integer DEFAULT_HAS_PAPER = 0;
    public static final Integer DEFAULT_IS_STAGE_FORUM = 0;
    public static final Integer DEFAULT_MEIZHI_TAG = 0;
    public static final List<Badges> DEFAULT_BADGES = Collections.emptyList();
    public static final Integer DEFAULT_LEVEL_ID = 0;
    public static final Integer DEFAULT_IS_FORBIDDEN = 0;
    public static final Integer DEFAULT_FAVO_TYPE = 0;
    public static final Integer DEFAULT_IS_SUPPORT_LOCAL = 0;
    public static final Integer DEFAULT_IS_LOCAL_EFFECT = 0;
    public static final List<RecommendForum> DEFAULT_RECOMMEND_FORUM = Collections.emptyList();
    public static final Integer DEFAULT_HAS_GAME = 0;
    public static final Integer DEFAULT_CAN_USE_ACCELERATE = 0;
    public static final List<GameInfo> DEFAULT_GAME_CARD = Collections.emptyList();
    public static final Integer DEFAULT_IS_LIVE_GAME_FORUM = 0;
    public static final Integer DEFAULT_IS_LIVE_GAME = 0;
    public static final Integer DEFAULT_IS_NEW_GAME_FORUM = 0;
    public static final Integer DEFAULT_IS_BRAND_FORUM = 0;
    public static final Integer DEFAULT_IS_SHOW_ALL_TOP_THREAD = 0;

    private ForumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.first_class == null) {
                this.first_class = "";
            } else {
                this.first_class = builder.first_class;
            }
            if (builder.second_class == null) {
                this.second_class = "";
            } else {
                this.second_class = builder.second_class;
            }
            if (builder.is_exists == null) {
                this.is_exists = DEFAULT_IS_EXISTS;
            } else {
                this.is_exists = builder.is_exists;
            }
            if (builder.is_like == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = builder.is_like;
            }
            if (builder.user_level == null) {
                this.user_level = DEFAULT_USER_LEVEL;
            } else {
                this.user_level = builder.user_level;
            }
            if (builder.level_name == null) {
                this.level_name = "";
            } else {
                this.level_name = builder.level_name;
            }
            if (builder.member_num == null) {
                this.member_num = DEFAULT_MEMBER_NUM;
            } else {
                this.member_num = builder.member_num;
            }
            if (builder.thread_num == null) {
                this.thread_num = DEFAULT_THREAD_NUM;
            } else {
                this.thread_num = builder.thread_num;
            }
            if (builder.post_num == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = builder.post_num;
            }
            if (builder.has_frs_star == null) {
                this.has_frs_star = DEFAULT_HAS_FRS_STAR;
            } else {
                this.has_frs_star = builder.has_frs_star;
            }
            if (builder.cur_score == null) {
                this.cur_score = DEFAULT_CUR_SCORE;
            } else {
                this.cur_score = builder.cur_score;
            }
            if (builder.levelup_score == null) {
                this.levelup_score = DEFAULT_LEVELUP_SCORE;
            } else {
                this.levelup_score = builder.levelup_score;
            }
            this.sign_in_info = builder.sign_in_info;
            this.zhibo = builder.zhibo;
            if (builder.managers == null) {
                this.managers = DEFAULT_MANAGERS;
            } else {
                this.managers = immutableCopyOf(builder.managers);
            }
            if (builder.forum_sign_calendar == null) {
                this.forum_sign_calendar = DEFAULT_FORUM_SIGN_CALENDAR;
            } else {
                this.forum_sign_calendar = immutableCopyOf(builder.forum_sign_calendar);
            }
            if (builder.is_search_people == null) {
                this.is_search_people = DEFAULT_IS_SEARCH_PEOPLE;
            } else {
                this.is_search_people = builder.is_search_people;
            }
            if (builder.tids == null) {
                this.tids = "";
            } else {
                this.tids = builder.tids;
            }
            if (builder.good_classify == null) {
                this.good_classify = DEFAULT_GOOD_CLASSIFY;
            } else {
                this.good_classify = immutableCopyOf(builder.good_classify);
            }
            if (builder.is_readonly == null) {
                this.is_readonly = "";
            } else {
                this.is_readonly = builder.is_readonly;
            }
            if (builder.album_open_photo_frs == null) {
                this.album_open_photo_frs = DEFAULT_ALBUM_OPEN_PHOTO_FRS;
            } else {
                this.album_open_photo_frs = builder.album_open_photo_frs;
            }
            if (builder.avatar == null) {
                this.avatar = "";
            } else {
                this.avatar = builder.avatar;
            }
            if (builder.slogan == null) {
                this.slogan = "";
            } else {
                this.slogan = builder.slogan;
            }
            if (builder.has_postpre == null) {
                this.has_postpre = DEFAULT_HAS_POSTPRE;
            } else {
                this.has_postpre = builder.has_postpre;
            }
            this.forum_button = builder.forum_button;
            this.top_notice = builder.top_notice;
            if (builder.has_paper == null) {
                this.has_paper = DEFAULT_HAS_PAPER;
            } else {
                this.has_paper = builder.has_paper;
            }
            if (builder.is_stage_forum == null) {
                this.is_stage_forum = DEFAULT_IS_STAGE_FORUM;
            } else {
                this.is_stage_forum = builder.is_stage_forum;
            }
            if (builder.meizhi_tag == null) {
                this.meizhi_tag = DEFAULT_MEIZHI_TAG;
            } else {
                this.meizhi_tag = builder.meizhi_tag;
            }
            this.banner = builder.banner;
            this.banner_list = builder.banner_list;
            if (builder.badges == null) {
                this.badges = DEFAULT_BADGES;
            } else {
                this.badges = immutableCopyOf(builder.badges);
            }
            if (builder.level_id == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = builder.level_id;
            }
            if (builder.is_forbidden == null) {
                this.is_forbidden = DEFAULT_IS_FORBIDDEN;
            } else {
                this.is_forbidden = builder.is_forbidden;
            }
            if (builder.favo_type == null) {
                this.favo_type = DEFAULT_FAVO_TYPE;
            } else {
                this.favo_type = builder.favo_type;
            }
            this.tag_info = builder.tag_info;
            this.post_prefix = builder.post_prefix;
            if (builder.superboy == null) {
                this.superboy = "";
            } else {
                this.superboy = builder.superboy;
            }
            if (builder.is_support_local == null) {
                this.is_support_local = DEFAULT_IS_SUPPORT_LOCAL;
            } else {
                this.is_support_local = builder.is_support_local;
            }
            if (builder.is_local_effect == null) {
                this.is_local_effect = DEFAULT_IS_LOCAL_EFFECT;
            } else {
                this.is_local_effect = builder.is_local_effect;
            }
            if (builder.recommend_forum == null) {
                this.recommend_forum = DEFAULT_RECOMMEND_FORUM;
            } else {
                this.recommend_forum = immutableCopyOf(builder.recommend_forum);
            }
            this.anchor_power = builder.anchor_power;
            this.worldcupinfo = builder.worldcupinfo;
            if (builder.has_game == null) {
                this.has_game = DEFAULT_HAS_GAME;
            } else {
                this.has_game = builder.has_game;
            }
            if (builder.game_url == null) {
                this.game_url = "";
            } else {
                this.game_url = builder.game_url;
            }
            this.recommend_user_info = builder.recommend_user_info;
            if (builder.can_use_accelerate == null) {
                this.can_use_accelerate = DEFAULT_CAN_USE_ACCELERATE;
            } else {
                this.can_use_accelerate = builder.can_use_accelerate;
            }
            if (builder.accelerate_cotent == null) {
                this.accelerate_cotent = "";
            } else {
                this.accelerate_cotent = builder.accelerate_cotent;
            }
            this.top_code = builder.top_code;
            this.news_info = builder.news_info;
            if (builder.game_card == null) {
                this.game_card = DEFAULT_GAME_CARD;
            } else {
                this.game_card = immutableCopyOf(builder.game_card);
            }
            if (builder.game_name == null) {
                this.game_name = "";
            } else {
                this.game_name = builder.game_name;
            }
            this.forumvip_show_icon = builder.forumvip_show_icon;
            this.adkiller_data = builder.adkiller_data;
            this.yule = builder.yule;
            this.realtime_data = builder.realtime_data;
            this.across_forum_show = builder.across_forum_show;
            this.post_topic = builder.post_topic;
            this.across_forum_hide = builder.across_forum_hide;
            if (builder.is_live_game_forum == null) {
                this.is_live_game_forum = DEFAULT_IS_LIVE_GAME_FORUM;
            } else {
                this.is_live_game_forum = builder.is_live_game_forum;
            }
            if (builder.is_live_game == null) {
                this.is_live_game = DEFAULT_IS_LIVE_GAME;
            } else {
                this.is_live_game = builder.is_live_game;
            }
            if (builder.is_new_game_forum == null) {
                this.is_new_game_forum = DEFAULT_IS_NEW_GAME_FORUM;
            } else {
                this.is_new_game_forum = builder.is_new_game_forum;
            }
            if (builder.forum_game_label == null) {
                this.forum_game_label = "";
            } else {
                this.forum_game_label = builder.forum_game_label;
            }
            if (builder.warning_msg == null) {
                this.warning_msg = "";
            } else {
                this.warning_msg = builder.warning_msg;
            }
            if (builder.special_forum_type == null) {
                this.special_forum_type = "";
            } else {
                this.special_forum_type = builder.special_forum_type;
            }
            if (builder.topic_special_icon == null) {
                this.topic_special_icon = "";
            } else {
                this.topic_special_icon = builder.topic_special_icon;
            }
            if (builder.topic_special_icon_right == null) {
                this.topic_special_icon_right = "";
            } else {
                this.topic_special_icon_right = builder.topic_special_icon_right;
            }
            if (builder.is_brand_forum == null) {
                this.is_brand_forum = DEFAULT_IS_BRAND_FORUM;
            } else {
                this.is_brand_forum = builder.is_brand_forum;
            }
            if (builder.is_show_all_top_thread == null) {
                this.is_show_all_top_thread = DEFAULT_IS_SHOW_ALL_TOP_THREAD;
                return;
            } else {
                this.is_show_all_top_thread = builder.is_show_all_top_thread;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.first_class = builder.first_class;
        this.second_class = builder.second_class;
        this.is_exists = builder.is_exists;
        this.is_like = builder.is_like;
        this.user_level = builder.user_level;
        this.level_name = builder.level_name;
        this.member_num = builder.member_num;
        this.thread_num = builder.thread_num;
        this.post_num = builder.post_num;
        this.has_frs_star = builder.has_frs_star;
        this.cur_score = builder.cur_score;
        this.levelup_score = builder.levelup_score;
        this.sign_in_info = builder.sign_in_info;
        this.zhibo = builder.zhibo;
        this.managers = immutableCopyOf(builder.managers);
        this.forum_sign_calendar = immutableCopyOf(builder.forum_sign_calendar);
        this.is_search_people = builder.is_search_people;
        this.tids = builder.tids;
        this.good_classify = immutableCopyOf(builder.good_classify);
        this.is_readonly = builder.is_readonly;
        this.album_open_photo_frs = builder.album_open_photo_frs;
        this.avatar = builder.avatar;
        this.slogan = builder.slogan;
        this.has_postpre = builder.has_postpre;
        this.forum_button = builder.forum_button;
        this.top_notice = builder.top_notice;
        this.has_paper = builder.has_paper;
        this.is_stage_forum = builder.is_stage_forum;
        this.meizhi_tag = builder.meizhi_tag;
        this.banner = builder.banner;
        this.banner_list = builder.banner_list;
        this.badges = immutableCopyOf(builder.badges);
        this.level_id = builder.level_id;
        this.is_forbidden = builder.is_forbidden;
        this.favo_type = builder.favo_type;
        this.tag_info = builder.tag_info;
        this.post_prefix = builder.post_prefix;
        this.superboy = builder.superboy;
        this.is_support_local = builder.is_support_local;
        this.is_local_effect = builder.is_local_effect;
        this.recommend_forum = immutableCopyOf(builder.recommend_forum);
        this.anchor_power = builder.anchor_power;
        this.worldcupinfo = builder.worldcupinfo;
        this.has_game = builder.has_game;
        this.game_url = builder.game_url;
        this.recommend_user_info = builder.recommend_user_info;
        this.can_use_accelerate = builder.can_use_accelerate;
        this.accelerate_cotent = builder.accelerate_cotent;
        this.top_code = builder.top_code;
        this.news_info = builder.news_info;
        this.game_card = immutableCopyOf(builder.game_card);
        this.game_name = builder.game_name;
        this.forumvip_show_icon = builder.forumvip_show_icon;
        this.adkiller_data = builder.adkiller_data;
        this.yule = builder.yule;
        this.realtime_data = builder.realtime_data;
        this.across_forum_show = builder.across_forum_show;
        this.post_topic = builder.post_topic;
        this.across_forum_hide = builder.across_forum_hide;
        this.is_live_game_forum = builder.is_live_game_forum;
        this.is_live_game = builder.is_live_game;
        this.is_new_game_forum = builder.is_new_game_forum;
        this.forum_game_label = builder.forum_game_label;
        this.warning_msg = builder.warning_msg;
        this.special_forum_type = builder.special_forum_type;
        this.topic_special_icon = builder.topic_special_icon;
        this.topic_special_icon_right = builder.topic_special_icon_right;
        this.is_brand_forum = builder.is_brand_forum;
        this.is_show_all_top_thread = builder.is_show_all_top_thread;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<ForumInfo> {
        public String accelerate_cotent;
        public AcrossForumIcon across_forum_hide;
        public AcrossForumIcon across_forum_show;
        public Adkiller adkiller_data;
        public Integer album_open_photo_frs;
        public AnchorPower anchor_power;
        public String avatar;
        public List<Badges> badges;
        public Banner banner;
        public BannerList banner_list;
        public Integer can_use_accelerate;
        public Integer cur_score;
        public Integer favo_type;
        public String first_class;
        public ForumButton forum_button;
        public String forum_game_label;
        public List<Calendar> forum_sign_calendar;
        public MemberShowIcon forumvip_show_icon;
        public List<GameInfo> game_card;
        public String game_name;
        public String game_url;
        public List<Classify> good_classify;
        public Integer has_frs_star;
        public Integer has_game;
        public Integer has_paper;
        public Integer has_postpre;
        public Long id;
        public Integer is_brand_forum;
        public Integer is_exists;
        public Integer is_forbidden;
        public Integer is_like;
        public Integer is_live_game;
        public Integer is_live_game_forum;
        public Integer is_local_effect;
        public Integer is_new_game_forum;
        public String is_readonly;
        public Integer is_search_people;
        public Integer is_show_all_top_thread;
        public Integer is_stage_forum;
        public Integer is_support_local;
        public Integer level_id;
        public String level_name;
        public Integer levelup_score;
        public List<Manager> managers;
        public Integer meizhi_tag;
        public Integer member_num;
        public String name;
        public TopNews news_info;
        public Integer post_num;
        public PostPrefix post_prefix;
        public PostTopic post_topic;
        public RealTime realtime_data;
        public List<RecommendForum> recommend_forum;
        public RecomUserInfo recommend_user_info;
        public String second_class;
        public SignInfo sign_in_info;
        public String slogan;
        public String special_forum_type;
        public String superboy;
        public TagInfo tag_info;
        public Integer thread_num;
        public String tids;
        public TopCode top_code;
        public TopNotice top_notice;
        public String topic_special_icon;
        public String topic_special_icon_right;
        public Integer user_level;
        public String warning_msg;
        public WorldCup worldcupinfo;
        public Yule yule;
        public Zhibo zhibo;

        public Builder() {
        }

        public Builder(ForumInfo forumInfo) {
            super(forumInfo);
            if (forumInfo != null) {
                this.id = forumInfo.id;
                this.name = forumInfo.name;
                this.first_class = forumInfo.first_class;
                this.second_class = forumInfo.second_class;
                this.is_exists = forumInfo.is_exists;
                this.is_like = forumInfo.is_like;
                this.user_level = forumInfo.user_level;
                this.level_name = forumInfo.level_name;
                this.member_num = forumInfo.member_num;
                this.thread_num = forumInfo.thread_num;
                this.post_num = forumInfo.post_num;
                this.has_frs_star = forumInfo.has_frs_star;
                this.cur_score = forumInfo.cur_score;
                this.levelup_score = forumInfo.levelup_score;
                this.sign_in_info = forumInfo.sign_in_info;
                this.zhibo = forumInfo.zhibo;
                this.managers = ForumInfo.copyOf(forumInfo.managers);
                this.forum_sign_calendar = ForumInfo.copyOf(forumInfo.forum_sign_calendar);
                this.is_search_people = forumInfo.is_search_people;
                this.tids = forumInfo.tids;
                this.good_classify = ForumInfo.copyOf(forumInfo.good_classify);
                this.is_readonly = forumInfo.is_readonly;
                this.album_open_photo_frs = forumInfo.album_open_photo_frs;
                this.avatar = forumInfo.avatar;
                this.slogan = forumInfo.slogan;
                this.has_postpre = forumInfo.has_postpre;
                this.forum_button = forumInfo.forum_button;
                this.top_notice = forumInfo.top_notice;
                this.has_paper = forumInfo.has_paper;
                this.is_stage_forum = forumInfo.is_stage_forum;
                this.meizhi_tag = forumInfo.meizhi_tag;
                this.banner = forumInfo.banner;
                this.banner_list = forumInfo.banner_list;
                this.badges = ForumInfo.copyOf(forumInfo.badges);
                this.level_id = forumInfo.level_id;
                this.is_forbidden = forumInfo.is_forbidden;
                this.favo_type = forumInfo.favo_type;
                this.tag_info = forumInfo.tag_info;
                this.post_prefix = forumInfo.post_prefix;
                this.superboy = forumInfo.superboy;
                this.is_support_local = forumInfo.is_support_local;
                this.is_local_effect = forumInfo.is_local_effect;
                this.recommend_forum = ForumInfo.copyOf(forumInfo.recommend_forum);
                this.anchor_power = forumInfo.anchor_power;
                this.worldcupinfo = forumInfo.worldcupinfo;
                this.has_game = forumInfo.has_game;
                this.game_url = forumInfo.game_url;
                this.recommend_user_info = forumInfo.recommend_user_info;
                this.can_use_accelerate = forumInfo.can_use_accelerate;
                this.accelerate_cotent = forumInfo.accelerate_cotent;
                this.top_code = forumInfo.top_code;
                this.news_info = forumInfo.news_info;
                this.game_card = ForumInfo.copyOf(forumInfo.game_card);
                this.game_name = forumInfo.game_name;
                this.forumvip_show_icon = forumInfo.forumvip_show_icon;
                this.adkiller_data = forumInfo.adkiller_data;
                this.yule = forumInfo.yule;
                this.realtime_data = forumInfo.realtime_data;
                this.across_forum_show = forumInfo.across_forum_show;
                this.post_topic = forumInfo.post_topic;
                this.across_forum_hide = forumInfo.across_forum_hide;
                this.is_live_game_forum = forumInfo.is_live_game_forum;
                this.is_live_game = forumInfo.is_live_game;
                this.is_new_game_forum = forumInfo.is_new_game_forum;
                this.forum_game_label = forumInfo.forum_game_label;
                this.warning_msg = forumInfo.warning_msg;
                this.special_forum_type = forumInfo.special_forum_type;
                this.topic_special_icon = forumInfo.topic_special_icon;
                this.topic_special_icon_right = forumInfo.topic_special_icon_right;
                this.is_brand_forum = forumInfo.is_brand_forum;
                this.is_show_all_top_thread = forumInfo.is_show_all_top_thread;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumInfo build(boolean z) {
            return new ForumInfo(this, z);
        }
    }
}
