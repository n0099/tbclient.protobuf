package tbclient.GetForumClassList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 1)
    public final ForumSquareBanner banner_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ForumSquareDirs> dir_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<ForumInfo> new_top_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<RecommendForumClass> recommend_classes;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<ForumSquareRecommendForumInfo> recommend_forums;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<WeeklyInfo> weekly_info;
    public static final List<ForumSquareDirs> DEFAULT_DIR_INFO = Collections.emptyList();
    public static final List<WeeklyInfo> DEFAULT_WEEKLY_INFO = Collections.emptyList();
    public static final List<RecommendForumClass> DEFAULT_RECOMMEND_CLASSES = Collections.emptyList();
    public static final List<ForumInfo> DEFAULT_NEW_TOP_INFO = Collections.emptyList();
    public static final List<ForumSquareRecommendForumInfo> DEFAULT_RECOMMEND_FORUMS = Collections.emptyList();

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.banner_info = builder.banner_info;
            if (builder.dir_info == null) {
                this.dir_info = DEFAULT_DIR_INFO;
            } else {
                this.dir_info = immutableCopyOf(builder.dir_info);
            }
            if (builder.weekly_info == null) {
                this.weekly_info = DEFAULT_WEEKLY_INFO;
            } else {
                this.weekly_info = immutableCopyOf(builder.weekly_info);
            }
            if (builder.recommend_classes == null) {
                this.recommend_classes = DEFAULT_RECOMMEND_CLASSES;
            } else {
                this.recommend_classes = immutableCopyOf(builder.recommend_classes);
            }
            if (builder.new_top_info == null) {
                this.new_top_info = DEFAULT_NEW_TOP_INFO;
            } else {
                this.new_top_info = immutableCopyOf(builder.new_top_info);
            }
            if (builder.recommend_forums == null) {
                this.recommend_forums = DEFAULT_RECOMMEND_FORUMS;
                return;
            } else {
                this.recommend_forums = immutableCopyOf(builder.recommend_forums);
                return;
            }
        }
        this.banner_info = builder.banner_info;
        this.dir_info = immutableCopyOf(builder.dir_info);
        this.weekly_info = immutableCopyOf(builder.weekly_info);
        this.recommend_classes = immutableCopyOf(builder.recommend_classes);
        this.new_top_info = immutableCopyOf(builder.new_top_info);
        this.recommend_forums = immutableCopyOf(builder.recommend_forums);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public ForumSquareBanner banner_info;
        public List<ForumSquareDirs> dir_info;
        public List<ForumInfo> new_top_info;
        public List<RecommendForumClass> recommend_classes;
        public List<ForumSquareRecommendForumInfo> recommend_forums;
        public List<WeeklyInfo> weekly_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.banner_info = dataRes.banner_info;
                this.dir_info = DataRes.copyOf(dataRes.dir_info);
                this.weekly_info = DataRes.copyOf(dataRes.weekly_info);
                this.recommend_classes = DataRes.copyOf(dataRes.recommend_classes);
                this.new_top_info = DataRes.copyOf(dataRes.new_top_info);
                this.recommend_forums = DataRes.copyOf(dataRes.recommend_forums);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
