package tbclient.DecryptCode;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes6.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_TIEBA_CODE = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1020common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tieba_code;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1020common = builder.f1021common;
            if (builder.tieba_code == null) {
                this.tieba_code = "";
                return;
            } else {
                this.tieba_code = builder.tieba_code;
                return;
            }
        }
        this.f1020common = builder.f1021common;
        this.tieba_code = builder.tieba_code;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1021common;
        public String tieba_code;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1021common = dataReq.f1020common;
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
