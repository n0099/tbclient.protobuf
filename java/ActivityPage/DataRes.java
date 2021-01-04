package tbclient.ActivityPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BannerImage;
import tbclient.Page;
import tbclient.ThreadInfo;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final List<BannerImage> DEFAULT_BANNER_IMAGE = Collections.emptyList();
    public static final List<BannerImage> DEFAULT_GRID = Collections.emptyList();
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<BannerImage> banner_image;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<BannerImage> grid;
    @ProtoField(tag = 4)
    public final HotTopic hot_topic;
    @ProtoField(tag = 8)
    public final Page page_info;
    @ProtoField(tag = 6)
    public final RecommendForumList recommend_forum;
    @ProtoField(tag = 7)
    public final RecommendUserList recommend_user;
    @ProtoField(tag = 5)
    public final SpecialColumnList special_column;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ThreadInfo> thread_list;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.banner_image == null) {
                this.banner_image = DEFAULT_BANNER_IMAGE;
            } else {
                this.banner_image = immutableCopyOf(builder.banner_image);
            }
            if (builder.grid == null) {
                this.grid = DEFAULT_GRID;
            } else {
                this.grid = immutableCopyOf(builder.grid);
            }
            if (builder.thread_list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = immutableCopyOf(builder.thread_list);
            }
            this.hot_topic = builder.hot_topic;
            this.special_column = builder.special_column;
            this.recommend_forum = builder.recommend_forum;
            this.recommend_user = builder.recommend_user;
            this.page_info = builder.page_info;
            return;
        }
        this.banner_image = immutableCopyOf(builder.banner_image);
        this.grid = immutableCopyOf(builder.grid);
        this.thread_list = immutableCopyOf(builder.thread_list);
        this.hot_topic = builder.hot_topic;
        this.special_column = builder.special_column;
        this.recommend_forum = builder.recommend_forum;
        this.recommend_user = builder.recommend_user;
        this.page_info = builder.page_info;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<BannerImage> banner_image;
        public List<BannerImage> grid;
        public HotTopic hot_topic;
        public Page page_info;
        public RecommendForumList recommend_forum;
        public RecommendUserList recommend_user;
        public SpecialColumnList special_column;
        public List<ThreadInfo> thread_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.banner_image = DataRes.copyOf(dataRes.banner_image);
                this.grid = DataRes.copyOf(dataRes.grid);
                this.thread_list = DataRes.copyOf(dataRes.thread_list);
                this.hot_topic = dataRes.hot_topic;
                this.special_column = dataRes.special_column;
                this.recommend_forum = dataRes.recommend_forum;
                this.recommend_user = dataRes.recommend_user;
                this.page_info = dataRes.page_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
