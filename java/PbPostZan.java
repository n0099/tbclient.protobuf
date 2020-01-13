package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class PbPostZan extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_zan;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long zan_num;
    public static final Long DEFAULT_ZAN_NUM = 0L;
    public static final Integer DEFAULT_HAS_ZAN = 0;

    private PbPostZan(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.zan_num == null) {
                this.zan_num = DEFAULT_ZAN_NUM;
            } else {
                this.zan_num = builder.zan_num;
            }
            if (builder.has_zan == null) {
                this.has_zan = DEFAULT_HAS_ZAN;
                return;
            } else {
                this.has_zan = builder.has_zan;
                return;
            }
        }
        this.zan_num = builder.zan_num;
        this.has_zan = builder.has_zan;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<PbPostZan> {
        public Integer has_zan;
        public Long zan_num;

        public Builder() {
        }

        public Builder(PbPostZan pbPostZan) {
            super(pbPostZan);
            if (pbPostZan != null) {
                this.zan_num = pbPostZan.zan_num;
                this.has_zan = pbPostZan.has_zan;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbPostZan build(boolean z) {
            return new PbPostZan(this, z);
        }
    }
}
