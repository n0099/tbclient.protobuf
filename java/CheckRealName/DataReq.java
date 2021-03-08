package tbclient.CheckRealName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_OBJ_SOURCE = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f8663common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String obj_source;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f8663common = builder.f8664common;
            if (builder.obj_source == null) {
                this.obj_source = "";
                return;
            } else {
                this.obj_source = builder.obj_source;
                return;
            }
        }
        this.f8663common = builder.f8664common;
        this.obj_source = builder.obj_source;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f8664common;
        public String obj_source;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f8664common = dataReq.f8663common;
                this.obj_source = dataReq.obj_source;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
