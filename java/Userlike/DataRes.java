package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.App;
import tbclient.BannerUserStory;
import tbclient.DiscoverHotForum;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_ABTEST_TAG = "";
    public static final String DEFAULT_LAST_TIPS = "";
    public static final String DEFAULT_PAGE_TAG = "";
    public static final String DEFAULT_TOP_TIPS = "";
    public static final String DEFAULT_USER_TIPS = "";
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String abtest_tag;
    @ProtoField(label = Message.Label.REPEATED, tag = 16)
    public final List<App> app_list;
    @ProtoField(tag = 13)
    public final BannerFollowLive banner_follow_live;
    @ProtoField(tag = 6)
    public final BannerUserStory banner_user_story;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(tag = 14)
    public final DiscoverHotForum hot_recomforum;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String last_tips;
    @ProtoField(tag = 19)
    public final PageData page_data;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String page_tag;
    @ProtoField(tag = 10, type = Message.Datatype.UINT64)
    public final Long req_unix;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ConcernData> thread_info;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String top_tips;
    @ProtoField(tag = 9)
    public final UserList top_user_info;
    @ProtoField(tag = 17)
    public final UserFollowLive user_follow_live;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<UserList> user_list;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String user_tips;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer user_tips_type;
    public static final List<ConcernData> DEFAULT_THREAD_INFO = Collections.emptyList();
    public static final List<UserList> DEFAULT_USER_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Long DEFAULT_REQ_UNIX = 0L;
    public static final Integer DEFAULT_USER_TIPS_TYPE = 0;
    public static final List<App> DEFAULT_APP_LIST = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String abtest_tag;
        public List<App> app_list;
        public BannerFollowLive banner_follow_live;
        public BannerUserStory banner_user_story;
        public Integer has_more;
        public DiscoverHotForum hot_recomforum;
        public String last_tips;
        public PageData page_data;
        public String page_tag;
        public Long req_unix;
        public List<ConcernData> thread_info;
        public String top_tips;
        public UserList top_user_info;
        public UserFollowLive user_follow_live;
        public List<UserList> user_list;
        public String user_tips;
        public Integer user_tips_type;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.thread_info = Message.copyOf(dataRes.thread_info);
            this.page_tag = dataRes.page_tag;
            this.user_list = Message.copyOf(dataRes.user_list);
            this.has_more = dataRes.has_more;
            this.user_tips = dataRes.user_tips;
            this.banner_user_story = dataRes.banner_user_story;
            this.last_tips = dataRes.last_tips;
            this.top_user_info = dataRes.top_user_info;
            this.req_unix = dataRes.req_unix;
            this.user_tips_type = dataRes.user_tips_type;
            this.top_tips = dataRes.top_tips;
            this.banner_follow_live = dataRes.banner_follow_live;
            this.hot_recomforum = dataRes.hot_recomforum;
            this.abtest_tag = dataRes.abtest_tag;
            this.app_list = Message.copyOf(dataRes.app_list);
            this.user_follow_live = dataRes.user_follow_live;
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
            List<ConcernData> list = builder.thread_info;
            if (list == null) {
                this.thread_info = DEFAULT_THREAD_INFO;
            } else {
                this.thread_info = Message.immutableCopyOf(list);
            }
            String str = builder.page_tag;
            if (str == null) {
                this.page_tag = "";
            } else {
                this.page_tag = str;
            }
            List<UserList> list2 = builder.user_list;
            if (list2 == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = Message.immutableCopyOf(list2);
            }
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = num;
            }
            String str2 = builder.user_tips;
            if (str2 == null) {
                this.user_tips = "";
            } else {
                this.user_tips = str2;
            }
            this.banner_user_story = builder.banner_user_story;
            String str3 = builder.last_tips;
            if (str3 == null) {
                this.last_tips = "";
            } else {
                this.last_tips = str3;
            }
            this.top_user_info = builder.top_user_info;
            Long l = builder.req_unix;
            if (l == null) {
                this.req_unix = DEFAULT_REQ_UNIX;
            } else {
                this.req_unix = l;
            }
            Integer num2 = builder.user_tips_type;
            if (num2 == null) {
                this.user_tips_type = DEFAULT_USER_TIPS_TYPE;
            } else {
                this.user_tips_type = num2;
            }
            String str4 = builder.top_tips;
            if (str4 == null) {
                this.top_tips = "";
            } else {
                this.top_tips = str4;
            }
            this.banner_follow_live = builder.banner_follow_live;
            this.hot_recomforum = builder.hot_recomforum;
            String str5 = builder.abtest_tag;
            if (str5 == null) {
                this.abtest_tag = "";
            } else {
                this.abtest_tag = str5;
            }
            List<App> list3 = builder.app_list;
            if (list3 == null) {
                this.app_list = DEFAULT_APP_LIST;
            } else {
                this.app_list = Message.immutableCopyOf(list3);
            }
            this.user_follow_live = builder.user_follow_live;
            this.page_data = builder.page_data;
            return;
        }
        this.thread_info = Message.immutableCopyOf(builder.thread_info);
        this.page_tag = builder.page_tag;
        this.user_list = Message.immutableCopyOf(builder.user_list);
        this.has_more = builder.has_more;
        this.user_tips = builder.user_tips;
        this.banner_user_story = builder.banner_user_story;
        this.last_tips = builder.last_tips;
        this.top_user_info = builder.top_user_info;
        this.req_unix = builder.req_unix;
        this.user_tips_type = builder.user_tips_type;
        this.top_tips = builder.top_tips;
        this.banner_follow_live = builder.banner_follow_live;
        this.hot_recomforum = builder.hot_recomforum;
        this.abtest_tag = builder.abtest_tag;
        this.app_list = Message.immutableCopyOf(builder.app_list);
        this.user_follow_live = builder.user_follow_live;
        this.page_data = builder.page_data;
    }
}
