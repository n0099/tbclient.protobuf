package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class FeatureCardHotSubNode extends Message {
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FeatureCardHotSubNode> {
        public String title;
        public String url;

        public Builder() {
        }

        public Builder(FeatureCardHotSubNode featureCardHotSubNode) {
            super(featureCardHotSubNode);
            if (featureCardHotSubNode == null) {
                return;
            }
            this.url = featureCardHotSubNode.url;
            this.title = featureCardHotSubNode.title;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeatureCardHotSubNode build(boolean z) {
            return new FeatureCardHotSubNode(this, z);
        }
    }

    public FeatureCardHotSubNode(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
                return;
            } else {
                this.title = str2;
                return;
            }
        }
        this.url = builder.url;
        this.title = builder.title;
    }
}
