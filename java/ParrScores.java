package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ParrScores extends Message {
    @ProtoField(tag = 9, type = Message.Datatype.UINT64)
    public final Long i_money;
    @ProtoField(tag = 10, type = Message.Datatype.UINT64)
    public final Long i_other;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long i_total;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer level;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer limit;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer scores_fetch;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer scores_money;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer scores_other;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer scores_total;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer update_time;
    public static final Integer DEFAULT_SCORES_TOTAL = 0;
    public static final Integer DEFAULT_SCORES_FETCH = 0;
    public static final Integer DEFAULT_SCORES_MONEY = 0;
    public static final Integer DEFAULT_SCORES_OTHER = 0;
    public static final Integer DEFAULT_UPDATE_TIME = 0;
    public static final Integer DEFAULT_LEVEL = 0;
    public static final Integer DEFAULT_LIMIT = 0;
    public static final Long DEFAULT_I_TOTAL = 0L;
    public static final Long DEFAULT_I_MONEY = 0L;
    public static final Long DEFAULT_I_OTHER = 0L;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ParrScores> {
        public Long i_money;
        public Long i_other;
        public Long i_total;
        public Integer level;
        public Integer limit;
        public Integer scores_fetch;
        public Integer scores_money;
        public Integer scores_other;
        public Integer scores_total;
        public Integer update_time;

        public Builder() {
        }

        public Builder(ParrScores parrScores) {
            super(parrScores);
            if (parrScores == null) {
                return;
            }
            this.scores_total = parrScores.scores_total;
            this.scores_fetch = parrScores.scores_fetch;
            this.scores_money = parrScores.scores_money;
            this.scores_other = parrScores.scores_other;
            this.update_time = parrScores.update_time;
            this.level = parrScores.level;
            this.limit = parrScores.limit;
            this.i_total = parrScores.i_total;
            this.i_money = parrScores.i_money;
            this.i_other = parrScores.i_other;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ParrScores build(boolean z) {
            return new ParrScores(this, z);
        }
    }

    public ParrScores(Builder builder, boolean z) {
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
            Integer num6 = builder.level;
            if (num6 == null) {
                this.level = DEFAULT_LEVEL;
            } else {
                this.level = num6;
            }
            Integer num7 = builder.limit;
            if (num7 == null) {
                this.limit = DEFAULT_LIMIT;
            } else {
                this.limit = num7;
            }
            Long l = builder.i_total;
            if (l == null) {
                this.i_total = DEFAULT_I_TOTAL;
            } else {
                this.i_total = l;
            }
            Long l2 = builder.i_money;
            if (l2 == null) {
                this.i_money = DEFAULT_I_MONEY;
            } else {
                this.i_money = l2;
            }
            Long l3 = builder.i_other;
            if (l3 == null) {
                this.i_other = DEFAULT_I_OTHER;
                return;
            } else {
                this.i_other = l3;
                return;
            }
        }
        this.scores_total = builder.scores_total;
        this.scores_fetch = builder.scores_fetch;
        this.scores_money = builder.scores_money;
        this.scores_other = builder.scores_other;
        this.update_time = builder.update_time;
        this.level = builder.level;
        this.limit = builder.limit;
        this.i_total = builder.i_total;
        this.i_money = builder.i_money;
        this.i_other = builder.i_other;
    }
}
