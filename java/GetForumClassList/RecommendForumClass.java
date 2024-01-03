package tbclient.GetForumClassList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
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

    /* loaded from: classes2.dex */
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
            if (recommendForumClass == null) {
                return;
            }
            this.recommend_title = recommendForumClass.recommend_title;
            this.recommend_image_url = recommendForumClass.recommend_image_url;
            this.link_url = recommendForumClass.link_url;
            this.forum_class_id = recommendForumClass.forum_class_id;
            this.title = recommendForumClass.title;
            this._abstract = recommendForumClass._abstract;
            this.image_url = recommendForumClass.image_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendForumClass build(boolean z) {
            return new RecommendForumClass(this, z);
        }
    }

    public RecommendForumClass(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.recommend_title;
            if (str == null) {
                this.recommend_title = "";
            } else {
                this.recommend_title = str;
            }
            String str2 = builder.recommend_image_url;
            if (str2 == null) {
                this.recommend_image_url = "";
            } else {
                this.recommend_image_url = str2;
            }
            String str3 = builder.link_url;
            if (str3 == null) {
                this.link_url = "";
            } else {
                this.link_url = str3;
            }
            Long l = builder.forum_class_id;
            if (l == null) {
                this.forum_class_id = DEFAULT_FORUM_CLASS_ID;
            } else {
                this.forum_class_id = l;
            }
            String str4 = builder.title;
            if (str4 == null) {
                this.title = "";
            } else {
                this.title = str4;
            }
            String str5 = builder._abstract;
            if (str5 == null) {
                this._abstract = "";
            } else {
                this._abstract = str5;
            }
            String str6 = builder.image_url;
            if (str6 == null) {
                this.image_url = "";
                return;
            } else {
                this.image_url = str6;
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
}
