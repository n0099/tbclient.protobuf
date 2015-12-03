package tbclient.GetForumClassList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class RecommendForumClass extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final Long DEFAULT_FORUM_CLASS_ID = 0L;
    public static final String DEFAULT_IMAGE_URL = "";
    public static final String DEFAULT_LINK_URL = "";
    public static final String DEFAULT_RECOMMEND_IMAGE_URL = "";
    public static final String DEFAULT_RECOMMEND_TITLE = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long forum_class_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String image_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String recommend_image_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String recommend_title;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String title;

    /* synthetic */ RecommendForumClass(Builder builder, boolean z, RecommendForumClass recommendForumClass) {
        this(builder, z);
    }

    private RecommendForumClass(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.recommend_title == null) {
                this.recommend_title = "";
            } else {
                this.recommend_title = builder.recommend_title;
            }
            if (builder.recommend_image_url == null) {
                this.recommend_image_url = "";
            } else {
                this.recommend_image_url = builder.recommend_image_url;
            }
            if (builder.link_url == null) {
                this.link_url = "";
            } else {
                this.link_url = builder.link_url;
            }
            if (builder.forum_class_id == null) {
                this.forum_class_id = DEFAULT_FORUM_CLASS_ID;
            } else {
                this.forum_class_id = builder.forum_class_id;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder._abstract == null) {
                this._abstract = "";
            } else {
                this._abstract = builder._abstract;
            }
            if (builder.image_url == null) {
                this.image_url = "";
                return;
            } else {
                this.image_url = builder.image_url;
                return;
            }
        }
        this.recommend_title = builder.recommend_title;
        this.recommend_image_url = builder.recommend_image_url;
        this.link_url = builder.link_url;
        this.forum_class_id = builder.forum_class_id;
        this.title = builder.title;
        this._abstract = builder._abstract;
        this.image_url = builder.image_url;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<RecommendForumClass> {
        public String _abstract;
        public Long forum_class_id;
        public String image_url;
        public String link_url;
        public String recommend_image_url;
        public String recommend_title;
        public String title;

        public Builder() {
        }

        public Builder(RecommendForumClass recommendForumClass) {
            super(recommendForumClass);
            if (recommendForumClass != null) {
                this.recommend_title = recommendForumClass.recommend_title;
                this.recommend_image_url = recommendForumClass.recommend_image_url;
                this.link_url = recommendForumClass.link_url;
                this.forum_class_id = recommendForumClass.forum_class_id;
                this.title = recommendForumClass.title;
                this._abstract = recommendForumClass._abstract;
                this.image_url = recommendForumClass.image_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendForumClass build(boolean z) {
            return new RecommendForumClass(this, z, null);
        }
    }
}
