package tbclient.FineZan;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes22.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ACTION = "";
    public static final Long DEFAULT_FTID = 0L;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String action;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1046common;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long ftid;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1046common = builder.f1047common;
            if (builder.action == null) {
                this.action = "";
            } else {
                this.action = builder.action;
            }
            if (builder.ftid == null) {
                this.ftid = DEFAULT_FTID;
                return;
            } else {
                this.ftid = builder.ftid;
                return;
            }
        }
        this.f1046common = builder.f1047common;
        this.action = builder.action;
        this.ftid = builder.ftid;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String action;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1047common;
        public Long ftid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1047common = dataReq.f1046common;
                this.action = dataReq.action;
                this.ftid = dataReq.ftid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
