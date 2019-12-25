package tbclient.CheckRealName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes6.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_OBJ_SOURCE = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1010common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String obj_source;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1010common = builder.f1011common;
            if (builder.obj_source == null) {
                this.obj_source = "";
                return;
            } else {
                this.obj_source = builder.obj_source;
                return;
            }
        }
        this.f1010common = builder.f1011common;
        this.obj_source = builder.obj_source;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1011common;
        public String obj_source;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1011common = dataReq.f1010common;
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
