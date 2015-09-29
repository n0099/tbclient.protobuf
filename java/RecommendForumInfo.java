package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class RecommendForumInfo extends Message {
    public static final String DEFAULT_AUTHEN = "";
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_RECOM_REASON = "";
    public static final String DEFAULT_SLOGAN = "";
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String authen;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<PbContent> content;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer forum_type;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_like;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer member_count;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String recom_reason;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String slogan;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer thread_count;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_IS_LIKE = 0;
    public static final Integer DEFAULT_MEMBER_COUNT = 0;
    public static final Integer DEFAULT_THREAD_COUNT = 0;
    public static final List<PbContent> DEFAULT_CONTENT = Collections.emptyList();
    public static final Integer DEFAULT_FORUM_TYPE = 0;

    /* synthetic */ RecommendForumInfo(Builder builder, boolean z, RecommendForumInfo recommendForumInfo) {
        this(builder, z);
    }

    private RecommendForumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.avatar == null) {
                this.avatar = "";
            } else {
                this.avatar = builder.avatar;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.is_like == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = builder.is_like;
            }
            if (builder.member_count == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = builder.member_count;
            }
            if (builder.thread_count == null) {
                this.thread_count = DEFAULT_THREAD_COUNT;
            } else {
                this.thread_count = builder.thread_count;
            }
            if (builder.slogan == null) {
                this.slogan = "";
            } else {
                this.slogan = builder.slogan;
            }
            if (builder.content == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = immutableCopyOf(builder.content);
            }
            if (builder.forum_type == null) {
                this.forum_type = DEFAULT_FORUM_TYPE;
            } else {
                this.forum_type = builder.forum_type;
            }
            if (builder.authen == null) {
                this.authen = "";
            } else {
                this.authen = builder.authen;
            }
            if (builder.recom_reason == null) {
                this.recom_reason = "";
                return;
            } else {
                this.recom_reason = builder.recom_reason;
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
        this.content = immutableCopyOf(builder.content);
        this.forum_type = builder.forum_type;
        this.authen = builder.authen;
        this.recom_reason = builder.recom_reason;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<RecommendForumInfo> {
        public String authen;
        public String avatar;
        public List<PbContent> content;
        public Long forum_id;
        public String forum_name;
        public Integer forum_type;
        public Integer is_like;
        public Integer member_count;
        public String recom_reason;
        public String slogan;
        public Integer thread_count;

        public Builder() {
        }

        public Builder(RecommendForumInfo recommendForumInfo) {
            super(recommendForumInfo);
            if (recommendForumInfo != null) {
                this.avatar = recommendForumInfo.avatar;
                this.forum_id = recommendForumInfo.forum_id;
                this.forum_name = recommendForumInfo.forum_name;
                this.is_like = recommendForumInfo.is_like;
                this.member_count = recommendForumInfo.member_count;
                this.thread_count = recommendForumInfo.thread_count;
                this.slogan = recommendForumInfo.slogan;
                this.content = RecommendForumInfo.copyOf(recommendForumInfo.content);
                this.forum_type = recommendForumInfo.forum_type;
                this.authen = recommendForumInfo.authen;
                this.recom_reason = recommendForumInfo.recom_reason;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendForumInfo build(boolean z) {
            return new RecommendForumInfo(this, z, null);
        }
    }
}
