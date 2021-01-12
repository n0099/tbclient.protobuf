package tbclient.GetGiftListByCategoryId;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_CATEGORY_ID = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer category_id;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14517common;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.category_id == null) {
                this.category_id = DEFAULT_CATEGORY_ID;
            } else {
                this.category_id = builder.category_id;
            }
            this.f14517common = builder.f14518common;
            return;
        }
        this.category_id = builder.category_id;
        this.f14517common = builder.f14518common;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer category_id;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14518common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.category_id = dataReq.category_id;
                this.f14518common = dataReq.f14517common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
