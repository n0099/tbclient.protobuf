package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class PubHeadCardCover extends Message {
    @ProtoField(tag = 1)
    public final ThemeColorInfo card_background;
    @ProtoField(tag = 2)
    public final PubCardFreq freq;
    @ProtoField(tag = 3)
    public final PubMatchCardInfo match_info;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PubHeadCardCover> {
        public ThemeColorInfo card_background;
        public PubCardFreq freq;
        public PubMatchCardInfo match_info;

        public Builder() {
        }

        public Builder(PubHeadCardCover pubHeadCardCover) {
            super(pubHeadCardCover);
            if (pubHeadCardCover == null) {
                return;
            }
            this.card_background = pubHeadCardCover.card_background;
            this.freq = pubHeadCardCover.freq;
            this.match_info = pubHeadCardCover.match_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PubHeadCardCover build(boolean z) {
            return new PubHeadCardCover(this, z);
        }
    }

    public PubHeadCardCover(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.card_background = builder.card_background;
            this.freq = builder.freq;
            this.match_info = builder.match_info;
            return;
        }
        this.card_background = builder.card_background;
        this.freq = builder.freq;
        this.match_info = builder.match_info;
    }
}
