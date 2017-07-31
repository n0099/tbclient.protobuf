package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BannerList;
import tbclient.SimpleForum;
import tbclient.ThreadInfo;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_STAT_KEY = "";
    @ProtoField(tag = 10)
    public final AgeSexModule age_sex;
    @ProtoField(tag = 9)
    public final BannerList banner_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<CardForum> card_forum;
    @ProtoField(label = Message.Label.REPEATED, tag = 12)
    public final List<CardGod> card_god;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<CardTopic> card_topic;
    @ProtoField(label = Message.Label.REPEATED, tag = 11)
    public final List<TagStruct> interestion;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_new_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 14)
    public final List<SimpleForum> like_forums;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<Resource> resource_list;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String stat_key;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer sug_seconds;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<TagInfo> tag_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<ThreadPersonalized> thread_personalized;
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

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tag_list == null) {
                this.tag_list = DEFAULT_TAG_LIST;
            } else {
                this.tag_list = immutableCopyOf(builder.tag_list);
            }
            if (builder.thread_list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = immutableCopyOf(builder.thread_list);
            }
            if (builder.resource_list == null) {
                this.resource_list = DEFAULT_RESOURCE_LIST;
            } else {
                this.resource_list = immutableCopyOf(builder.resource_list);
            }
            if (builder.card_forum == null) {
                this.card_forum = DEFAULT_CARD_FORUM;
            } else {
                this.card_forum = immutableCopyOf(builder.card_forum);
            }
            if (builder.card_topic == null) {
                this.card_topic = DEFAULT_CARD_TOPIC;
            } else {
                this.card_topic = immutableCopyOf(builder.card_topic);
            }
            if (builder.sug_seconds == null) {
                this.sug_seconds = DEFAULT_SUG_SECONDS;
            } else {
                this.sug_seconds = builder.sug_seconds;
            }
            if (builder.thread_personalized == null) {
                this.thread_personalized = DEFAULT_THREAD_PERSONALIZED;
            } else {
                this.thread_personalized = immutableCopyOf(builder.thread_personalized);
            }
            if (builder.is_new_url == null) {
                this.is_new_url = DEFAULT_IS_NEW_URL;
            } else {
                this.is_new_url = builder.is_new_url;
            }
            this.banner_list = builder.banner_list;
            this.age_sex = builder.age_sex;
            if (builder.interestion == null) {
                this.interestion = DEFAULT_INTERESTION;
            } else {
                this.interestion = immutableCopyOf(builder.interestion);
            }
            if (builder.card_god == null) {
                this.card_god = DEFAULT_CARD_GOD;
            } else {
                this.card_god = immutableCopyOf(builder.card_god);
            }
            if (builder.stat_key == null) {
                this.stat_key = "";
            } else {
                this.stat_key = builder.stat_key;
            }
            if (builder.like_forums == null) {
                this.like_forums = DEFAULT_LIKE_FORUMS;
                return;
            } else {
                this.like_forums = immutableCopyOf(builder.like_forums);
                return;
            }
        }
        this.tag_list = immutableCopyOf(builder.tag_list);
        this.thread_list = immutableCopyOf(builder.thread_list);
        this.resource_list = immutableCopyOf(builder.resource_list);
        this.card_forum = immutableCopyOf(builder.card_forum);
        this.card_topic = immutableCopyOf(builder.card_topic);
        this.sug_seconds = builder.sug_seconds;
        this.thread_personalized = immutableCopyOf(builder.thread_personalized);
        this.is_new_url = builder.is_new_url;
        this.banner_list = builder.banner_list;
        this.age_sex = builder.age_sex;
        this.interestion = immutableCopyOf(builder.interestion);
        this.card_god = immutableCopyOf(builder.card_god);
        this.stat_key = builder.stat_key;
        this.like_forums = immutableCopyOf(builder.like_forums);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public AgeSexModule age_sex;
        public BannerList banner_list;
        public List<CardForum> card_forum;
        public List<CardGod> card_god;
        public List<CardTopic> card_topic;
        public List<TagStruct> interestion;
        public Integer is_new_url;
        public List<SimpleForum> like_forums;
        public List<Resource> resource_list;
        public String stat_key;
        public Integer sug_seconds;
        public List<TagInfo> tag_list;
        public List<ThreadInfo> thread_list;
        public List<ThreadPersonalized> thread_personalized;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.tag_list = DataRes.copyOf(dataRes.tag_list);
                this.thread_list = DataRes.copyOf(dataRes.thread_list);
                this.resource_list = DataRes.copyOf(dataRes.resource_list);
                this.card_forum = DataRes.copyOf(dataRes.card_forum);
                this.card_topic = DataRes.copyOf(dataRes.card_topic);
                this.sug_seconds = dataRes.sug_seconds;
                this.thread_personalized = DataRes.copyOf(dataRes.thread_personalized);
                this.is_new_url = dataRes.is_new_url;
                this.banner_list = dataRes.banner_list;
                this.age_sex = dataRes.age_sex;
                this.interestion = DataRes.copyOf(dataRes.interestion);
                this.card_god = DataRes.copyOf(dataRes.card_god);
                this.stat_key = dataRes.stat_key;
                this.like_forums = DataRes.copyOf(dataRes.like_forums);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
