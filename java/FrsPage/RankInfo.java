package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
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

    /* synthetic */ RankInfo(Builder builder, boolean z, RankInfo rankInfo) {
        this(builder, z);
    }

    private RankInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.sign_count == null) {
                this.sign_count = DEFAULT_SIGN_COUNT;
            } else {
                this.sign_count = builder.sign_count;
            }
            if (builder.sign_rank == null) {
                this.sign_rank = DEFAULT_SIGN_RANK;
            } else {
                this.sign_rank = builder.sign_rank;
            }
            if (builder.member_count == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = builder.member_count;
            }
            if (builder.dir_rate == null) {
                this.dir_rate = DEFAULT_DIR_RATE;
                return;
            } else {
                this.dir_rate = builder.dir_rate;
                return;
            }
        }
        this.sign_count = builder.sign_count;
        this.sign_rank = builder.sign_rank;
        this.member_count = builder.member_count;
        this.dir_rate = builder.dir_rate;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<RankInfo> {
        public Double dir_rate;
        public Integer member_count;
        public Integer sign_count;
        public Integer sign_rank;

        public Builder(RankInfo rankInfo) {
            super(rankInfo);
            if (rankInfo != null) {
                this.sign_count = rankInfo.sign_count;
                this.sign_rank = rankInfo.sign_rank;
                this.member_count = rankInfo.member_count;
                this.dir_rate = rankInfo.dir_rate;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RankInfo build(boolean z) {
            return new RankInfo(this, z, null);
        }
    }
}
