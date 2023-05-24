package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ActiveCenter;
import tbclient.Anti;
import tbclient.BannerList;
import tbclient.DiscoverHotForum;
import tbclient.FavoritePanel;
import tbclient.SimpleForum;
import tbclient.ThreadInfo;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_STAT_KEY = "";
    @ProtoField(tag = 22)
    public final ActiveCenter active_center;
    @ProtoField(tag = 10)
    public final AgeSexModule age_sex;
    @ProtoField(tag = 16)
    public final Anti anti;
    @ProtoField(tag = 9)
    public final BannerList banner_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<CardForum> card_forum;
    @ProtoField(label = Message.Label.REPEATED, tag = 12)
    public final List<CardGod> card_god;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<CardTopic> card_topic;
    @ProtoField(tag = 24)
    public final FavoritePanel favorite_panel;
    @ProtoField(tag = 18)
    public final FloatInfo float_info;
    @ProtoField(tag = 21, type = Message.Datatype.INT32)
    public final Integer fresh_ctrl_num;
    @ProtoField(tag = 26)
    public final HeaderCard header_card;
    @ProtoField(tag = 23)
    public final DiscoverHotForum hot_recomforum;
    @ProtoField(label = Message.Label.REPEATED, tag = 11)
    public final List<TagStruct> interestion;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_new_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 14)
    public final List<SimpleForum> like_forums;
    @ProtoField(tag = 17)
    public final LiveAnswer live_answer;
    @ProtoField(tag = 27)
    public final PageData page_data;
    @ProtoField(tag = 19)
    public final RecomPostTopic recom_post_topic;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<Resource> resource_list;
    @ProtoField(tag = 25, type = Message.Datatype.INT32)
    public final Integer show_adsense;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String stat_key;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer style_ab_tag;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer sug_seconds;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<TagInfo> tag_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<ThreadPersonalized> thread_personalized;
    @ProtoField(tag = 20)
    public final UserFollowLive user_follow_live;
    public static final List<TagInfo> DEFAULT_TAG_LIST = Collections.emptyList();
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final List<Resource> DEFAULT_RESOURCE_LIST = Collections.emptyList();
    public static final List<CardForum> DEFAULT_CARD_FORUM = Collections.emptyList();
    public static final List<CardTopic> DEFAULT_CARD_TOPIC = Collections.emptyList();
    public static final Integer DEFAULT_SUG_SECONDS = 0;
    public static final List<ThreadPersonalized> DEFAULT_THREAD_PERSONALIZED = Collections.emptyList();
    public static final Integer DEFAULT_IS_NEW_URL = 0;
    public static final List<TagStruct> DEFAULT_INTERESTION = Collections.emptyList();
    public static final List<CardGod> DEFAULT_CARD_GOD = Collections.emptyList();
    public static final List<SimpleForum> DEFAULT_LIKE_FORUMS = Collections.emptyList();
    public static final Integer DEFAULT_STYLE_AB_TAG = 0;
    public static final Integer DEFAULT_FRESH_CTRL_NUM = 0;
    public static final Integer DEFAULT_SHOW_ADSENSE = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public ActiveCenter active_center;
        public AgeSexModule age_sex;
        public Anti anti;
        public BannerList banner_list;
        public List<CardForum> card_forum;
        public List<CardGod> card_god;
        public List<CardTopic> card_topic;
        public FavoritePanel favorite_panel;
        public FloatInfo float_info;
        public Integer fresh_ctrl_num;
        public HeaderCard header_card;
        public DiscoverHotForum hot_recomforum;
        public List<TagStruct> interestion;
        public Integer is_new_url;
        public List<SimpleForum> like_forums;
        public LiveAnswer live_answer;
        public PageData page_data;
        public RecomPostTopic recom_post_topic;
        public List<Resource> resource_list;
        public Integer show_adsense;
        public String stat_key;
        public Integer style_ab_tag;
        public Integer sug_seconds;
        public List<TagInfo> tag_list;
        public List<ThreadInfo> thread_list;
        public List<ThreadPersonalized> thread_personalized;
        public UserFollowLive user_follow_live;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.tag_list = Message.copyOf(dataRes.tag_list);
            this.thread_list = Message.copyOf(dataRes.thread_list);
            this.resource_list = Message.copyOf(dataRes.resource_list);
            this.card_forum = Message.copyOf(dataRes.card_forum);
            this.card_topic = Message.copyOf(dataRes.card_topic);
            this.sug_seconds = dataRes.sug_seconds;
            this.thread_personalized = Message.copyOf(dataRes.thread_personalized);
            this.is_new_url = dataRes.is_new_url;
            this.banner_list = dataRes.banner_list;
            this.age_sex = dataRes.age_sex;
            this.interestion = Message.copyOf(dataRes.interestion);
            this.card_god = Message.copyOf(dataRes.card_god);
            this.stat_key = dataRes.stat_key;
            this.like_forums = Message.copyOf(dataRes.like_forums);
            this.style_ab_tag = dataRes.style_ab_tag;
            this.anti = dataRes.anti;
            this.live_answer = dataRes.live_answer;
            this.float_info = dataRes.float_info;
            this.recom_post_topic = dataRes.recom_post_topic;
            this.user_follow_live = dataRes.user_follow_live;
            this.fresh_ctrl_num = dataRes.fresh_ctrl_num;
            this.active_center = dataRes.active_center;
            this.hot_recomforum = dataRes.hot_recomforum;
            this.favorite_panel = dataRes.favorite_panel;
            this.show_adsense = dataRes.show_adsense;
            this.header_card = dataRes.header_card;
            this.page_data = dataRes.page_data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<TagInfo> list = builder.tag_list;
            if (list == null) {
                this.tag_list = DEFAULT_TAG_LIST;
            } else {
                this.tag_list = Message.immutableCopyOf(list);
            }
            List<ThreadInfo> list2 = builder.thread_list;
            if (list2 == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list2);
            }
            List<Resource> list3 = builder.resource_list;
            if (list3 == null) {
                this.resource_list = DEFAULT_RESOURCE_LIST;
            } else {
                this.resource_list = Message.immutableCopyOf(list3);
            }
            List<CardForum> list4 = builder.card_forum;
            if (list4 == null) {
                this.card_forum = DEFAULT_CARD_FORUM;
            } else {
                this.card_forum = Message.immutableCopyOf(list4);
            }
            List<CardTopic> list5 = builder.card_topic;
            if (list5 == null) {
                this.card_topic = DEFAULT_CARD_TOPIC;
            } else {
                this.card_topic = Message.immutableCopyOf(list5);
            }
            Integer num = builder.sug_seconds;
            if (num == null) {
                this.sug_seconds = DEFAULT_SUG_SECONDS;
            } else {
                this.sug_seconds = num;
            }
            List<ThreadPersonalized> list6 = builder.thread_personalized;
            if (list6 == null) {
                this.thread_personalized = DEFAULT_THREAD_PERSONALIZED;
            } else {
                this.thread_personalized = Message.immutableCopyOf(list6);
            }
            Integer num2 = builder.is_new_url;
            if (num2 == null) {
                this.is_new_url = DEFAULT_IS_NEW_URL;
            } else {
                this.is_new_url = num2;
            }
            this.banner_list = builder.banner_list;
            this.age_sex = builder.age_sex;
            List<TagStruct> list7 = builder.interestion;
            if (list7 == null) {
                this.interestion = DEFAULT_INTERESTION;
            } else {
                this.interestion = Message.immutableCopyOf(list7);
            }
            List<CardGod> list8 = builder.card_god;
            if (list8 == null) {
                this.card_god = DEFAULT_CARD_GOD;
            } else {
                this.card_god = Message.immutableCopyOf(list8);
            }
            String str = builder.stat_key;
            if (str == null) {
                this.stat_key = "";
            } else {
                this.stat_key = str;
            }
            List<SimpleForum> list9 = builder.like_forums;
            if (list9 == null) {
                this.like_forums = DEFAULT_LIKE_FORUMS;
            } else {
                this.like_forums = Message.immutableCopyOf(list9);
            }
            Integer num3 = builder.style_ab_tag;
            if (num3 == null) {
                this.style_ab_tag = DEFAULT_STYLE_AB_TAG;
            } else {
                this.style_ab_tag = num3;
            }
            this.anti = builder.anti;
            this.live_answer = builder.live_answer;
            this.float_info = builder.float_info;
            this.recom_post_topic = builder.recom_post_topic;
            this.user_follow_live = builder.user_follow_live;
            Integer num4 = builder.fresh_ctrl_num;
            if (num4 == null) {
                this.fresh_ctrl_num = DEFAULT_FRESH_CTRL_NUM;
            } else {
                this.fresh_ctrl_num = num4;
            }
            this.active_center = builder.active_center;
            this.hot_recomforum = builder.hot_recomforum;
            this.favorite_panel = builder.favorite_panel;
            Integer num5 = builder.show_adsense;
            if (num5 == null) {
                this.show_adsense = DEFAULT_SHOW_ADSENSE;
            } else {
                this.show_adsense = num5;
            }
            this.header_card = builder.header_card;
            this.page_data = builder.page_data;
            return;
        }
        this.tag_list = Message.immutableCopyOf(builder.tag_list);
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.resource_list = Message.immutableCopyOf(builder.resource_list);
        this.card_forum = Message.immutableCopyOf(builder.card_forum);
        this.card_topic = Message.immutableCopyOf(builder.card_topic);
        this.sug_seconds = builder.sug_seconds;
        this.thread_personalized = Message.immutableCopyOf(builder.thread_personalized);
        this.is_new_url = builder.is_new_url;
        this.banner_list = builder.banner_list;
        this.age_sex = builder.age_sex;
        this.interestion = Message.immutableCopyOf(builder.interestion);
        this.card_god = Message.immutableCopyOf(builder.card_god);
        this.stat_key = builder.stat_key;
        this.like_forums = Message.immutableCopyOf(builder.like_forums);
        this.style_ab_tag = builder.style_ab_tag;
        this.anti = builder.anti;
        this.live_answer = builder.live_answer;
        this.float_info = builder.float_info;
        this.recom_post_topic = builder.recom_post_topic;
        this.user_follow_live = builder.user_follow_live;
        this.fresh_ctrl_num = builder.fresh_ctrl_num;
        this.active_center = builder.active_center;
        this.hot_recomforum = builder.hot_recomforum;
        this.favorite_panel = builder.favorite_panel;
        this.show_adsense = builder.show_adsense;
        this.header_card = builder.header_card;
        this.page_data = builder.page_data;
    }
}
