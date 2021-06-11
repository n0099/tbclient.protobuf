package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class RankInfo extends Message {
    @ProtoField(tag = 4, type = Message.Datatype.DOUBLE)
    public final Double dir_rate;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer member_count;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer sign_count;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer sign_rank;
    public static final Integer DEFAULT_SIGN_COUNT = 0;
    public static final Integer DEFAULT_SIGN_RANK = 0;
    public static final Integer DEFAULT_MEMBER_COUNT = 0;
    public static final Double DEFAULT_DIR_RATE = Double.valueOf(0.0d);

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<RankInfo> {
        public Double dir_rate;
        public Integer member_count;
        public Integer sign_count;
        public Integer sign_rank;

        public Builder() {
        }

        public Builder(RankInfo rankInfo) {
            super(rankInfo);
            if (rankInfo == null) {
                return;
            }
            this.sign_count = rankInfo.sign_count;
            this.sign_rank = rankInfo.sign_rank;
            this.member_count = rankInfo.member_count;
            this.dir_rate = rankInfo.dir_rate;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RankInfo build(boolean z) {
            return new RankInfo(this, z);
        }
    }

    public RankInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.sign_count;
            if (num == null) {
                this.sign_count = DEFAULT_SIGN_COUNT;
            } else {
                this.sign_count = num;
            }
            Integer num2 = builder.sign_rank;
            if (num2 == null) {
                this.sign_rank = DEFAULT_SIGN_RANK;
            } else {
                this.sign_rank = num2;
            }
            Integer num3 = builder.member_count;
            if (num3 == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = num3;
            }
            Double d2 = builder.dir_rate;
            if (d2 == null) {
                this.dir_rate = DEFAULT_DIR_RATE;
                return;
            } else {
                this.dir_rate = d2;
                return;
            }
        }
        this.sign_count = builder.sign_count;
        this.sign_rank = builder.sign_rank;
        this.member_count = builder.member_count;
        this.dir_rate = builder.dir_rate;
    }
}
