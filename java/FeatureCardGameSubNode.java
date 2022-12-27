package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class FeatureCardGameSubNode extends Message {
    public static final String DEFAULT_IMAGE = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String image;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FeatureCardGameSubNode> {
        public String image;
        public String name;
        public String title;
        public String url;

        public Builder() {
        }

        public Builder(FeatureCardGameSubNode featureCardGameSubNode) {
            super(featureCardGameSubNode);
            if (featureCardGameSubNode == null) {
                return;
            }
            this.image = featureCardGameSubNode.image;
            this.title = featureCardGameSubNode.title;
            this.name = featureCardGameSubNode.name;
            this.url = featureCardGameSubNode.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeatureCardGameSubNode build(boolean z) {
            return new FeatureCardGameSubNode(this, z);
        }
    }

    public FeatureCardGameSubNode(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.image;
            if (str == null) {
                this.image = "";
            } else {
                this.image = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            String str3 = builder.name;
            if (str3 == null) {
                this.name = "";
            } else {
                this.name = str3;
            }
            String str4 = builder.url;
            if (str4 == null) {
                this.url = "";
                return;
            } else {
                this.url = str4;
                return;
            }
        }
        this.image = builder.image;
        this.title = builder.title;
        this.name = builder.name;
        this.url = builder.url;
    }
}
