package tbclient.Tabfeedlist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GeneralResource;
import tbclient.HotUserRankEntry;
import tbclient.RecommendForumInfo;
import tbclient.ThreadInfo;
/* loaded from: classes21.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 3)
    public final HotUserRankEntry hot_userrank_entry;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_new_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<RecommendForumInfo> recommend_forum_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<GeneralResource> resource_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> thread_list;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final List<GeneralResource> DEFAULT_RESOURCE_LIST = Collections.emptyList();
    public static final List<RecommendForumInfo> DEFAULT_RECOMMEND_FORUM_INFO = Collections.emptyList();
    public static final Integer DEFAULT_IS_NEW_URL = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
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
            this.hot_userrank_entry = builder.hot_userrank_entry;
            if (builder.recommend_forum_info == null) {
                this.recommend_forum_info = DEFAULT_RECOMMEND_FORUM_INFO;
            } else {
                this.recommend_forum_info = immutableCopyOf(builder.recommend_forum_info);
            }
            if (builder.is_new_url == null) {
                this.is_new_url = DEFAULT_IS_NEW_URL;
                return;
            } else {
                this.is_new_url = builder.is_new_url;
                return;
            }
        }
        this.thread_list = immutableCopyOf(builder.thread_list);
        this.resource_list = immutableCopyOf(builder.resource_list);
        this.hot_userrank_entry = builder.hot_userrank_entry;
        this.recommend_forum_info = immutableCopyOf(builder.recommend_forum_info);
        this.is_new_url = builder.is_new_url;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public HotUserRankEntry hot_userrank_entry;
        public Integer is_new_url;
        public List<RecommendForumInfo> recommend_forum_info;
        public List<GeneralResource> resource_list;
        public List<ThreadInfo> thread_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.thread_list = DataRes.copyOf(dataRes.thread_list);
                this.resource_list = DataRes.copyOf(dataRes.resource_list);
                this.hot_userrank_entry = dataRes.hot_userrank_entry;
                this.recommend_forum_info = DataRes.copyOf(dataRes.recommend_forum_info);
                this.is_new_url = dataRes.is_new_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
