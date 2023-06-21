package tbclient;

import com.squareup.wire.Message;
/* loaded from: classes2.dex */
public final class PubHeadCardCover extends Message {

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PubHeadCardCover> {
        public Builder() {
        }

        public Builder(PubHeadCardCover pubHeadCardCover) {
            super(pubHeadCardCover);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PubHeadCardCover build(boolean z) {
            return new PubHeadCardCover(this, z);
        }
    }

    public PubHeadCardCover(Builder builder, boolean z) {
        super(builder);
    }
}
