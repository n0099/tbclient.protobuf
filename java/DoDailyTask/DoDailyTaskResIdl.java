package tbclient.DoDailyTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class DoDailyTaskResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private DoDailyTaskResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DoDailyTaskResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(DoDailyTaskResIdl doDailyTaskResIdl) {
            super(doDailyTaskResIdl);
            if (doDailyTaskResIdl != null) {
                this.error = doDailyTaskResIdl.error;
                this.data = doDailyTaskResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DoDailyTaskResIdl build(boolean z) {
            return new DoDailyTaskResIdl(this, z);
        }
    }
}
