package tbclient.CheckRealName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_OBJ_SOURCE = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f68327common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String obj_source;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f68328common;
        public String obj_source;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f68328common = dataReq.f68327common;
            this.obj_source = dataReq.obj_source;
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
            this.f68327common = builder.f68328common;
            String str = builder.obj_source;
            if (str == null) {
                this.obj_source = "";
                return;
            } else {
                this.obj_source = str;
                return;
            }
        }
        this.f68327common = builder.f68328common;
        this.obj_source = builder.obj_source;
    }
}
