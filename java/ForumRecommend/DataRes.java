package tbclient.ForumRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.RecommendForumInfo;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_MSIGN_TEXT = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<Banner> banner;
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
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<NewRecommend> new_recommend;
    @ProtoField(label = Message.Label.REPEATED, tag = 10)
    public final List<RecommendForumInfo> recommend_forum_info;
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

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.like_forum == null) {
                this.like_forum = DEFAULT_LIKE_FORUM;
            } else {
                this.like_forum = immutableCopyOf(builder.like_forum);
            }
            if (builder.banner == null) {
                this.banner = DEFAULT_BANNER;
            } else {
                this.banner = immutableCopyOf(builder.banner);
            }
            if (builder.new_recommend == null) {
                this.new_recommend = DEFAULT_NEW_RECOMMEND;
            } else {
                this.new_recommend = immutableCopyOf(builder.new_recommend);
            }
            if (builder.is_login == null) {
                this.is_login = DEFAULT_IS_LOGIN;
            } else {
                this.is_login = builder.is_login;
            }
            if (builder.msign_valid == null) {
                this.msign_valid = DEFAULT_MSIGN_VALID;
            } else {
                this.msign_valid = builder.msign_valid;
            }
            if (builder.msign_text == null) {
                this.msign_text = "";
            } else {
                this.msign_text = builder.msign_text;
            }
            if (builder.msign_level == null) {
                this.msign_level = DEFAULT_MSIGN_LEVEL;
            } else {
                this.msign_level = builder.msign_level;
            }
            if (builder.time == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = builder.time;
            }
            if (builder.is_mem == null) {
                this.is_mem = DEFAULT_IS_MEM;
            } else {
                this.is_mem = builder.is_mem;
            }
            if (builder.recommend_forum_info == null) {
                this.recommend_forum_info = DEFAULT_RECOMMEND_FORUM_INFO;
                return;
            } else {
                this.recommend_forum_info = immutableCopyOf(builder.recommend_forum_info);
                return;
            }
        }
        this.like_forum = immutableCopyOf(builder.like_forum);
        this.banner = immutableCopyOf(builder.banner);
        this.new_recommend = immutableCopyOf(builder.new_recommend);
        this.is_login = builder.is_login;
        this.msign_valid = builder.msign_valid;
        this.msign_text = builder.msign_text;
        this.msign_level = builder.msign_level;
        this.time = builder.time;
        this.is_mem = builder.is_mem;
        this.recommend_forum_info = immutableCopyOf(builder.recommend_forum_info);
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public List<Banner> banner;
        public Integer is_login;
        public Integer is_mem;
        public List<LikeForum> like_forum;
        public Integer msign_level;
        public String msign_text;
        public Integer msign_valid;
        public List<NewRecommend> new_recommend;
        public List<RecommendForumInfo> recommend_forum_info;
        public Integer time;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.like_forum = DataRes.copyOf(dataRes.like_forum);
                this.banner = DataRes.copyOf(dataRes.banner);
                this.new_recommend = DataRes.copyOf(dataRes.new_recommend);
                this.is_login = dataRes.is_login;
                this.msign_valid = dataRes.msign_valid;
                this.msign_text = dataRes.msign_text;
                this.msign_level = dataRes.msign_level;
                this.time = dataRes.time;
                this.is_mem = dataRes.is_mem;
                this.recommend_forum_info = DataRes.copyOf(dataRes.recommend_forum_info);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
