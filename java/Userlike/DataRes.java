package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BannerUserStory;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_LAST_TIPS = "";
    public static final String DEFAULT_PAGE_TAG = "";
    public static final String DEFAULT_USER_TIPS = "";
    @ProtoField(tag = 6)
    public final BannerUserStory banner_user_story;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String last_tips;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String page_tag;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ConcernData> thread_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<UserList> user_list;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String user_tips;
    public static final List<ConcernData> DEFAULT_THREAD_INFO = Collections.emptyList();
    public static final List<UserList> DEFAULT_USER_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;

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
                return;
            } else {
                this.last_tips = builder.last_tips;
                return;
            }
        }
        this.thread_info = immutableCopyOf(builder.thread_info);
        this.page_tag = builder.page_tag;
        this.user_list = immutableCopyOf(builder.user_list);
        this.has_more = builder.has_more;
        this.user_tips = builder.user_tips;
        this.banner_user_story = builder.banner_user_story;
        this.last_tips = builder.last_tips;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public BannerUserStory banner_user_story;
        public Integer has_more;
        public String last_tips;
        public String page_tag;
        public List<ConcernData> thread_info;
        public List<UserList> user_list;
        public String user_tips;

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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
