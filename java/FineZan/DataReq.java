package tbclient.FineZan;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ACTION = "";
    public static final Long DEFAULT_FTID = 0L;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String action;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f68566common;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long ftid;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String action;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f68567common;
        public Long ftid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f68567common = dataReq.f68566common;
            this.action = dataReq.action;
            this.ftid = dataReq.ftid;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f68566common = builder.f68567common;
            String str = builder.action;
            if (str == null) {
                this.action = "";
            } else {
                this.action = str;
            }
            Long l = builder.ftid;
            if (l == null) {
                this.ftid = DEFAULT_FTID;
                return;
            } else {
                this.ftid = l;
                return;
            }
        }
        this.f68566common = builder.f68567common;
        this.action = builder.action;
        this.ftid = builder.ftid;
    }
}
