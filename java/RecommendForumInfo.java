package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class RecommendForumInfo extends Message {
    public static final String DEFAULT_ABTEST_TAG = "";
    public static final String DEFAULT_AUTHEN = "";
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_AVATAR_ORIGIN = "";
    public static final String DEFAULT_EXTRA = "";
    public static final String DEFAULT_FIRST_CATEGORY = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_HOT_TEXT = "";
    public static final String DEFAULT_LV1_NAME = "";
    public static final String DEFAULT_LV2_NAME = "";
    public static final String DEFAULT_RECOM_REASON = "";
    public static final String DEFAULT_SLOGAN = "";
    public static final String DEFAULT_SOURCE = "";
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String abtest_tag;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String authen;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String avatar_origin;
    @ProtoField(tag = 28)
    public final BlockPopInfo block_pop_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<PbContent> content;
    @ProtoField(tag = 27, type = Message.Datatype.UINT32)
    public final Integer day_thread_num;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String extra;
    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String first_category;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer forum_type;
    @ProtoField(tag = 25, type = Message.Datatype.INT32)
    public final Integer has_postpre;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String hot_text;
    @ProtoField(tag = 22, type = Message.Datatype.UINT64)
    public final Long hot_thread_id;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer is_brand_forum;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_like;
    @ProtoField(tag = 17, type = Message.Datatype.UINT32)
    public final Integer is_private_forum;
    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer is_recommend_forum;
    @ProtoField(tag = 30, type = Message.Datatype.INT32)
    public final Integer level_id;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String lv1_name;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String lv2_name;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer member_count;
    @ProtoField(tag = 24)
    public final PostPrefix post_prefix;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String recom_reason;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String slogan;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String source;
    @ProtoField(label = Message.Label.REPEATED, tag = 26)
    public final List<FrsTabInfo> tab_info;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer thread_count;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_IS_LIKE = 0;
    public static final Integer DEFAULT_MEMBER_COUNT = 0;
    public static final Integer DEFAULT_THREAD_COUNT = 0;
    public static final List<PbContent> DEFAULT_CONTENT = Collections.emptyList();
    public static final Integer DEFAULT_FORUM_TYPE = 0;
    public static final Integer DEFAULT_IS_BRAND_FORUM = 0;
    public static final Integer DEFAULT_IS_PRIVATE_FORUM = 0;
    public static final Long DEFAULT_HOT_THREAD_ID = 0L;
    public static final Integer DEFAULT_IS_RECOMMEND_FORUM = 0;
    public static final Integer DEFAULT_HAS_POSTPRE = 0;
    public static final List<FrsTabInfo> DEFAULT_TAB_INFO = Collections.emptyList();
    public static final Integer DEFAULT_DAY_THREAD_NUM = 0;
    public static final Integer DEFAULT_LEVEL_ID = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<RecommendForumInfo> {
        public String abtest_tag;
        public String authen;
        public String avatar;
        public String avatar_origin;
        public BlockPopInfo block_pop_info;
        public List<PbContent> content;
        public Integer day_thread_num;
        public String extra;
        public String first_category;
        public Long forum_id;
        public String forum_name;
        public Integer forum_type;
        public Integer has_postpre;
        public String hot_text;
        public Long hot_thread_id;
        public Integer is_brand_forum;
        public Integer is_like;
        public Integer is_private_forum;
        public Integer is_recommend_forum;
        public Integer level_id;
        public String lv1_name;
        public String lv2_name;
        public Integer member_count;
        public PostPrefix post_prefix;
        public String recom_reason;
        public String slogan;
        public String source;
        public List<FrsTabInfo> tab_info;
        public Integer thread_count;

        public Builder() {
        }

        public Builder(RecommendForumInfo recommendForumInfo) {
            super(recommendForumInfo);
            if (recommendForumInfo == null) {
                return;
            }
            this.avatar = recommendForumInfo.avatar;
            this.forum_id = recommendForumInfo.forum_id;
            this.forum_name = recommendForumInfo.forum_name;
            this.is_like = recommendForumInfo.is_like;
            this.member_count = recommendForumInfo.member_count;
            this.thread_count = recommendForumInfo.thread_count;
            this.slogan = recommendForumInfo.slogan;
            this.content = Message.copyOf(recommendForumInfo.content);
            this.forum_type = recommendForumInfo.forum_type;
            this.authen = recommendForumInfo.authen;
            this.recom_reason = recommendForumInfo.recom_reason;
            this.is_brand_forum = recommendForumInfo.is_brand_forum;
            this.hot_text = recommendForumInfo.hot_text;
            this.abtest_tag = recommendForumInfo.abtest_tag;
            this.source = recommendForumInfo.source;
            this.extra = recommendForumInfo.extra;
            this.is_private_forum = recommendForumInfo.is_private_forum;
            this.lv1_name = recommendForumInfo.lv1_name;
            this.lv2_name = recommendForumInfo.lv2_name;
            this.avatar_origin = recommendForumInfo.avatar_origin;
            this.hot_thread_id = recommendForumInfo.hot_thread_id;
            this.is_recommend_forum = recommendForumInfo.is_recommend_forum;
            this.post_prefix = recommendForumInfo.post_prefix;
            this.has_postpre = recommendForumInfo.has_postpre;
            this.tab_info = Message.copyOf(recommendForumInfo.tab_info);
            this.day_thread_num = recommendForumInfo.day_thread_num;
            this.block_pop_info = recommendForumInfo.block_pop_info;
            this.first_category = recommendForumInfo.first_category;
            this.level_id = recommendForumInfo.level_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendForumInfo build(boolean z) {
            return new RecommendForumInfo(this, z);
        }
    }

    public RecommendForumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.avatar;
            if (str == null) {
                this.avatar = "";
            } else {
                this.avatar = str;
            }
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str2 = builder.forum_name;
            if (str2 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str2;
            }
            Integer num = builder.is_like;
            if (num == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = num;
            }
            Integer num2 = builder.member_count;
            if (num2 == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = num2;
            }
            Integer num3 = builder.thread_count;
            if (num3 == null) {
                this.thread_count = DEFAULT_THREAD_COUNT;
            } else {
                this.thread_count = num3;
            }
            String str3 = builder.slogan;
            if (str3 == null) {
                this.slogan = "";
            } else {
                this.slogan = str3;
            }
            List<PbContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = Message.immutableCopyOf(list);
            }
            Integer num4 = builder.forum_type;
            if (num4 == null) {
                this.forum_type = DEFAULT_FORUM_TYPE;
            } else {
                this.forum_type = num4;
            }
            String str4 = builder.authen;
            if (str4 == null) {
                this.authen = "";
            } else {
                this.authen = str4;
            }
            String str5 = builder.recom_reason;
            if (str5 == null) {
                this.recom_reason = "";
            } else {
                this.recom_reason = str5;
            }
            Integer num5 = builder.is_brand_forum;
            if (num5 == null) {
                this.is_brand_forum = DEFAULT_IS_BRAND_FORUM;
            } else {
                this.is_brand_forum = num5;
            }
            String str6 = builder.hot_text;
            if (str6 == null) {
                this.hot_text = "";
            } else {
                this.hot_text = str6;
            }
            String str7 = builder.abtest_tag;
            if (str7 == null) {
                this.abtest_tag = "";
            } else {
                this.abtest_tag = str7;
            }
            String str8 = builder.source;
            if (str8 == null) {
                this.source = "";
            } else {
                this.source = str8;
            }
            String str9 = builder.extra;
            if (str9 == null) {
                this.extra = "";
            } else {
                this.extra = str9;
            }
            Integer num6 = builder.is_private_forum;
            if (num6 == null) {
                this.is_private_forum = DEFAULT_IS_PRIVATE_FORUM;
            } else {
                this.is_private_forum = num6;
            }
            String str10 = builder.lv1_name;
            if (str10 == null) {
                this.lv1_name = "";
            } else {
                this.lv1_name = str10;
            }
            String str11 = builder.lv2_name;
            if (str11 == null) {
                this.lv2_name = "";
            } else {
                this.lv2_name = str11;
            }
            String str12 = builder.avatar_origin;
            if (str12 == null) {
                this.avatar_origin = "";
            } else {
                this.avatar_origin = str12;
            }
            Long l2 = builder.hot_thread_id;
            if (l2 == null) {
                this.hot_thread_id = DEFAULT_HOT_THREAD_ID;
            } else {
                this.hot_thread_id = l2;
            }
            Integer num7 = builder.is_recommend_forum;
            if (num7 == null) {
                this.is_recommend_forum = DEFAULT_IS_RECOMMEND_FORUM;
            } else {
                this.is_recommend_forum = num7;
            }
            this.post_prefix = builder.post_prefix;
            Integer num8 = builder.has_postpre;
            if (num8 == null) {
                this.has_postpre = DEFAULT_HAS_POSTPRE;
            } else {
                this.has_postpre = num8;
            }
            List<FrsTabInfo> list2 = builder.tab_info;
            if (list2 == null) {
                this.tab_info = DEFAULT_TAB_INFO;
            } else {
                this.tab_info = Message.immutableCopyOf(list2);
            }
            Integer num9 = builder.day_thread_num;
            if (num9 == null) {
                this.day_thread_num = DEFAULT_DAY_THREAD_NUM;
            } else {
                this.day_thread_num = num9;
            }
            this.block_pop_info = builder.block_pop_info;
            String str13 = builder.first_category;
            if (str13 == null) {
                this.first_category = "";
            } else {
                this.first_category = str13;
            }
            Integer num10 = builder.level_id;
            if (num10 == null) {
                this.level_id = DEFAULT_LEVEL_ID;
                return;
            } else {
                this.level_id = num10;
                return;
            }
        }
        this.avatar = builder.avatar;
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.is_like = builder.is_like;
        this.member_count = builder.member_count;
        this.thread_count = builder.thread_count;
        this.slogan = builder.slogan;
        this.content = Message.immutableCopyOf(builder.content);
        this.forum_type = builder.forum_type;
        this.authen = builder.authen;
        this.recom_reason = builder.recom_reason;
        this.is_brand_forum = builder.is_brand_forum;
        this.hot_text = builder.hot_text;
        this.abtest_tag = builder.abtest_tag;
        this.source = builder.source;
        this.extra = builder.extra;
        this.is_private_forum = builder.is_private_forum;
        this.lv1_name = builder.lv1_name;
        this.lv2_name = builder.lv2_name;
        this.avatar_origin = builder.avatar_origin;
        this.hot_thread_id = builder.hot_thread_id;
        this.is_recommend_forum = builder.is_recommend_forum;
        this.post_prefix = builder.post_prefix;
        this.has_postpre = builder.has_postpre;
        this.tab_info = Message.immutableCopyOf(builder.tab_info);
        this.day_thread_num = builder.day_thread_num;
        this.block_pop_info = builder.block_pop_info;
        this.first_category = builder.first_category;
        this.level_id = builder.level_id;
    }
}
