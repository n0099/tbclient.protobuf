package tbclient.TestClose;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes16.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1223common;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long from_page;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long test_id;
    public static final Long DEFAULT_TEST_ID = 0L;
    public static final Long DEFAULT_FROM_PAGE = 0L;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1223common = builder.f1224common;
            if (builder.test_id == null) {
                this.test_id = DEFAULT_TEST_ID;
            } else {
                this.test_id = builder.test_id;
            }
            if (builder.from_page == null) {
                this.from_page = DEFAULT_FROM_PAGE;
                return;
            } else {
                this.from_page = builder.from_page;
                return;
            }
        }
        this.f1223common = builder.f1224common;
        this.test_id = builder.test_id;
        this.from_page = builder.from_page;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1224common;
        public Long from_page;
        public Long test_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1224common = dataReq.f1223common;
                this.test_id = dataReq.test_id;
                this.from_page = dataReq.from_page;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
