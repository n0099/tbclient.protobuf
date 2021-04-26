package tbclient.GetMyGift;

import com.squareup.wire.Message;
/* loaded from: classes7.dex */
public final class NobilityTdou extends Message {

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<NobilityTdou> {
        public Builder() {
        }

        public Builder(NobilityTdou nobilityTdou) {
            super(nobilityTdou);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NobilityTdou build(boolean z) {
            return new NobilityTdou(this, z);
        }
    }

    public NobilityTdou(Builder builder, boolean z) {
        super(builder);
    }
}
