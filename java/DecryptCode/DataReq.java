package tbclient.DecryptCode;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_TIEBA_CODE = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1017common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tieba_code;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1017common = builder.f1018common;
            if (builder.tieba_code == null) {
                this.tieba_code = "";
                return;
            } else {
                this.tieba_code = builder.tieba_code;
                return;
            }
        }
        this.f1017common = builder.f1018common;
        this.tieba_code = builder.tieba_code;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1018common;
        public String tieba_code;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1018common = dataReq.f1017common;
                this.tieba_code = dataReq.tieba_code;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
