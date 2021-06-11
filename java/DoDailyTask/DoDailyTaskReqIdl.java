package tbclient.DoDailyTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class DoDailyTaskReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DoDailyTaskReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(DoDailyTaskReqIdl doDailyTaskReqIdl) {
            super(doDailyTaskReqIdl);
            if (doDailyTaskReqIdl == null) {
                return;
            }
            this.data = doDailyTaskReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DoDailyTaskReqIdl build(boolean z) {
            return new DoDailyTaskReqIdl(this, z);
        }
    }

    public DoDailyTaskReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
