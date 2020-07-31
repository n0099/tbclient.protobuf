package tbclient.ActiveConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes16.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f995common;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_first_up;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_schema_up;
    public static final Integer DEFAULT_IS_SCHEMA_UP = 0;
    public static final Integer DEFAULT_IS_FIRST_UP = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f995common = builder.f996common;
            if (builder.is_schema_up == null) {
                this.is_schema_up = DEFAULT_IS_SCHEMA_UP;
            } else {
                this.is_schema_up = builder.is_schema_up;
            }
            if (builder.is_first_up == null) {
                this.is_first_up = DEFAULT_IS_FIRST_UP;
                return;
            } else {
                this.is_first_up = builder.is_first_up;
                return;
            }
        }
        this.f995common = builder.f996common;
        this.is_schema_up = builder.is_schema_up;
        this.is_first_up = builder.is_first_up;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f996common;
        public Integer is_first_up;
        public Integer is_schema_up;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f996common = dataReq.f995common;
                this.is_schema_up = dataReq.is_schema_up;
                this.is_first_up = dataReq.is_first_up;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
