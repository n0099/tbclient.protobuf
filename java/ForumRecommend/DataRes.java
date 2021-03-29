package tbclient.ForumRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ForumCreateInfo;
import tbclient.ForumPopupInfo;
import tbclient.FrequentlyForumInfo;
import tbclient.FrsTabInfo;
import tbclient.PrivatePopInfo;
import tbclient.RecommendForumInfo;
/* loaded from: classes7.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_MSIGN_TEXT = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<Banner> banner;
    @ProtoField(tag = 19)
    public final ForumCreateInfo forum_create_info;
    @ProtoField(tag = 22)
    public final ForumPopupInfo forum_popup_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 14)
    public final List<FrequentlyForumInfo> frequently_forum_info;
    @ProtoField(tag = 11)
    public final HotSearch hot_search;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_login;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_mem;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<LikeForum> like_forum;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer msign_level;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String msign_text;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer msign_valid;
    @ProtoField(label = Message.Label.REPEATED, tag = 21)
    public final List<FrsTabInfo> nav_tab_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 13)
    public final List<Banner> new_banner_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<NewRecommend> new_recommend;
    @ProtoField(tag = 20)
    public final PrivatePopInfo private_forum_popinfo;
    @ProtoField(label = Message.Label.REPEATED, tag = 10)
    public final List<RecommendForumInfo> recommend_forum_info;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer redirect;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer sort_type;
    @ProtoField(label = Message.Label.REPEATED, tag = 15)
    public final List<RecommendForumInfo> tag_recommend_forum;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer time;
    public static final List<LikeForum> DEFAULT_LIKE_FORUM = Collections.emptyList();
    public static final List<Banner> DEFAULT_BANNER = Collections.emptyList();
    public static final List<NewRecommend> DEFAULT_NEW_RECOMMEND = Collections.emptyList();
    public static final Integer DEFAULT_IS_LOGIN = 0;
    public static final Integer DEFAULT_MSIGN_VALID = 0;
    public static final Integer DEFAULT_MSIGN_LEVEL = 0;
    public static final Integer DEFAULT_TIME = 0;
    public static final Integer DEFAULT_IS_MEM = 0;
    public static final List<RecommendForumInfo> DEFAULT_RECOMMEND_FORUM_INFO = Collections.emptyList();
    public static final Integer DEFAULT_REDIRECT = 0;
    public static final List<Banner> DEFAULT_NEW_BANNER_INFO = Collections.emptyList();
    public static final List<FrequentlyForumInfo> DEFAULT_FREQUENTLY_FORUM_INFO = Collections.emptyList();
    public static final List<RecommendForumInfo> DEFAULT_TAG_RECOMMEND_FORUM = Collections.emptyList();
    public static final Integer DEFAULT_SORT_TYPE = 0;
    public static final List<FrsTabInfo> DEFAULT_NAV_TAB_INFO = Collections.emptyList();

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<Banner> banner;
        public ForumCreateInfo forum_create_info;
        public ForumPopupInfo forum_popup_info;
        public List<FrequentlyForumInfo> frequently_forum_info;
        public HotSearch hot_search;
        public Integer is_login;
        public Integer is_mem;
        public List<LikeForum> like_forum;
        public Integer msign_level;
        public String msign_text;
        public Integer msign_valid;
        public List<FrsTabInfo> nav_tab_info;
        public List<Banner> new_banner_info;
        public List<NewRecommend> new_recommend;
        public PrivatePopInfo private_forum_popinfo;
        public List<RecommendForumInfo> recommend_forum_info;
        public Integer redirect;
        public Integer sort_type;
        public List<RecommendForumInfo> tag_recommend_forum;
        public Integer time;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.like_forum = Message.copyOf(dataRes.like_forum);
            this.banner = Message.copyOf(dataRes.banner);
            this.new_recommend = Message.copyOf(dataRes.new_recommend);
            this.is_login = dataRes.is_login;
            this.msign_valid = dataRes.msign_valid;
            this.msign_text = dataRes.msign_text;
            this.msign_level = dataRes.msign_level;
            this.time = dataRes.time;
            this.is_mem = dataRes.is_mem;
            this.recommend_forum_info = Message.copyOf(dataRes.recommend_forum_info);
            this.hot_search = dataRes.hot_search;
            this.redirect = dataRes.redirect;
            this.new_banner_info = Message.copyOf(dataRes.new_banner_info);
            this.frequently_forum_info = Message.copyOf(dataRes.frequently_forum_info);
            this.tag_recommend_forum = Message.copyOf(dataRes.tag_recommend_forum);
            this.sort_type = dataRes.sort_type;
            this.forum_create_info = dataRes.forum_create_info;
            this.private_forum_popinfo = dataRes.private_forum_popinfo;
            this.nav_tab_info = Message.copyOf(dataRes.nav_tab_info);
            this.forum_popup_info = dataRes.forum_popup_info;
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
            List<LikeForum> list = builder.like_forum;
            if (list == null) {
                this.like_forum = DEFAULT_LIKE_FORUM;
            } else {
                this.like_forum = Message.immutableCopyOf(list);
            }
            List<Banner> list2 = builder.banner;
            if (list2 == null) {
                this.banner = DEFAULT_BANNER;
            } else {
                this.banner = Message.immutableCopyOf(list2);
            }
            List<NewRecommend> list3 = builder.new_recommend;
            if (list3 == null) {
                this.new_recommend = DEFAULT_NEW_RECOMMEND;
            } else {
                this.new_recommend = Message.immutableCopyOf(list3);
            }
            Integer num = builder.is_login;
            if (num == null) {
                this.is_login = DEFAULT_IS_LOGIN;
            } else {
                this.is_login = num;
            }
            Integer num2 = builder.msign_valid;
            if (num2 == null) {
                this.msign_valid = DEFAULT_MSIGN_VALID;
            } else {
                this.msign_valid = num2;
            }
            String str = builder.msign_text;
            if (str == null) {
                this.msign_text = "";
            } else {
                this.msign_text = str;
            }
            Integer num3 = builder.msign_level;
            if (num3 == null) {
                this.msign_level = DEFAULT_MSIGN_LEVEL;
            } else {
                this.msign_level = num3;
            }
            Integer num4 = builder.time;
            if (num4 == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = num4;
            }
            Integer num5 = builder.is_mem;
            if (num5 == null) {
                this.is_mem = DEFAULT_IS_MEM;
            } else {
                this.is_mem = num5;
            }
            List<RecommendForumInfo> list4 = builder.recommend_forum_info;
            if (list4 == null) {
                this.recommend_forum_info = DEFAULT_RECOMMEND_FORUM_INFO;
            } else {
                this.recommend_forum_info = Message.immutableCopyOf(list4);
            }
            this.hot_search = builder.hot_search;
            Integer num6 = builder.redirect;
            if (num6 == null) {
                this.redirect = DEFAULT_REDIRECT;
            } else {
                this.redirect = num6;
            }
            List<Banner> list5 = builder.new_banner_info;
            if (list5 == null) {
                this.new_banner_info = DEFAULT_NEW_BANNER_INFO;
            } else {
                this.new_banner_info = Message.immutableCopyOf(list5);
            }
            List<FrequentlyForumInfo> list6 = builder.frequently_forum_info;
            if (list6 == null) {
                this.frequently_forum_info = DEFAULT_FREQUENTLY_FORUM_INFO;
            } else {
                this.frequently_forum_info = Message.immutableCopyOf(list6);
            }
            List<RecommendForumInfo> list7 = builder.tag_recommend_forum;
            if (list7 == null) {
                this.tag_recommend_forum = DEFAULT_TAG_RECOMMEND_FORUM;
            } else {
                this.tag_recommend_forum = Message.immutableCopyOf(list7);
            }
            Integer num7 = builder.sort_type;
            if (num7 == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
            } else {
                this.sort_type = num7;
            }
            this.forum_create_info = builder.forum_create_info;
            this.private_forum_popinfo = builder.private_forum_popinfo;
            List<FrsTabInfo> list8 = builder.nav_tab_info;
            if (list8 == null) {
                this.nav_tab_info = DEFAULT_NAV_TAB_INFO;
            } else {
                this.nav_tab_info = Message.immutableCopyOf(list8);
            }
            this.forum_popup_info = builder.forum_popup_info;
            return;
        }
        this.like_forum = Message.immutableCopyOf(builder.like_forum);
        this.banner = Message.immutableCopyOf(builder.banner);
        this.new_recommend = Message.immutableCopyOf(builder.new_recommend);
        this.is_login = builder.is_login;
        this.msign_valid = builder.msign_valid;
        this.msign_text = builder.msign_text;
        this.msign_level = builder.msign_level;
        this.time = builder.time;
        this.is_mem = builder.is_mem;
        this.recommend_forum_info = Message.immutableCopyOf(builder.recommend_forum_info);
        this.hot_search = builder.hot_search;
        this.redirect = builder.redirect;
        this.new_banner_info = Message.immutableCopyOf(builder.new_banner_info);
        this.frequently_forum_info = Message.immutableCopyOf(builder.frequently_forum_info);
        this.tag_recommend_forum = Message.immutableCopyOf(builder.tag_recommend_forum);
        this.sort_type = builder.sort_type;
        this.forum_create_info = builder.forum_create_info;
        this.private_forum_popinfo = builder.private_forum_popinfo;
        this.nav_tab_info = Message.immutableCopyOf(builder.nav_tab_info);
        this.forum_popup_info = builder.forum_popup_info;
    }
}
