package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BannerFollowLive;
import tbclient.BannerUserStory;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_LAST_TIPS = "";
    public static final String DEFAULT_PAGE_TAG = "";
    public static final String DEFAULT_TOP_TIPS = "";
    public static final String DEFAULT_USER_TIPS = "";
    @ProtoField(tag = 13)
    public final BannerFollowLive banner_follow_live;
    @ProtoField(tag = 6)
    public final BannerUserStory banner_user_story;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String last_tips;
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

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.thread_info == null) {
                this.thread_info = DEFAULT_THREAD_INFO;
            } else {
                this.thread_info = immutableCopyOf(builder.thread_info);
            }
            if (builder.page_tag == null) {
                this.page_tag = "";
            } else {
                this.page_tag = builder.page_tag;
            }
            if (builder.user_list == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = immutableCopyOf(builder.user_list);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = builder.has_more;
            }
            if (builder.user_tips == null) {
                this.user_tips = "";
            } else {
                this.user_tips = builder.user_tips;
            }
            this.banner_user_story = builder.banner_user_story;
            if (builder.last_tips == null) {
                this.last_tips = "";
            } else {
                this.last_tips = builder.last_tips;
            }
            this.top_user_info = builder.top_user_info;
            if (builder.req_unix == null) {
                this.req_unix = DEFAULT_REQ_UNIX;
            } else {
                this.req_unix = builder.req_unix;
            }
            if (builder.user_tips_type == null) {
                this.user_tips_type = DEFAULT_USER_TIPS_TYPE;
            } else {
                this.user_tips_type = builder.user_tips_type;
            }
            if (builder.top_tips == null) {
                this.top_tips = "";
            } else {
                this.top_tips = builder.top_tips;
            }
            this.banner_follow_live = builder.banner_follow_live;
            return;
        }
        this.thread_info = immutableCopyOf(builder.thread_info);
        this.page_tag = builder.page_tag;
        this.user_list = immutableCopyOf(builder.user_list);
        this.has_more = builder.has_more;
        this.user_tips = builder.user_tips;
        this.banner_user_story = builder.banner_user_story;
        this.last_tips = builder.last_tips;
        this.top_user_info = builder.top_user_info;
        this.req_unix = builder.req_unix;
        this.user_tips_type = builder.user_tips_type;
        this.top_tips = builder.top_tips;
        this.banner_follow_live = builder.banner_follow_live;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public BannerFollowLive banner_follow_live;
        public BannerUserStory banner_user_story;
        public Integer has_more;
        public String last_tips;
        public String page_tag;
        public Long req_unix;
        public List<ConcernData> thread_info;
        public String top_tips;
        public UserList top_user_info;
        public List<UserList> user_list;
        public String user_tips;
        public Integer user_tips_type;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.thread_info = DataRes.copyOf(dataRes.thread_info);
                this.page_tag = dataRes.page_tag;
                this.user_list = DataRes.copyOf(dataRes.user_list);
                this.has_more = dataRes.has_more;
                this.user_tips = dataRes.user_tips;
                this.banner_user_story = dataRes.banner_user_story;
                this.last_tips = dataRes.last_tips;
                this.top_user_info = dataRes.top_user_info;
                this.req_unix = dataRes.req_unix;
                this.user_tips_type = dataRes.user_tips_type;
                this.top_tips = dataRes.top_tips;
                this.banner_follow_live = dataRes.banner_follow_live;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
