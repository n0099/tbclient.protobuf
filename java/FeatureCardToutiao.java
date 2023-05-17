package tbclient;

import com.squareup.wire.Message;
/* loaded from: classes10.dex */
public final class FeatureCardToutiao extends Message {

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<FeatureCardToutiao> {
        public Builder() {
        }

        public Builder(FeatureCardToutiao featureCardToutiao) {
            super(featureCardToutiao);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeatureCardToutiao build(boolean z) {
            return new FeatureCardToutiao(this, z);
        }
    }

    public FeatureCardToutiao(Builder builder, boolean z) {
        super(builder);
    }
}
