package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class FeatureCardTopicSubNode extends Message {
    public static final String DEFAULT_IMAGE = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer article_num;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String image;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer update_time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_UPDATE_TIME = 0;
    public static final Integer DEFAULT_ARTICLE_NUM = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FeatureCardTopicSubNode> {
        public Integer article_num;
        public String image;
        public String title;
        public Integer update_time;
        public String url;

        public Builder() {
        }

        public Builder(FeatureCardTopicSubNode featureCardTopicSubNode) {
            super(featureCardTopicSubNode);
            if (featureCardTopicSubNode == null) {
                return;
            }
            this.image = featureCardTopicSubNode.image;
            this.update_time = featureCardTopicSubNode.update_time;
            this.article_num = featureCardTopicSubNode.article_num;
            this.url = featureCardTopicSubNode.url;
            this.title = featureCardTopicSubNode.title;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeatureCardTopicSubNode build(boolean z) {
            return new FeatureCardTopicSubNode(this, z);
        }
    }

    public FeatureCardTopicSubNode(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.image;
            if (str == null) {
                this.image = "";
            } else {
                this.image = str;
            }
            Integer num = builder.update_time;
            if (num == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = num;
            }
            Integer num2 = builder.article_num;
            if (num2 == null) {
                this.article_num = DEFAULT_ARTICLE_NUM;
            } else {
                this.article_num = num2;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
            } else {
                this.url = str2;
            }
            String str3 = builder.title;
            if (str3 == null) {
                this.title = "";
                return;
            } else {
                this.title = str3;
                return;
            }
        }
        this.image = builder.image;
        this.update_time = builder.update_time;
        this.article_num = builder.article_num;
        this.url = builder.url;
        this.title = builder.title;
    }
}
