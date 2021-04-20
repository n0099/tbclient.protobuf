package tbclient.GetGiftListByCategoryId;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_CATEGORY_ID = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer category_id;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69436common;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer category_id;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69437common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.category_id = dataReq.category_id;
            this.f69437common = dataReq.f69436common;
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
            Integer num = builder.category_id;
            if (num == null) {
                this.category_id = DEFAULT_CATEGORY_ID;
            } else {
                this.category_id = num;
            }
            this.f69436common = builder.f69437common;
            return;
        }
        this.category_id = builder.category_id;
        this.f69436common = builder.f69437common;
    }
}
