package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
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

    /* loaded from: classes2.dex */
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
            if (vipParrScores == null) {
                return;
            }
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

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipParrScores build(boolean z) {
            return new VipParrScores(this, z);
        }
    }

    public VipParrScores(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.scores_total;
            if (num == null) {
                this.scores_total = DEFAULT_SCORES_TOTAL;
            } else {
                this.scores_total = num;
            }
            Integer num2 = builder.scores_fetch;
            if (num2 == null) {
                this.scores_fetch = DEFAULT_SCORES_FETCH;
            } else {
                this.scores_fetch = num2;
            }
            Integer num3 = builder.scores_money;
            if (num3 == null) {
                this.scores_money = DEFAULT_SCORES_MONEY;
            } else {
                this.scores_money = num3;
            }
            Integer num4 = builder.scores_other;
            if (num4 == null) {
                this.scores_other = DEFAULT_SCORES_OTHER;
            } else {
                this.scores_other = num4;
            }
            Integer num5 = builder.update_time;
            if (num5 == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = num5;
            }
            Integer num6 = builder.i_total;
            if (num6 == null) {
                this.i_total = DEFAULT_I_TOTAL;
            } else {
                this.i_total = num6;
            }
            Integer num7 = builder.i_money;
            if (num7 == null) {
                this.i_money = DEFAULT_I_MONEY;
            } else {
                this.i_money = num7;
            }
            Integer num8 = builder.i_other;
            if (num8 == null) {
                this.i_other = DEFAULT_I_OTHER;
            } else {
                this.i_other = num8;
            }
            Integer num9 = builder.level;
            if (num9 == null) {
                this.level = DEFAULT_LEVEL;
            } else {
                this.level = num9;
            }
            Integer num10 = builder.limit;
            if (num10 == null) {
                this.limit = DEFAULT_LIMIT;
                return;
            } else {
                this.limit = num10;
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
}
