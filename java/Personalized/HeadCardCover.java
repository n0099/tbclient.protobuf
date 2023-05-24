package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThemeColorInfo;
/* loaded from: classes2.dex */
public final class HeadCardCover extends Message {
    @ProtoField(tag = 2)
    public final ThemeColorInfo card_background;
    @ProtoField(tag = 1)
    public final CardFreq freq;
    @ProtoField(tag = 3)
    public final MatchCardInfo match_info;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<HeadCardCover> {
        public ThemeColorInfo card_background;
        public CardFreq freq;
        public MatchCardInfo match_info;

        public Builder() {
        }

        public Builder(HeadCardCover headCardCover) {
            super(headCardCover);
            if (headCardCover == null) {
                return;
            }
            this.freq = headCardCover.freq;
            this.card_background = headCardCover.card_background;
            this.match_info = headCardCover.match_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HeadCardCover build(boolean z) {
            return new HeadCardCover(this, z);
        }
    }

    public HeadCardCover(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.freq = builder.freq;
            this.card_background = builder.card_background;
            this.match_info = builder.match_info;
            return;
        }
        this.freq = builder.freq;
        this.card_background = builder.card_background;
        this.match_info = builder.match_info;
    }
}
