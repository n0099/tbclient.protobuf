package tbclient.GetAddressList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ReqData extends Message {
    public static final Integer DEFAULT_TIMESTAMP = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer timestamp;

    /* synthetic */ ReqData(Builder builder, boolean z, ReqData reqData) {
        this(builder, z);
    }

    private ReqData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.timestamp == null) {
                this.timestamp = DEFAULT_TIMESTAMP;
                return;
            } else {
                this.timestamp = builder.timestamp;
                return;
            }
        }
        this.timestamp = builder.timestamp;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<ReqData> {
        public Integer timestamp;

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData != null) {
                this.timestamp = reqData.timestamp;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z, null);
        }
    }
}
