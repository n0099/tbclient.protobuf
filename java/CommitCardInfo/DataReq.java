package tbclient.CommitCardInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_CARD_TYPE = 0;
    public static final String DEFAULT_IMAGE_INFO = "";
    public static final String DEFAULT_RESOURCE_ID = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer card_type;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14728common;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String image_info;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String resource_id;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14728common = builder.f14729common;
            if (builder.resource_id == null) {
                this.resource_id = "";
            } else {
                this.resource_id = builder.resource_id;
            }
            if (builder.card_type == null) {
                this.card_type = DEFAULT_CARD_TYPE;
            } else {
                this.card_type = builder.card_type;
            }
            if (builder.image_info == null) {
                this.image_info = "";
                return;
            } else {
                this.image_info = builder.image_info;
                return;
            }
        }
        this.f14728common = builder.f14729common;
        this.resource_id = builder.resource_id;
        this.card_type = builder.card_type;
        this.image_info = builder.image_info;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer card_type;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14729common;
        public String image_info;
        public String resource_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14729common = dataReq.f14728common;
                this.resource_id = dataReq.resource_id;
                this.card_type = dataReq.card_type;
                this.image_info = dataReq.image_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
