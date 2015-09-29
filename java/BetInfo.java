package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class BetInfo extends Message {
    public static final String DEFAULT_BET = "";
    public static final Long DEFAULT_SCORE = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String bet;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long score;

    /* synthetic */ BetInfo(Builder builder, boolean z, BetInfo betInfo) {
        this(builder, z);
    }

    private BetInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.bet == null) {
                this.bet = "";
            } else {
                this.bet = builder.bet;
            }
            if (builder.score == null) {
                this.score = DEFAULT_SCORE;
                return;
            } else {
                this.score = builder.score;
                return;
            }
        }
        this.bet = builder.bet;
        this.score = builder.score;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<BetInfo> {
        public String bet;
        public Long score;

        public Builder() {
        }

        public Builder(BetInfo betInfo) {
            super(betInfo);
            if (betInfo != null) {
                this.bet = betInfo.bet;
                this.score = betInfo.score;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BetInfo build(boolean z) {
            return new BetInfo(this, z, null);
        }
    }
}
