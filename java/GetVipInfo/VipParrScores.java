package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class VipParrScores extends Message {
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer i_money;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer i_other;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer i_total;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer level;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer limit;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer scores_fetch;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer scores_money;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer scores_other;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer scores_total;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer update_time;
    public static final Integer DEFAULT_SCORES_TOTAL = 0;
    public static final Integer DEFAULT_SCORES_FETCH = 0;
    public static final Integer DEFAULT_SCORES_MONEY = 0;
    public static final Integer DEFAULT_SCORES_OTHER = 0;
    public static final Integer DEFAULT_UPDATE_TIME = 0;
    public static final Integer DEFAULT_I_TOTAL = 0;
    public static final Integer DEFAULT_I_MONEY = 0;
    public static final Integer DEFAULT_I_OTHER = 0;
    public static final Integer DEFAULT_LEVEL = 0;
    public static final Integer DEFAULT_LIMIT = 0;

    private VipParrScores(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.scores_total == null) {
                this.scores_total = DEFAULT_SCORES_TOTAL;
            } else {
                this.scores_total = builder.scores_total;
            }
            if (builder.scores_fetch == null) {
                this.scores_fetch = DEFAULT_SCORES_FETCH;
            } else {
                this.scores_fetch = builder.scores_fetch;
            }
            if (builder.scores_money == null) {
                this.scores_money = DEFAULT_SCORES_MONEY;
            } else {
                this.scores_money = builder.scores_money;
            }
            if (builder.scores_other == null) {
                this.scores_other = DEFAULT_SCORES_OTHER;
            } else {
                this.scores_other = builder.scores_other;
            }
            if (builder.update_time == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = builder.update_time;
            }
            if (builder.i_total == null) {
                this.i_total = DEFAULT_I_TOTAL;
            } else {
                this.i_total = builder.i_total;
            }
            if (builder.i_money == null) {
                this.i_money = DEFAULT_I_MONEY;
            } else {
                this.i_money = builder.i_money;
            }
            if (builder.i_other == null) {
                this.i_other = DEFAULT_I_OTHER;
            } else {
                this.i_other = builder.i_other;
            }
            if (builder.level == null) {
                this.level = DEFAULT_LEVEL;
            } else {
                this.level = builder.level;
            }
            if (builder.limit == null) {
                this.limit = DEFAULT_LIMIT;
                return;
            } else {
                this.limit = builder.limit;
                return;
            }
        }
        this.scores_total = builder.scores_total;
        this.scores_fetch = builder.scores_fetch;
        this.scores_money = builder.scores_money;
        this.scores_other = builder.scores_other;
        this.update_time = builder.update_time;
        this.i_total = builder.i_total;
        this.i_money = builder.i_money;
        this.i_other = builder.i_other;
        this.level = builder.level;
        this.limit = builder.limit;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VipParrScores> {
        public Integer i_money;
        public Integer i_other;
        public Integer i_total;
        public Integer level;
        public Integer limit;
        public Integer scores_fetch;
        public Integer scores_money;
        public Integer scores_other;
        public Integer scores_total;
        public Integer update_time;

        public Builder() {
        }

        public Builder(VipParrScores vipParrScores) {
            super(vipParrScores);
            if (vipParrScores != null) {
                this.scores_total = vipParrScores.scores_total;
                this.scores_fetch = vipParrScores.scores_fetch;
                this.scores_money = vipParrScores.scores_money;
                this.scores_other = vipParrScores.scores_other;
                this.update_time = vipParrScores.update_time;
                this.i_total = vipParrScores.i_total;
                this.i_money = vipParrScores.i_money;
                this.i_other = vipParrScores.i_other;
                this.level = vipParrScores.level;
                this.limit = vipParrScores.limit;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipParrScores build(boolean z) {
            return new VipParrScores(this, z);
        }
    }
}
