package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class BetInfo extends Message {
    public static final String DEFAULT_BET = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String bet;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer no;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long score;
    public static final Long DEFAULT_SCORE = 0L;
    public static final Integer DEFAULT_NO = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<BetInfo> {
        public String bet;
        public Integer no;
        public Long score;

        public Builder() {
        }

        public Builder(BetInfo betInfo) {
            super(betInfo);
            if (betInfo == null) {
                return;
            }
            this.bet = betInfo.bet;
            this.score = betInfo.score;
            this.no = betInfo.no;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BetInfo build(boolean z) {
            return new BetInfo(this, z);
        }
    }

    public BetInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.bet;
            if (str == null) {
                this.bet = "";
            } else {
                this.bet = str;
            }
            Long l = builder.score;
            if (l == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = l;
            }
            Integer num = builder.no;
            if (num == null) {
                this.no = DEFAULT_NO;
                return;
            } else {
                this.no = num;
                return;
            }
        }
        this.bet = builder.bet;
        this.score = builder.score;
        this.no = builder.no;
    }
}
