package tbclient.TestClose;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f68838common;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long from_page;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long test_id;
    public static final Long DEFAULT_TEST_ID = 0L;
    public static final Long DEFAULT_FROM_PAGE = 0L;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f68839common;
        public Long from_page;
        public Long test_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f68839common = dataReq.f68838common;
            this.test_id = dataReq.test_id;
            this.from_page = dataReq.from_page;
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
            this.f68838common = builder.f68839common;
            Long l = builder.test_id;
            if (l == null) {
                this.test_id = DEFAULT_TEST_ID;
            } else {
                this.test_id = l;
            }
            Long l2 = builder.from_page;
            if (l2 == null) {
                this.from_page = DEFAULT_FROM_PAGE;
                return;
            } else {
                this.from_page = l2;
                return;
            }
        }
        this.f68838common = builder.f68839common;
        this.test_id = builder.test_id;
        this.from_page = builder.from_page;
    }
}
