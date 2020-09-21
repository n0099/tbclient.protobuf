package tbclient.GetForumPrivateInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes25.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_PN = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1076common;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer pn;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1076common = builder.f1077common;
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
                return;
            } else {
                this.pn = builder.pn;
                return;
            }
        }
        this.f1076common = builder.f1077common;
        this.pn = builder.pn;
    }

    /* loaded from: classes25.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1077common;
        public Integer pn;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1077common = dataReq.f1076common;
                this.pn = dataReq.pn;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
