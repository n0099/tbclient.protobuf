package tbclient.Tabfeedlist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.DiscoverHotForum;
import tbclient.GeneralResource;
import tbclient.HotUserRankEntry;
import tbclient.RecommendForumInfo;
import tbclient.ThreadInfo;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 7)
    public final HotUserRankEntry god_userrank_entry;
    @ProtoField(tag = 6)
    public final DiscoverHotForum hot_recmforum;
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

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public HotUserRankEntry god_userrank_entry;
        public DiscoverHotForum hot_recmforum;
        public HotUserRankEntry hot_userrank_entry;
        public Integer is_new_url;
        public List<RecommendForumInfo> recommend_forum_info;
        public List<GeneralResource> resource_list;
        public List<ThreadInfo> thread_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.thread_list = Message.copyOf(dataRes.thread_list);
            this.resource_list = Message.copyOf(dataRes.resource_list);
            this.hot_userrank_entry = dataRes.hot_userrank_entry;
            this.recommend_forum_info = Message.copyOf(dataRes.recommend_forum_info);
            this.is_new_url = dataRes.is_new_url;
            this.hot_recmforum = dataRes.hot_recmforum;
            this.god_userrank_entry = dataRes.god_userrank_entry;
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
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            List<GeneralResource> list2 = builder.resource_list;
            if (list2 == null) {
                this.resource_list = DEFAULT_RESOURCE_LIST;
            } else {
                this.resource_list = Message.immutableCopyOf(list2);
            }
            this.hot_userrank_entry = builder.hot_userrank_entry;
            List<RecommendForumInfo> list3 = builder.recommend_forum_info;
            if (list3 == null) {
                this.recommend_forum_info = DEFAULT_RECOMMEND_FORUM_INFO;
            } else {
                this.recommend_forum_info = Message.immutableCopyOf(list3);
            }
            Integer num = builder.is_new_url;
            if (num == null) {
                this.is_new_url = DEFAULT_IS_NEW_URL;
            } else {
                this.is_new_url = num;
            }
            this.hot_recmforum = builder.hot_recmforum;
            this.god_userrank_entry = builder.god_userrank_entry;
            return;
        }
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.resource_list = Message.immutableCopyOf(builder.resource_list);
        this.hot_userrank_entry = builder.hot_userrank_entry;
        this.recommend_forum_info = Message.immutableCopyOf(builder.recommend_forum_info);
        this.is_new_url = builder.is_new_url;
        this.hot_recmforum = builder.hot_recmforum;
        this.god_userrank_entry = builder.god_userrank_entry;
    }
}
