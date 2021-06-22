package tbclient.DecryptCode;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_TIEBA_CODE = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f72678common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tieba_code;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f72679common;
        public String tieba_code;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f72679common = dataReq.f72678common;
            this.tieba_code = dataReq.tieba_code;
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
            this.f72678common = builder.f72679common;
            String str = builder.tieba_code;
            if (str == null) {
                this.tieba_code = "";
                return;
            } else {
                this.tieba_code = str;
                return;
            }
        }
        this.f72678common = builder.f72679common;
        this.tieba_code = builder.tieba_code;
    }
}
