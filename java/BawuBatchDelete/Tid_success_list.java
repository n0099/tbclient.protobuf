package tbclient.BawuBatchDelete;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class Tid_success_list extends Message {
    public static final Long DEFAULT_TID = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long tid;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<Tid_success_list> {
        public Long tid;

        public Builder() {
        }

        public Builder(Tid_success_list tid_success_list) {
            super(tid_success_list);
            if (tid_success_list == null) {
                return;
            }
            this.tid = tid_success_list.tid;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Tid_success_list build(boolean z) {
            return new Tid_success_list(this, z);
        }
    }

    public Tid_success_list(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
                return;
            } else {
                this.tid = l;
                return;
            }
        }
        this.tid = builder.tid;
    }
}
